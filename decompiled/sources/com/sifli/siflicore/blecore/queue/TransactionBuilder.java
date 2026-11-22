package com.sifli.siflicore.blecore.queue;

import android.bluetooth.BluetoothGattCharacteristic;
import com.sifli.siflicore.blecore.actions.NotifyAction;
import com.sifli.siflicore.blecore.actions.ReadAction;
import com.sifli.siflicore.blecore.actions.RequestConnectionPriorityAction;
import com.sifli.siflicore.blecore.actions.RequestMtuAction;
import com.sifli.siflicore.blecore.actions.WriteAction;
import java.util.Arrays;

/* loaded from: classes14.dex */
public class TransactionBuilder {
    private boolean mQueued;
    private final Transaction mTransaction;

    public TransactionBuilder(String str) {
        this.mTransaction = new Transaction(str);
    }

    public TransactionBuilder read(BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        return bluetoothGattCharacteristic == null ? this : add(new ReadAction(bluetoothGattCharacteristic));
    }

    public TransactionBuilder write(BluetoothGattCharacteristic bluetoothGattCharacteristic, byte[] bArr) {
        return bluetoothGattCharacteristic == null ? this : add(new WriteAction(bluetoothGattCharacteristic, bArr));
    }

    public TransactionBuilder write(BluetoothGattCharacteristic bluetoothGattCharacteristic, byte[] bArr, boolean z) {
        if (bluetoothGattCharacteristic == null) {
            return this;
        }
        WriteAction writeAction = new WriteAction(bluetoothGattCharacteristic, bArr);
        writeAction.setExpectsResult(z);
        return add(writeAction);
    }

    public TransactionBuilder writeChunkedData(BluetoothGattCharacteristic bluetoothGattCharacteristic, byte[] bArr, int i) {
        int i2 = 0;
        while (i2 < bArr.length) {
            int i3 = i2 + i;
            add(new WriteAction(bluetoothGattCharacteristic, Arrays.copyOfRange(bArr, i2, i3 > bArr.length ? bArr.length : i3)));
            i2 = i3;
        }
        return this;
    }

    public TransactionBuilder requestMtu(int i) {
        return add(new RequestMtuAction(i));
    }

    public TransactionBuilder requestConnectionPriority(int i) {
        return add(new RequestConnectionPriorityAction(i));
    }

    public TransactionBuilder requestConnectionPriority(int i, boolean z) {
        RequestConnectionPriorityAction requestConnectionPriorityAction = new RequestConnectionPriorityAction(i);
        requestConnectionPriorityAction.setHighSpeedMode(z);
        return add(requestConnectionPriorityAction);
    }

    public TransactionBuilder notify(BluetoothGattCharacteristic bluetoothGattCharacteristic, boolean z) {
        return bluetoothGattCharacteristic == null ? this : add(createNotifyAction(bluetoothGattCharacteristic, z));
    }

    protected NotifyAction createNotifyAction(BluetoothGattCharacteristic bluetoothGattCharacteristic, boolean z) {
        return new NotifyAction(bluetoothGattCharacteristic, z);
    }

    public TransactionBuilder add(BtLEAction btLEAction) {
        this.mTransaction.add(btLEAction);
        return this;
    }

    public void setCallback(GattCallback gattCallback) {
        this.mTransaction.setCallback(gattCallback);
    }

    public GattCallback getGattCallback() {
        return this.mTransaction.getGattCallback();
    }

    public void queue(BtLEQueue btLEQueue) {
        if (this.mQueued) {
            throw new IllegalStateException("This builder had already been queued. You must not reuse it.");
        }
        this.mQueued = true;
        btLEQueue.add(this.mTransaction);
    }

    public Transaction getTransaction() {
        return this.mTransaction;
    }

    public String getTaskName() {
        return this.mTransaction.getTaskName();
    }
}
