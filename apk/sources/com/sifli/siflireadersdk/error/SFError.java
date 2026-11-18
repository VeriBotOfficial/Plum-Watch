package com.sifli.siflireadersdk.error;

import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class SFError implements Serializable {
    private int code;
    private String innerError;
    private String msg;

    public SFError(int r1, String str) {
        this.code = r1;
        this.msg = str;
    }

    public SFError(int r1, String str, String str2) {
        this.code = r1;
        this.msg = str;
        this.innerError = str2;
    }

    public int getCode() {
        return this.code;
    }

    public String getMsg() {
        return this.msg;
    }

    public String getInnerError() {
        return this.innerError;
    }

    public String toString() {
        if (this.innerError == null) {
            return "SFError code=" + this.code + ",msg=" + this.msg;
        }
        return "SFError code=" + this.code + ",msg=" + this.msg + ",innerError=" + this.innerError;
    }
}
