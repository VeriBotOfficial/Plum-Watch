package com.reactnativecommunity.netinfo.types;

import com.iflytek.cloud.SpeechConstant;

/* JADX INFO: loaded from: classes2.dex */
public enum ConnectionType {
    BLUETOOTH(SpeechConstant.BLUETOOTH),
    CELLULAR("cellular"),
    ETHERNET("ethernet"),
    NONE("none"),
    UNKNOWN("unknown"),
    WIFI("wifi"),
    WIMAX("wimax"),
    VPN("vpn");

    public final String label;

    ConnectionType(String str) {
        this.label = str;
    }
}
