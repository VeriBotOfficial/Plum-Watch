package com.reactnativecommunity.netinfo.types;

import com.iflytek.cloud.SpeechConstant;

/* loaded from: classes17.dex */
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
