package com.sifli.siflicore.blecore.queue;

import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;

/* loaded from: classes14.dex */
public interface GattCallback {
    boolean onCharacteristicChanged(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic);

    boolean onCharacteristicRead(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i);

    boolean onCharacteristicWrite(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i);

    void onConnectionStateChange(BluetoothGatt bluetoothGatt, int i, int i2);

    boolean onDescriptorRead(BluetoothGatt bluetoothGatt, BluetoothGattDescriptor bluetoothGattDescriptor, int i);

    boolean onDescriptorWrite(BluetoothGatt bluetoothGatt, BluetoothGattDescriptor bluetoothGattDescriptor, int i);

    void onMtuChanged(BluetoothGatt bluetoothGatt, int i, int i2);

    void onReadRemoteRssi(BluetoothGatt bluetoothGatt, int i, int i2);

    void onServicesDiscovered(BluetoothGatt bluetoothGatt);

    void onWriteFail();
}
