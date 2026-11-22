package com.bytedance.sdk.openadsdk.dx;

import com.efs.sdk.base.core.util.NetworkUtil;

/* loaded from: classes14.dex */
public enum hm {
    TYPE_2G(NetworkUtil.NETWORK_CLASS_2G),
    TYPE_3G(NetworkUtil.NETWORK_CLASS_3G),
    TYPE_4G(NetworkUtil.NETWORK_CLASS_4G),
    TYPE_5G(NetworkUtil.NETWORK_CLASS_5G),
    TYPE_WIFI("wifi"),
    TYPE_MOBILE("mobile"),
    TYPE_UNKNOWN("unknown");

    private String tw;

    hm(String str) {
        this.tw = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.tw;
    }
}
