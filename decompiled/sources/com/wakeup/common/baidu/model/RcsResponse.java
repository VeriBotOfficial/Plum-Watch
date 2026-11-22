package com.wakeup.common.baidu.model;

/* loaded from: classes2.dex */
public class RcsResponse {
    private String request_id;
    private String ret_code;
    private BceData ret_data;
    private String ret_msg;

    public String getRet_code() {
        return this.ret_code;
    }

    public void setRet_code(String ret_code) {
        this.ret_code = ret_code;
    }

    public String getRet_msg() {
        return this.ret_msg;
    }

    public void setRet_msg(String ret_msg) {
        this.ret_msg = ret_msg;
    }

    public String getRequest_id() {
        return this.request_id;
    }

    public void setRequest_id(String request_id) {
        this.request_id = request_id;
    }

    public BceData getRet_data() {
        return this.ret_data;
    }

    public void setRet_data(BceData ret_data) {
        this.ret_data = ret_data;
    }
}
