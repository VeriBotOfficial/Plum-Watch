package com.bytedance.sdk.openadsdk.utils;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;

/* loaded from: classes14.dex */
public class ij {
    private static String fxn;

    public static boolean gff() {
        return false;
    }

    public static boolean fxn() {
        return com.bytedance.sdk.component.utils.ckl.hm() && com.bytedance.sdk.openadsdk.core.jq.kg().rmu() && com.bytedance.sdk.openadsdk.core.jq.kg().ud();
    }

    public static String fxn(String str) {
        try {
            if (!fxn()) {
                return str;
            }
            String dx = com.bytedance.sdk.openadsdk.core.jq.kg().dx();
            if (TextUtils.isEmpty(dx)) {
                return str;
            }
            Log.d("TestHelperUtils", "AnyDoorId=".concat(String.valueOf(dx)));
            return Uri.parse(str).buildUpon().appendQueryParameter(kg(), dx).appendQueryParameter("aid", "5001121").toString();
        } catch (Throwable unused) {
            return str;
        }
    }

    public static String kg() {
        if (TextUtils.isEmpty(fxn)) {
            fxn = new String(Base64.decode("ZGV2aWNlX2lk", 0));
        }
        return fxn;
    }
}
