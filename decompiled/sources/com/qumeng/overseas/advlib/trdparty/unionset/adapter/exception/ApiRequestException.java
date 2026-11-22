package com.qumeng.overseas.advlib.trdparty.unionset.adapter.exception;

/* loaded from: classes17.dex */
public class ApiRequestException extends Exception {
    private int code;
    private String msg;

    public ApiRequestException(int i, String str) {
        super(str);
        this.code = i;
        this.msg = str;
    }

    public int getCode() {
        return this.code;
    }

    public String getMsg() {
        return this.msg;
    }

    public void setCode(int i) {
        this.code = i;
    }

    public void setMsg(String str) {
        this.msg = str;
    }
}
