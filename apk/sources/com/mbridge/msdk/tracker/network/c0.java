package com.mbridge.msdk.tracker.network;

import android.util.Log;
import androidx.camera.core.CameraInfo;
import java.util.Locale;

/* JADX INFO: compiled from: VolleyLog.java */
/* JADX INFO: loaded from: classes2.dex */
public class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static String f12287a = "TrackManager_Volley";
    private static final String b = "com.mbridge.msdk.tracker.network.c0";

    public static void a(Throwable th, String str, Object... objArr) {
        Log.e(f12287a, a(str, objArr), th);
    }

    public static void b(String str, Object... objArr) {
        Log.d(f12287a, a(str, objArr));
    }

    public static void c(String str, Object... objArr) {
        Log.e(f12287a, a(str, objArr));
    }

    public static void d(String str, Object... objArr) {
    }

    private static String a(String str, Object... objArr) {
        String str2;
        if (objArr != null) {
            str = String.format(Locale.US, str, objArr);
        }
        StackTraceElement[] stackTrace = new Throwable().fillInStackTrace().getStackTrace();
        for (int r0 = 2; r0 < stackTrace.length; r0++) {
            if (!stackTrace[r0].getClassName().equals(b)) {
                String className = stackTrace[r0].getClassName();
                String strSubstring = className.substring(className.lastIndexOf(46) + 1);
                str2 = strSubstring.substring(strSubstring.lastIndexOf(36) + 1) + "." + stackTrace[r0].getMethodName();
                return String.format(Locale.US, "[%d] %s: %s", Long.valueOf(Thread.currentThread().getId()), str2, str);
            }
        }
        str2 = CameraInfo.IMPLEMENTATION_TYPE_UNKNOWN;
        return String.format(Locale.US, "[%d] %s: %s", Long.valueOf(Thread.currentThread().getId()), str2, str);
    }
}
