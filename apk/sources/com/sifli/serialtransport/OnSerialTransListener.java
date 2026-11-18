package com.sifli.serialtransport;

/* JADX INFO: loaded from: classes16.dex */
public interface OnSerialTransListener {
    void onSerialBluetoothConnect(int r1);

    void onSerialDataReceive(int r1, byte[] bArr);

    void onSerialMTUChangeResult(int r1);

    void onSerialTranSendFinish();

    void onSerialTransBLEStateChanged(int r1);

    void onSerialTransProgress(int r1);

    void onSerialTransSend(int r1);
}
