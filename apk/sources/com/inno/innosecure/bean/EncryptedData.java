package com.inno.innosecure.bean;

/* JADX INFO: loaded from: classes2.dex */
public class EncryptedData {
    private byte[] encodedData;
    private String exceptionInfo;
    private int resultCode;

    public EncryptedData(int r1) {
        this.resultCode = r1;
    }

    public byte[] getEncodedData() {
        return this.encodedData;
    }

    public String getExceptionInfo() {
        return this.exceptionInfo;
    }

    public int getResultCode() {
        return this.resultCode;
    }

    public void setEncodedData(byte[] bArr) {
        this.encodedData = bArr;
    }

    public void setExceptionInfo(String str) {
        this.exceptionInfo = str;
    }

    public void setResultCode(int r1) {
        this.resultCode = r1;
    }
}
