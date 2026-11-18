package com.huawei.secure.android.common.util;

import android.util.Log;

/* JADX INFO: loaded from: classes2.dex */
public class SafeString {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f10840a = "SafeString";
    private static final String b = "";

    public static String replace(String str, CharSequence charSequence, CharSequence charSequence2) {
        if (str != null && charSequence != null && charSequence2 != null) {
            try {
                return str.replace(charSequence, charSequence2);
            } catch (Exception e) {
                Log.e(f10840a, "replace: " + e.getMessage());
            }
        }
        return str;
    }

    public static String substring(String str, int r4) {
        if (str != null && str.length() >= r4 && r4 >= 0) {
            try {
                return str.substring(r4);
            } catch (Exception e) {
                Log.e(f10840a, "substring exception: " + e.getMessage());
            }
        }
        return "";
    }

    public static String substring(String str, int r3, int r4) {
        if (str != null && r3 >= 0 && r4 <= str.length() && r4 >= r3) {
            try {
                return str.substring(r3, r4);
            } catch (Exception e) {
                Log.e(f10840a, "substring: " + e.getMessage());
            }
        }
        return "";
    }
}
