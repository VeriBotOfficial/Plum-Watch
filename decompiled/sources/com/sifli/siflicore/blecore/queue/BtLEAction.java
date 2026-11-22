package com.sifli.siflicore.blecore.queue;

import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCharacteristic;

/* loaded from: classes14.dex */
public abstract class BtLEAction {
    private final BluetoothGattCharacteristic characteristic;
    private final long creationTimestamp = System.currentTimeMillis();

    public abstract boolean expectsResult();

    public abstract boolean run(BluetoothGatt bluetoothGatt);

    public BtLEAction(BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        this.characteristic = bluetoothGattCharacteristic;
    }

    public BluetoothGattCharacteristic getCharacteristic() {
        return this.characteristic;
    }

    public String toString() {
        BluetoothGattCharacteristic characteristic = getCharacteristic();
        return getClass().getSimpleName() + " on characteristic: " + (characteristic == null ? "(null)" : characteristic.getUuid().toString());
    }
}
