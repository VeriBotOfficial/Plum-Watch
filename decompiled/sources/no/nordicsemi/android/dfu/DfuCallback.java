package no.nordicsemi.android.dfu;

import android.bluetooth.BluetoothGattCallback;

/* loaded from: classes8.dex */
interface DfuCallback extends DfuController {

    public static class DfuGattCallback extends BluetoothGattCallback {
        public void onDisconnected(int i) {
        }
    }

    DfuGattCallback getGattCallback();

    void onBondStateChanged(int i);
}
