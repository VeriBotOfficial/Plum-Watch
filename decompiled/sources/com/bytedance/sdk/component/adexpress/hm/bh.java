package com.bytedance.sdk.component.adexpress.hm;

import android.text.TextUtils;

/* loaded from: classes13.dex */
public class bh {
    public static boolean fxn(String str) {
        return TextUtils.equals(str, "fullscreen_interstitial_ad") || TextUtils.equals(str, "rewarded_video");
    }

    public static boolean kg(String str) {
        return com.bytedance.sdk.component.adexpress.hm.kg() && fxn(str);
    }
}
