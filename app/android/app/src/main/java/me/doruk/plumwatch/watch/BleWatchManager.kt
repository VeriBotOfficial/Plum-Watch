package me.doruk.plumwatch.watch

import android.annotation.SuppressLint
import android.bluetooth.BluetoothAdapter
import android.bluetooth.BluetoothDevice
import android.bluetooth.BluetoothGatt
import android.bluetooth.BluetoothGattCallback
import android.bluetooth.BluetoothManager
import android.bluetooth.BluetoothProfile
import android.bluetooth.BluetoothGattCharacteristic
import android.bluetooth.BluetoothGattDescriptor
import android.bluetooth.BluetoothStatusCodes
import android.os.Build
import android.bluetooth.le.ScanCallback
import android.bluetooth.le.ScanResult
import android.bluetooth.le.ScanSettings
import android.content.Context
import android.os.Handler
import android.os.Looper
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlin.math.min

data class WatchDevice(
    val name: String,
    val address: String,
    val rssi: Int
)

data class BleUiState(
    val discoveredDevices: List<WatchDevice> = emptyList(),
    val isScanning: Boolean = false,
    val isConnecting: Boolean = false,
    val isReconnecting: Boolean = false,
    val connectedDevice: WatchDevice? = null,
    val savedDevice: WatchDevice? = null,
    val pendingDevice: WatchDevice? = null,
    val connectionMessage: String = "Not connected",
    val discoveredServiceCount: Int = 0,
    val batteryPercent: Int? = null,
    val heartRateBpm: Int? = null,
    val supportsBattery: Boolean = false,
    val supportsHeartRate: Boolean = false,
    val canFindWatch: Boolean = false,
    val errorMessage: String? = null
) {
    val isConnected: Boolean get() = connectedDevice != null
}

class BleWatchManager(context: Context) {
    private val appContext = context.applicationContext
    private val bluetoothManager =
        appContext.getSystemService(Context.BLUETOOTH_SERVICE) as? BluetoothManager
    private val adapter: BluetoothAdapter? = bluetoothManager?.adapter
    private val handler = Handler(Looper.getMainLooper())

    private val preferences = appContext.getSharedPreferences(
        WATCH_PREFERENCES,
        Context.MODE_PRIVATE
    )
    private val initialSavedDevice = readSavedDevice()
    private val mutableState = MutableStateFlow(
        BleUiState(
            savedDevice = initialSavedDevice,
            isReconnecting = initialSavedDevice != null,
            connectionMessage = if (initialSavedDevice != null) {
                "Saved watch · reconnecting"
            } else {
                "Not connected"
            }
        )
    )
    val state: StateFlow<BleUiState> = mutableState.asStateFlow()

    private var bluetoothGatt: BluetoothGatt? = null
    private var batteryCharacteristic: BluetoothGattCharacteristic? = null
    private var findWatchCharacteristic: BluetoothGattCharacteristic? = null
    private val pendingNotificationDescriptors = java.util.ArrayDeque<BluetoothGattDescriptor>()
    private var pendingBatteryRead: BluetoothGattCharacteristic? = null
    private var autoReconnectEnabled = initialSavedDevice != null
    private var reconnectAttempts = 0

    private val stopFindWatchTask = Runnable {
        val gatt = bluetoothGatt ?: return@Runnable
        val characteristic = findWatchCharacteristic ?: return@Runnable
        writeAlertLevel(gatt, characteristic, ALERT_LEVEL_NONE)
    }

    private val reconnectTask = Runnable {
        val device = mutableState.value.savedDevice
        if (device == null || !autoReconnectEnabled) return@Runnable
        if (mutableState.value.isConnected || mutableState.value.isConnecting) return@Runnable

        if (!isBluetoothEnabled()) {
            scheduleReconnect(MAX_RECONNECT_DELAY_MS)
            return@Runnable
        }

        connectInternal(device, reconnecting = true)
    }

    init {
        if (initialSavedDevice != null) scheduleReconnect(INITIAL_RECONNECT_DELAY_MS)
    }

    private val connectionTimeoutTask = Runnable {
        if (mutableState.value.isConnecting) {
            bluetoothGatt?.let { gatt ->
                bluetoothGatt = null
                runCatching { gatt.disconnect() }
                runCatching { gatt.close() }
            }
            finishFailedConnection("The watch did not respond. Retrying the Bluetooth connection.")
        }
    }

    private val stopScanTask = Runnable {
        stopScan()
        mutableState.update {
            it.copy(
                connectionMessage = if (it.discoveredDevices.isEmpty()) {
                    "No nearby devices found"
                } else {
                    "Select your watch to connect"
                }
            )
        }
    }

    private val scanCallback = object : ScanCallback() {
        override fun onScanResult(callbackType: Int, result: ScanResult) {
            val name = result.scanRecord?.deviceName
                ?: safeDeviceName(result.device)
                ?: "Unknown device"

            val found = WatchDevice(
                name = name,
                address = result.device.address,
                rssi = result.rssi
            )

            mutableState.update { old ->
                val updated = (old.discoveredDevices.filterNot { it.address == found.address } + found)
                    .sortedByDescending { it.rssi }
                old.copy(discoveredDevices = updated)
            }
        }

        override fun onBatchScanResults(results: MutableList<ScanResult>) {
            results.forEach { onScanResult(0, it) }
        }

        override fun onScanFailed(errorCode: Int) {
            handler.removeCallbacks(stopScanTask)
            mutableState.update {
                it.copy(
                    isScanning = false,
                    connectionMessage = "Bluetooth scan failed ($errorCode)",
                    errorMessage = "The phone could not complete the Bluetooth scan."
                )
            }
        }
    }

    private val gattCallback = object : BluetoothGattCallback() {
        override fun onConnectionStateChange(
            gatt: BluetoothGatt,
            status: Int,
            newState: Int
        ) {
            if (status == BluetoothGatt.GATT_SUCCESS &&
                newState == BluetoothProfile.STATE_CONNECTED
            ) {
                if (bluetoothGatt !== gatt) {
                    gatt.close()
                    return
                }
                handler.removeCallbacks(reconnectTask)
                handler.removeCallbacks(connectionTimeoutTask)
                reconnectAttempts = 0
                val connectedDevice = mutableState.value.pendingDevice ?: mutableState.value.savedDevice
                connectedDevice?.let(::persistSavedDevice)
                mutableState.update { old ->
                    val device = old.pendingDevice ?: old.savedDevice
                    old.copy(
                        isConnecting = false,
                        isReconnecting = false,
                        connectedDevice = device,
                        savedDevice = device ?: old.savedDevice,
                        pendingDevice = null,
                        connectionMessage = "Connected",
                        discoveredServiceCount = 0,
                        errorMessage = null
                    )
                }
                batteryCharacteristic = null
                findWatchCharacteristic = null
                pendingNotificationDescriptors.clear()
                pendingBatteryRead = null
                if (!gatt.discoverServices()) {
                    mutableState.update {
                        it.copy(
                            connectionMessage = "Connected · service discovery unavailable",
                            errorMessage = "The BLE link is active, but Android could not start GATT service discovery."
                        )
                    }
                }
                return
            }

            if (newState == BluetoothProfile.STATE_DISCONNECTED) {
                val failed = status != BluetoothGatt.GATT_SUCCESS
                gatt.close()

                if (bluetoothGatt === gatt) {
                    bluetoothGatt = null
                    handler.removeCallbacks(connectionTimeoutTask)
                    handler.removeCallbacks(stopFindWatchTask)
                    batteryCharacteristic = null
                    findWatchCharacteristic = null
                    pendingNotificationDescriptors.clear()
                    pendingBatteryRead = null
                    val current = mutableState.value
                    val saved = current.savedDevice ?: current.connectedDevice
                    val shouldReconnect = autoReconnectEnabled &&
                        saved != null
                    mutableState.update { old ->
                        old.copy(
                            isConnecting = false,
                            isReconnecting = shouldReconnect,
                            connectedDevice = null,
                            savedDevice = saved,
                            pendingDevice = null,
                            connectionMessage = when {
                                shouldReconnect -> "Connection lost · reconnecting"
                                failed -> "Connection ended ($status)"
                                else -> "Disconnected"
                            },
                            discoveredServiceCount = 0,
                            batteryPercent = null,
                            heartRateBpm = null,
                            supportsBattery = false,
                            supportsHeartRate = false,
                            canFindWatch = false,
                            errorMessage = if (shouldReconnect) null else if (failed) {
                                "The watch connection ended. Try reconnecting when it is nearby."
                            } else {
                                null
                            }
                        )
                    }
                    if (shouldReconnect) scheduleReconnect(nextReconnectDelay())
                }
            }
        }

        override fun onServicesDiscovered(gatt: BluetoothGatt, status: Int) {
            if (bluetoothGatt !== gatt) return
            if (status != BluetoothGatt.GATT_SUCCESS) {
                mutableState.update {
                    it.copy(
                        connectionMessage = "Connected · service discovery failed",
                        errorMessage = "The GATT link is active, but the watch did not return its service list."
                    )
                }
                return
            }

            val battery = gatt.getService(BATTERY_SERVICE_UUID)
                ?.getCharacteristic(BATTERY_LEVEL_UUID)
            val heartRate = gatt.getService(HEART_RATE_SERVICE_UUID)
                ?.getCharacteristic(HEART_RATE_MEASUREMENT_UUID)
            val alertLevel = gatt.getService(IMMEDIATE_ALERT_SERVICE_UUID)
                ?.getCharacteristic(ALERT_LEVEL_UUID)

            batteryCharacteristic = battery
            findWatchCharacteristic = alertLevel?.takeIf {
                it.properties and (
                    BluetoothGattCharacteristic.PROPERTY_WRITE or
                        BluetoothGattCharacteristic.PROPERTY_WRITE_NO_RESPONSE
                ) != 0
            }

            mutableState.update {
                it.copy(
                    discoveredServiceCount = gatt.services.size,
                    supportsBattery = battery != null,
                    supportsHeartRate = heartRate != null,
                    canFindWatch = findWatchCharacteristic != null,
                    connectionMessage = "Connected"
                )
            }

            pendingNotificationDescriptors.clear()
            listOfNotNull(battery, heartRate).forEach { characteristic ->
                val canNotify = characteristic.properties and (
                    BluetoothGattCharacteristic.PROPERTY_NOTIFY or
                        BluetoothGattCharacteristic.PROPERTY_INDICATE
                ) != 0
                if (canNotify) {
                    gatt.setCharacteristicNotification(characteristic, true)
                    characteristic.getDescriptor(CLIENT_CONFIG_UUID)?.let {
                        pendingNotificationDescriptors.add(it)
                    }
                }
            }
            pendingBatteryRead = battery?.takeIf {
                it.properties and BluetoothGattCharacteristic.PROPERTY_READ != 0
            }
            writeNextNotificationDescriptor(gatt)
            if (pendingNotificationDescriptors.isEmpty()) readPendingBattery(gatt)
        }

        override fun onDescriptorWrite(
            gatt: BluetoothGatt,
            descriptor: BluetoothGattDescriptor,
            status: Int
        ) {
            if (bluetoothGatt !== gatt) return
            writeNextNotificationDescriptor(gatt)
            if (pendingNotificationDescriptors.isEmpty()) readPendingBattery(gatt)
        }

        @Suppress("DEPRECATION")
        override fun onCharacteristicRead(
            gatt: BluetoothGatt,
            characteristic: BluetoothGattCharacteristic,
            status: Int
        ) {
            if (bluetoothGatt !== gatt || status != BluetoothGatt.GATT_SUCCESS) return
            characteristic.value?.let { handleCharacteristicValue(characteristic, it) }
        }

        override fun onCharacteristicRead(
            gatt: BluetoothGatt,
            characteristic: BluetoothGattCharacteristic,
            value: ByteArray,
            status: Int
        ) {
            if (bluetoothGatt !== gatt || status != BluetoothGatt.GATT_SUCCESS) return
            handleCharacteristicValue(characteristic, value)
        }

        @Suppress("DEPRECATION")
        override fun onCharacteristicChanged(
            gatt: BluetoothGatt,
            characteristic: BluetoothGattCharacteristic
        ) {
            if (bluetoothGatt !== gatt) return
            characteristic.value?.let { handleCharacteristicValue(characteristic, it) }
        }

        override fun onCharacteristicChanged(
            gatt: BluetoothGatt,
            characteristic: BluetoothGattCharacteristic,
            value: ByteArray
        ) {
            if (bluetoothGatt !== gatt) return
            handleCharacteristicValue(characteristic, value)
        }
    }

    @SuppressLint("MissingPermission")
    private fun writeNextNotificationDescriptor(gatt: BluetoothGatt) {
        if (bluetoothGatt !== gatt) return
        val descriptor = pendingNotificationDescriptors.pollFirst() ?: return
        val value = BluetoothGattDescriptor.ENABLE_NOTIFICATION_VALUE
        val started = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
            gatt.writeDescriptor(descriptor, value) == BluetoothStatusCodes.SUCCESS
        } else {
            @Suppress("DEPRECATION")
            descriptor.value = value
            @Suppress("DEPRECATION")
            gatt.writeDescriptor(descriptor)
        }
        if (!started) handler.post { writeNextNotificationDescriptor(gatt) }
    }

    @SuppressLint("MissingPermission")
    private fun readPendingBattery(gatt: BluetoothGatt) {
        if (bluetoothGatt !== gatt) return
        val characteristic = pendingBatteryRead
        pendingBatteryRead = null
        if (characteristic != null) gatt.readCharacteristic(characteristic)
    }

    private fun handleCharacteristicValue(
        characteristic: BluetoothGattCharacteristic,
        value: ByteArray
    ) {
        when (characteristic.uuid) {
            BATTERY_LEVEL_UUID -> {
                val level = value.firstOrNull()?.toInt()?.and(0xFF)
                    ?.takeIf { it in 0..100 } ?: return
                mutableState.update { it.copy(batteryPercent = level) }
            }
            HEART_RATE_MEASUREMENT_UUID -> {
                if (value.size < 2) return
                val flags = value[0].toInt() and 0xFF
                val bpm = if ((flags and 0x01) != 0) {
                    if (value.size < 3) return
                    (value[1].toInt() and 0xFF) or
                        ((value[2].toInt() and 0xFF) shl 8)
                } else {
                    value[1].toInt() and 0xFF
                }
                if (bpm in 1..65535) mutableState.update { it.copy(heartRateBpm = bpm) }
            }
        }
    }

    @SuppressLint("MissingPermission")
    fun refreshHealth() {
        val gatt = bluetoothGatt ?: return
        val characteristic = batteryCharacteristic ?: return
        if (characteristic.properties and BluetoothGattCharacteristic.PROPERTY_READ != 0) {
            gatt.readCharacteristic(characteristic)
        }
    }

    @SuppressLint("MissingPermission")
    fun findWatch() {
        val gatt = bluetoothGatt ?: return
        val characteristic = findWatchCharacteristic ?: return
        handler.removeCallbacks(stopFindWatchTask)
        writeAlertLevel(gatt, characteristic, ALERT_LEVEL_HIGH)
        handler.postDelayed(stopFindWatchTask, FIND_WATCH_ALERT_DURATION_MS)
    }

    @SuppressLint("MissingPermission")
    @Suppress("DEPRECATION")
    private fun writeAlertLevel(
        gatt: BluetoothGatt,
        characteristic: BluetoothGattCharacteristic,
        level: Byte
    ) {
        if (bluetoothGatt !== gatt) return
        val writeType = if (
            characteristic.properties and BluetoothGattCharacteristic.PROPERTY_WRITE_NO_RESPONSE != 0
        ) BluetoothGattCharacteristic.WRITE_TYPE_NO_RESPONSE
        else BluetoothGattCharacteristic.WRITE_TYPE_DEFAULT

        val started = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
            gatt.writeCharacteristic(characteristic, byteArrayOf(level), writeType) ==
                BluetoothStatusCodes.SUCCESS
        } else {
            characteristic.writeType = writeType
            characteristic.value = byteArrayOf(level)
            gatt.writeCharacteristic(characteristic)
        }
        if (!started) {
            mutableState.update {
                it.copy(errorMessage = "The watch rejected the standard alert command.")
            }
        }
    }

    fun isBluetoothSupported(): Boolean = adapter != null

    @SuppressLint("MissingPermission")
    fun isBluetoothEnabled(): Boolean = try {
        adapter?.isEnabled == true
    } catch (_: SecurityException) {
        false
    }

    @SuppressLint("MissingPermission")
    fun startScan() {
        val bluetoothAdapter = adapter
        if (bluetoothAdapter == null) {
            mutableState.update {
                it.copy(
                    isScanning = false,
                    connectionMessage = "Bluetooth is not supported",
                    errorMessage = "This phone does not expose a Bluetooth adapter."
                )
            }
            return
        }

        if (!isBluetoothEnabled()) {
            mutableState.update {
                it.copy(
                    isScanning = false,
                    connectionMessage = "Bluetooth is turned off",
                    errorMessage = "Turn on Bluetooth to search for your watch."
                )
            }
            return
        }

        val scanner = bluetoothAdapter.bluetoothLeScanner
        if (scanner == null) {
            mutableState.update {
                it.copy(
                    isScanning = false,
                    connectionMessage = "Bluetooth scanner unavailable",
                    errorMessage = "Android could not initialise the BLE scanner."
                )
            }
            return
        }

        stopScan()
        mutableState.update {
            it.copy(
                discoveredDevices = emptyList(),
                isScanning = true,
                connectionMessage = "Searching nearby devices…",
                errorMessage = null
            )
        }

        try {
            val settings = ScanSettings.Builder()
                .setScanMode(ScanSettings.SCAN_MODE_LOW_LATENCY)
                .build()
            scanner.startScan(null, settings, scanCallback)
            handler.removeCallbacks(stopScanTask)
            handler.postDelayed(stopScanTask, SCAN_WINDOW_MS)
        } catch (_: SecurityException) {
            mutableState.update {
                it.copy(
                    isScanning = false,
                    connectionMessage = "Bluetooth permission required",
                    errorMessage = "Allow Nearby devices access and try again."
                )
            }
        } catch (exception: IllegalStateException) {
            mutableState.update {
                it.copy(
                    isScanning = false,
                    connectionMessage = "Scanner unavailable",
                    errorMessage = exception.message ?: "Android could not start Bluetooth scanning."
                )
            }
        }
    }

    @SuppressLint("MissingPermission")
    fun stopScan() {
        handler.removeCallbacks(stopScanTask)
        try {
            adapter?.bluetoothLeScanner?.stopScan(scanCallback)
        } catch (_: SecurityException) {
            // The scan is stopped locally even if Android revoked permission.
        } catch (_: IllegalStateException) {
            // The scanner may already have shut down.
        }
        mutableState.update { it.copy(isScanning = false) }
    }

    @SuppressLint("MissingPermission")
    fun connect(device: WatchDevice) {
        autoReconnectEnabled = true
        reconnectAttempts = 0
        persistSavedDevice(device)
        mutableState.update { it.copy(savedDevice = device, errorMessage = null) }
        handler.removeCallbacks(reconnectTask)
        connectInternal(device, reconnecting = false)
    }

    @SuppressLint("MissingPermission")
    private fun connectInternal(device: WatchDevice, reconnecting: Boolean) {
        if (mutableState.value.isConnected || mutableState.value.isConnecting) return
        stopScan()

        val bluetoothAdapter = adapter
        if (bluetoothAdapter == null || !isBluetoothEnabled()) {
            mutableState.update {
                it.copy(
                    isConnecting = false,
                    isReconnecting = autoReconnectEnabled,
                    connectionMessage = "Bluetooth is unavailable",
                    errorMessage = if (autoReconnectEnabled) null else "Turn on Bluetooth and try again."
                )
            }
            if (autoReconnectEnabled) {
                scheduleReconnect(nextReconnectDelay())
            }
            return
        }

        bluetoothGatt?.let { previous ->
            try {
                previous.disconnect()
                previous.close()
            } catch (_: SecurityException) {
                // A new connection attempt is still allowed to proceed.
            }
        }
        bluetoothGatt = null

        mutableState.update {
            it.copy(
                isConnecting = true,
                isReconnecting = reconnecting,
                connectedDevice = null,
                savedDevice = it.savedDevice,
                pendingDevice = device,
                connectionMessage = if (reconnecting) {
                    "Reconnecting to ${device.name}…"
                } else {
                    "Connecting to ${device.name}…"
                },
                discoveredServiceCount = 0,
                errorMessage = null
            )
        }

        try {
            val remoteDevice = bluetoothAdapter.getRemoteDevice(device.address)
            bluetoothGatt = remoteDevice.connectGatt(
                appContext,
                false,
                gattCallback,
                BluetoothDevice.TRANSPORT_LE
            )

            if (bluetoothGatt == null) {
                finishFailedConnection("Android did not create a GATT connection.")
            } else {
                handler.removeCallbacks(connectionTimeoutTask)
                handler.postDelayed(connectionTimeoutTask, CONNECTION_TIMEOUT_MS)
            }
        } catch (_: SecurityException) {
            finishFailedConnection("Allow Nearby devices access and try again.")
        } catch (exception: IllegalArgumentException) {
            finishFailedConnection(exception.message ?: "Invalid Bluetooth device.")
        } catch (exception: IllegalStateException) {
            finishFailedConnection(exception.message ?: "Android could not start the connection.")
        }
    }

    private fun finishFailedConnection(message: String) {
        handler.removeCallbacks(connectionTimeoutTask)
        val shouldReconnect = autoReconnectEnabled &&
            mutableState.value.savedDevice != null
        mutableState.update {
            it.copy(
                isConnecting = false,
                isReconnecting = shouldReconnect,
                pendingDevice = null,
                connectionMessage = if (shouldReconnect) "Connection lost · retrying" else "Connection failed",
                errorMessage = if (shouldReconnect) null else message
            )
        }
        if (shouldReconnect) scheduleReconnect(nextReconnectDelay())
    }

    @SuppressLint("MissingPermission")
    fun disconnect(forgetDevice: Boolean = false) {
        stopScan()
        autoReconnectEnabled = false
        handler.removeCallbacks(reconnectTask)
        handler.removeCallbacks(connectionTimeoutTask)
        handler.removeCallbacks(stopFindWatchTask)
        batteryCharacteristic = null
        findWatchCharacteristic = null
        pendingNotificationDescriptors.clear()
        pendingBatteryRead = null

        val activeGatt = bluetoothGatt
        bluetoothGatt = null
        if (activeGatt != null) {
            try {
                activeGatt.disconnect()
            } catch (_: SecurityException) {
                // Closing below still releases the local GATT object.
            }
            handler.postDelayed({
                try {
                    activeGatt.close()
                } catch (_: SecurityException) {
                    // Nothing else can be done if permission was revoked.
                }
            }, 350L)
        }

        if (forgetDevice) {
            preferences.edit()
                .remove(KEY_DEVICE_NAME)
                .remove(KEY_DEVICE_ADDRESS)
                .commit()
        }

        mutableState.update {
            it.copy(
                isConnecting = false,
                isReconnecting = false,
                connectedDevice = null,
                savedDevice = if (forgetDevice) null else it.savedDevice,
                pendingDevice = null,
                connectionMessage = if (forgetDevice) "Device removed" else "Disconnected",
                discoveredServiceCount = 0,
                batteryPercent = null,
                heartRateBpm = null,
                supportsBattery = false,
                supportsHeartRate = false,
                canFindWatch = false,
                errorMessage = null
            )
        }
    }

    fun reconnectSavedDevice() {
        if (mutableState.value.savedDevice == null) return
        autoReconnectEnabled = true
        reconnectAttempts = 0
        scheduleReconnect(250L)
    }

    fun resumeConnection() {
        if (!autoReconnectEnabled || mutableState.value.savedDevice == null) return
        if (!mutableState.value.isConnected && !mutableState.value.isConnecting) {
            scheduleReconnect(250L)
        }
    }

    private fun persistSavedDevice(device: WatchDevice) {
        preferences.edit()
            .putString(KEY_DEVICE_NAME, device.name)
            .putString(KEY_DEVICE_ADDRESS, device.address)
            .commit()
    }

    private fun readSavedDevice(): WatchDevice? {
        val address = preferences.getString(KEY_DEVICE_ADDRESS, null)
            ?.takeIf { it.isNotBlank() } ?: return null
        val name = preferences.getString(KEY_DEVICE_NAME, null)
            ?.takeIf { it.isNotBlank() } ?: "My watch"
        return WatchDevice(name = name, address = address, rssi = 0)
    }

    private fun scheduleReconnect(delayMs: Long) {
        if (!autoReconnectEnabled) return
        handler.removeCallbacks(reconnectTask)
        mutableState.update {
            it.copy(
                isReconnecting = it.savedDevice != null && !it.isConnected,
                connectionMessage = if (it.savedDevice != null && !it.isConnected) {
                    "Connection lost · reconnecting"
                } else {
                    it.connectionMessage
                }
            )
        }
        handler.postDelayed(reconnectTask, delayMs)
    }

    private fun nextReconnectDelay(): Long {
        val delays = longArrayOf(2_000L, 5_000L, 12_000L, 30_000L, MAX_RECONNECT_DELAY_MS)
        val index = min(reconnectAttempts, delays.lastIndex)
        reconnectAttempts = (reconnectAttempts + 1).coerceAtMost(delays.lastIndex)
        return delays[index]
    }

    @SuppressLint("MissingPermission")
    fun release() {
        // Activity destruction must not drop the saved watch connection.
        stopScan()
    }

    @SuppressLint("MissingPermission")
    private fun safeDeviceName(device: BluetoothDevice): String? = try {
        device.name?.takeIf { it.isNotBlank() }
    } catch (_: SecurityException) {
        null
    }

    companion object {
        private const val SCAN_WINDOW_MS = 15_000L
        private const val WATCH_PREFERENCES = "plum-watch-saved-device"
        private const val KEY_DEVICE_NAME = "device-name"
        private const val KEY_DEVICE_ADDRESS = "device-address"
        private const val INITIAL_RECONNECT_DELAY_MS = 1_500L
        private const val MAX_RECONNECT_DELAY_MS = 30_000L
        private const val CONNECTION_TIMEOUT_MS = 12_000L
        private const val FIND_WATCH_ALERT_DURATION_MS = 5_000L
        private const val ALERT_LEVEL_HIGH: Byte = 0x02
        private const val ALERT_LEVEL_NONE: Byte = 0x00
        private val BATTERY_SERVICE_UUID = java.util.UUID.fromString("0000180f-0000-1000-8000-00805f9b34fb")
        private val BATTERY_LEVEL_UUID = java.util.UUID.fromString("00002a19-0000-1000-8000-00805f9b34fb")
        private val HEART_RATE_SERVICE_UUID = java.util.UUID.fromString("0000180d-0000-1000-8000-00805f9b34fb")
        private val HEART_RATE_MEASUREMENT_UUID = java.util.UUID.fromString("00002a37-0000-1000-8000-00805f9b34fb")
        private val IMMEDIATE_ALERT_SERVICE_UUID = java.util.UUID.fromString("00001802-0000-1000-8000-00805f9b34fb")
        private val ALERT_LEVEL_UUID = java.util.UUID.fromString("00002a06-0000-1000-8000-00805f9b34fb")
        private val CLIENT_CONFIG_UUID = java.util.UUID.fromString("00002902-0000-1000-8000-00805f9b34fb")

        @Volatile
        private var instance: BleWatchManager? = null

        fun getInstance(context: Context): BleWatchManager =
            instance ?: synchronized(this) {
                instance ?: BleWatchManager(context.applicationContext).also { instance = it }
            }
    }
}
