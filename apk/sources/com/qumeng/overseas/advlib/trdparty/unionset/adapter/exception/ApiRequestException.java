package com.qumeng.overseas.advlib.trdparty.unionset.adapter.exception;

/* JADX INFO: loaded from: classes2.dex */
public class ApiRequestException extends Exception {
    private int code;
    private String msg;

    public ApiRequestException(int r1, String str) {
        super(str);
        this.code = r1;
        this.msg = str;
    }

    public int getCode() {
        return this.code;
    }

    public String getMsg() {
        return this.msg;
    }

    public void setCode(int r1) {
        this.code = r1;
    }

    public void setMsg(String str) {
        this.msg = str;
    }
}
