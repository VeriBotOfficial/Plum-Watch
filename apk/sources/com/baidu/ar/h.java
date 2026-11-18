package com.baidu.ar;

import android.util.Log;

/* JADX INFO: loaded from: classes16.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f6953a = 2;

    public static String a() {
        StackTraceElement stackTraceElement = new Exception().getStackTrace()[2];
        StringBuffer stringBuffer = new StringBuffer("[");
        stringBuffer.append(stackTraceElement.getFileName());
        stringBuffer.append(" | ");
        stringBuffer.append(stackTraceElement.getLineNumber());
        stringBuffer.append(" | ");
        stringBuffer.append(stackTraceElement.getMethodName());
        stringBuffer.append("]");
        return stringBuffer.toString();
    }

    public static void a(String str) {
        a("ARLOG", a() + " " + str);
    }

    public static void a(String str, String str2) {
        if (f6953a > 3) {
            return;
        }
        Log.d(str, str2);
    }

    public static void a(boolean z) {
        f6953a = z ? 2 : 6;
    }

    public static void b(String str) {
        b("ARLOG", a() + " " + str);
    }

    public static void b(String str, String str2) {
        if (f6953a > 6) {
            return;
        }
        Log.e(str, str2);
    }

    public static void c(String str) {
        c("ARLOG", a() + " " + str);
    }

    public static void c(String str, String str2) {
        if (f6953a > 4) {
            return;
        }
        Log.i(str, str2);
    }

    public static void d(String str) {
        d("ARLOG", a() + " " + str);
    }

    public static void d(String str, String str2) {
        if (f6953a > 2) {
            return;
        }
        Log.v(str, str2);
    }

    public static void e(String str, String str2) {
        if (f6953a > 5) {
            return;
        }
        Log.w(str, str2);
    }
}
