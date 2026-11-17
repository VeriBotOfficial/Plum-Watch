package me.doruk.plumwatch.watch

import android.annotation.SuppressLint
import android.bluetooth.BluetoothAdapter
import android.bluetooth.BluetoothDevice
import android.bluetooth.BluetoothGatt
import android.bluetooth.BluetoothGattCallback
import android.bluetooth.BluetoothManager
import android.bluetooth.BluetoothProfile
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
import kotlinx.coroutines.flow.update

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
    private var autoReconnectEnabled = initialSavedDevice != null
    private var companionPresenceMonitoring = false
    private var companionDevicePresent = true
    private var reconnectAttempts = 0

    private val reconnectTask = Runnable {
        val device = mutableState.value.savedDevice
        if (device == null || !autoReconnectEnabled) return@Runnable
        if (companionPresenceMonitoring && !companionDevicePresent) return@Runnable
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
                    val current = mutableState.value
                    val saved = current.savedDevice ?: current.connectedDevice
                    val shouldReconnect = autoReconnectEnabled &&
                        saved != null &&
                        (!companionPresenceMonitoring || companionDevicePresent)

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

            if (status == BluetoothGatt.GATT_SUCCESS) {
                mutableState.update {
                    it.copy(
                        discoveredServiceCount = gatt.services.size,
                        connectionMessage = "Connected"
                    )
                }
            } else {
                mutableState.update {
                    it.copy(
                        connectionMessage = "Connected · service discovery failed",
                        errorMessage = "The GATT link is active, but the watch did not return its service list."
                    )
                }
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
        companionDevicePresent = true
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
            if (autoReconnectEnabled && (!companionPresenceMonitoring || companionDevicePresent)) {
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

            if (bluetoothGatt == null) finishFailedConnection("Android did not create a GATT connection.")
        } catch (_: SecurityException) {
            finishFailedConnection("Allow Nearby devices access and try again.")
        } catch (exception: IllegalArgumentException) {
            finishFailedConnection(exception.message ?: "Invalid Bluetooth device.")
        } catch (exception: IllegalStateException) {
            finishFailedConnection(exception.message ?: "Android could not start the connection.")
        }
    }

    private fun finishFailedConnection(message: String) {
        val shouldReconnect = autoReconnectEnabled &&
            mutableState.value.savedDevice != null &&
            (!companionPresenceMonitoring || companionDevicePresent)
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
                .apply()
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
                errorMessage = null
            )
        }
    }

    fun reconnectSavedDevice() {
        if (mutableState.value.savedDevice == null) return
        autoReconnectEnabled = true
        if (companionPresenceMonitoring && !companionDevicePresent) {
            mutableState.update {
                it.copy(
                    isReconnecting = true,
                    connectionMessage = "Waiting for your watch to come into range"
                )
            }
            return
        }
        reconnectAttempts = 0
        scheduleReconnect(250L)
    }

    fun setCompanionPresenceMonitoring(enabled: Boolean) {
        companionPresenceMonitoring = enabled
        if (enabled) {
            companionDevicePresent = false
            handler.removeCallbacks(reconnectTask)
            mutableState.update {
                it.copy(
                    isReconnecting = it.savedDevice != null,
                    connectionMessage = if (it.savedDevice != null) {
                        "Waiting for your watch to come into range"
                    } else {
                        it.connectionMessage
                    }
                )
            }
        }
    }

    fun onCompanionDeviceAppeared() {
        companionPresenceMonitoring = true
        companionDevicePresent = true
        autoReconnectEnabled = mutableState.value.savedDevice != null
        reconnectAttempts = 0
        if (autoReconnectEnabled && !mutableState.value.isConnected && !mutableState.value.isConnecting) {
            scheduleReconnect(250L)
        }
    }

    @SuppressLint("MissingPermission")
    fun onCompanionDeviceDisappeared() {
        companionPresenceMonitoring = true
        companionDevicePresent = false
        handler.removeCallbacks(reconnectTask)
        val activeGatt = bluetoothGatt
        bluetoothGatt = null
        if (activeGatt != null) {
            try {
                activeGatt.disconnect()
            } catch (_: SecurityException) {
                // The watch is already out of range or permission was revoked.
            }
            handler.postDelayed({
                try {
                    activeGatt.close()
                } catch (_: SecurityException) {
                    // Best-effort cleanup.
                }
            }, 300L)
        }
        mutableState.update {
            it.copy(
                isConnecting = false,
                isReconnecting = it.savedDevice != null,
                connectedDevice = null,
                pendingDevice = null,
                connectionMessage = if (it.savedDevice != null) {
                    "Watch out of range · waiting to reconnect"
                } else {
                    it.connectionMessage
                },
                discoveredServiceCount = 0,
                errorMessage = null
            )
        }
    }

    private fun persistSavedDevice(device: WatchDevice) {
        preferences.edit()
            .putString(KEY_DEVICE_NAME, device.name)
            .putString(KEY_DEVICE_ADDRESS, device.address)
            .apply()
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
        if (companionPresenceMonitoring && !companionDevicePresent) return
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
        private const val MAX_RECONNECT_DELAY_MS = 60_000L

        @Volatile
        private var instance: BleWatchManager? = null

        fun getInstance(context: Context): BleWatchManager =
            instance ?: synchronized(this) {
                instance ?: BleWatchManager(context.applicationContext).also { instance = it }
            }
    }
}
