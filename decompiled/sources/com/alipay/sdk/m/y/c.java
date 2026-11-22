package com.alipay.sdk.m.y;

import android.os.SystemClock;

/* loaded from: classes11.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public static final long f1480a = 3000;
    public static long b = -1;

    public static synchronized boolean a() {
        synchronized (c.class) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (elapsedRealtime - b < 3000) {
                return true;
            }
            b = elapsedRealtime;
            return false;
        }
    }
}
