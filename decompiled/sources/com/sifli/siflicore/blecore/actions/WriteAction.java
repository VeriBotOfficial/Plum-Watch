package com.sifli.siflicore.blecore.actions;

import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCharacteristic;
import com.sifli.siflicore.blecore.queue.BtLEAction;

/* loaded from: classes14.dex */
public class WriteAction extends BtLEAction {
    private boolean expectsResult;
    private final byte[] value;

    public WriteAction(BluetoothGattCharacteristic bluetoothGattCharacteristic, byte[] bArr) {
        super(bluetoothGattCharacteristic);
        this.expectsResult = true;
        this.value = bArr;
    }

    @Override // com.sifli.siflicore.blecore.queue.BtLEAction
    public boolean run(BluetoothGatt bluetoothGatt) {
        BluetoothGattCharacteristic characteristic = getCharacteristic();
        int properties = characteristic.getProperties();
        if ((properties & 8) > 0 || (properties & 4) > 0) {
            return writeValue(bluetoothGatt, characteristic, this.value);
        }
        return false;
    }

    protected boolean writeValue(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, byte[] bArr) {
        if (bluetoothGattCharacteristic.setValue(bArr)) {
            return bluetoothGatt.writeCharacteristic(bluetoothGattCharacteristic);
        }
        return false;
    }

    public final byte[] getValue() {
        return this.value;
    }

    public void setExpectsResult(boolean z) {
        this.expectsResult = z;
    }

    @Override // com.sifli.siflicore.blecore.queue.BtLEAction
    public boolean expectsResult() {
        return this.expectsResult;
    }
}
