package com.wakeup.module.device.lib.callback;

import com.wakeup.commponent.module.device.BleDevice;

/* loaded from: classes4.dex */
public abstract class BleScanAndConnectCallback extends BleGattCallback implements BleScanPresenterImp {
    public void onLeScan(BleDevice bleDevice) {
    }

    public abstract void onScanFinished(BleDevice bleDevice);
}
