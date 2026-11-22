package com.iflytek.idata.extension.d;

import android.util.Log;

/* loaded from: classes17.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private static boolean f11233a = false;

    public static void a(String str, String str2) {
        if (f11233a) {
            Log.d("iData_" + str, str2);
        }
    }

    public static void b(String str, String str2) {
        if (f11233a) {
            Log.w("iData_" + str, str2);
        }
    }

    public static void c(String str, String str2) {
        if (f11233a) {
            Log.e("iData_" + str, str2);
        }
    }
}
