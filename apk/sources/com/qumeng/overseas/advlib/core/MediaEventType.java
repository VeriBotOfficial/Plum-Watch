package com.qumeng.overseas.advlib.core;

/* JADX INFO: loaded from: classes2.dex */
public enum MediaEventType {
    ENTER("enter"),
    EXIT("exit"),
    COMMON("common");

    private final String eventString;

    MediaEventType(String str) {
        this.eventString = str;
    }

    public String getEventString() {
        return this.eventString;
    }
}
