package com.qweather.sdk.bean.base;

/* JADX INFO: loaded from: classes2.dex */
public enum Unit {
    IMPERIAL("i"),
    METRIC("m");

    private final String code;

    Unit(String str) {
        this.code = str;
    }

    public String getCode() {
        return this.code;
    }
}
