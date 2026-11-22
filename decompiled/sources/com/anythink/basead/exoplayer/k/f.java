package com.anythink.basead.exoplayer.k;

import android.os.SystemClock;

/* loaded from: classes11.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    private boolean f2678a;

    public final synchronized boolean a() {
        if (this.f2678a) {
            return false;
        }
        this.f2678a = true;
        notifyAll();
        return true;
    }

    public final synchronized boolean b() {
        boolean z;
        z = this.f2678a;
        this.f2678a = false;
        return z;
    }

    public final synchronized void c() {
        while (!this.f2678a) {
            wait();
        }
    }

    private synchronized boolean a(long j) {
        boolean z;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j2 = j + elapsedRealtime;
        while (true) {
            z = this.f2678a;
            if (z || elapsedRealtime >= j2) {
                break;
            }
            wait(j2 - elapsedRealtime);
            elapsedRealtime = SystemClock.elapsedRealtime();
        }
        return z;
    }
}
