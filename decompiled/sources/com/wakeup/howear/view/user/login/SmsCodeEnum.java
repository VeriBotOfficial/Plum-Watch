package com.wakeup.howear.view.user.login;

/* loaded from: classes4.dex */
public enum SmsCodeEnum {
    UPDATE_PWD("2", "修改密码"),
    BIND_PHONE("3", "绑定手机"),
    TYPE_FORGET("2", "找回密码"),
    LOGIN("5", "登录");

    private final String desc;
    private final String type;

    SmsCodeEnum(String str, String str2) {
        this.type = str;
        this.desc = str2;
    }

    public String getType() {
        return this.type;
    }
}
