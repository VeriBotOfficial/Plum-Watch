package com.bytedance.sdk.component.adexpress.hm;

import android.text.TextUtils;

/* loaded from: classes13.dex */
public class rb {
    public static boolean fxn(String str) {
        if (com.bytedance.sdk.component.adexpress.hm.kg()) {
            return TextUtils.equals(str, "embeded_ad") || TextUtils.equals(str, "banner_ad");
        }
        return false;
    }
}
