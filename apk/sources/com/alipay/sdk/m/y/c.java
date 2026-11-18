package com.alipay.sdk.m.y;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes7.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long f1480a = 3000;
    public static long b = -1;

    public static synchronized boolean a() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (jElapsedRealtime - b < 3000) {
            return true;
        }
        b = jElapsedRealtime;
        return false;
    }
}
