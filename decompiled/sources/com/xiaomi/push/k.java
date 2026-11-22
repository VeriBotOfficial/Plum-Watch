package com.xiaomi.push;

import android.os.Build;

/* loaded from: classes4.dex */
public class k {

    /* renamed from: a, reason: collision with root package name */
    private static long f14684a;

    /* renamed from: a, reason: collision with other field name */
    private static String f925a;

    public static synchronized String a() {
        String str;
        synchronized (k.class) {
            long currentTimeMillis = System.currentTimeMillis();
            if (Math.abs(currentTimeMillis - f14684a) > 86400000) {
                f14684a = currentTimeMillis;
                f925a = Build.MODEL;
            }
            str = f925a;
            if (str == null) {
                str = "";
            }
        }
        return str;
    }
}
