package com.huawei.secure.android.common.util;

import android.util.Log;

/* loaded from: classes17.dex */
public class SafeStringBuffer {

    /* renamed from: a, reason: collision with root package name */
    private static final String f10841a = "SafeStringBuffer";
    private static final String b = "";

    public static String substring(StringBuffer stringBuffer, int i) {
        if (stringBuffer != null && stringBuffer.length() >= i && i >= 0) {
            try {
                return stringBuffer.substring(i);
            } catch (Exception e) {
                Log.e(f10841a, "substring exception: " + e.getMessage());
            }
        }
        return "";
    }

    public static String substring(StringBuffer stringBuffer, int i, int i2) {
        if (stringBuffer != null && i >= 0 && i2 <= stringBuffer.length() && i2 >= i) {
            try {
                return stringBuffer.substring(i, i2);
            } catch (Exception e) {
                Log.e(f10841a, "substring: " + e.getMessage());
            }
        }
        return "";
    }
}
