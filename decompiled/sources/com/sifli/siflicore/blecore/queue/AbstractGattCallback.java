package com.sifli.siflicore.blecore.queue;

import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;

/* loaded from: classes14.dex */
public abstract class AbstractGattCallback implements GattCallback {
    @Override // com.sifli.siflicore.blecore.queue.GattCallback
    public boolean onCharacteristicChanged(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        return false;
    }

    @Override // com.sifli.siflicore.blecore.queue.GattCallback
    public boolean onCharacteristicRead(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i) {
        return false;
    }

    @Override // com.sifli.siflicore.blecore.queue.GattCallback
    public boolean onCharacteristicWrite(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i) {
        return false;
    }

    @Override // com.sifli.siflicore.blecore.queue.GattCallback
    public void onConnectionStateChange(BluetoothGatt bluetoothGatt, int i, int i2) {
    }

    @Override // com.sifli.siflicore.blecore.queue.GattCallback
    public boolean onDescriptorRead(BluetoothGatt bluetoothGatt, BluetoothGattDescriptor bluetoothGattDescriptor, int i) {
        return false;
    }

    @Override // com.sifli.siflicore.blecore.queue.GattCallback
    public boolean onDescriptorWrite(BluetoothGatt bluetoothGatt, BluetoothGattDescriptor bluetoothGattDescriptor, int i) {
        return false;
    }

    @Override // com.sifli.siflicore.blecore.queue.GattCallback
    public void onMtuChanged(BluetoothGatt bluetoothGatt, int i, int i2) {
    }

    @Override // com.sifli.siflicore.blecore.queue.GattCallback
    public void onReadRemoteRssi(BluetoothGatt bluetoothGatt, int i, int i2) {
    }

    @Override // com.sifli.siflicore.blecore.queue.GattCallback
    public void onServicesDiscovered(BluetoothGatt bluetoothGatt) {
    }
}
