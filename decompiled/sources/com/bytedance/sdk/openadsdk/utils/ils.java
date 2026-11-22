package com.bytedance.sdk.openadsdk.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes14.dex */
public class ils {
    private static final Map<String, ils> fxn = new HashMap();
    private SharedPreferences kg;

    public static ils fxn(String str, Context context) {
        if (TextUtils.isEmpty(str)) {
            str = "tt_ad_sdk_sp";
        }
        Map<String, ils> map = fxn;
        ils ilsVar = map.get(str);
        if (ilsVar != null) {
            return ilsVar;
        }
        synchronized (ils.class) {
            if (ilsVar == null) {
                try {
                    ilsVar = new ils(str, com.bytedance.sdk.openadsdk.core.rmu.fxn());
                } catch (Throwable th) {
                    throw th;
                }
            }
            map.put(str, ilsVar);
        }
        return ilsVar;
    }

    private ils(String str, Context context) {
        if (context != null) {
            this.kg = context.getSharedPreferences(str, 0);
        }
    }

    public String fxn(String str, String str2) {
        try {
            return this.kg.getString(str, str2);
        } catch (Throwable unused) {
            return str2;
        }
    }

    public void fxn(String str) {
        try {
            this.kg.edit().remove(str).apply();
        } catch (Throwable unused) {
        }
    }
}
