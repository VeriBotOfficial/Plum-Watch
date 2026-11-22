package com.wakeup.module.device.lib.callback;

import com.wakeup.commponent.module.device.BleDevice;

/* loaded from: classes4.dex */
public interface BleScanPresenterImp {
    void onScanStarted(boolean z);

    void onScanning(BleDevice bleDevice);
}
