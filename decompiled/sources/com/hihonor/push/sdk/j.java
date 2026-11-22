package com.hihonor.push.sdk;

import android.util.Log;

/* loaded from: classes11.dex */
public class j {
    public static void a(String str) {
        String str2;
        StackTraceElement[] stackTrace = new Throwable().fillInStackTrace().getStackTrace();
        int i = 2;
        while (true) {
            if (i >= stackTrace.length) {
                str2 = "";
                break;
            } else {
                if (!stackTrace[i].getClass().equals(j.class)) {
                    String className = stackTrace[i].getClassName();
                    str2 = className.substring(className.lastIndexOf(46) + 1);
                    break;
                }
                i++;
            }
        }
        a("HonorPush_" + str2, str, null);
    }

    public static void a(String str, String str2, Throwable th) {
        if (str2.length() <= 4000) {
            Log.e(str, str2, th);
            return;
        }
        int i = 0;
        while (i < str2.length()) {
            int i2 = i + 4000;
            Log.e(str, str2.length() > i2 ? str2.substring(i, i2) : str2.substring(i), th);
            i = i2;
        }
    }
}
