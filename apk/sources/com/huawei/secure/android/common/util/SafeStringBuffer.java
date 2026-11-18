package com.huawei.secure.android.common.util;

import android.util.Log;

/* JADX INFO: loaded from: classes2.dex */
public class SafeStringBuffer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f10841a = "SafeStringBuffer";
    private static final String b = "";

    public static String substring(StringBuffer stringBuffer, int r4) {
        if (stringBuffer != null && stringBuffer.length() >= r4 && r4 >= 0) {
            try {
                return stringBuffer.substring(r4);
            } catch (Exception e) {
                Log.e(f10841a, "substring exception: " + e.getMessage());
            }
        }
        return "";
    }

    public static String substring(StringBuffer stringBuffer, int r3, int r4) {
        if (stringBuffer != null && r3 >= 0 && r4 <= stringBuffer.length() && r4 >= r3) {
            try {
                return stringBuffer.substring(r3, r4);
            } catch (Exception e) {
                Log.e(f10841a, "substring: " + e.getMessage());
            }
        }
        return "";
    }
}
