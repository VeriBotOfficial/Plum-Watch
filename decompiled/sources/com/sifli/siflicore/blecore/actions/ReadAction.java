package com.sifli.siflicore.blecore.actions;

import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCharacteristic;
import com.sifli.siflicore.blecore.queue.BtLEAction;

/* loaded from: classes14.dex */
public class ReadAction extends BtLEAction {
    @Override // com.sifli.siflicore.blecore.queue.BtLEAction
    public boolean expectsResult() {
        return true;
    }

    public ReadAction(BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        super(bluetoothGattCharacteristic);
    }

    @Override // com.sifli.siflicore.blecore.queue.BtLEAction
    public boolean run(BluetoothGatt bluetoothGatt) {
        if ((getCharacteristic().getProperties() & 2) > 0) {
            return bluetoothGatt.readCharacteristic(getCharacteristic());
        }
        return false;
    }
}
