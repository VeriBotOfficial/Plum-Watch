package com.bytedance.sdk.openadsdk.utils;

import android.text.TextUtils;

/* loaded from: classes14.dex */
public class mvp {
    public static void fxn(String str) {
        fxn("any_door_id", str);
    }

    public static String fxn() {
        return kg("any_door_id", null);
    }

    private static void fxn(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            com.bytedance.sdk.openadsdk.multipro.hm.hm.fxn((String) null, str, str2);
        } catch (Throwable unused) {
        }
    }

    private static String kg(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            return com.bytedance.sdk.openadsdk.multipro.hm.hm.kg(null, str, str2);
        } catch (Throwable unused) {
            return str2;
        }
    }
}
