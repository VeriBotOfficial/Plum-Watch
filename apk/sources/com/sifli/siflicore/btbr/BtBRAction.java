package com.sifli.siflicore.btbr;

import android.bluetooth.BluetoothSocket;

/* JADX INFO: loaded from: classes11.dex */
public abstract class BtBRAction {
    private final long creationTimestamp = System.currentTimeMillis();

    public abstract boolean expectsResult();

    public abstract boolean run(BluetoothSocket bluetoothSocket);

    public String toString() {
        return getClass().getSimpleName();
    }
}
