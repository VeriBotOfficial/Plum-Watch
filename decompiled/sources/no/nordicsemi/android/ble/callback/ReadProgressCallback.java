package no.nordicsemi.android.ble.callback;

import android.bluetooth.BluetoothDevice;

@FunctionalInterface
/* loaded from: classes8.dex */
public interface ReadProgressCallback {
    void onPacketReceived(BluetoothDevice bluetoothDevice, byte[] bArr, int i);
}
