package com.qweather.sdk.bean.base;

/* JADX INFO: loaded from: classes2.dex */
public enum Type {
    SCENIC("scenic"),
    CSTA("CSTA"),
    TSTA("TSTA");

    private final String code;

    Type(String str) {
        this.code = str;
    }

    public String getCode() {
        return this.code;
    }
}
