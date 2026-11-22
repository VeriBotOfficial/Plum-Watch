package no.nordicsemi.android.ble.callback;

import android.bluetooth.BluetoothDevice;
import no.nordicsemi.android.ble.data.Data;

@FunctionalInterface
/* loaded from: classes8.dex */
public interface DataReceivedCallback {
    void onDataReceived(BluetoothDevice bluetoothDevice, Data data);
}
