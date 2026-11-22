package com.sifli.siflicore.blecore.actions;

import android.bluetooth.BluetoothGatt;
import com.sifli.siflicore.blecore.queue.BtLEAction;

/* loaded from: classes14.dex */
public class RequestMtuAction extends BtLEAction {
    private int mtu;

    @Override // com.sifli.siflicore.blecore.queue.BtLEAction
    public boolean expectsResult() {
        return true;
    }

    public RequestMtuAction(int i) {
        super(null);
        this.mtu = i;
    }

    @Override // com.sifli.siflicore.blecore.queue.BtLEAction
    public boolean run(BluetoothGatt bluetoothGatt) {
        return bluetoothGatt.requestMtu(this.mtu);
    }
}
