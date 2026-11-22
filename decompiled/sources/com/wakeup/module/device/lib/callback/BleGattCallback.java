package com.wakeup.module.device.lib.callback;

import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCallback;
import com.wakeup.commponent.module.device.BleDevice;
import com.wakeup.module.device.lib.exception.BleException;

/* loaded from: classes4.dex */
public abstract class BleGattCallback extends BluetoothGattCallback {
    public abstract void onConnectFail(BleDevice bleDevice, BleException bleException);

    public abstract void onConnectSuccess(BleDevice bleDevice, BluetoothGatt bluetoothGatt, int i);

    public abstract void onDisConnected(boolean z, BleDevice bleDevice, BluetoothGatt bluetoothGatt, int i);

    public abstract void onStartConnect(BleDevice bleDevice);
}
