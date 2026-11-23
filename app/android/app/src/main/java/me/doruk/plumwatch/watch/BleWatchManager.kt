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
import android.Manifest
import android.content.Intent
import android.content.pm.PackageManager
import android.media.AudioManager
import android.view.KeyEvent
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

internal object WatchfaceArchivePaths {
    /** Returns the absolute watch-side path while rejecting ZIP traversal and malformed names. */
    fun toWatchPath(entryName: String): String {
        val normalized = entryName.replace('\\', '/').trimStart('/')
        require(normalized.isNotBlank()) { "The watchface archive contains an empty file path." }
        val segments = normalized.split('/')
        require(segments.all { segment ->
            segment.isNotBlank() && segment != "." && segment != ".." &&
                segment.none { character -> character.isISOControl() }
        }) { "The watchface archive contains an unsafe file path." }
        val watchPath = "/" + segments.joinToString("/")
        require(watchPath.toByteArray(StandardCharsets.UTF_8).size <= 255) {
            "The watchface archive contains a file path that is too long for the watch protocol."
        }
        return watchPath
    }

    /** Resolves a watch-side path inside the app's extraction directory, never at filesystem root. */
    fun resolveInside(root: File, watchPath: String): File {
        require(watchPath.startsWith('/')) { "The watchface destination path must be absolute." }
        val relativePath = watchPath.removePrefix("/")
        require(relativePath.isNotBlank()) { "The watchface destination path is empty." }
        val canonicalRoot = root.canonicalFile
        val destination = File(canonicalRoot, relativePath).canonicalFile
        val rootPrefix = canonicalRoot.path.trimEnd(File.separatorChar) + File.separator
        require(destination.path.startsWith(rootPrefix)) {
            "The watchface archive path escapes the extraction directory."
        }
        return destination
    }
}

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
    val batteryUpdatedAt: Long? = null,
    val heartRateBpm: Int? = null,
    val bloodOxygenPercent: Int? = null,
    val heartRateUpdatedAt: Long? = null,
    val bloodOxygenUpdatedAt: Long? = null,
    val cameraRequestSequence: Int = 0,
    val cameraShutterSequence: Int = 0,
    val cameraSwitchSequence: Int = 0,
    val supportsBattery: Boolean = false,
    val supportsHeartRate: Boolean = false,
    val supportsBloodOxygen: Boolean = false,
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
    private val deviceSettingsPreferences = appContext.getSharedPreferences(
        DEVICE_SETTINGS_PREFERENCES,
        Context.MODE_PRIVATE
    )
    private val initialSavedDevice = readSavedDevice()
    private val mutableState = MutableStateFlow(
        BleUiState(
            batteryPercent = preferences.getInt(KEY_BATTERY_PERCENT, -1).takeIf { it in 0..100 },
            batteryUpdatedAt = preferences.getLong(KEY_BATTERY_UPDATED_AT, 0L).takeIf { it > 0L },
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
    private var heartRateCharacteristic: BluetoothGattCharacteristic? = null
    private var findWatchCharacteristic: BluetoothGattCharacteristic? = null
    private var currentTimeCharacteristic: BluetoothGattCharacteristic? = null

    // Wearfit's regular settings/control channel. Prefer its NUS route when advertised.
    private var wearfitWriteCharacteristic: BluetoothGattCharacteristic? = null
    private var wearfitNotifyCharacteristic: BluetoothGattCharacteristic? = null
    private var wearfitNotificationsReady = false
    private val pendingWearfitWrites = java.util.ArrayDeque<ByteArray>()
    private var activeWearfitWrite: ByteArray? = null
    private var activeWearfitWriteCharacteristic: BluetoothGattCharacteristic? = null
    private var initialSetupTimeSyncPending = false

    // SiFli is retained exclusively for its separate watchface/file-transfer protocol.
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

    // Proprietary handshake state is informational; writable settings do not wait for this reply.
    private var sifliHandshakeDone = false

    // Reassembly buffer for proprietary (non-SiFli) commands that arrive fragmented.
    private val proprietaryAssembly = ByteArrayOutputStream()

    private val stopFindWatchTask = Runnable {
        val gatt = bluetoothGatt ?: return@Runnable
        val characteristic = findWatchCharacteristic ?: return@Runnable
        writeAlertLevel(gatt, characteristic, ALERT_LEVEL_NONE)
    }

    private val wearfitWriteTimeoutTask = Runnable {
        if (activeWearfitWrite != null) {
            activeWearfitWrite = null
            activeWearfitWriteCharacteristic = null
            pendingWearfitWrites.clear()
            mutableState.update {
                it.copy(errorMessage = "The watch did not complete a Bluetooth command write. Reconnect and try again.")
            }
        }
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

    private var lastAutomaticHealthSyncAt = 0L
    private val automaticSyncTask = object : Runnable {
        override fun run() {
            if (bluetoothGatt == null) return
            refreshBattery()
            val now = System.currentTimeMillis()
            if (mutableState.value.supportsProprietaryCommands &&
                (lastAutomaticHealthSyncAt == 0L ||
                    now - lastAutomaticHealthSyncAt >= AUTO_SYNC_HEALTH_INTERVAL_MS)
            ) {
                refreshHealth()
                lastAutomaticHealthSyncAt = now
            }
            handler.postDelayed(this, AUTO_SYNC_BATTERY_INTERVAL_MS)
        }
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
                resetWearfitTransport()
                batteryCharacteristic = null
                heartRateCharacteristic = null
                findWatchCharacteristic = null
                sifliDataCharacteristic = null
                sifliHandshakeDone = false
                proprietaryAssembly.reset()
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
                    stopAutomaticSync()
                    resetWearfitTransport()
                    batteryCharacteristic = null
                    heartRateCharacteristic = null
                    findWatchCharacteristic = null
                    sifliDataCharacteristic = null
                    sifliNotificationsReady = false
                    sifliMtu = 23
                    sifliReassembler.reset()
                    sifliHandshakeDone = false
                    proprietaryAssembly.reset()
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
                             bloodOxygenPercent = null,
                             heartRateUpdatedAt = null,
                             bloodOxygenUpdatedAt = null,
                             supportsBloodOxygen = false,
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
            val nusService = gatt.getService(NUS_SERVICE_UUID)
            val nusWrite = nusService?.getCharacteristic(NUS_WRITE_CHARACTERISTIC_UUID)
            val nusNotify = nusService?.getCharacteristic(NUS_NOTIFY_CHARACTERISTIC_UUID)
            val nusCanWrite = nusWrite != null && nusWrite.properties and (
                BluetoothGattCharacteristic.PROPERTY_WRITE or
                    BluetoothGattCharacteristic.PROPERTY_WRITE_NO_RESPONSE
            ) != 0
            val nusCanNotify = nusNotify != null && nusNotify.properties and (
                BluetoothGattCharacteristic.PROPERTY_NOTIFY or
                    BluetoothGattCharacteristic.PROPERTY_INDICATE
            ) != 0

            val sifliData = gatt.getService(SIFLI_SERIAL_SERVICE_UUID)
                ?.getCharacteristic(SIFLI_SERIAL_DATA_UUID)
            val sifliCanWrite = sifliData != null && sifliData.properties and (
                BluetoothGattCharacteristic.PROPERTY_WRITE_NO_RESPONSE or
                    BluetoothGattCharacteristic.PROPERTY_WRITE
            ) != 0
            val sifliCanNotify = sifliData != null && sifliData.properties and (
                BluetoothGattCharacteristic.PROPERTY_NOTIFY or
                    BluetoothGattCharacteristic.PROPERTY_INDICATE
            ) != 0

            batteryCharacteristic = battery
            heartRateCharacteristic = heartRate
            currentTimeCharacteristic = currentTime?.takeIf { timeSyncWritable }
            sifliDataCharacteristic = sifliData?.takeIf { sifliCanWrite }
            sifliNotificationsReady = false

            // Wearfit's general command route is NUS. Some device families expose the same
            // command protocol over the SiFli serial characteristic, so retain that as fallback.
            val useNus = nusCanWrite && nusCanNotify
            wearfitWriteCharacteristic = when {
                useNus -> nusWrite
                sifliCanWrite && sifliCanNotify -> sifliData
                else -> null
            }
            wearfitNotifyCharacteristic = when {
                useNus -> nusNotify
                sifliCanWrite && sifliCanNotify -> sifliData
                else -> null
            }
            wearfitNotificationsReady = false
            pendingWearfitWrites.clear()
            activeWearfitWrite = null
            activeWearfitWriteCharacteristic = null
            handler.removeCallbacks(wearfitWriteTimeoutTask)
            initialSetupTimeSyncPending = false

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
                    supportsProprietaryCommands = false,
                    connectionMessage = "Connected"
                )
            }

            pendingNotificationDescriptors.clear()
            listOfNotNull(
                battery,
                heartRate,
                wearfitNotifyCharacteristic,
                sifliDataCharacteristic
            ).distinctBy { it.uuid }.forEach { characteristic ->
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
            if (descriptor.characteristic.uuid == wearfitNotifyCharacteristic?.uuid) {
                wearfitNotificationsReady = status == BluetoothGatt.GATT_SUCCESS &&
                    wearfitWriteCharacteristic != null
                mutableState.update {
                    it.copy(
                        supportsProprietaryCommands = false,
                        supportsTimeSync = currentTimeCharacteristic != null,
                        errorMessage = if (wearfitNotificationsReady) it.errorMessage
                        else "The watch command channel could not enable notifications."
                    )
                }
            }
            if (descriptor.characteristic.uuid == SIFLI_SERIAL_DATA_UUID) {
                sifliNotificationsReady = status == BluetoothGatt.GATT_SUCCESS &&
                    sifliDataCharacteristic != null
                mutableState.update {
                    it.copy(
                        supportsSifliWatchface = sifliNotificationsReady,
                        errorMessage = if (status == BluetoothGatt.GATT_SUCCESS) it.errorMessage
                        else "The watchface transfer channel could not enable notifications."
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
            if (characteristic.uuid == SIFLI_SERIAL_DATA_UUID) {
                pendingSifliWrite?.let { pending ->
                    if (!pending.isCompleted) pending.complete(status == BluetoothGatt.GATT_SUCCESS)
                }
            }
            if (characteristic.uuid == wearfitWriteCharacteristic?.uuid) {
                completeWearfitWrite(gatt, characteristic, status)
            }
            if (characteristic.uuid == CURRENT_TIME_CHARACTERISTIC_UUID) {
                mutableState.update {
                    it.copy(
                        lastTimeSyncAt = if (status == BluetoothGatt.GATT_SUCCESS) {
                            System.currentTimeMillis()
                        } else it.lastTimeSyncAt,
                        errorMessage = if (status == BluetoothGatt.GATT_SUCCESS) it.errorMessage
                        else "The watch rejected the standard Current Time update."
                    )
                }
                if (initialSetupTimeSyncPending) {
                    initialSetupTimeSyncPending = false
                    startProprietaryHandshake(gatt)
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
                handleIncomingCharacteristic(characteristic, value)
            }
        }

        override fun onCharacteristicChanged(
            gatt: BluetoothGatt,
            characteristic: BluetoothGattCharacteristic,
            value: ByteArray
        ) {
            if (bluetoothGatt !== gatt) return
            handleIncomingCharacteristic(characteristic, value)
        }

        private fun handleIncomingCharacteristic(
            characteristic: BluetoothGattCharacteristic,
            value: ByteArray
        ) {
            when {
                characteristic.uuid == SIFLI_SERIAL_DATA_UUID ->
                    handleSerialData(value)
                characteristic.uuid == wearfitNotifyCharacteristic?.uuid ->
                    handleProprietaryCommand(value)
                else -> handleCharacteristicValue(characteristic, value)
            }
        }

        /** Routes SiFli serial notifications: Wearfit command frames first, then watchface frames. */
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
            val separator = cmd[3].toInt() and 0xFF
            if ((marker != 0xAB && marker != 0xEA) || (separator != 0xFF && separator != 0x00)) return
            val commandId = cmd[4].toInt() and 0xFF

            WearfitProtocol.parseHealthMeasurement(cmd)?.let { measurement ->
                val timestamp = System.currentTimeMillis()
                measurement.heartRateBpm?.let { persistHealthSample("hr_samples", timestamp, it) }
                measurement.bloodOxygenPercent?.let { persistHealthSample("spo_samples", timestamp, it) }
                mutableState.update { current ->
                    current.copy(
                        heartRateBpm = measurement.heartRateBpm ?: current.heartRateBpm,
                        bloodOxygenPercent = measurement.bloodOxygenPercent ?: current.bloodOxygenPercent,
                        heartRateUpdatedAt = if (measurement.heartRateBpm != null) timestamp else current.heartRateUpdatedAt,
                        bloodOxygenUpdatedAt = if (measurement.bloodOxygenPercent != null) timestamp else current.bloodOxygenUpdatedAt,
                        supportsHeartRate = current.supportsHeartRate || measurement.heartRateBpm != null,
                        supportsBloodOxygen = current.supportsBloodOxygen || measurement.bloodOxygenPercent != null
                    )
                }
                return
            }

            // Heartbeat request from watch: marker 171/234, cmd 11, arg 1
            if (commandId == PROPRIETARY_CMD_HEARTBEAT_REQ && cmd.size >= 6 && cmd[5].toInt() and 0xFF == 1) {
                val char = wearfitWriteCharacteristic
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
                    mutableState.update {
                        it.copy(
                            supportsProprietaryCommands = true,
                            canFindWatch = it.canFindWatch || wearfitWriteCharacteristic != null,
                            watchConnected = true,
                            connectionMessage = "Connected · watch handshake complete"
                        )
                    }
                    applyAutomaticConnectionSettings()
                    startAutomaticSync()
                }
                return
            }

            // Battery report: cmd 145, battery level at index 7
            if (commandId == PROPRIETARY_CMD_BATTERY && cmd.size >= 8) {
                val level = cmd[7].toInt() and 0xFF
                if (level in 0..100) {
                    val updatedAt = persistBatteryLevel(level)
                    mutableState.update {
                        it.copy(batteryPercent = level, batteryUpdatedAt = updatedAt, supportsBattery = true)
                    }
                }
                return
            }

            // HealthDataAnalyzer: command 0x31 dispatches measurement type from byte 5.
            // OldDataSyncProxy.saveSingleHR/saveCurrentHR and saveSingleBO/saveCurrentBO
            // read the returned numeric measurement from byte 6.
            if (marker == 0xAB && separator == 0xFF && commandId == 0x31 && cmd.size >= 7) {
                val measurementType = cmd[5].toInt() and 0xFF
                val reading = cmd[6].toInt() and 0xFF
                val timestamp = System.currentTimeMillis()
                when (measurementType) {
                    9, 10 -> if (reading in 1..255) {
                        persistHealthSample("hr_samples", timestamp, reading)
                        mutableState.update {
                            it.copy(
                                heartRateBpm = reading,
                                heartRateUpdatedAt = timestamp,
                                supportsHeartRate = true
                            )
                        }
                    }
                    17, 18 -> if (reading in 1..100) {
                        persistHealthSample("spo_samples", timestamp, reading)
                        mutableState.update {
                            it.copy(
                                bloodOxygenPercent = reading,
                                bloodOxygenUpdatedAt = timestamp,
                                supportsBloodOxygen = true
                            )
                        }
                    }
                }
                return
            }

            // Match Wearfit's CameraControlAnalyzer exactly:
            // EA ... 15 02 = direct lens switch.
            // EA ... 15 01 <state> [width:2] [height:2], state 1=shutter, 2=lens switch.
            if (commandId == 0x15 && marker == 0xEA) {
                WearfitProtocol.parseCameraControlEvent(cmd)?.let { event ->
                    mutableState.update { current ->
                        current.copy(
                            cameraRequestSequence = current.cameraRequestSequence +
                                if (event.requestsCamera) 1 else 0,
                            cameraShutterSequence = current.cameraShutterSequence +
                                if (event.takePhoto) 1 else 0,
                            cameraSwitchSequence = current.cameraSwitchSequence +
                                if (event.switchCamera) 1 else 0
                        )
                    }
                }
                return
            }

            // Watch-originated media controls use marker 0xEA, command 19.
            if (marker == 0xEA && commandId == 19 && cmd.size >= 6) {
                dispatchPhoneMediaCommand(cmd[5].toInt() and 0xFF)
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


    fun controlPhoneMedia(command: Int): Boolean = dispatchPhoneMediaCommand(command)

    private fun dispatchPhoneMediaCommand(command: Int): Boolean {
        val audioManager = appContext.getSystemService(Context.AUDIO_SERVICE) as? AudioManager ?: return false
        val keyCode = when (command) {
            1 -> KeyEvent.KEYCODE_MEDIA_PLAY
            2 -> KeyEvent.KEYCODE_MEDIA_PAUSE
            3 -> KeyEvent.KEYCODE_MEDIA_NEXT
            4 -> KeyEvent.KEYCODE_MEDIA_PREVIOUS
            5 -> {
                audioManager.adjustVolume(AudioManager.ADJUST_RAISE, 0)
                return true
            }
            6 -> {
                audioManager.adjustVolume(AudioManager.ADJUST_LOWER, 0)
                return true
            }
            else -> return false
        }
        audioManager.dispatchMediaKeyEvent(KeyEvent(KeyEvent.ACTION_DOWN, keyCode))
        audioManager.dispatchMediaKeyEvent(KeyEvent(KeyEvent.ACTION_UP, keyCode))
        return true
    }

    @SuppressLint("MissingPermission")
    private fun writeNextNotificationDescriptor(gatt: BluetoothGatt) {
        if (bluetoothGatt !== gatt || notificationDescriptorWritePending) return
        val descriptor = pendingNotificationDescriptors.pollFirst()
        if (descriptor == null) {
            finishServiceSetup(gatt)
            return
        }
        val properties = descriptor.characteristic.properties
        val value = if (properties and BluetoothGattCharacteristic.PROPERTY_NOTIFY != 0) {
            BluetoothGattDescriptor.ENABLE_NOTIFICATION_VALUE
        } else {
            BluetoothGattDescriptor.ENABLE_INDICATION_VALUE
        }
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

    private fun startAutomaticSync() {
        handler.removeCallbacks(automaticSyncTask)
        lastAutomaticHealthSyncAt = 0L
        handler.postDelayed(automaticSyncTask, AUTO_SYNC_INITIAL_DELAY_MS)
    }

    private fun stopAutomaticSync() {
        handler.removeCallbacks(automaticSyncTask)
        lastAutomaticHealthSyncAt = 0L
    }

    private fun applyAutomaticConnectionSettings() {
        setTimeFormat(deviceSettingsPreferences.getBoolean(KEY_TIME_FORMAT_24H, true))
        setRaiseToWake(deviceSettingsPreferences.getBoolean(KEY_RAISE_TO_WAKE, true))
        setAutomaticHealthMeasurements(deviceSettingsPreferences.getBoolean(KEY_AUTO_HEALTH, true))
        setSleepMode(
            enabled = deviceSettingsPreferences.getBoolean(KEY_SLEEP_ACTIVE, false),
            mode = deviceSettingsPreferences.getInt(KEY_SLEEP_MODE, 2),
            tracking = deviceSettingsPreferences.getBoolean(KEY_SLEEP_TRACKING, true),
            chargeReminder = deviceSettingsPreferences.getBoolean(KEY_SLEEP_CHARGE_REMINDER, false)
        )
        if (deviceSettingsPreferences.contains(KEY_LANGUAGE)) {
            setWatchLanguage(deviceSettingsPreferences.getInt(KEY_LANGUAGE, 1))
        }
        if (deviceSettingsPreferences.contains(KEY_BODY_TEMPERATURE)) {
            setBodyTemperatureMeasurement(
                deviceSettingsPreferences.getBoolean(KEY_BODY_TEMPERATURE, false)
            )
        }
        if (deviceSettingsPreferences.contains(KEY_NOTIFICATION_ICON)) {
            setNotificationDisplay(
                deviceSettingsPreferences.getInt(KEY_NOTIFICATION_ICON, 3),
                deviceSettingsPreferences.getBoolean(KEY_NOTIFICATION_SHOW, true),
                deviceSettingsPreferences.getBoolean(KEY_NOTIFICATION_HIDE_DETAILS, false)
            )
        }
        // Temporary camera-session mode must not remain enabled after a process restart.
        setShakeToPhoto(false)
        syncStoredAlarms()
    }

    private fun syncStoredAlarms() {
        val alarmPreferences = appContext.getSharedPreferences("plum_watch_alarms", Context.MODE_PRIVATE)
        for (id in 0..7) {
            if (!alarmPreferences.getBoolean("alarm_${id}_exists", false)) continue
            val vibrate = alarmPreferences.getBoolean("alarm_${id}_vibrate", true)
            setAlarm(
                id = id,
                enabled = alarmPreferences.getBoolean("alarm_${id}_enabled", false),
                hour = alarmPreferences.getInt("alarm_${id}_hour", 8),
                minute = alarmPreferences.getInt("alarm_${id}_minute", 0),
                repeatMask = alarmPreferences.getInt("alarm_${id}_repeat", 128),
                remindFlags = if (vibrate) 3 else 2
            )
        }
    }

    private fun persistHealthSample(key: String, timestamp: Long, value: Int) {
        val history = appContext.getSharedPreferences(HEALTH_HISTORY_PREFERENCES, Context.MODE_PRIVATE)
        val existing = history.getString(key, null).orEmpty()
            .split(',')
            .filter { it.contains(':') }
        val encoded = "$timestamp:$value"
        if (existing.lastOrNull() == encoded) return
        history.edit()
            .putString(key, (existing + encoded).takeLast(72).joinToString(","))
            .apply()
    }

    private fun persistBatteryLevel(level: Int): Long {
        val timestamp = System.currentTimeMillis()
        val editor = preferences.edit()
            .putInt(KEY_BATTERY_PERCENT, level)
            .putLong(KEY_BATTERY_UPDATED_AT, timestamp)
        val encoded = preferences.getString(KEY_BATTERY_HISTORY, null).orEmpty()
        val samples = encoded.split(",").mapNotNull { token ->
            val parts = token.split(":", limit = 2)
            if (parts.size != 2) null
            else {
                val time = parts[0].toLongOrNull()
                val value = parts[1].toIntOrNull()
                if (time != null && value != null && value in 0..100) time to value else null
            }
        }.toMutableList()
        val last = samples.lastOrNull()
        if (last == null || last.second != level || timestamp - last.first >= AUTO_SYNC_BATTERY_INTERVAL_MS) {
            samples.add(timestamp to level)
        }
        editor.putString(
            KEY_BATTERY_HISTORY,
            samples.takeLast(MAX_BATTERY_HISTORY_SAMPLES).joinToString(",") { "${it.first}:${it.second}" }
        ).apply()
        return timestamp
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
        // Start standard battery polling after GATT setup; it must not depend on
        // the optional Wearfit proprietary handshake.
        startAutomaticSync()
        if (!wearfitNotificationsReady || wearfitWriteCharacteristic == null) {
            mutableState.update {
                it.copy(
                    supportsProprietaryCommands = false,
                    errorMessage = if (it.errorMessage != null) it.errorMessage
                    else "The watch did not expose a ready command channel."
                )
            }
            readPendingBattery(gatt)
            return
        }

        if (currentTimeCharacteristic != null) {
            initialSetupTimeSyncPending = true
            if (!startCurrentTimeSync(gatt)) {
                initialSetupTimeSyncPending = false
                startProprietaryHandshake(gatt)
            }
        } else {
            startProprietaryHandshake(gatt)
        }
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
        if (startCurrentTimeSync(gatt)) return

        mutableState.update {
            it.copy(errorMessage = "This watch does not expose standard time synchronisation.")
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
        if (wearfitWriteCharacteristic?.uuid == SIFLI_SERIAL_DATA_UUID &&
            (activeWearfitWrite != null || pendingWearfitWrites.isNotEmpty())
        ) {
            throw IllegalStateException("Wait for pending watch settings to finish before sending a watchface.")
        }
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

    /** Unzips safely inside destDir and returns entries sorted by descending size (GIFs last). */
    private fun unzipArchive(archive: File, destDir: File): List<WatchfaceFileEntry> {
        if (!destDir.exists() && !destDir.mkdirs()) {
            throw IllegalStateException("Could not create the temporary watchface directory.")
        }

        val entries = mutableListOf<WatchfaceFileEntry>()
        val seenWatchPaths = HashSet<String>()
        var extractedBytes = 0L
        java.util.zip.ZipFile(archive).use { zip ->
            val enumeration = zip.entries()
            while (enumeration.hasMoreElements()) {
                val entry = enumeration.nextElement()
                if (entry.isDirectory) continue
                if (entries.size >= MAX_WATCHFACE_FILES) {
                    throw IllegalArgumentException("The watchface archive contains too many files.")
                }

                // Keep the leading slash for the watch protocol, but strip it before local extraction.
                val watchPath = WatchfaceArchivePaths.toWatchPath(entry.name)
                if (!seenWatchPaths.add(watchPath)) {
                    throw IllegalArgumentException("The watchface archive contains a duplicate path: $watchPath")
                }
                val destFile = WatchfaceArchivePaths.resolveInside(destDir, watchPath)
                val parent = destFile.parentFile
                    ?: throw IllegalArgumentException("The watchface archive contains an invalid file path.")
                if (!parent.exists() && !parent.mkdirs()) {
                    throw IllegalStateException("Could not create a watchface extraction subdirectory.")
                }

                var fileBytes = 0L
                zip.getInputStream(entry).use { input ->
                    destFile.outputStream().buffered().use { output ->
                        val buffer = ByteArray(8 * 1024)
                        while (true) {
                            val count = input.read(buffer)
                            if (count < 0) break
                            fileBytes += count
                            extractedBytes += count
                            if (fileBytes > MAX_WATCHFACE_FILE_BYTES ||
                                extractedBytes > MAX_WATCHFACE_TOTAL_BYTES
                            ) {
                                throw IllegalArgumentException("The watchface archive expands beyond the allowed size.")
                            }
                            output.write(buffer, 0, count)
                        }
                    }
                }

                if (entry.size >= 0L && fileBytes != entry.size) {
                    throw IllegalStateException("A watchface archive entry was extracted incompletely.")
                }
                entries += WatchfaceFileEntry(destFile, watchPath, fileBytes)
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
                val updatedAt = persistBatteryLevel(level)
                mutableState.update { it.copy(batteryPercent = level, batteryUpdatedAt = updatedAt, supportsBattery = true) }
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
                if (bpm in 1..65535) {
                    val timestamp = System.currentTimeMillis()
                    persistHealthSample("hr_samples", timestamp, bpm)
                    mutableState.update {
                        it.copy(heartRateBpm = bpm, heartRateUpdatedAt = timestamp)
                    }
                }
            }
        }
    }

    @SuppressLint("MissingPermission")
    fun refreshHealth() {
        val gatt = bluetoothGatt ?: return
        val characteristic = heartRateCharacteristic
        if (characteristic != null &&
            characteristic.properties and BluetoothGattCharacteristic.PROPERTY_READ != 0
        ) {
            gatt.readCharacteristic(characteristic)
        }

        // Wearfit measurement requests are independent of the standard BLE HR service.
        // The readings arrive asynchronously in a Wearfit health-sync frame.
        requestHeartRateMeasurement()
        requestBloodOxygenMeasurement()
    }

    /** Refreshes battery state for the device card, independently of health metrics. */
    @SuppressLint("MissingPermission")
    fun refreshBattery() {
        val gatt = bluetoothGatt ?: return
        val standardBattery = batteryCharacteristic
        if (standardBattery != null &&
            standardBattery.properties and BluetoothGattCharacteristic.PROPERTY_READ != 0
        ) {
            gatt.readCharacteristic(standardBattery)
        } else {
            wearfitWriteCharacteristic?.let { characteristic ->
                sendProprietaryCommand(gatt, characteristic, PROPRIETARY_DEVICE_INFO_PAYLOAD)
            }
        }
    }

    private fun sendWearfitPacket(packet: ByteArray): Boolean {
        val gatt = bluetoothGatt ?: return false
        val characteristic = wearfitWriteCharacteristic ?: return false
        val queued = sendProprietaryCommand(gatt, characteristic, packet)
        mutableState.update {
            it.copy(errorMessage = if (queued) null else "Android could not queue the watch command.")
        }
        return queued
    }

    /** Queue Wearfit commands so Android never has overlapping characteristic writes. */
    @SuppressLint("MissingPermission")
    private fun sendProprietaryCommand(
        gatt: BluetoothGatt,
        characteristic: BluetoothGattCharacteristic,
        payload: ByteArray
    ): Boolean {
        if (bluetoothGatt !== gatt ||
            !wearfitNotificationsReady ||
            characteristic.uuid != wearfitWriteCharacteristic?.uuid ||
            (characteristic.uuid == SIFLI_SERIAL_DATA_UUID && sifliPushMutex.isLocked)
        ) return false

        pendingWearfitWrites.addLast(payload.copyOf())
        if (activeWearfitWrite == null) startNextWearfitWrite(gatt)
        return activeWearfitWrite != null || pendingWearfitWrites.isNotEmpty()
    }

    /**
     * Wearfit's setSmartWarnCarryContent is a separate SplitWriter path.
     * It uses one 20-byte initial write, then indexed 19-byte continuations.
     * Ordinary settings and camera commands stay as one complete packet.
     */
    @SuppressLint("MissingPermission")
    private fun sendSplitProprietaryCommand(
        gatt: BluetoothGatt,
        characteristic: BluetoothGattCharacteristic,
        payload: ByteArray
    ): Boolean {
        if (bluetoothGatt !== gatt ||
            !wearfitNotificationsReady ||
            characteristic.uuid != wearfitWriteCharacteristic?.uuid ||
            (characteristic.uuid == SIFLI_SERIAL_DATA_UUID && sifliPushMutex.isLocked) ||
            payload.isEmpty()
        ) return false

        WearfitProtocol.splitLongMessage(payload).forEach { fragment ->
            pendingWearfitWrites.addLast(fragment)
        }
        if (activeWearfitWrite == null) startNextWearfitWrite(gatt)
        return activeWearfitWrite != null || pendingWearfitWrites.isNotEmpty()
    }

    @SuppressLint("MissingPermission")
    private fun startNextWearfitWrite(gatt: BluetoothGatt) {
        if (bluetoothGatt !== gatt || activeWearfitWrite != null ||
            !wearfitNotificationsReady
        ) return

        val characteristic = wearfitWriteCharacteristic ?: run {
            pendingWearfitWrites.clear()
            return
        }
        val payload = pendingWearfitWrites.pollFirst() ?: return
        val writeType = if (
            characteristic.properties and BluetoothGattCharacteristic.PROPERTY_WRITE != 0
        ) {
            BluetoothGattCharacteristic.WRITE_TYPE_DEFAULT
        } else if (
            characteristic.properties and BluetoothGattCharacteristic.PROPERTY_WRITE_NO_RESPONSE != 0
        ) {
            BluetoothGattCharacteristic.WRITE_TYPE_NO_RESPONSE
        } else {
            pendingWearfitWrites.clear()
            mutableState.update { it.copy(errorMessage = "The watch command characteristic is not writable.") }
            return
        }

        val started = try {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
                gatt.writeCharacteristic(characteristic, payload, writeType) == BluetoothStatusCodes.SUCCESS
            } else {
                @Suppress("DEPRECATION")
                characteristic.writeType = writeType
                @Suppress("DEPRECATION")
                characteristic.value = payload
                @Suppress("DEPRECATION")
                gatt.writeCharacteristic(characteristic)
            }
        } catch (_: SecurityException) {
            false
        }

        if (!started) {
            pendingWearfitWrites.clear()
            mutableState.update {
                it.copy(errorMessage = "Android could not start the Bluetooth command write.")
            }
            return
        }

        activeWearfitWrite = payload
        activeWearfitWriteCharacteristic = characteristic
        handler.removeCallbacks(wearfitWriteTimeoutTask)
        handler.postDelayed(wearfitWriteTimeoutTask, WEARFIT_WRITE_TIMEOUT_MS)
    }

    private fun completeWearfitWrite(
        gatt: BluetoothGatt,
        characteristic: BluetoothGattCharacteristic,
        status: Int
    ) {
        if (bluetoothGatt !== gatt ||
            activeWearfitWrite == null ||
            characteristic.uuid != activeWearfitWriteCharacteristic?.uuid
        ) return

        handler.removeCallbacks(wearfitWriteTimeoutTask)
        activeWearfitWrite = null
        activeWearfitWriteCharacteristic = null
        if (status != BluetoothGatt.GATT_SUCCESS) {
            pendingWearfitWrites.clear()
            mutableState.update {
                it.copy(errorMessage = "The watch rejected a Bluetooth command write.")
            }
            return
        }
        startNextWearfitWrite(gatt)
    }

    private fun resetWearfitTransport() {
        handler.removeCallbacks(wearfitWriteTimeoutTask)
        wearfitWriteCharacteristic = null
        wearfitNotifyCharacteristic = null
        wearfitNotificationsReady = false
        pendingWearfitWrites.clear()
        activeWearfitWrite = null
        activeWearfitWriteCharacteristic = null
        initialSetupTimeSyncPending = false
    }

    /** Starts the Wearfit handshake after the command notification channel is ready. */
    @SuppressLint("MissingPermission")
    private fun startProprietaryHandshake(gatt: BluetoothGatt) {
        val char = wearfitWriteCharacteristic ?: return
        if (!wearfitNotificationsReady) return

        sendProprietaryCommand(gatt, char, PROPRIETARY_PHONE_SYSTEM_PAYLOAD)
        handler.postDelayed({
            if (bluetoothGatt === gatt) {
                sendProprietaryCommand(gatt, char, PROPRIETARY_DEVICE_INFO_PAYLOAD)
            }
        }, 300L)
    }


    @SuppressLint("MissingPermission")
    fun findWatch() {
        val gatt = bluetoothGatt ?: return
        handler.removeCallbacks(stopFindWatchTask)

        val proprietaryStarted = wearfitWriteCharacteristic?.let { characteristic ->
            sendProprietaryCommand(gatt, characteristic, buildFindBandPayload())
        } ?: false
        val standardStarted = if (proprietaryStarted) false else {
            findWatchCharacteristic?.let { characteristic ->
                writeAlertLevel(gatt, characteristic, ALERT_LEVEL_HIGH)
            } ?: false
        }
        if (standardStarted) {
            handler.postDelayed(stopFindWatchTask, FIND_WATCH_ALERT_DURATION_MS)
        }

        if (!standardStarted && !proprietaryStarted) {
            mutableState.update {
                it.copy(errorMessage = "This watch does not expose a working Find Watch command.")
            }
        } else {
            mutableState.update { it.copy(errorMessage = null) }
        }
    }


    /** Sends a documented Wearfit setting without waiting for a device-info response. */
    private fun sendWearfitSetting(
        commandId: Int,
        data: ByteArray,
        marker: Int = 0xAB,
        separator: Int = 0xFF
    ): Boolean {
        return sendWearfitPacket(WearfitProtocol.packet(commandId, data, marker, separator))
    }

    fun setWatchLanguage(languageCode: Int): Boolean {
        if (languageCode !in setOf(0, 1, 5, 6, 8, 9, 10, 11, 13, 24)) return false
        deviceSettingsPreferences.edit().putInt(KEY_LANGUAGE, languageCode).apply()
        return sendWearfitSetting(0x7B, byteArrayOf(0x80.toByte(), languageCode.toByte()))
    }

    fun setTimeFormat(use24Hour: Boolean): Boolean {
        deviceSettingsPreferences.edit().putBoolean(KEY_TIME_FORMAT_24H, use24Hour).apply()
        return sendWearfitSetting(0x7C, byteArrayOf(0x80.toByte(), if (use24Hour) 1 else 0))
    }

    fun setRaiseToWake(enabled: Boolean): Boolean {
        deviceSettingsPreferences.edit().putBoolean(KEY_RAISE_TO_WAKE, enabled).apply()
        return sendWearfitSetting(0x77, byteArrayOf(0x80.toByte(), if (enabled) 1 else 0))
    }

    fun setAutomaticHealthMeasurements(enabled: Boolean): Boolean {
        deviceSettingsPreferences.edit().putBoolean(KEY_AUTO_HEALTH, enabled).apply()
        return sendWearfitSetting(0x78, byteArrayOf(0x80.toByte(), if (enabled) 1 else 0))
    }

    fun setShakeToPhoto(enabled: Boolean): Boolean =
        sendWearfitSetting(0x79, byteArrayOf(0x80.toByte(), if (enabled) 1 else 0))

    /** Wearfit's CameraControlAnalyzer switches preview/capture through command 0x15. */
    fun setCameraPreviewState(enabled: Boolean): Boolean =
        sendWearfitPacket(WearfitProtocol.cameraPreviewState(enabled))

    fun sendCameraPhotoState(first: Int, second: Int, third: Int): Boolean =
        sendWearfitPacket(WearfitProtocol.cameraPhotoState(first, second, third))

    fun startCamera(): Boolean {
        // Do not send until service discovery, command notifications and the
        // Wearfit handshake have completed. The UI retries when readiness changes.
        if (!mutableState.value.isConnected ||
            !mutableState.value.supportsProprietaryCommands ||
            !wearfitNotificationsReady
        ) return false
        return setCameraPreviewState(true)
    }

    fun stopCamera(): Boolean {
        val stopped = setCameraPreviewState(false)
        mutableState.update {
            it.copy(
                cameraRequestSequence = 0,
                cameraShutterSequence = 0,
                cameraSwitchSequence = 0
            )
        }
        return stopped
    }

    /** Exact Wearfit single/real-time requests: HR=(9,0), SpO2=(17,0). */
    fun requestHeartRateMeasurement(realtime: Boolean = false): Boolean =
        sendWearfitSetting(0x31, byteArrayOf(0x09, if (realtime) 1 else 0))

    fun requestBloodOxygenMeasurement(realtime: Boolean = false): Boolean =
        sendWearfitSetting(0x31, byteArrayOf(0x11, if (realtime) 1 else 0))

    /** Sends Wearfit's separate notification-content packet through its 19-byte split queue. */
    fun sendAppNotification(title: String, text: String): Boolean {
        val content = listOf(title.trim(), text.trim())
            .filter { it.isNotEmpty() }
            .joinToString(": ")
        if (content.isBlank()) return false
        val gatt = bluetoothGatt ?: return false
        val characteristic = wearfitWriteCharacteristic ?: return false
        val packet = WearfitProtocol.notificationContent(content)
        val queued = sendSplitProprietaryCommand(gatt, characteristic, packet)
        mutableState.update {
            it.copy(errorMessage = if (queued) null else "Android could not queue the watch notification.")
        }
        return queued
    }

    fun setBodyTemperatureMeasurement(enabled: Boolean): Boolean {
        deviceSettingsPreferences.edit().putBoolean(KEY_BODY_TEMPERATURE, enabled).apply()
        return sendWearfitSetting(0x86, byteArrayOf(0x80.toByte(), if (enabled) 1 else 0))
    }

    fun setNotificationDisplay(iconPrompt: Int, display: Boolean, hideDetails: Boolean): Boolean {
        require(iconPrompt in 0..3)
        deviceSettingsPreferences.edit()
            .putInt(KEY_NOTIFICATION_ICON, iconPrompt)
            .putBoolean(KEY_NOTIFICATION_SHOW, display)
            .putBoolean(KEY_NOTIFICATION_HIDE_DETAILS, hideDetails)
            .apply()
        return sendWearfitSetting(
            commandId = 0x72,
            data = byteArrayOf(0x01, iconPrompt.toByte(), if (display) 1 else 0, if (hideDetails) 1 else 0),
            marker = 0xEA
        )
    }

    fun setSleepMode(enabled: Boolean, mode: Int, tracking: Boolean, chargeReminder: Boolean): Boolean {
        require(mode in 0..2)
        deviceSettingsPreferences.edit()
            .putBoolean(KEY_SLEEP_ACTIVE, enabled)
            .putInt(KEY_SLEEP_MODE, mode)
            .putBoolean(KEY_SLEEP_TRACKING, tracking)
            .putBoolean(KEY_SLEEP_CHARGE_REMINDER, chargeReminder)
            .apply()
        return sendWearfitSetting(
            commandId = 0x7F,
            data = byteArrayOf(
                0x01,
                if (enabled) 1 else 0,
                mode.toByte(),
                if (tracking) 1 else 0,
                if (chargeReminder) 1 else 0
            ),
            marker = 0xEA
        )
    }

    fun setPhysicalTraining(
        autoPause: Boolean,
        startPrompt: Boolean,
        stopPrompt: Boolean,
        keyPause: Boolean
    ): Boolean = sendWearfitSetting(
        commandId = 0x01,
        data = byteArrayOf(
            0x01,
            if (autoPause) 1 else 0,
            if (startPrompt) 1 else 0,
            if (stopPrompt) 1 else 0,
            if (keyPause) 1 else 0
        ),
        marker = 0xEA,
        separator = 0x00
    )

    fun setHeartRateZones(values: List<Int>): Boolean {
        require(values.size == 8) { "Exactly eight heart-rate thresholds are required." }
        require(values.all { it in 0..255 }) { "Heart-rate thresholds must fit in one byte." }
        return sendWearfitSetting(
            commandId = 0xA0,
            data = byteArrayOf(0x00) + values.map { it.toByte() }.toByteArray(),
            marker = 0xEA
        )
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
    ): Boolean {
        val gatt = bluetoothGatt ?: return false
        val characteristic = wearfitWriteCharacteristic ?: return false
        require(id in 0..7) { "Alarm ID must be 0-7" }
        require(hour in 0..23) { "Hour must be 0-23" }
        require(minute in 0..59) { "Minute must be 0-59" }
        require(repeatMask in 0..0xFF) { "Alarm repeat mask must fit in one byte." }
        require(remindFlags in 0..3) { "Alarm reminder flags must be 0-3." }

        val queued = sendProprietaryCommand(
            gatt,
            characteristic,
            buildAlarmPayload(id, enabled, hour, minute, repeatMask, remindFlags)
        )
        mutableState.update {
            it.copy(errorMessage = if (queued) null else "Android could not queue the alarm command.")
        }
        return queued
    }

    private fun buildFindBandPayload(): ByteArray {
        // 0xAB 00 03 FF 71 80
        return byteArrayOf(-85, 0, 3, -1, PROP_CMD_FIND_BAND.toByte(), Byte.MIN_VALUE)
    }

    private fun buildAlarmPayload(
        id: Int, enabled: Boolean, hour: Int, minute: Int,
        repeatMask: Int, remindFlags: Int
    ): ByteArray {
        // 0xAB 00 09 FF 73 80 id status hour minute repeat remindFlags
        return WearfitProtocol.alarm(
            id = id,
            enabled = enabled,
            hour = hour,
            minute = minute,
            repeatMask = repeatMask,
            remindFlags = remindFlags
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
        ensureBackgroundSync()
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
        stopAutomaticSync()
        appContext.stopService(Intent(appContext, WatchSyncService::class.java))
        autoReconnectEnabled = false
        handler.removeCallbacks(reconnectTask)
        handler.removeCallbacks(connectionTimeoutTask)
        handler.removeCallbacks(stopFindWatchTask)
        resetWearfitTransport()
        batteryCharacteristic = null
        heartRateCharacteristic = null
        findWatchCharacteristic = null
        sifliDataCharacteristic = null
        sifliNotificationsReady = false
        sifliMtu = 23
        sifliReassembler.reset()
        sifliHandshakeDone = false
        proprietaryAssembly.reset()
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
                bloodOxygenPercent = null,
                heartRateUpdatedAt = null,
                bloodOxygenUpdatedAt = null,
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
        ensureBackgroundSync()
        autoReconnectEnabled = true
        reconnectAttempts = 0
        scheduleReconnect(250L)
    }

    fun hasSavedDevice(): Boolean = mutableState.value.savedDevice != null

    fun ensureBackgroundSync() {
        // Read persisted pairing state as connect() may call this before its StateFlow update.
        if (readSavedDevice() == null) return
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.S &&
            appContext.checkSelfPermission(Manifest.permission.BLUETOOTH_CONNECT) != PackageManager.PERMISSION_GRANTED
        ) return
        runCatching {
            appContext.startForegroundService(Intent(appContext, WatchSyncService::class.java))
        }
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
        private const val DEVICE_SETTINGS_PREFERENCES = "plum_watch_device_settings"
        private const val HEALTH_HISTORY_PREFERENCES = "plum_watch_health_history"
        private const val KEY_LANGUAGE = "watch-language"
        private const val KEY_TIME_FORMAT_24H = "time-format-24h"
        private const val KEY_RAISE_TO_WAKE = "raise-to-wake"
        private const val KEY_AUTO_HEALTH = "auto-health"
        private const val KEY_BODY_TEMPERATURE = "body-temperature"
        private const val KEY_NOTIFICATION_ICON = "notification-icon"
        private const val KEY_NOTIFICATION_SHOW = "notification-show"
        private const val KEY_NOTIFICATION_HIDE_DETAILS = "notification-hide-details"
        private const val KEY_SLEEP_ACTIVE = "sleep-active"
        private const val KEY_SLEEP_MODE = "sleep-mode"
        private const val KEY_SLEEP_TRACKING = "sleep-tracking"
        private const val KEY_SLEEP_CHARGE_REMINDER = "sleep-charge-reminder"
        private const val KEY_BATTERY_PERCENT = "battery-percent"
        private const val KEY_BATTERY_UPDATED_AT = "battery-updated-at"
        private const val KEY_BATTERY_HISTORY = "battery-history"
        private const val MAX_BATTERY_HISTORY_SAMPLES = 8640
        private const val AUTO_SYNC_INITIAL_DELAY_MS = 5_000L
        private const val AUTO_SYNC_BATTERY_INTERVAL_MS = 5 * 60 * 1_000L
        private const val AUTO_SYNC_HEALTH_INTERVAL_MS = 15 * 60 * 1_000L
        private const val KEY_DEVICE_NAME = "device-name"
        private const val KEY_DEVICE_ADDRESS = "device-address"
        private const val INITIAL_RECONNECT_DELAY_MS = 1_500L
        private const val MAX_RECONNECT_DELAY_MS = 30_000L
        private const val CONNECTION_TIMEOUT_MS = 12_000L
        private const val FIND_WATCH_ALERT_DURATION_MS = 5_000L
        private const val WEARFIT_WRITE_TIMEOUT_MS = 5_000L
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

        private const val PROPRIETARY_CMD_TIMEOUT_MS = 5_000L
        private const val MAX_PROPRIETARY_MESSAGE_LENGTH = 16 * 1024
        private const val MAX_WATCHFACE_FILES = 1_024
        private const val MAX_WATCHFACE_FILE_BYTES = 64L * 1024 * 1024
        private const val MAX_WATCHFACE_TOTAL_BYTES = 256L * 1024 * 1024

        // Proprietary command IDs (matching Wearfit Pro)
        private const val PROP_CMD_FIND_BAND = 0x71 // 113
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
        private val NUS_SERVICE_UUID = java.util.UUID.fromString("6e400001-b5a3-f393-e0a9-e50e24dcca9e")
        private val NUS_WRITE_CHARACTERISTIC_UUID = java.util.UUID.fromString("6e400002-b5a3-f393-e0a9-e50e24dcca9e")
        private val NUS_NOTIFY_CHARACTERISTIC_UUID = java.util.UUID.fromString("6e400003-b5a3-f393-e0a9-e50e24dcca9e")
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
