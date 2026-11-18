package com.bytedance.sdk.component.utils;

import android.os.Build;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes15.dex */
public class uhw {
    private static volatile String fxn;

    public static String fxn() {
        if (!TextUtils.isEmpty(fxn)) {
            return fxn;
        }
        String str = Build.MODEL;
        fxn = str;
        return str;
    }
}
