package com.sifli.siflireadersdk.error;

/* JADX INFO: loaded from: classes3.dex */
public class SFReaderException extends Exception {
    private int code;

    public SFReaderException(int r1, String str) {
        super(str);
        this.code = r1;
    }

    public int getCode() {
        return this.code;
    }

    @Override // java.lang.Throwable
    public String toString() {
        return "SFReaderException code=" + this.code + ",msg=" + getMessage();
    }
}
