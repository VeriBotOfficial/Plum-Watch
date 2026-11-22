package com.autonavi.aps.amapapi.restruct;

import android.net.wifi.WifiInfo;
import android.text.TextUtils;
import com.autonavi.aps.amapapi.utils.Utils;

/* loaded from: classes12.dex */
public class WifiInfoWrapper {

    /* renamed from: a, reason: collision with root package name */
    private WifiInfo f6685a;
    private String b;
    private String c;
    private int d = -1;

    public WifiInfoWrapper(WifiInfo wifiInfo) {
        this.f6685a = wifiInfo;
    }

    public String getBSSID() {
        if (this.c == null) {
            this.c = SystemApiWrapper.getBSSID(this.f6685a);
        }
        return this.c;
    }

    public WifiInfo getOrigin() {
        return this.f6685a;
    }

    public int getRssi() {
        if (this.d == -1) {
            this.d = SystemApiWrapper.getRssi(this.f6685a);
        }
        return this.d;
    }

    public String getSSID() {
        if (this.b == null) {
            this.b = SystemApiWrapper.getSSID(this.f6685a);
        }
        return this.b;
    }

    public boolean isUseFul() {
        return (this.f6685a == null || TextUtils.isEmpty(getSSID()) || !Utils.wifiUseful(getBSSID())) ? false : true;
    }

    public WifiInfoWrapper(WifiInfo wifiInfo, String str, String str2) {
        this.f6685a = wifiInfo;
        this.b = str;
        this.c = str2;
    }
}
