package com.wakeup.module.device.lib.callback;

import com.wakeup.module.device.lib.exception.BleException;

/* loaded from: classes4.dex */
public abstract class BleMtuChangedCallback extends BleBaseCallback {
    public abstract void onMtuChanged(int i);

    public abstract void onSetMTUFailure(BleException bleException);
}
