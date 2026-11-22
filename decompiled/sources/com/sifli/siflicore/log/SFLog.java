package com.sifli.siflicore.log;

import android.util.Log;
import com.sifli.siflicore.log.SFLogManager;

/* loaded from: classes14.dex */
public class SFLog {
    public static void i(String str, String str2) {
        String str3 = "[SiFli]" + str;
        if (SFLogManager.getInstance().isLogEnable()) {
            Log.i(str3, str2);
        }
        callbackLog(1, str3, str2);
    }

    public static void i(String str, String str2, Object... objArr) {
        i(str, String.format(str2, objArr));
    }

    public static void e(String str, String str2) {
        String str3 = "[SiFli]" + str;
        if (SFLogManager.getInstance().isLogEnable()) {
            Log.e(str3, str2);
        }
        callbackLog(4, str3, str2);
    }

    public static void e(String str, String str2, Object... objArr) {
        e(str, String.format(str2, objArr));
    }

    public static void d(String str, String str2) {
        String str3 = "[SiFli]" + str;
        if (SFLogManager.getInstance().isLogEnable()) {
            Log.d(str3, str2);
        }
        callbackLog(3, str3, str2);
    }

    public static void d(String str, String str2, Object... objArr) {
        d(str, String.format(str2, objArr));
    }

    public static void w(String str, String str2) {
        String str3 = "[SiFli]" + str;
        if (SFLogManager.getInstance().isLogEnable()) {
            Log.w(str3, str2);
        }
        callbackLog(2, str3, str2);
    }

    public static void w(String str, String str2, Object... objArr) {
        w(str, String.format(str2, objArr));
    }

    private static void callbackLog(int i, String str, String str2) {
        SFLogManager.SFLogManagerCallback callback = SFLogManager.getInstance().getCallback();
        if (callback != null) {
            callback.onLog(i, String.format("[%s] %s", str, str2));
        }
    }
}
