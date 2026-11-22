package no.nordicsemi.android.ble.callback;

import android.bluetooth.BluetoothDevice;

@FunctionalInterface
/* loaded from: classes8.dex */
public interface ConnectionParametersUpdatedCallback {
    void onConnectionUpdated(BluetoothDevice bluetoothDevice, int i, int i2, int i3);
}
