package me.doruk.plumwatch.ble

import android.annotation.SuppressLint
import android.bluetooth.BluetoothAdapter
import android.bluetooth.BluetoothDevice
import android.bluetooth.BluetoothGatt
import android.bluetooth.BluetoothGattCallback
import android.bluetooth.BluetoothProfile
import android.bluetooth.BluetoothManager
import android.bluetooth.le.ScanCallback
import android.bluetooth.le.ScanResult
import android.bluetooth.le.ScanSettings
import android.content.Context
import android.os.Handler
import android.os.Looper
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

data class NearbyWatch(
    val name: String,
    val address: String,
    val rssi: Int
)

data class WatchConnectionState(
    val scanning: Boolean = false,
    val devices: List<NearbyWatch> = emptyList(),
    val connectionStatus: String = "Not connected",
    val connected: Boolean = false,
    val deviceName: String? = null,
    val deviceAddress: String? = null,
    val services: List<String> = emptyList(),
    val error: String? = null
)

/**
 * Handles BLE discovery and the GATT connection lifecycle.
 *
 * This deliberately does not send vendor-specific commands. HK firmware families
 * use different GATT services and packet formats, which must be identified before
 * implementing controls such as notifications, alarms or watchface transfer.
 */
class BluetoothWatchManager(context: Context) {
    private val appContext = context.applicationContext
    private val adapter: BluetoothAdapter? =
        (appContext.getSystemService(Context.BLUETOOTH_SERVICE) as BluetoothManager).adapter
    private val preferences = appContext.getSharedPreferences("plum_watch_device", Context.MODE_PRIVATE)
    private val handler = Handler(Looper.getMainLooper())
    private val mutableState = MutableStateFlow(
        WatchConnectionState(
            deviceName = preferences.getString("name", null),
            deviceAddress = preferences.getString("address", null)
        )
    )

    val state: StateFlow<WatchConnectionState> = mutableState.asStateFlow()

    private var gatt: BluetoothGatt? = null
    private val foundDevices = linkedMapOf<String, NearbyWatch>()

    private val scanTimeout = Runnable { stopScan() }

    private val scanCallback = object : ScanCallback() {
        override fun onScanResult(callbackType: Int, result: ScanResult) {
            val device = result.device ?: return
            val address = device.address ?: return
            val name = safeDeviceName(device, result) ?: "Unknown Bluetooth device"
            foundDevices[address] = NearbyWatch(name, address, result.rssi)

            val sorted = foundDevices.values.sortedWith(
                compareByDescending<NearbyWatch> { it.name.contains("HK", ignoreCase = true) }
                    .thenByDescending { it.rssi }
                    .thenBy { it.name.lowercase() }
            )
            mutableState.value = mutableState.value.copy(devices = sorted)
        }

        override fun onScanFailed(errorCode: Int) {
            mutableState.value = mutableState.value.copy(
                scanning = false,
                error = "Bluetooth scan failed (code $errorCode). Try again."
            )
        }
    }

    @SuppressLint("MissingPermission")
    private fun safeDeviceName(device: BluetoothDevice, result: ScanResult): String? {
        return try {
            device.name ?: result.scanRecord?.deviceName
        } catch (_: SecurityException) {
            result.scanRecord?.deviceName
        }
    }

    @SuppressLint("MissingPermission")
    fun startScan() {
        val scanner = adapter?.bluetoothLeScanner
        if (adapter == null || !adapter.isEnabled || scanner == null) {
            mutableState.value = mutableState.value.copy(
                scanning = false,
                error = "Turn on Bluetooth to find your watch."
            )
            return
        }

        stopScan()
        foundDevices.clear()
        mutableState.value = mutableState.value.copy(
            scanning = true,
            devices = emptyList(),
            error = null
        )

        try {
            val settings = ScanSettings.Builder()
                .setScanMode(ScanSettings.SCAN_MODE_LOW_LATENCY)
                .build()
            scanner.startScan(null, settings, scanCallback)
            handler.postDelayed(scanTimeout, 15_000L)
        } catch (exception: SecurityException) {
            mutableState.value = mutableState.value.copy(
                scanning = false,
                error = "Bluetooth scan permission was not granted."
            )
        } catch (exception: IllegalStateException) {
            mutableState.value = mutableState.value.copy(
                scanning = false,
                error = "Bluetooth is not ready. Try again."
            )
        }
    }

    @SuppressLint("MissingPermission")
    fun stopScan() {
        handler.removeCallbacks(scanTimeout)
        try {
            adapter?.bluetoothLeScanner?.stopScan(scanCallback)
        } catch (_: SecurityException) {
            // The scan may already have stopped or permission may have changed.
        }
        if (mutableState.value.scanning) {
            mutableState.value = mutableState.value.copy(scanning = false)
        }
    }

    @SuppressLint("MissingPermission")
    fun connect(device: NearbyWatch) {
        if (adapter == null || !adapter.isEnabled) {
            mutableState.value = mutableState.value.copy(error = "Turn on Bluetooth first.")
            return
        }

        stopScan()
        closeGatt()
        mutableState.value = mutableState.value.copy(
            connectionStatus = "Connecting",
            connected = false,
            deviceName = device.name,
            deviceAddress = device.address,
            services = emptyList(),
            error = null
        )

        try {
            val remoteDevice = adapter.getRemoteDevice(device.address)
            gatt = remoteDevice.connectGatt(appContext, false, gattCallback, BluetoothDevice.TRANSPORT_LE)
            if (gatt == null) {
                mutableState.value = mutableState.value.copy(
                    connectionStatus = "Connection failed",
                    error = "Android could not start a GATT connection."
                )
            }
        } catch (exception: SecurityException) {
            mutableState.value = mutableState.value.copy(
                connectionStatus = "Permission required",
                error = "Allow nearby-device access to connect."
            )
        } catch (exception: IllegalArgumentException) {
            mutableState.value = mutableState.value.copy(
                connectionStatus = "Connection failed",
                error = "The Bluetooth device address is invalid."
            )
        }
    }

    private val gattCallback = object : BluetoothGattCallback() {
        @SuppressLint("MissingPermission")
        override fun onConnectionStateChange(gatt: BluetoothGatt, status: Int, newState: Int) {
            if (status != BluetoothGatt.GATT_SUCCESS) {
                mutableState.value = mutableState.value.copy(
                    connected = false,
                    connectionStatus = "Connection lost",
                    error = "Bluetooth connection ended (code $status)."
                )
                gatt.close()
                if (this@BluetoothWatchManager.gatt === gatt) this@BluetoothWatchManager.gatt = null
                return
            }

            when (newState) {
                BluetoothProfile.STATE_CONNECTED -> {
                    mutableState.value = mutableState.value.copy(
                        connected = true,
                        connectionStatus = "Connected",
                        error = null
                    )
                    try {
                        gatt.discoverServices()
                    } catch (_: SecurityException) {
                        mutableState.value = mutableState.value.copy(
                            error = "Connected, but service discovery permission is missing."
                        )
                    }
                }

                BluetoothProfile.STATE_DISCONNECTED -> {
                    mutableState.value = mutableState.value.copy(
                        connected = false,
                        connectionStatus = "Disconnected",
                        services = emptyList()
                    )
                    gatt.close()
                    if (this@BluetoothWatchManager.gatt === gatt) this@BluetoothWatchManager.gatt = null
                }
            }
        }

        override fun onServicesDiscovered(gatt: BluetoothGatt, status: Int) {
            if (status == BluetoothGatt.GATT_SUCCESS) {
                val uuids = gatt.services.map { it.uuid.toString() }.sorted()
                mutableState.value = mutableState.value.copy(services = uuids, error = null)
                val address = mutableState.value.deviceAddress
                val name = mutableState.value.deviceName
                if (address != null) {
                    preferences.edit()
                        .putString("address", address)
                        .putString("name", name)
                        .apply()
                }
            } else {
                mutableState.value = mutableState.value.copy(
                    error = "Connected, but Bluetooth services could not be read."
                )
            }
        }
    }

    @SuppressLint("MissingPermission")
    fun disconnect() {
        stopScan()
        val current = gatt
        gatt = null
        try {
            current?.disconnect()
            current?.close()
        } catch (_: SecurityException) {
            current?.close()
        }
        mutableState.value = mutableState.value.copy(
            connected = false,
            connectionStatus = "Disconnected",
            services = emptyList(),
            error = null
        )
    }

    fun forgetDevice() {
        disconnect()
        preferences.edit().clear().apply()
        mutableState.value = WatchConnectionState()
    }

    private fun closeGatt() {
        val current = gatt
        gatt = null
        try {
            current?.disconnect()
        } catch (_: SecurityException) {
            // close below
        }
        current?.close()
    }

    fun close() {
        stopScan()
        closeGatt()
    }
}
