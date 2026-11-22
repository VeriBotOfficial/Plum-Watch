package com.sifli.siflicore.btbr;

import com.sifli.siflicore.error.SFError;

/* loaded from: classes14.dex */
public interface SFSppManagerCallback {
    void onDeviceConnectFail(SFError sFError);

    void onDeviceConnected(String str);

    void onDeviceDisconnected(SFError sFError);

    void onNotifyData(byte[] bArr);

    void onWriteFail(SFError sFError);

    void onWriteListDataDone();
}
