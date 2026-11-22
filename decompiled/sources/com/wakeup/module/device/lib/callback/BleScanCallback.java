package com.wakeup.module.device.lib.callback;

import com.wakeup.commponent.module.device.BleDevice;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class BleScanCallback implements BleScanPresenterImp {
    public void onLeScan(BleDevice bleDevice) {
    }

    public abstract void onScanFinished(List<BleDevice> list);
}
