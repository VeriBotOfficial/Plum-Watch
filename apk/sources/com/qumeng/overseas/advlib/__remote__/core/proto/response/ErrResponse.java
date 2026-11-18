package com.qumeng.overseas.advlib.__remote__.core.proto.response;

import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public class ErrResponse implements Serializable {
    public int err_code;
    public String err_msg;
    public int resp_code;

    public ErrResponse() {
        this.err_code = 100001;
        this.resp_code = -1;
        this.err_msg = "";
    }

    public ErrResponse(int r2, String str) {
        this.resp_code = -1;
        this.err_code = r2;
        this.err_msg = str;
    }
}
