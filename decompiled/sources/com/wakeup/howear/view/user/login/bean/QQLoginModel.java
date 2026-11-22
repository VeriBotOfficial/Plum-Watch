package com.wakeup.howear.view.user.login.bean;

/* loaded from: classes4.dex */
public class QQLoginModel {
    private String access_token;
    private int authority_cost;
    private String expires_in;
    private int login_cost;
    private String msg;
    private String openid;
    private String pay_token;
    private String pf;
    private String pfkey;
    private int query_authority_cost;
    private int ret;

    public int getRet() {
        return this.ret;
    }

    public void setRet(int i) {
        this.ret = i;
    }

    public String getOpenid() {
        return this.openid;
    }

    public void setOpenid(String str) {
        this.openid = str;
    }

    public String getAccess_token() {
        return this.access_token;
    }

    public void setAccess_token(String str) {
        this.access_token = str;
    }

    public String getPay_token() {
        return this.pay_token;
    }

    public void setPay_token(String str) {
        this.pay_token = str;
    }

    public String getExpires_in() {
        return this.expires_in;
    }

    public void setExpires_in(String str) {
        this.expires_in = str;
    }

    public String getPf() {
        return this.pf;
    }

    public void setPf(String str) {
        this.pf = str;
    }

    public String getPfkey() {
        return this.pfkey;
    }

    public void setPfkey(String str) {
        this.pfkey = str;
    }

    public String getMsg() {
        return this.msg;
    }

    public void setMsg(String str) {
        this.msg = str;
    }

    public int getLogin_cost() {
        return this.login_cost;
    }

    public void setLogin_cost(int i) {
        this.login_cost = i;
    }

    public int getQuery_authority_cost() {
        return this.query_authority_cost;
    }

    public void setQuery_authority_cost(int i) {
        this.query_authority_cost = i;
    }

    public int getAuthority_cost() {
        return this.authority_cost;
    }

    public void setAuthority_cost(int i) {
        this.authority_cost = i;
    }
}
