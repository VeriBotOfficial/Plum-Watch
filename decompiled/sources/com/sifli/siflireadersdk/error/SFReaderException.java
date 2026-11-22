package com.sifli.siflireadersdk.error;

/* loaded from: classes16.dex */
public class SFReaderException extends Exception {
    private int code;

    public SFReaderException(int i, String str) {
        super(str);
        this.code = i;
    }

    public int getCode() {
        return this.code;
    }

    @Override // java.lang.Throwable
    public String toString() {
        return "SFReaderException code=" + this.code + ",msg=" + getMessage();
    }
}
