package com.sifli.siflicore.blecore.queue;

import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;

/* JADX INFO: loaded from: classes11.dex */
public interface GattCallback {
    boolean onCharacteristicChanged(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic);

    boolean onCharacteristicRead(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, int r3);

    boolean onCharacteristicWrite(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, int r3);

    void onConnectionStateChange(BluetoothGatt bluetoothGatt, int r2, int r3);

    boolean onDescriptorRead(BluetoothGatt bluetoothGatt, BluetoothGattDescriptor bluetoothGattDescriptor, int r3);

    boolean onDescriptorWrite(BluetoothGatt bluetoothGatt, BluetoothGattDescriptor bluetoothGattDescriptor, int r3);

    void onMtuChanged(BluetoothGatt bluetoothGatt, int r2, int r3);

    void onReadRemoteRssi(BluetoothGatt bluetoothGatt, int r2, int r3);

    void onServicesDiscovered(BluetoothGatt bluetoothGatt);

    void onWriteFail();
}
