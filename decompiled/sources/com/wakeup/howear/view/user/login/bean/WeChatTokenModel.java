package com.wakeup.howear.view.user.login.bean;

/* loaded from: classes4.dex */
public class WeChatTokenModel {
    private String access_token;
    private int expires_in;
    private String openid;
    private String refresh_token;
    private String scope;

    public String getAccess_token() {
        return this.access_token;
    }

    public void setAccess_token(String str) {
        this.access_token = str;
    }

    public int getExpires_in() {
        return this.expires_in;
    }

    public void setExpires_in(int i) {
        this.expires_in = i;
    }

    public String getRefresh_token() {
        return this.refresh_token;
    }

    public void setRefresh_token(String str) {
        this.refresh_token = str;
    }

    public String getOpenid() {
        return this.openid;
    }

    public void setOpenid(String str) {
        this.openid = str;
    }

    public String getScope() {
        return this.scope;
    }

    public void setScope(String str) {
        this.scope = str;
    }
}
