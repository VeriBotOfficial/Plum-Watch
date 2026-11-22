package com.wakeup.module.device.lib.callback;

import com.wakeup.module.device.lib.exception.BleException;

/* loaded from: classes4.dex */
public abstract class BleWriteCallback extends BleBaseCallback {
    public abstract void onWriteFailure(BleException bleException);

    public abstract void onWriteSuccess(int i, int i2, byte[] bArr);
}
