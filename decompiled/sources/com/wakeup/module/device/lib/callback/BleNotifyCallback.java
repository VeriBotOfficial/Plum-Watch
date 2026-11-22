package com.wakeup.module.device.lib.callback;

import com.wakeup.module.device.lib.exception.BleException;

/* loaded from: classes4.dex */
public abstract class BleNotifyCallback extends BleBaseCallback {
    public abstract void onCharacteristicChanged(byte[] bArr);

    public abstract void onNotifyFailure(String str, BleException bleException);

    public abstract void onNotifySuccess(String str);
}
