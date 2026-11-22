package com.sifli.siflicore.error;

/* loaded from: classes14.dex */
public class SFException extends Exception {
    private int code;

    public SFException(int i, String str) {
        super(str);
        this.code = i;
    }

    public int getCode() {
        return this.code;
    }

    @Override // java.lang.Throwable
    public String toString() {
        return "SFException code=" + this.code + ",msg=" + getMessage();
    }
}
