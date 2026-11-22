package com.sifli.siflicore.blecore;

import com.sifli.siflicore.error.SFError;

/* loaded from: classes14.dex */
public interface SFBLEManagerCallback {
    void onDeviceConnectFail(SFError sFError);

    void onDeviceConnected(String str);

    void onDeviceDisconnected(SFError sFError);

    void onHandShake(int i);

    void onHandShakeFail(SFError sFError);

    void onMtuChanged(int i);

    void onNotifyData(byte[] bArr);

    void onWriteFail(SFError sFError);

    void onWriteListDataDone();
}
