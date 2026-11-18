package com.hihonor.push.sdk;

import android.util.Log;

/* JADX INFO: loaded from: classes7.dex */
public class j {
    public static void a(String str) {
        String strSubstring;
        StackTraceElement[] stackTrace = new Throwable().fillInStackTrace().getStackTrace();
        for (int r1 = 2; r1 < stackTrace.length; r1++) {
            if (!stackTrace[r1].getClass().equals(j.class)) {
                String className = stackTrace[r1].getClassName();
                strSubstring = className.substring(className.lastIndexOf(46) + 1);
                a("HonorPush_" + strSubstring, str, null);
            }
        }
        strSubstring = "";
        a("HonorPush_" + strSubstring, str, null);
    }

    public static void a(String str, String str2, Throwable th) {
        if (str2.length() <= 4000) {
            Log.e(str, str2, th);
            return;
        }
        int r0 = 0;
        while (r0 < str2.length()) {
            int r2 = r0 + 4000;
            Log.e(str, str2.length() > r2 ? str2.substring(r0, r2) : str2.substring(r0), th);
            r0 = r2;
        }
    }
}
