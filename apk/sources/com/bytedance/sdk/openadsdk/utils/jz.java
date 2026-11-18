package com.bytedance.sdk.openadsdk.utils;

import android.os.Build;
import java.util.Locale;

/* JADX INFO: loaded from: classes11.dex */
public class jz {
    public static boolean fxn() {
        if (Build.VERSION.SDK_INT < 33) {
            return Build.VERSION.SDK_INT >= 32 && fxn("T", Build.VERSION.CODENAME);
        }
        return true;
    }

    public static boolean fxn(String str, String str2) {
        return !"REL".equals(str2) && str2.toUpperCase(Locale.ROOT).compareTo(str.toUpperCase(Locale.ROOT)) >= 0;
    }
}
