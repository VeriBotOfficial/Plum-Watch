package com.sifli.siflicore.btbr.actions;

import android.bluetooth.BluetoothSocket;
import com.sifli.siflicore.btbr.BtBRAction;

/* loaded from: classes14.dex */
public class WaitAction extends BtBRAction {
    private final int mMillis;

    @Override // com.sifli.siflicore.btbr.BtBRAction
    public boolean expectsResult() {
        return false;
    }

    public WaitAction(int i) {
        this.mMillis = i;
    }

    @Override // com.sifli.siflicore.btbr.BtBRAction
    public boolean run(BluetoothSocket bluetoothSocket) {
        try {
            Thread.sleep(this.mMillis);
            return true;
        } catch (InterruptedException unused) {
            return false;
        }
    }
}
