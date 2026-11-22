package com.qumeng.overseas.advlib.__remote__.core.proto.utils;

import android.os.Build;
import android.text.TextUtils;

/* loaded from: classes17.dex */
public class k {
    private static String a(String str, String str2) {
        String str3;
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            str3 = (String) cls.getDeclaredMethod("get", String.class).invoke(cls, str);
        } catch (Throwable unused) {
        }
        return TextUtils.isEmpty(str3) ? str2 : str3;
    }

    public static String b() {
        return a(com.alipay.sdk.m.d.a.b, "");
    }

    public static boolean c() {
        try {
            Class<?> cls = Class.forName("com.huawei.system.BuildEx");
            return "Harmony".equalsIgnoreCase(cls.getMethod("getOsBrand", new Class[0]).invoke(cls, new Object[0]).toString());
        } catch (Throwable unused) {
            return false;
        }
    }

    public static String a() {
        return Build.DISPLAY;
    }
}
