package com.beken.iot.smartsdk.core.callback;

/* loaded from: classes13.dex */
public interface OnChannelDataTransmission {
    void onCmdSend(int i, int i2, byte[] bArr);

    void onEvtReceive(int i, byte b, byte[] bArr);
}
