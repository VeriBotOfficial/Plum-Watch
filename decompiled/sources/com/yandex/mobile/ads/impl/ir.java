package com.yandex.mobile.ads.impl;

import android.os.SystemClock;

/* loaded from: classes5.dex */
public final class ir {

    /* renamed from: a, reason: collision with root package name */
    private boolean f15846a;

    public final synchronized void c() {
        this.f15846a = false;
    }

    public ir() {
        this(0);
    }

    public ir(int i) {
    }

    public final synchronized boolean e() {
        if (this.f15846a) {
            return false;
        }
        this.f15846a = true;
        notifyAll();
        return true;
    }

    public final synchronized void a() throws InterruptedException {
        while (!this.f15846a) {
            wait();
        }
    }

    public final synchronized void b() {
        boolean z = false;
        while (!this.f15846a) {
            try {
                wait();
            } catch (InterruptedException unused) {
                z = true;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    public final synchronized boolean d() {
        return this.f15846a;
    }

    public final synchronized boolean a(long j) throws InterruptedException {
        if (j <= 0) {
            return this.f15846a;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j2 = j + elapsedRealtime;
        if (j2 < elapsedRealtime) {
            a();
        } else {
            while (!this.f15846a && elapsedRealtime < j2) {
                wait(j2 - elapsedRealtime);
                elapsedRealtime = SystemClock.elapsedRealtime();
            }
        }
        return this.f15846a;
    }
}
