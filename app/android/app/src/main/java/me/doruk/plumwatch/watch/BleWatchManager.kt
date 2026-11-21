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
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.CompletableDeferred
import kotlinx.coroutines.CancellationException
import kotlinx.coroutines.withContext
import kotlinx.coroutines.withTimeout
import kotlinx.coroutines.withTimeoutOrNull
import kotlinx.coroutines.sync.Mutex
import kotlinx.coroutines.sync.withLock
import java.io.File
import java.io.ByteArrayOutputStream
import java.nio.ByteBuffer
import java.nio.ByteOrder
import java.util.zip.ZipFile
import java.nio.charset.StandardCharsets

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
    val supportsTimeSync: Boolean = false,
    val lastTimeSyncAt: Long? = null,
    val supportsSifliWatchface: Boolean = false,
    val supportsProprietaryCommands: Boolean = false,
    val watchConnected: Boolean = false,
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
    private var currentTimeCharacteristic: BluetoothGattCharacteristic? = null
    private var sifliDataCharacteristic: BluetoothGattCharacteristic? = null
    private var sifliNotificationsReady = false
    private var sifliMtu = 23
    private val sifliReassembler = SifliSerialProtocol.Reassembler()
    private val sifliIncomingMessages = Channel<ByteArray>(Channel.UNLIMITED)
    private var pendingSifliWrite: CompletableDeferred<Boolean>? = null
    private var pendingSifliMtuChange: CompletableDeferred<Int>? = null
    private val sifliPushMutex = Mutex()
    private val pendingNotificationDescriptors = java.util.ArrayDeque<BluetoothGattDescriptor>()
    private var notificationDescriptorWritePending = false
    private var pendingBatteryRead: BluetoothGattCharacteristic? = null
    private var autoReconnectEnabled = initialSavedDevice != null
    private var reconnectAttempts = 0

    // Proprietary watch connection state (handshake / heartbeat / battery via commands).
    private var sifliHandshakeDone = false
    private var watchConnected = false
    private var proprietaryBatterySupported = false
    private var heartbeatTask: Handler? = null

    // Reassembly buffer for proprietary (non-SiFli) commands that arrive fragmented.
    private val proprietaryAssembly = ByteArrayOutputStream()

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
                        supportsTimeSync = false,
                        lastTimeSyncAt = null,
                        supportsSifliWatchface = false,
                        errorMessage = null
                    )
                }
                batteryCharacteristic = null
                findWatchCharacteristic = null
                sifliDataCharacteristic = null
                sifliHandshakeDone = false
                watchConnected = false
                proprietaryBatterySupported = false
                proprietaryAssembly.reset()
                stopHeartbeat()
                sifliNotificationsReady = false
                sifliMtu = 23
                sifliReassembler.reset()
                pendingNotificationDescriptors.clear()
                notificationDescriptorWritePending = false
                pendingBatteryRead = null
                while (sifliIncomingMessages.tryReceive().isSuccess) Unit
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
                    sifliDataCharacteristic = null
                    sifliNotificationsReady = false
                    sifliMtu = 23
                    sifliReassembler.reset()
                    sifliHandshakeDone = false
                    watchConnected = false
                    proprietaryBatterySupported = false
                    proprietaryAssembly.reset()
                    stopHeartbeat()
                    pendingNotificationDescriptors.clear()
                    notificationDescriptorWritePending = false
                    pendingBatteryRead = null
                    pendingSifliWrite?.complete(false)
                    pendingSifliWrite = null
                    pendingSifliMtuChange?.completeExceptionally(
                        IllegalStateException("Watch disconnected during MTU negotiation.")
                    )
                    pendingSifliMtuChange = null
                    sifliIncomingMessages.trySend(ByteArray(0))
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
                            supportsSifliWatchface = false,
                            supportsProprietaryCommands = false,
                            watchConnected = false,
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
            val currentTime = gatt.getService(CURRENT_TIME_SERVICE_UUID)
                ?.getCharacteristic(CURRENT_TIME_CHARACTERISTIC_UUID)
            val timeSyncWritable = currentTime != null &&
                currentTime.properties and BluetoothGattCharacteristic.PROPERTY_WRITE != 0
            val sifliData = gatt.getService(SIFLI_SERIAL_SERVICE_UUID)
                ?.getCharacteristic(SIFLI_SERIAL_DATA_UUID)
            val sifliCanWrite = sifliData != null &&
                (sifliData.properties and (
                    BluetoothGattCharacteristic.PROPERTY_WRITE_NO_RESPONSE or
                        BluetoothGattCharacteristic.PROPERTY_WRITE
                )) != 0
            val sifliCanNotify = sifliData != null &&
                (sifliData.properties and BluetoothGattCharacteristic.PROPERTY_NOTIFY) != 0

            batteryCharacteristic = battery
            currentTimeCharacteristic = currentTime?.takeIf { timeSyncWritable }
            sifliDataCharacteristic = sifliData?.takeIf { sifliCanWrite && sifliCanNotify }
            sifliNotificationsReady = false
            findWatchCharacteristic = alertLevel?.takeIf {
                it.properties and (
                    BluetoothGattCharacteristic.PROPERTY_WRITE or
                        BluetoothGattCharacteristic.PROPERTY_WRITE_NO_RESPONSE
                ) != 0
            }

            mutableState.update {
                it.copy(
                    discoveredServiceCount = gatt.services.size,
                    supportsBattery = battery != null && (
                        battery.properties and BluetoothGattCharacteristic.PROPERTY_READ != 0 ||
                            battery.properties and (BluetoothGattCharacteristic.PROPERTY_NOTIFY or
                                BluetoothGattCharacteristic.PROPERTY_INDICATE) != 0
                        ),
                    supportsHeartRate = heartRate != null && heartRate.properties and (
                        BluetoothGattCharacteristic.PROPERTY_NOTIFY or
                            BluetoothGattCharacteristic.PROPERTY_INDICATE
                    ) != 0,
                    canFindWatch = findWatchCharacteristic != null,
                    supportsTimeSync = currentTimeCharacteristic != null,
                    lastTimeSyncAt = null,
                    supportsSifliWatchface = false,
                    connectionMessage = "Connected"
                )
            }

            pendingNotificationDescriptors.clear()
            listOfNotNull(battery, heartRate, sifliDataCharacteristic).forEach { characteristic ->
                val canNotify = characteristic.properties and (
                    BluetoothGattCharacteristic.PROPERTY_NOTIFY or
                        BluetoothGattCharacteristic.PROPERTY_INDICATE
                ) != 0
                if (canNotify) {
                    val localNotificationsEnabled =
                        gatt.setCharacteristicNotification(characteristic, true)
                    if (localNotificationsEnabled) {
                        characteristic.getDescriptor(CLIENT_CONFIG_UUID)?.let {
                            pendingNotificationDescriptors.add(it)
                        }
                    } else if (characteristic.uuid == SIFLI_SERIAL_DATA_UUID) {
                        sifliDataCharacteristic = null
                    }
                }
            }
            pendingBatteryRead = battery?.takeIf {
                it.properties and BluetoothGattCharacteristic.PROPERTY_READ != 0
            }
            writeNextNotificationDescriptor(gatt)
        }

        override fun onDescriptorWrite(
            gatt: BluetoothGatt,
            descriptor: BluetoothGattDescriptor,
            status: Int
        ) {
            if (bluetoothGatt !== gatt) return
            notificationDescriptorWritePending = false
            if (descriptor.characteristic.uuid == SIFLI_SERIAL_DATA_UUID) {
                sifliNotificationsReady = status == BluetoothGatt.GATT_SUCCESS &&
                    sifliDataCharacteristic != null
                mutableState.update {
                    it.copy(
                        supportsSifliWatchface = sifliNotificationsReady,
                        errorMessage = if (status == BluetoothGatt.GATT_SUCCESS) it.errorMessage
                        else "The watch's SiFli transfer notifications could not be enabled."
                    )
                }
            }
            writeNextNotificationDescriptor(gatt)
            if (sifliDataCharacteristic == null && descriptor.characteristic.uuid == SIFLI_SERIAL_DATA_UUID) {
                mutableState.update { it.copy(supportsSifliWatchface = false) }
            }
        }

        override fun onMtuChanged(gatt: BluetoothGatt, mtu: Int, status: Int) {
            if (bluetoothGatt !== gatt) return
            if (status == BluetoothGatt.GATT_SUCCESS) sifliMtu = mtu
            pendingSifliMtuChange?.let { pending ->
                if (!pending.isCompleted) {
                    if (status == BluetoothGatt.GATT_SUCCESS) pending.complete(mtu)
                    else pending.completeExceptionally(
                        IllegalStateException("The watch rejected the requested BLE MTU.")
                    )
                }
            }
        }

        override fun onCharacteristicWrite(
            gatt: BluetoothGatt,
            characteristic: BluetoothGattCharacteristic,
            status: Int
        ) {
            if (bluetoothGatt !== gatt) return
            when (characteristic.uuid) {
                SIFLI_SERIAL_DATA_UUID -> {
                    pendingSifliWrite?.let { pending ->
                        if (!pending.isCompleted) pending.complete(status == BluetoothGatt.GATT_SUCCESS)
                    }
                }
                CURRENT_TIME_CHARACTERISTIC_UUID -> {
                    mutableState.update {
                        it.copy(
                            lastTimeSyncAt = if (status == BluetoothGatt.GATT_SUCCESS) {
                                System.currentTimeMillis()
                            } else it.lastTimeSyncAt,
                            errorMessage = if (status == BluetoothGatt.GATT_SUCCESS) it.errorMessage
                            else "The watch rejected the standard Current Time update."
                        )
                    }
                    readPendingBattery(gatt)
                }
            }
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
            characteristic.value?.let { value ->
                if (characteristic.uuid == SIFLI_SERIAL_DATA_UUID) {
                    handleSerialData(value)
                } else {
                    handleCharacteristicValue(characteristic, value)
                }
            }
        }

        override fun onCharacteristicChanged(
            gatt: BluetoothGatt,
            characteristic: BluetoothGattCharacteristic,
            value: ByteArray
        ) {
            if (bluetoothGatt !== gatt) return
            if (characteristic.uuid == SIFLI_SERIAL_DATA_UUID) {
                handleSerialData(value)
            } else {
                handleCharacteristicValue(characteristic, value)
            }
        }

        /** Routes incoming serial data: proprietary WearFit commands first, then SiFli frames. */
        private fun handleSerialData(value: ByteArray) {
            if (value.isEmpty()) return
            val first = value[0].toInt() and 0xFF
            if (first == 0xAB || first == 0xEA) {
                handleProprietaryCommand(value)
            } else if (first == SIFLI_WATCHFACE_CATEGORY.toInt() and 0xFF) {
                handleSifliSerialFrame(value)
            }
            // Unknown framing: ignore silently.
        }

        private fun handleProprietaryCommand(value: ByteArray) {
            // Proprietary packet: marker + big-endian body length + 0xFF + command + data.
            if (proprietaryAssembly.size() + value.size > MAX_PROPRIETARY_MESSAGE_LENGTH) {
                proprietaryAssembly.reset()
            }
            proprietaryAssembly.write(value, 0, value.size)

            while (true) {
                val buffer = proprietaryAssembly.toByteArray()
                if (buffer.size < 3) return
                val marker = buffer[0].toInt() and 0xFF
                if (marker != 0xAB && marker != 0xEA) {
                    proprietaryAssembly.reset()
                    return
                }
                val bodyLength = ((buffer[1].toInt() and 0xFF) shl 8) or
                    (buffer[2].toInt() and 0xFF)
                if (bodyLength < 2 || bodyLength > MAX_PROPRIETARY_MESSAGE_LENGTH - 3) {
                    proprietaryAssembly.reset()
                    return
                }
                val packetLength = 3 + bodyLength
                if (buffer.size < packetLength) return

                val packet = buffer.copyOfRange(0, packetLength)
                val remainder = buffer.copyOfRange(packetLength, buffer.size)
                proprietaryAssembly.reset()
                if (remainder.isNotEmpty()) proprietaryAssembly.write(remainder, 0, remainder.size)
                processProprietaryCommand(packet)
                if (proprietaryAssembly.size() == 0) return
            }
        }

        private fun processProprietaryCommand(cmd: ByteArray) {
            if (cmd.size < 5) return
            val marker = cmd[0].toInt() and 0xFF
            val commandId = cmd[4].toInt() and 0xFF

            // Heartbeat request from watch: marker 171/234, cmd 11, arg 1
            if (commandId == PROPRIETARY_CMD_HEARTBEAT_REQ && cmd.size >= 6 && cmd[5].toInt() and 0xFF == 1) {
                val char = sifliDataCharacteristic
                val g = bluetoothGatt
                if (char != null && g != null) {
                    sendProprietaryCommand(g, char, PROPRIETARY_HEARTBEAT_RESPONSE)
                }
                return
            }

            // Device info response: cmd -110 (0x92)
            if (commandId == PROPRIETARY_CMD_DEVICE_INFO && cmd.size >= 7) {
                // Watch reports it is paired/connected. Mark proprietary channel alive.
                if (!sifliHandshakeDone) {
                    sifliHandshakeDone = true
                    watchConnected = true
                    mutableState.update {
                        it.copy(
                            supportsProprietaryCommands = true,
                            canFindWatch = it.canFindWatch || sifliDataCharacteristic != null,
                            watchConnected = true,
                            connectionMessage = "Connected · watch handshake complete"
                        )
                    }
                    startHeartbeat()
                }
                return
            }

            // Battery report: cmd 145, battery level at index 7
            if (commandId == PROPRIETARY_CMD_BATTERY && cmd.size >= 8) {
                val level = cmd[7].toInt() and 0xFF
                if (level in 0..100) {
                    proprietaryBatterySupported = true
                    mutableState.update { it.copy(batteryPercent = level) }
                }
                return
            }

            // Connection state: cmd 224
            if (commandId == 224 && cmd.size >= 7) {
                val state = cmd[6].toInt() and 0xFF
                when (state) {
                    0 -> { /* connection accepted */ }
                    1 -> { /* connection rejected */ }
                    else -> { /* other states */ }
                }
                return
            }
        }
    }

    @SuppressLint("MissingPermission")
    private fun writeNextNotificationDescriptor(gatt: BluetoothGatt) {
        if (bluetoothGatt !== gatt || notificationDescriptorWritePending) return
        val descriptor = pendingNotificationDescriptors.pollFirst()
        if (descriptor == null) {
            finishServiceSetup(gatt)
            return
        }
        val value = BluetoothGattDescriptor.ENABLE_NOTIFICATION_VALUE
        val started = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
            gatt.writeDescriptor(descriptor, value) == BluetoothStatusCodes.SUCCESS
        } else {
            @Suppress("DEPRECATION")
            descriptor.value = value
            @Suppress("DEPRECATION")
            gatt.writeDescriptor(descriptor)
        }
        if (started) {
            notificationDescriptorWritePending = true
        } else {
            // A descriptor could not be queued. Continue so a missing optional
            // notification does not block battery reads or service initialization.
            handler.post { writeNextNotificationDescriptor(gatt) }
        }
    }

    @SuppressLint("MissingPermission")
    private fun readPendingBattery(gatt: BluetoothGatt) {
        if (bluetoothGatt !== gatt) return
        val characteristic = pendingBatteryRead
        pendingBatteryRead = null
        if (characteristic != null) gatt.readCharacteristic(characteristic)
    }

    private fun handleSifliSerialFrame(value: ByteArray) {
        sifliReassembler.accept(value)?.let { message ->
            sifliIncomingMessages.trySend(message)
        }
    }

    private fun finishServiceSetup(gatt: BluetoothGatt) {
        if (!startCurrentTimeSync(gatt)) readPendingBattery(gatt)
        startProprietaryHandshake(gatt)
    }

    private fun startCurrentTimeSync(gatt: BluetoothGatt): Boolean {
        if (bluetoothGatt !== gatt) return false
        val characteristic = currentTimeCharacteristic ?: return false
        val payload = BluetoothCurrentTime.encode()
        val started = try {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
                gatt.writeCharacteristic(
                    characteristic,
                    payload,
                    BluetoothGattCharacteristic.WRITE_TYPE_DEFAULT
                ) == BluetoothStatusCodes.SUCCESS
            } else {
                @Suppress("DEPRECATION")
                characteristic.writeType = BluetoothGattCharacteristic.WRITE_TYPE_DEFAULT
                @Suppress("DEPRECATION")
                characteristic.value = payload
                @Suppress("DEPRECATION")
                gatt.writeCharacteristic(characteristic)
            }
        } catch (_: SecurityException) {
            false
        }
        if (!started) {
            mutableState.update {
                it.copy(errorMessage = "The watch exposes Current Time but Android could not queue the update.")
            }
        }
        return started
    }

    /** Sends the phone's local date and time to a watch exposing writable standard CTS. */
    @SuppressLint("MissingPermission")
    fun syncCurrentTime() {
        val gatt = bluetoothGatt ?: return
        if (!startCurrentTimeSync(gatt)) {
            mutableState.update {
                it.copy(errorMessage = "This watch does not expose a writable standard Current Time characteristic.")
            }
        }
    }

    private suspend fun requestSifliMtu(gatt: BluetoothGatt): Int {
        if (sifliMtu > 23) return sifliMtu
        val pending = CompletableDeferred<Int>()
        pendingSifliMtuChange = pending
        val requested = try {
            gatt.requestMtu(SIFLI_REQUESTED_MTU)
        } catch (_: SecurityException) {
            false
        }
        if (!requested) {
            pendingSifliMtuChange = null
            return sifliMtu
        }
        return try {
            try {
                withTimeoutOrNull(SIFLI_MTU_TIMEOUT_MS) { pending.await() } ?: sifliMtu
            } catch (cancelled: CancellationException) {
                throw cancelled
            } catch (_: Exception) {
                sifliMtu
            }
        } finally {
            if (pendingSifliMtuChange === pending) pendingSifliMtuChange = null
        }
    }

    @SuppressLint("MissingPermission")
    suspend fun pushWatchface(
        archiveFile: File,
        onProgress: (Float) -> Unit = {}
    ) = sifliPushMutex.withLock {
        val gatt = bluetoothGatt
            ?: throw IllegalStateException("Connect your watch before sending a watchface.")
        val characteristic = sifliDataCharacteristic
            ?: throw IllegalStateException("This watch does not expose the SiFli watchface transfer service.")
        if (!sifliNotificationsReady) {
            throw IllegalStateException("The watch's SiFli transfer channel is not ready yet. Reconnect and try again.")
        }
        if (!archiveFile.isFile || archiveFile.length() <= 0L) {
            throw IllegalArgumentException("The watchface ZIP file is empty or unavailable.")
        }

        // Per-file watchface transfer (matches Wearfit Pro / SiFli reference):
        // 1. Unzip the archive on the phone.
        // 2. Push each contained file separately, using its relative path inside the ZIP
        //    as the destination path (e.g. /dyn/dynamic_app/watchface/installer/wf_clock1003.dsc).
        // 3. File data index starts at 1.
        // 4. Files sorted by descending size; GIFs go last.
        // 5. Type 0 (watchface/DIALPLATE): files sent raw, no padding/CRC.
        val tempDir = File(appContext.cacheDir, "plum-watchface-${System.currentTimeMillis()}")
        tempDir.mkdirs()
        try {
            val files = unzipArchive(archiveFile, tempDir)
            if (files.isEmpty()) {
                throw IllegalStateException("The watchface ZIP contains no files.")
            }

            while (sifliIncomingMessages.tryReceive().isSuccess) Unit
            runCatching { gatt.requestConnectionPriority(BluetoothGatt.CONNECTION_PRIORITY_HIGH) }
            requestSifliMtu(gatt)

            val totalBytes = files.sumOf { it.size }
            require(totalBytes <= 0xFFFFFFFFL) {
                "This watchface archive is too large for the SiFli transfer protocol."
            }

            // ENTIRE_START_REQ: type(2 LE) + phoneType(1=Android) + totalBytes(4 LE)
            val startPayload = ByteBuffer.allocate(7).order(ByteOrder.LITTLE_ENDIAN)
                .putShort(SIFLI_WATCHFACE_FILE_TYPE_WATCHFACE.toShort())
                .put(SIFLI_PHONE_TYPE_ANDROID.toByte())
                .putInt(totalBytes.toInt())
                .array()
            sendSifliProtocolMessage(gatt, characteristic, SIFLI_MSG_START_REQ, startPayload)
            val startResponse = awaitSifliProtocolResponse(SIFLI_MSG_START_RSP)
            ensureSifliSuccess(startResponse, "The watch rejected the watchface transfer request.")

            val maxDataLen = if (startResponse.size >= 6) {
                readUnsignedShort(startResponse, 4).coerceAtLeast(4).coerceAtMost(SIFLI_MAX_DATA_LENGTH)
            } else {
                SIFLI_MAX_DATA_LENGTH
            }

            var completedBytes = 0L
            for (fileEntry in files) {
                val fileData = fileEntry.file.readBytes()
                val relPath = fileEntry.relativePath
                val pathBytes = relPath.toByteArray(StandardCharsets.UTF_8)
                require(pathBytes.isNotEmpty() && pathBytes.size <= 255) {
                    "Invalid watchface file path: $relPath"
                }

                // FILE_START_REQ: fileLen(4 LE) + nameLen(2 LE) + name (UTF-8)
                val fileStartPayload = ByteBuffer.allocate(6 + pathBytes.size)
                    .order(ByteOrder.LITTLE_ENDIAN)
                    .putInt(fileData.size.toInt())
                    .putShort(pathBytes.size.toShort())
                    .put(pathBytes)
                    .array()
                sendSifliProtocolMessage(
                    gatt, characteristic, SIFLI_MSG_FILE_SEND_START_REQ, fileStartPayload
                )
                val fileStartResponse = awaitSifliProtocolResponse(SIFLI_MSG_FILE_SEND_START_RSP)
                ensureSifliSuccess(
                    fileStartResponse,
                    "The watch could not prepare the watchface file ($relPath)."
                )

                // Send file data slices, index starting at 1.
                var sliceIndex = 0
                var offset = 0
                while (offset < fileData.size) {
                    val sliceSize = minOf(maxDataLen, fileData.size - offset)
                    val slice = fileData.copyOfRange(offset, offset + sliceSize)

                    // FILE_DATA_REQ: index(4 LE, starting at 1) + data
                    val dataPayload = ByteBuffer.allocate(4 + slice.size)
                        .order(ByteOrder.LITTLE_ENDIAN)
                        .putInt((sliceIndex + 1).toInt())
                        .put(slice)
                        .array()

                    sendSifliProtocolMessage(
                        gatt, characteristic, SIFLI_MSG_FILE_SEND_DATA, dataPayload
                    )
                    val dataResponse = awaitSifliProtocolResponse(SIFLI_MSG_FILE_SEND_DATA_RSP)
                    ensureSifliSuccess(
                        dataResponse,
                        "The watch rejected watchface data block $sliceIndex for $relPath."
                    )

                    offset += sliceSize
                    sliceIndex++
                    completedBytes += sliceSize.toLong()
                    withContext(Dispatchers.Main.immediate) {
                        onProgress((completedBytes.toDouble() / totalBytes.toDouble())
                            .toFloat().coerceIn(0f, 1f))
                    }
                }

                // FILE_END_REQ: empty body
                sendSifliProtocolMessage(
                    gatt, characteristic, SIFLI_MSG_FILE_SEND_END_REQ, byteArrayOf()
                )
                val fileEndResponse = awaitSifliProtocolResponse(SIFLI_MSG_FILE_SEND_END_RSP)
                ensureSifliSuccess(
                    fileEndResponse,
                    "The watch could not finish writing $relPath."
                )
            }

            // ENTIRE_END_REQ: empty body
            sendSifliProtocolMessage(gatt, characteristic, SIFLI_MSG_END_REQ, byteArrayOf())
            val endResponse = awaitSifliProtocolResponse(SIFLI_MSG_END_RSP)
            ensureSifliSuccess(
                endResponse,
                "The watch did not confirm completion of the watchface transfer."
            )
            onProgress(1f)
        } catch (exception: Exception) {
            runCatching {
                sendSifliProtocolMessage(
                    gatt,
                    characteristic,
                    SIFLI_MSG_ABORT_CMD,
                    byteArrayOf(SIFLI_ABORT_REASON_PHONE.toByte())
                )
            }
            throw exception
        } finally {
            runCatching {
                gatt.requestConnectionPriority(BluetoothGatt.CONNECTION_PRIORITY_BALANCED)
            }
            // Clean up the temporary unzip directory.
            deleteRecursive(tempDir)
        }
    }

    /** A single unzipped watchface file with its relative path inside the archive. */
    private data class WatchfaceFileEntry(
        val file: File,
        val relativePath: String,
        val size: Long
    )

    /** Unzips the archive into destDir and returns entries sorted by descending size (GIFs last). */
    private fun unzipArchive(archive: File, destDir: File): List<WatchfaceFileEntry> {
        val entries = mutableListOf<WatchfaceFileEntry>()
        java.util.zip.ZipFile(archive).use { zip ->
            val enumeration = zip.entries()
            while (enumeration.hasMoreElements()) {
                val entry = enumeration.nextElement()
                if (entry.isDirectory) continue
                val entryName = entry.name
                // Normalise: use forward slashes, ensure a leading "/".
                val normName = if (entryName.startsWith("/")) entryName else "/" + entryName
                val destFile = File(destDir, normName)
                destFile.parentFile?.mkdirs()
                zip.getInputStream(entry).use { input ->
                    destFile.outputStream().use { output ->
                        input.copyTo(output, 8192)
                    }
                }
                if (destFile.exists()) {
                    entries += WatchfaceFileEntry(destFile, normName, destFile.length())
                }
            }
        }
        // Sort by descending size; GIFs moved to the end (matches SiFli WatchfaceFileComparator).
        entries.sortWith(compareByDescending<WatchfaceFileEntry> { it.size }
            .thenBy { if (it.relativePath.lowercase().endsWith(".gif")) 1 else 0 }
            .thenBy { it.relativePath })
        return entries
    }

    /** Recursively deletes a directory and all its contents. */
    private fun deleteRecursive(dir: File) {
        if (!dir.exists()) return
        val files = dir.listFiles()
        if (files != null) {
            for (file in files) {
                if (file.isDirectory) deleteRecursive(file)
                else file.delete()
            }
        }
        dir.delete()
    }

    private suspend fun sendSifliProtocolMessage(
        gatt: BluetoothGatt,
        characteristic: BluetoothGattCharacteristic,
        messageId: Int,
        payload: ByteArray
    ) {
        val frames = SifliSerialProtocol.fragmentMessage(
            messageId = messageId,
            payload = payload,
            mtu = sifliMtu,
            category = SIFLI_WATCHFACE_CATEGORY
        )
        for (frame in frames) {
            writeSifliFrame(gatt, characteristic, frame)
        }
    }

    @SuppressLint("MissingPermission")
    private suspend fun writeSifliFrame(
        gatt: BluetoothGatt,
        characteristic: BluetoothGattCharacteristic,
        frame: ByteArray
    ) {
        if (bluetoothGatt !== gatt || !sifliNotificationsReady) {
            throw IllegalStateException("The watch disconnected during the watchface transfer.")
        }
        val pending = CompletableDeferred<Boolean>()
        pendingSifliWrite = pending
        val writeType = if (
            characteristic.properties and BluetoothGattCharacteristic.PROPERTY_WRITE_NO_RESPONSE != 0
        ) BluetoothGattCharacteristic.WRITE_TYPE_NO_RESPONSE
        else BluetoothGattCharacteristic.WRITE_TYPE_DEFAULT
        val started = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
            gatt.writeCharacteristic(characteristic, frame, writeType) == BluetoothStatusCodes.SUCCESS
        } else {
            @Suppress("DEPRECATION")
            characteristic.writeType = writeType
            @Suppress("DEPRECATION")
            characteristic.value = frame
            @Suppress("DEPRECATION")
            gatt.writeCharacteristic(characteristic)
        }
        if (!started) {
            if (pendingSifliWrite === pending) pendingSifliWrite = null
            throw IllegalStateException("Android could not queue a SiFli data packet.")
        }
        val success = try {
            withTimeout(SIFLI_WRITE_TIMEOUT_MS) { pending.await() }
        } finally {
            if (pendingSifliWrite === pending) pendingSifliWrite = null
        }
        if (!success) throw IllegalStateException("A SiFli Bluetooth packet could not be sent.")
    }

    private suspend fun awaitSifliProtocolResponse(expectedMessageId: Int): ByteArray =
        withTimeout(SIFLI_RESPONSE_TIMEOUT_MS) {
            while (true) {
                val message = sifliIncomingMessages.receive()
                if (message.isEmpty()) {
                    throw IllegalStateException("The Bluetooth connection to the watch was lost.")
                }
                if (message.size < 2) continue
                val messageId = readUnsignedShort(message, 0)
                when (messageId) {
                    SIFLI_MSG_LOSE_CHECK_REQ -> {
                        sendSifliProtocolMessage(
                            bluetoothGatt ?: throw IllegalStateException("The watch disconnected."),
                            sifliDataCharacteristic ?: throw IllegalStateException("The SiFli channel closed."),
                            SIFLI_MSG_LOSE_CHECK_RSP,
                            byteArrayOf(0, 0)
                        )
                    }
                    SIFLI_MSG_ABORT_CMD -> {
                        val reason = if (message.size > 4) message[4].toInt() and 0xFF else -1
                        throw IllegalStateException("The watch aborted the transfer (reason " + reason + ").")
                    }
                    expectedMessageId -> return@withTimeout message
                }
            }
            throw IllegalStateException("The watch did not return the expected response.")
        }

    private fun ensureSifliSuccess(response: ByteArray, errorMessage: String) {
        val status = SifliWatchfaceStatus.readResponseStatus(response)
            ?: throw IllegalStateException("The watch returned an incomplete SiFli response.")
        if (status != SIFLI_STATUS_OK) {
            throw IllegalStateException(
                errorMessage + " (status " + status + ": " + SifliWatchfaceStatus.describe(status) + ")."
            )
        }
    }

    private fun readUnsignedShort(bytes: ByteArray, offset: Int): Int {
        if (offset < 0 || offset + 1 >= bytes.size) return -1
        return (bytes[offset].toInt() and 0xFF) or
            ((bytes[offset + 1].toInt() and 0xFF) shl 8)
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
        val standardBattery = batteryCharacteristic
        if (standardBattery != null &&
            standardBattery.properties and BluetoothGattCharacteristic.PROPERTY_READ != 0
        ) {
            gatt.readCharacteristic(standardBattery)
        }

        // A proprietary battery report is independent of the standard Battery Service.
        if (proprietaryBatterySupported && sifliHandshakeDone) {
            sifliDataCharacteristic?.let { characteristic ->
                sendProprietaryCommand(gatt, characteristic, PROPRIETARY_DEVICE_INFO_PAYLOAD)
            }
        }
    }

    /** Fire-and-forget write of a raw proprietary command byte array. */
    @SuppressLint("MissingPermission")
    private fun sendProprietaryCommand(
        gatt: BluetoothGatt,
        characteristic: BluetoothGattCharacteristic,
        payload: ByteArray
    ): Boolean {
        if (bluetoothGatt !== gatt) return false
        val writeType = if (
            characteristic.properties and BluetoothGattCharacteristic.PROPERTY_WRITE_NO_RESPONSE != 0
        ) BluetoothGattCharacteristic.WRITE_TYPE_NO_RESPONSE
        else if (characteristic.properties and BluetoothGattCharacteristic.PROPERTY_WRITE != 0) {
            BluetoothGattCharacteristic.WRITE_TYPE_DEFAULT
        } else {
            return false
        }
        return if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
            gatt.writeCharacteristic(characteristic, payload, writeType) == BluetoothStatusCodes.SUCCESS
        } else {
            @Suppress("DEPRECATION")
            characteristic.writeType = writeType
            @Suppress("DEPRECATION")
            characteristic.value = payload
            @Suppress("DEPRECATION")
            gatt.writeCharacteristic(characteristic)
        }
    }

    /** Starts the proprietary watch handshake once SiFli notifications are ready. */
    @SuppressLint("MissingPermission")
    private fun startProprietaryHandshake(gatt: BluetoothGatt) {
        val char = sifliDataCharacteristic ?: return
        if (!sifliNotificationsReady) return
        // Step 1: tell the watch we are an Android phone.
        sendProprietaryCommand(gatt, char, PROPRIETARY_PHONE_SYSTEM_PAYLOAD)
        // Step 2: request device info (also triggers the battery report at cmd 145).
        handler.postDelayed({
            runCatching {
                sendProprietaryCommand(
                    gatt,
                    char,
                    buildConnectRequestPayload()
                )
            }
        }, 300L)
        handler.postDelayed({
            runCatching {
                sendProprietaryCommand(gatt, char, PROPRIETARY_DEVICE_INFO_PAYLOAD)
            }
        }, 600L)
        // Start the keep-alive heartbeat after the handshake.
        handler.postDelayed({ startHeartbeat() }, 1000L)
    }

    /** Builds the "connect request type" command: 0xAB 0x00 <len> 0xFF 0xE0 <type> <model>... */
    private fun buildConnectRequestPayload(): ByteArray {
        val modelBytes = android.os.Build.MODEL.toByteArray(StandardCharsets.UTF_8)
        val model = if (modelBytes.size > 11) modelBytes.copyOfRange(0, 11) else modelBytes
        // E0 80 <connection type=0> <model length> <model bytes>.
        val payload = ByteArray(8 + model.size)
        val bodyLength = payload.size - 3
        payload[0] = 0xAB.toByte()
        payload[1] = (bodyLength ushr 8).toByte()
        payload[2] = bodyLength.toByte()
        payload[3] = 0xFF.toByte()
        payload[4] = 0xE0.toByte()
        payload[5] = 0x80.toByte()
        payload[6] = 0 // connect request type
        payload[7] = model.size.toByte()
        System.arraycopy(model, 0, payload, 8, model.size)
        return payload
    }

    /** Starts periodic keep-alive heartbeat to the watch. */
    @SuppressLint("MissingPermission")
    private fun startHeartbeat() {
        stopHeartbeat()
        heartbeatTask = Handler(Looper.getMainLooper())
        val char = sifliDataCharacteristic ?: return
        val gatt = bluetoothGatt ?: return
        val task = object : Runnable {
            override fun run() {
                if (!watchConnected || bluetoothGatt !== gatt) {
                    stopHeartbeat()
                    return
                }
                runCatching {
                    sendProprietaryCommand(gatt, char, PROPRIETARY_HEARTBEAT_RESPONSE)
                }
                heartbeatTask?.postDelayed(this, PROPRIETARY_HEARTBEAT_INTERVAL_MS)
            }
        }
        heartbeatTask?.postDelayed(task, PROPRIETARY_HEARTBEAT_INTERVAL_MS)
    }

    private fun stopHeartbeat() {
        heartbeatTask?.removeCallbacksAndMessages(null)
        heartbeatTask = null
    }

    @SuppressLint("MissingPermission")
    fun findWatch() {
        val gatt = bluetoothGatt ?: return
        handler.removeCallbacks(stopFindWatchTask)

        val standardStarted = findWatchCharacteristic?.let { characteristic ->
            writeAlertLevel(gatt, characteristic, ALERT_LEVEL_HIGH)
        } ?: false
        if (standardStarted) handler.postDelayed(stopFindWatchTask, FIND_WATCH_ALERT_DURATION_MS)

        val proprietaryStarted = if (sifliHandshakeDone) {
            sifliDataCharacteristic?.let { characteristic ->
                sendProprietaryCommand(gatt, characteristic, buildFindBandPayload())
            } ?: false
        } else false

        if (!standardStarted && !proprietaryStarted) {
            mutableState.update {
                it.copy(errorMessage = "This watch does not expose a working Find Watch command.")
            }
        } else {
            mutableState.update { it.copy(errorMessage = null) }
        }
    }

    /** Sends a QR code to the watch (e.g. for Wi-Fi, payment, contact). */
    @SuppressLint("MissingPermission")
    fun setQrCode(qrContent: String, qrType: Int = 0): Boolean {
        val gatt = bluetoothGatt ?: return false
        val characteristic = sifliDataCharacteristic ?: return false
        if (!sifliHandshakeDone) {
            mutableState.update { it.copy(errorMessage = "Watch not ready for QR code. Wait for connection.") }
            return false
        }
        if (qrContent.isBlank() || qrType !in 0..0xFF) {
            mutableState.update { it.copy(errorMessage = "Enter QR content and select a valid QR type.") }
            return false
        }

        val payload = buildQrCodePayload(qrContent, qrType)
        if (payload.size > sifliMtu - 3) {
            mutableState.update {
                it.copy(errorMessage = "This QR payload exceeds the negotiated BLE packet size. Shorten the content.")
            }
            return false
        }
        val queued = sendProprietaryCommand(gatt, characteristic, payload)
        mutableState.update {
            it.copy(errorMessage = if (queued) null else "Android could not queue the QR command.")
        }
        return queued
    }

    /** Configures an alarm on the watch (up to 8 alarms, ID 0-7). */
    @SuppressLint("MissingPermission")
    fun setAlarm(
        id: Int,
        enabled: Boolean,
        hour: Int,
        minute: Int,
        repeatMask: Int = 0,      // bitmask: 1=Mon..64=Sun, 128=once
        remindFlags: Int = 3      // 1=vibrate, 2=sound, 3=both
    ) {
        val gatt = bluetoothGatt ?: return
        val char = sifliDataCharacteristic ?: return
        if (!sifliHandshakeDone) {
            mutableState.update { it.copy(errorMessage = "Watch not ready for alarm. Wait for connection.") }
            return
        }
        require(id in 0..7) { "Alarm ID must be 0-7" }
        require(hour in 0..23) { "Hour must be 0-23" }
        require(minute in 0..59) { "Minute must be 0-59" }
        sendProprietaryCommand(gatt, char, buildAlarmPayload(id, enabled, hour, minute, repeatMask, remindFlags))
    }

    private fun buildFindBandPayload(): ByteArray {
        // 0xAB 00 03 FF 71 80
        return byteArrayOf(-85, 0, 3, -1, PROP_CMD_FIND_BAND.toByte(), Byte.MIN_VALUE)
    }

    private fun buildQrCodePayload(qrContent: String, qrType: Int): ByteArray {
        val qrBytes = qrContent.toByteArray(StandardCharsets.UTF_8)
        // QR send is command 0x80; 0xA8 is the incoming QR result response.
        val bodyLength = 3 + qrBytes.size // separator + command + type + content
        require(bodyLength <= 0xFFFF) { "QR payload is too large." }
        return byteArrayOf(
            0xAB.toByte(),
            (bodyLength ushr 8).toByte(),
            bodyLength.toByte(),
            0xFF.toByte(),
            PROP_CMD_SET_QR.toByte(),
            qrType.toByte()
        ) + qrBytes
    }

    private fun buildAlarmPayload(
        id: Int, enabled: Boolean, hour: Int, minute: Int,
        repeatMask: Int, remindFlags: Int
    ): ByteArray {
        // 0xAB 00 09 FF 73 80 id status hour minute repeat remindFlags
        return byteArrayOf(
            -85, 0, 9, -1, PROP_CMD_SET_ALARM.toByte(), Byte.MIN_VALUE,
            id.toByte(),
            if (enabled) 1 else 0,
            hour.toByte(),
            minute.toByte(),
            repeatMask.toByte(),
            remindFlags.toByte()
        )
    }

    @SuppressLint("MissingPermission")
    @Suppress("DEPRECATION")
    private fun writeAlertLevel(
        gatt: BluetoothGatt,
        characteristic: BluetoothGattCharacteristic,
        level: Byte
    ): Boolean {
        if (bluetoothGatt !== gatt) return false
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
        return started
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
        sifliDataCharacteristic = null
        sifliNotificationsReady = false
        sifliMtu = 23
        sifliReassembler.reset()
        sifliHandshakeDone = false
        watchConnected = false
        proprietaryBatterySupported = false
        proprietaryAssembly.reset()
        stopHeartbeat()
        pendingSifliWrite?.complete(false)
        pendingSifliWrite = null
        pendingSifliMtuChange?.completeExceptionally(
            IllegalStateException("Watch disconnected during MTU negotiation.")
        )
        pendingSifliMtuChange = null
        sifliIncomingMessages.trySend(ByteArray(0))
        pendingNotificationDescriptors.clear()
        notificationDescriptorWritePending = false
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
                supportsSifliWatchface = false,
                supportsProprietaryCommands = false,
                watchConnected = false,
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

        private const val SIFLI_WATCHFACE_CATEGORY = 0x04
        // Native watchface type: confirmed by a successful type-0 upload on this HK watch.
        private const val SIFLI_WATCHFACE_FILE_TYPE_WATCHFACE = 0
        private const val SIFLI_PHONE_TYPE_ANDROID = 2
        private const val SIFLI_MAX_DATA_LENGTH = 10 * 1024
        private const val SIFLI_REQUESTED_MTU = 247
        private const val SIFLI_MTU_TIMEOUT_MS = 3_000L
        private const val SIFLI_WRITE_TIMEOUT_MS = 5_000L
        private const val SIFLI_RESPONSE_TIMEOUT_MS = 12_000L
        private const val MAX_SIFLI_MESSAGE_LENGTH = 65_535
        private const val SIFLI_ABORT_REASON_PHONE = 1
        private const val SIFLI_MSG_START_REQ = 0
        private const val SIFLI_MSG_START_RSP = 1
        private const val SIFLI_MSG_FILE_SEND_START_REQ = 2
        private const val SIFLI_MSG_FILE_SEND_START_RSP = 3
        private const val SIFLI_MSG_FILE_SEND_DATA = 4
        private const val SIFLI_MSG_FILE_SEND_DATA_RSP = 5
        private const val SIFLI_MSG_FILE_SEND_END_REQ = 6
        private const val SIFLI_MSG_FILE_SEND_END_RSP = 7
        private const val SIFLI_MSG_END_REQ = 8
        private const val SIFLI_MSG_END_RSP = 9
        private const val SIFLI_MSG_LOSE_CHECK_REQ = 10
        private const val SIFLI_MSG_LOSE_CHECK_RSP = 11
        private const val SIFLI_MSG_ABORT_CMD = 12
        private const val SIFLI_MSG_FILE_INFO_REQ = 13
        private const val SIFLI_MSG_FILE_INFO_RSP = 14
        private const val SIFLI_STATUS_OK = 0
        private const val ALERT_LEVEL_NONE: Byte = 0x00

        // Proprietary command bytes (reverse-engineered from Wearfit Pro's com.wakeup layer).
        // These share the Sifli serial data characteristic (...0200) and category 0x04.
        private const val PROPRIETARY_CMD_HEARTBEAT_REQ: Int = 11   // watch sends 11/1, we reply 11/2
        private const val PROPRIETARY_CMD_PHONE_SYSTEM: Int = 32      // we send phone system
        private const val PROPRIETARY_CMD_DEVICE_INFO: Int = 146      // 0x92 unsigned (-110 signed)
        private const val PROPRIETARY_CMD_BATTERY: Int = 145          // watch reports battery at index 7

        private val PROPRIETARY_HEARTBEAT_RESPONSE = byteArrayOf(-22, 0, 3, 0, 11, 2)
        private val PROPRIETARY_PHONE_SYSTEM_PAYLOAD = byteArrayOf(-85, 0, 5, -1, 32, Byte.MIN_VALUE, 1, 2)
        private val PROPRIETARY_DEVICE_INFO_PAYLOAD = byteArrayOf(-85, 0, 4, -1, -110, Byte.MIN_VALUE, 1)

        private const val PROPRIETARY_HEARTBEAT_INTERVAL_MS = 30_000L
        private const val PROPRIETARY_BATTERY_INTERVAL_MS = 60_000L
        private const val PROPRIETARY_CMD_TIMEOUT_MS = 5_000L
        private const val MAX_PROPRIETARY_MESSAGE_LENGTH = 16 * 1024

        // Proprietary command IDs (matching Wearfit Pro)
        private const val PROP_CMD_FIND_BAND = 0x71 // 113
        private const val PROP_CMD_SET_QR = 0x80  // 128: send QR; 0xA8 is the result response
        private const val PROP_CMD_SET_ALARM = 0x73 // 115

        private val BATTERY_SERVICE_UUID = java.util.UUID.fromString("0000180f-0000-1000-8000-00805f9b34fb")
        private val BATTERY_LEVEL_UUID = java.util.UUID.fromString("00002a19-0000-1000-8000-00805f9b34fb")
        private val HEART_RATE_SERVICE_UUID = java.util.UUID.fromString("0000180d-0000-1000-8000-00805f9b34fb")
        private val HEART_RATE_MEASUREMENT_UUID = java.util.UUID.fromString("00002a37-0000-1000-8000-00805f9b34fb")
        private val IMMEDIATE_ALERT_SERVICE_UUID = java.util.UUID.fromString("00001802-0000-1000-8000-00805f9b34fb")
        private val CURRENT_TIME_SERVICE_UUID = java.util.UUID.fromString("00001805-0000-1000-8000-00805f9b34fb")
        private val CURRENT_TIME_CHARACTERISTIC_UUID = java.util.UUID.fromString("00002a2b-0000-1000-8000-00805f9b34fb")
        private val ALERT_LEVEL_UUID = java.util.UUID.fromString("00002a06-0000-1000-8000-00805f9b34fb")
        private val CLIENT_CONFIG_UUID = java.util.UUID.fromString("00002902-0000-1000-8000-00805f9b34fb")
        private val SIFLI_SERIAL_SERVICE_UUID = java.util.UUID.fromString("00000000-0000-0000-6473-5f696c666973")
        private val SIFLI_SERIAL_DATA_UUID = java.util.UUID.fromString("00000000-0000-0200-6473-5f696c666973")

        @Volatile
        private var instance: BleWatchManager? = null

        fun getInstance(context: Context): BleWatchManager =
            instance ?: synchronized(this) {
                instance ?: BleWatchManager(context.applicationContext).also { instance = it }
            }
    }
}
