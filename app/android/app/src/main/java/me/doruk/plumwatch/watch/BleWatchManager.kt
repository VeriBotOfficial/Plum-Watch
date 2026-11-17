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

data class WatchDevice(
    val name: String,
    val address: String,
    val rssi: Int
)

data class BleUiState(
    val discoveredDevices: List<WatchDevice> = emptyList(),
    val isScanning: Boolean = false,
    val isConnecting: Boolean = false,
    val connectedDevice: WatchDevice? = null,
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

    private val mutableState = MutableStateFlow(BleUiState())
    val state: StateFlow<BleUiState> = mutableState.asStateFlow()

    private var bluetoothGatt: BluetoothGatt? = null

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
                mutableState.update { old ->
                    old.copy(
                        isConnecting = false,
                        connectedDevice = old.pendingDevice,
                        pendingDevice = null,
                        connectionMessage = "Connected",
                        discoveredServiceCount = 0,
                        errorMessage = null
                    )
                }
                gatt.discoverServices()
                return
            }

            if (newState == BluetoothProfile.STATE_DISCONNECTED) {
                val failed = status != BluetoothGatt.GATT_SUCCESS
                gatt.close()

                if (bluetoothGatt === gatt) {
                    bluetoothGatt = null
                    mutableState.update { old ->
                        old.copy(
                            isConnecting = false,
                            connectedDevice = null,
                            pendingDevice = null,
                            connectionMessage = if (failed) {
                                "Connection ended ($status)"
                            } else {
                                "Disconnected"
                            },
                            discoveredServiceCount = 0,
                            errorMessage = if (failed) {
                                "The watch ended the BLE connection. Try again with the watch awake and nearby."
                            } else {
                                null
                            }
                        )
                    }
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
        stopScan()

        val bluetoothAdapter = adapter
        if (bluetoothAdapter == null || !isBluetoothEnabled()) {
            mutableState.update {
                it.copy(
                    connectionMessage = "Bluetooth is unavailable",
                    errorMessage = "Turn on Bluetooth and try again."
                )
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
                connectedDevice = null,
                pendingDevice = device,
                connectionMessage = "Connecting to ${device.name}…",
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
                mutableState.update {
                    it.copy(
                        isConnecting = false,
                        pendingDevice = null,
                        connectionMessage = "Connection could not start",
                        errorMessage = "Android did not create a GATT connection."
                    )
                }
            }
        } catch (_: SecurityException) {
            mutableState.update {
                it.copy(
                    isConnecting = false,
                    pendingDevice = null,
                    connectionMessage = "Bluetooth permission required",
                    errorMessage = "Allow Nearby devices access and try again."
                )
            }
        } catch (exception: IllegalArgumentException) {
            mutableState.update {
                it.copy(
                    isConnecting = false,
                    pendingDevice = null,
                    connectionMessage = "Invalid Bluetooth device",
                    errorMessage = exception.message
                )
            }
        }
    }

    @SuppressLint("MissingPermission")
    fun disconnect(forgetDevice: Boolean = false) {
        stopScan()
        val activeGatt = bluetoothGatt

        if (activeGatt != null) {
            try {
                activeGatt.disconnect()
            } catch (_: SecurityException) {
                // Close below still releases the local GATT object.
            }
            handler.postDelayed({
                if (bluetoothGatt === activeGatt) {
                    try {
                        activeGatt.close()
                    } catch (_: SecurityException) {
                        // Nothing else can be done if permission was revoked.
                    }
                    bluetoothGatt = null
                }
            }, 400L)
        }

        mutableState.update {
            it.copy(
                isConnecting = false,
                connectedDevice = null,
                pendingDevice = null,
                connectionMessage = if (forgetDevice) "Device removed" else "Disconnected",
                discoveredServiceCount = 0,
                errorMessage = null
            )
        }
    }

    @SuppressLint("MissingPermission")
    fun release() {
        handler.removeCallbacks(stopScanTask)
        try {
            adapter?.bluetoothLeScanner?.stopScan(scanCallback)
        } catch (_: Exception) {
            // The activity is closing; release the GATT handle regardless.
        }
        bluetoothGatt?.let {
            try {
                it.disconnect()
                it.close()
            } catch (_: Exception) {
                // Best-effort cleanup during Activity destruction.
            }
        }
        bluetoothGatt = null
    }

    @SuppressLint("MissingPermission")
    private fun safeDeviceName(device: BluetoothDevice): String? = try {
        device.name?.takeIf { it.isNotBlank() }
    } catch (_: SecurityException) {
        null
    }

    private companion object {
        const val SCAN_WINDOW_MS = 15_000L
    }
}
