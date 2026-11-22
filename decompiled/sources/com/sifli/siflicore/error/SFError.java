package com.sifli.siflicore.error;

import java.io.Serializable;

/* loaded from: classes14.dex */
public class SFError implements Serializable {
    private int code;
    private int deviceErrorCode;
    private String innerError;
    private String msg;

    public SFError(int i, String str) {
        this.code = i;
        this.msg = str;
    }

    public SFError(int i, String str, String str2) {
        this.code = i;
        this.msg = str;
        this.innerError = str2;
    }

    public static SFError makeDevError(int i) {
        SFError sFError = new SFError(16, String.format("Device Reponse Error Code:%d", Integer.valueOf(i)));
        sFError.deviceErrorCode = i;
        return sFError;
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

    public int getDeviceErrorCode() {
        return this.deviceErrorCode;
    }
}
