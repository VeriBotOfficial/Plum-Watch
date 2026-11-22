package com.sifli.siflicore.btbr;

import android.bluetooth.BluetoothSocket;

/* loaded from: classes14.dex */
public abstract class BtBRAction {
    private final long creationTimestamp = System.currentTimeMillis();

    public abstract boolean expectsResult();

    public abstract boolean run(BluetoothSocket bluetoothSocket);

    public String toString() {
        return getClass().getSimpleName();
    }
}
