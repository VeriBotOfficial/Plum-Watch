package com.mbridge.msdk.thrid.okio;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: Timeout.java */
/* JADX INFO: loaded from: classes2.dex */
public class t {
    public static final t d = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f12263a;
    private long b;
    private long c;

    /* JADX INFO: compiled from: Timeout.java */
    static class a extends t {
        a() {
        }

        @Override // com.mbridge.msdk.thrid.okio.t
        public t a(long j) {
            return this;
        }

        @Override // com.mbridge.msdk.thrid.okio.t
        public t a(long j, TimeUnit timeUnit) {
            return this;
        }

        @Override // com.mbridge.msdk.thrid.okio.t
        public void e() throws IOException {
        }
    }

    public t a(long j, TimeUnit timeUnit) {
        if (j < 0) {
            throw new IllegalArgumentException("timeout < 0: " + j);
        }
        if (timeUnit == null) {
            throw new IllegalArgumentException("unit == null");
        }
        this.c = timeUnit.toNanos(j);
        return this;
    }

    public t b() {
        this.c = 0L;
        return this;
    }

    public long c() {
        if (this.f12263a) {
            return this.b;
        }
        throw new IllegalStateException("No deadline");
    }

    public boolean d() {
        return this.f12263a;
    }

    public void e() throws IOException {
        if (Thread.interrupted()) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException("interrupted");
        }
        if (this.f12263a && this.b - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    public long f() {
        return this.c;
    }

    public t a(long j) {
        this.f12263a = true;
        this.b = j;
        return this;
    }

    public t a() {
        this.f12263a = false;
        return this;
    }
}
