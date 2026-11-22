package com.sifli.siflicore.btbr;

import com.sifli.siflicore.error.SFError;

/* loaded from: classes14.dex */
public interface SocketCallback {
    void onConnectionEstablished();

    void onConnectionFail(SFError sFError);

    void onReadFail(SFError sFError);

    void onSocketRead(byte[] bArr);

    void onWriteFail(SFError sFError);
}
