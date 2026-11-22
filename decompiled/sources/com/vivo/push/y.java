package com.vivo.push;

import android.os.SystemClock;

/* compiled from: RequestFrequencyControl.java */
/* loaded from: classes2.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    private volatile long f14169a = -1;

    public final synchronized boolean a() {
        boolean z;
        long j = this.f14169a;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        z = j != -1 && elapsedRealtime > j && elapsedRealtime < j + 2000;
        this.f14169a = SystemClock.elapsedRealtime();
        return z;
    }
}
