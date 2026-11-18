package com.bytedance.sdk.component.bh.fxn.fxn.fxn;

import android.text.TextUtils;
import android.util.Base64;

/* JADX INFO: loaded from: classes15.dex */
public class bh {
    public static String fxn(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        return Base64.encodeToString(str.getBytes(), 10);
    }

    public static String kg(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        return new String(Base64.decode(str, 10));
    }
}
