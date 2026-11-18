package com.beken.iot.smartsdk.core.callback;

/* JADX INFO: loaded from: classes15.dex */
public interface OnChannelDataTransmission {
    void onCmdSend(int r1, int r2, byte[] bArr);

    void onEvtReceive(int r1, byte b, byte[] bArr);
}
