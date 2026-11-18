package com.sifli.siflicore.error;

/* JADX INFO: loaded from: classes11.dex */
public class SFException extends Exception {
    private int code;

    public SFException(int r1, String str) {
        super(str);
        this.code = r1;
    }

    public int getCode() {
        return this.code;
    }

    @Override // java.lang.Throwable
    public String toString() {
        return "SFException code=" + this.code + ",msg=" + getMessage();
    }
}
