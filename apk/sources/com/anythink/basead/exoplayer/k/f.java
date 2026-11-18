package com.anythink.basead.exoplayer.k;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes7.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
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
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j2 = j + jElapsedRealtime;
        while (true) {
            z = this.f2678a;
            if (z || jElapsedRealtime >= j2) {
                break;
            }
            wait(j2 - jElapsedRealtime);
            jElapsedRealtime = SystemClock.elapsedRealtime();
        }
        return z;
    }
}
