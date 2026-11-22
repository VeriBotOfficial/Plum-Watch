package com.sifli.siflicore.blecore.actions;

import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import com.sifli.siflicore.blecore.queue.BtLEAction;
import java.util.UUID;

/* loaded from: classes14.dex */
public class NotifyAction extends BtLEAction {
    protected final boolean enableFlag;
    private boolean hasWrittenDescriptor;

    public NotifyAction(BluetoothGattCharacteristic bluetoothGattCharacteristic, boolean z) {
        super(bluetoothGattCharacteristic);
        this.hasWrittenDescriptor = false;
        this.enableFlag = z;
    }

    private boolean writeDescriptor(BluetoothGatt bluetoothGatt, BluetoothGattDescriptor bluetoothGattDescriptor, byte[] bArr) {
        if (bluetoothGatt == null || bluetoothGattDescriptor == null) {
            return false;
        }
        bluetoothGattDescriptor.getCharacteristic().getUuid().toString();
        return bluetoothGattDescriptor.setValue(bArr) && bluetoothGatt.writeDescriptor(bluetoothGattDescriptor);
    }

    @Override // com.sifli.siflicore.blecore.queue.BtLEAction
    public boolean run(BluetoothGatt bluetoothGatt) {
        boolean characteristicNotification = bluetoothGatt.setCharacteristicNotification(getCharacteristic(), this.enableFlag);
        if (characteristicNotification) {
            BluetoothGattDescriptor descriptor = getCharacteristic().getDescriptor(UUID.fromString(String.format("0000%s-0000-1000-8000-00805f9b34fb", "2902")));
            if (descriptor != null) {
                int properties = getCharacteristic().getProperties();
                if ((properties & 16) > 0) {
                    boolean writeDescriptor = writeDescriptor(bluetoothGatt, descriptor, this.enableFlag ? BluetoothGattDescriptor.ENABLE_NOTIFICATION_VALUE : BluetoothGattDescriptor.DISABLE_NOTIFICATION_VALUE);
                    this.hasWrittenDescriptor = true;
                    return writeDescriptor;
                }
                if ((properties & 32) > 0) {
                    boolean writeDescriptor2 = writeDescriptor(bluetoothGatt, descriptor, this.enableFlag ? BluetoothGattDescriptor.ENABLE_INDICATION_VALUE : BluetoothGattDescriptor.DISABLE_NOTIFICATION_VALUE);
                    this.hasWrittenDescriptor = true;
                    return writeDescriptor2;
                }
                this.hasWrittenDescriptor = false;
                return characteristicNotification;
            }
            this.hasWrittenDescriptor = false;
            return characteristicNotification;
        }
        this.hasWrittenDescriptor = false;
        return characteristicNotification;
    }

    @Override // com.sifli.siflicore.blecore.queue.BtLEAction
    public boolean expectsResult() {
        return this.hasWrittenDescriptor;
    }
}
