package com.bytedance.sdk.component.utils;

import android.text.TextUtils;
import android.util.Log;

/* JADX INFO: loaded from: classes15.dex */
public class dx {
    private static boolean fxn = false;
    private static String kg = "";

    public static void fxn() {
        fxn = true;
    }

    public static void kg() {
        fxn = false;
    }

    public static void fxn(String str, String str2) {
        if (fxn && str2 != null) {
            Log.d(kg(str), str2);
        }
    }

    public static void fxn(String str, Object... objArr) {
        if (fxn && objArr != null) {
            Log.d(kg(str), fxn(objArr));
        }
    }

    public static void kg(String str, String str2) {
        if (fxn && str2 != null) {
            Log.i(kg(str), str2);
        }
    }

    public static void kg(String str, Object... objArr) {
        if (fxn && objArr != null) {
            Log.i(kg(str), fxn(objArr));
        }
    }

    public static void gff(String str, String str2) {
        if (fxn && str2 != null) {
            Log.e(kg(str), str2);
        }
    }

    public static void gff(String str, Object... objArr) {
        if (fxn && objArr != null) {
            Log.e(kg(str), fxn(objArr));
        }
    }

    public static void fxn(String str, String str2, Throwable th) {
        if (fxn) {
            if (str2 == null && th == null) {
                return;
            }
            Log.e(kg(str), str2, th);
        }
    }

    public static void fxn(String str) {
        kg = str;
    }

    private static String kg(String str) {
        return TextUtils.isEmpty(kg) ? str : fxn("[" + kg + "]-[" + str + "]");
    }

    private static String fxn(Object... objArr) {
        if (objArr == null || objArr.length == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (Object obj : objArr) {
            if (obj != null) {
                sb.append(obj.toString());
            } else {
                sb.append(" null ");
            }
            sb.append(" ");
        }
        return sb.toString();
    }
}
