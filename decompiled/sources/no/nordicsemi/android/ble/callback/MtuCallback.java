package no.nordicsemi.android.ble.callback;

import android.bluetooth.BluetoothDevice;

@FunctionalInterface
/* loaded from: classes8.dex */
public interface MtuCallback {
    void onMtuChanged(BluetoothDevice bluetoothDevice, int i);
}
