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
import java.io.ByteArrayOutputStream
import java.io.File
import java.nio.ByteBuffer
import java.nio.ByteOrder
import java.security.MessageDigest
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
    val supportsSifliWatchface: Boolean = false,
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
    private var sifliDataCharacteristic: BluetoothGattCharacteristic? = null
    private var sifliNotificationsReady = false
    private var sifliMtu = 23
    private var sifliAssembly: ByteArrayOutputStream? = null
    private var sifliAssemblyExpectedLength = 0
    private var sifliAssemblyCategory = -1
    private val sifliIncomingMessages = Channel<ByteArray>(Channel.UNLIMITED)
    private var pendingSifliWrite: CompletableDeferred<Boolean>? = null
    private var pendingSifliMtuChange: CompletableDeferred<Int>? = null
    private val sifliPushMutex = Mutex()
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
                        supportsSifliWatchface = false,
                        errorMessage = null
                    )
                }
                batteryCharacteristic = null
                findWatchCharacteristic = null
                sifliDataCharacteristic = null
                sifliNotificationsReady = false
                sifliMtu = 23
                sifliAssembly = null
                sifliAssemblyExpectedLength = 0
                sifliAssemblyCategory = -1
                pendingNotificationDescriptors.clear()
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
                    sifliAssembly = null
                    sifliAssemblyExpectedLength = 0
                    sifliAssemblyCategory = -1
                    pendingNotificationDescriptors.clear()
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
                    supportsBattery = battery != null,
                    supportsHeartRate = heartRate != null,
                    canFindWatch = findWatchCharacteristic != null,
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
            if (pendingNotificationDescriptors.isEmpty()) readPendingBattery(gatt)
        }

        override fun onDescriptorWrite(
            gatt: BluetoothGatt,
            descriptor: BluetoothGattDescriptor,
            status: Int
        ) {
            if (bluetoothGatt !== gatt) return
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
            if (pendingNotificationDescriptors.isEmpty()) {
                if (sifliDataCharacteristic == null) {
                    mutableState.update { it.copy(supportsSifliWatchface = false) }
                }
                readPendingBattery(gatt)
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
                    handleSifliSerialFrame(value)
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
                handleSifliSerialFrame(value)
            } else {
                handleCharacteristicValue(characteristic, value)
            }
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

    private fun handleSifliSerialFrame(value: ByteArray) {
        if (value.size < 2) return
        val category = value[0].toInt() and 0xFF
        val fragmentFlag = value[1].toInt() and 0xFF
        if (category != SIFLI_WATCHFACE_CATEGORY) return

        when (fragmentFlag) {
            0 -> {
                if (value.size < 4) return
                val length = readUnsignedShort(value, 2)
                if (length < 0 || value.size < 4 + length) return
                sifliIncomingMessages.trySend(value.copyOfRange(4, 4 + length))
            }
            1 -> {
                if (value.size < 4) return
                val expectedLength = readUnsignedShort(value, 2)
                if (expectedLength <= 0 || expectedLength > MAX_SIFLI_MESSAGE_LENGTH) {
                    sifliAssembly = null
                    return
                }
                val assembly = ByteArrayOutputStream(expectedLength)
                assembly.write(value, 4, value.size - 4)
                sifliAssembly = assembly
                sifliAssemblyExpectedLength = expectedLength
                sifliAssemblyCategory = category
                if (assembly.size() > expectedLength) {
                    sifliAssembly = null
                }
            }
            2, 3 -> {
                val assembly = sifliAssembly ?: return
                if (sifliAssemblyCategory != category) {
                    sifliAssembly = null
                    return
                }
                if (value.size > 2) assembly.write(value, 2, value.size - 2)
                if (assembly.size() > sifliAssemblyExpectedLength) {
                    sifliAssembly = null
                    sifliAssemblyExpectedLength = 0
                    return
                }
                if (fragmentFlag == 3) {
                    if (assembly.size() == sifliAssemblyExpectedLength) {
                        sifliIncomingMessages.trySend(assembly.toByteArray())
                    }
                    sifliAssembly = null
                    sifliAssemblyExpectedLength = 0
                    sifliAssemblyCategory = -1
                }
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
        targetFileName: String,
        onProgress: (Float) -> Unit = {}
    ) = sifliPushMutex.withLock {
        val gatt = bluetoothGatt ?: throw IllegalStateException("Connect your watch before sending a watchface.")
        val characteristic = sifliDataCharacteristic
            ?: throw IllegalStateException("This watch does not expose the SiFli watchface transfer service.")
        if (!sifliNotificationsReady) {
            throw IllegalStateException("The watch's SiFli transfer channel is not ready yet. Reconnect and try again.")
        }
        if (!archiveFile.isFile || archiveFile.length() <= 0L) {
            throw IllegalArgumentException("The watchface ZIP file is empty or unavailable.")
        }

        // WFPUSH2's byte-aligned payload is: ZIP bytes, zero padding to 4 bytes,
        // then CRC-32/MPEG-2 (little-endian). The CRC is part of the transferred file.
        val archiveSize = archiveFile.length()
        val paddingBytes = ((4L - (archiveSize % 4L)) % 4L).toInt()
        val alignedArchiveSize = archiveSize + paddingBytes
        val transferSize = alignedArchiveSize + 4L
        require(transferSize <= 0xFFFFFFFFL) {
            "This watchface archive is too large for the SiFli transfer protocol."
        }

        val fileNameBytes = targetFileName.toByteArray(StandardCharsets.UTF_8)
        require(fileNameBytes.isNotEmpty() && fileNameBytes.size <= 0xFFFF) {
            "The watchface file name is invalid."
        }

        while (sifliIncomingMessages.tryReceive().isSuccess) Unit
        runCatching { gatt.requestConnectionPriority(BluetoothGatt.CONNECTION_PRIORITY_HIGH) }
        requestSifliMtu(gatt)

        val crc32 = withContext(Dispatchers.IO) { calculateCrc32Mpeg2(archiveFile, paddingBytes) }
        val crcBytes = ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putInt(crc32.toInt()).array()
        val safeBlockLength = (SIFLI_MAX_DATA_LENGTH - (SIFLI_MAX_DATA_LENGTH % 4)).coerceAtLeast(4)

        try {
            val startPayload = ByteBuffer.allocate(7).order(ByteOrder.LITTLE_ENDIAN)
                .putShort(SIFLI_WATCHFACE_FILE_TYPE_WATCHFACE.toShort())
                .put(SIFLI_PHONE_TYPE_ANDROID.toByte())
                .putInt(transferSize.toInt())
                .array()
            sendSifliProtocolMessage(gatt, characteristic, SIFLI_MSG_START_REQ, startPayload)
            val startResponse = awaitSifliProtocolResponse(SIFLI_MSG_START_RSP)
            ensureSifliSuccess(startResponse, "The watch rejected the watchface transfer request.")
            val maxBlockLength = if (startResponse.size >= 6) {
                readUnsignedShort(startResponse, 4).coerceIn(4, SIFLI_MAX_DATA_LENGTH)
            } else {
                SIFLI_MAX_DATA_LENGTH
            }.let { minOf(it - (it % 4), safeBlockLength).coerceAtLeast(4) }

            // SiFli's WFPUSH2 file-info request carries the block count. MD5 is optional
            // in the SDK; the byte-aligned WFPUSH2 sender uses CRC32 in the file stream.
            val fileBlocks = ((transferSize + maxBlockLength - 1L) / maxBlockLength).toInt()
            val infoPayload = ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN)
                .putInt(fileBlocks)
                .array()
            sendSifliProtocolMessage(gatt, characteristic, SIFLI_MSG_FILE_INFO_REQ, infoPayload)
            val infoResponse = awaitSifliProtocolResponse(SIFLI_MSG_FILE_INFO_RSP)
            ensureSifliSuccess(infoResponse, "The watch rejected the watchface file information.")

            val fileStartPayload = ByteBuffer.allocate(6 + fileNameBytes.size).order(ByteOrder.LITTLE_ENDIAN)
                .putInt(transferSize.toInt())
                .putShort(fileNameBytes.size.toShort())
                .put(fileNameBytes)
                .array()
            sendSifliProtocolMessage(gatt, characteristic, SIFLI_MSG_FILE_SEND_START_REQ, fileStartPayload)
            val fileStartResponse = awaitSifliProtocolResponse(SIFLI_MSG_FILE_SEND_START_RSP)
            ensureSifliSuccess(fileStartResponse, "The watch could not prepare the watchface file.")

            var sentBytes = 0L
            var archiveBytesRead = 0L
            withContext(Dispatchers.IO) {
                archiveFile.inputStream().buffered().use { input ->
                    var blockIndex = 0
                    while (sentBytes < transferSize) {
                        val requestedBytes = minOf(maxBlockLength.toLong(), transferSize - sentBytes).toInt()
                        val block = ByteArray(requestedBytes)
                        var offset = 0
                        while (offset < requestedBytes) {
                            val absoluteOffset = sentBytes + offset
                            when {
                                absoluteOffset < archiveSize -> {
                                    val readable = minOf(
                                        (requestedBytes - offset).toLong(),
                                        archiveSize - absoluteOffset
                                    ).toInt()
                                    val count = input.read(block, offset, readable)
                                    if (count < 0) throw IllegalStateException("The watchface ZIP ended unexpectedly.")
                                    offset += count
                                    archiveBytesRead += count
                                }
                                absoluteOffset < alignedArchiveSize -> {
                                    val zeroCount = minOf(
                                        (requestedBytes - offset).toLong(),
                                        alignedArchiveSize - absoluteOffset
                                    ).toInt()
                                    offset += zeroCount // ByteArray is already zero-filled.
                                }
                                else -> {
                                    val crcOffset = (absoluteOffset - alignedArchiveSize).toInt()
                                    val crcCount = minOf(requestedBytes - offset, 4 - crcOffset)
                                    System.arraycopy(crcBytes, crcOffset, block, offset, crcCount)
                                    offset += crcCount
                                }
                            }
                        }

                        val blockPayload = ByteBuffer.allocate(4 + block.size).order(ByteOrder.LITTLE_ENDIAN)
                            .putInt(blockIndex)
                            .put(block)
                            .array()
                        withContext(Dispatchers.Main.immediate) {
                            sendSifliProtocolMessage(gatt, characteristic, SIFLI_MSG_FILE_SEND_DATA, blockPayload)
                            val dataResponse = awaitSifliProtocolResponse(SIFLI_MSG_FILE_SEND_DATA_RSP)
                            ensureSifliSuccess(
                                dataResponse,
                                "The watch rejected watchface data block " + blockIndex + "."
                            )
                        }
                        sentBytes += requestedBytes
                        blockIndex++
                        withContext(Dispatchers.Main.immediate) {
                            onProgress((sentBytes.toDouble() / transferSize.toDouble()).toFloat().coerceIn(0f, 1f))
                        }
                    }
                }
            }
            if (archiveBytesRead != archiveSize) {
                throw IllegalStateException("The complete watchface ZIP could not be read.")
            }

            sendSifliProtocolMessage(
                gatt, characteristic, SIFLI_MSG_FILE_SEND_END_REQ, byteArrayOf(0, 0)
            )
            val fileEndResponse = awaitSifliProtocolResponse(SIFLI_MSG_FILE_SEND_END_RSP)
            ensureSifliSuccess(fileEndResponse, "The watch could not finish writing the watchface file.")

            sendSifliProtocolMessage(gatt, characteristic, SIFLI_MSG_END_REQ, byteArrayOf())
            val endResponse = awaitSifliProtocolResponse(SIFLI_MSG_END_RSP)
            ensureSifliSuccess(endResponse, "The watch did not confirm completion of the watchface transfer.")
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
            runCatching { gatt.requestConnectionPriority(BluetoothGatt.CONNECTION_PRIORITY_BALANCED) }
        }
    }

    private fun calculateCrc32Mpeg2(file: File, paddingBytes: Int): Long {
        var crc = 0xFFFFFFFFL
        val polynomial = 0x04C11DB7L
        file.inputStream().buffered().use { input ->
            val buffer = ByteArray(16 * 1024)
            while (true) {
                val count = input.read(buffer)
                if (count < 0) break
                for (index in 0 until count) {
                    crc = crc xor ((buffer[index].toLong() and 0xFFL) shl 24)
                    repeat(8) {
                        crc = if ((crc and 0x80000000L) != 0L) {
                            ((crc shl 1) xor polynomial) and 0xFFFFFFFFL
                        } else {
                            (crc shl 1) and 0xFFFFFFFFL
                        }
                    }
                }
            }
        }
        repeat(paddingBytes) {
            crc = crc xor 0L
            repeat(8) {
                crc = if ((crc and 0x80000000L) != 0L) {
                    ((crc shl 1) xor polynomial) and 0xFFFFFFFFL
                } else {
                    (crc shl 1) and 0xFFFFFFFFL
                }
            }
        }
        return crc and 0xFFFFFFFFL
    }

    private suspend fun sendSifliProtocolMessage(
        gatt: BluetoothGatt,
        characteristic: BluetoothGattCharacteristic,
        messageId: Int,
        payload: ByteArray
    ) {
        require(payload.size <= 0xFFFF) { "SiFli watchface message exceeds the protocol length limit." }
        val message = ByteBuffer.allocate(4 + payload.size).order(ByteOrder.LITTLE_ENDIAN)
            .putShort(messageId.toShort())
            .putShort(payload.size.toShort())
            .put(payload)
            .array()
        val fragmentCapacity = (sifliMtu - 7).coerceAtLeast(1)
        if (message.size <= fragmentCapacity) {
            val frame = ByteBuffer.allocate(4 + message.size).order(ByteOrder.LITTLE_ENDIAN)
                .put(SIFLI_WATCHFACE_CATEGORY.toByte())
                .put(0)
                .putShort(message.size.toShort())
                .put(message)
                .array()
            writeSifliFrame(gatt, characteristic, frame)
            return
        }

        var offset = 0
        var first = true
        while (offset < message.size) {
            val length = minOf(fragmentCapacity, message.size - offset)
            val flag = when {
                first -> 1
                offset + length >= message.size -> 3
                else -> 2
            }
            val headerSize = if (first) 4 else 2
            val frame = ByteArray(headerSize + length)
            frame[0] = SIFLI_WATCHFACE_CATEGORY.toByte()
            frame[1] = flag.toByte()
            if (first) {
                frame[2] = (message.size and 0xFF).toByte()
                frame[3] = ((message.size shr 8) and 0xFF).toByte()
            }
            System.arraycopy(message, offset, frame, headerSize, length)
            writeSifliFrame(gatt, characteristic, frame)
            offset += length
            first = false
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
        if (response.size < 4) throw IllegalStateException("The watch returned an incomplete SiFli response.")
        val status = readUnsignedShort(response, 2)
        if (status != SIFLI_STATUS_OK) {
            throw IllegalStateException(errorMessage + " (status " + status + ").")
        }
    }

    private fun readUnsignedShort(bytes: ByteArray, offset: Int): Int {
        if (offset < 0 || offset + 1 >= bytes.size) return -1
        return (bytes[offset].toInt() and 0xFF) or
            ((bytes[offset + 1].toInt() and 0xFF) shl 8)
    }

    private fun calculateMd5Ascii(file: File, paddingBytes: Int): ByteArray {
        val digest = MessageDigest.getInstance("MD5")
        file.inputStream().buffered().use { input ->
            val buffer = ByteArray(16 * 1024)
            while (true) {
                val count = input.read(buffer)
                if (count < 0) break
                digest.update(buffer, 0, count)
            }
        }
        if (paddingBytes > 0) digest.update(ByteArray(paddingBytes))
        val hex = digest.digest().joinToString("") { byte -> "%02x".format(byte) }
        return hex.toByteArray(StandardCharsets.US_ASCII)
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
        sifliDataCharacteristic = null
        sifliNotificationsReady = false
        sifliMtu = 23
        sifliAssembly = null
        sifliAssemblyExpectedLength = 0
        sifliAssemblyCategory = -1
        pendingSifliWrite?.complete(false)
        pendingSifliWrite = null
        pendingSifliMtuChange?.completeExceptionally(
            IllegalStateException("Watch disconnected during MTU negotiation.")
        )
        pendingSifliMtuChange = null
        sifliIncomingMessages.trySend(ByteArray(0))
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
                supportsSifliWatchface = false,
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
        private val BATTERY_SERVICE_UUID = java.util.UUID.fromString("0000180f-0000-1000-8000-00805f9b34fb")
        private val BATTERY_LEVEL_UUID = java.util.UUID.fromString("00002a19-0000-1000-8000-00805f9b34fb")
        private val HEART_RATE_SERVICE_UUID = java.util.UUID.fromString("0000180d-0000-1000-8000-00805f9b34fb")
        private val HEART_RATE_MEASUREMENT_UUID = java.util.UUID.fromString("00002a37-0000-1000-8000-00805f9b34fb")
        private val IMMEDIATE_ALERT_SERVICE_UUID = java.util.UUID.fromString("00001802-0000-1000-8000-00805f9b34fb")
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
