package com.anythink.core.common.n.c;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* loaded from: classes12.dex */
public class x {
    public static final x c = new x() { // from class: com.anythink.core.common.n.c.x.1
        @Override // com.anythink.core.common.n.c.x
        public final x a(long j) {
            return this;
        }

        @Override // com.anythink.core.common.n.c.x
        public final x a(long j, TimeUnit timeUnit) {
            return this;
        }

        @Override // com.anythink.core.common.n.c.x
        public final void g() {
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private boolean f4242a;
    private long b;
    private long d;

    private static long a(long j, long j2) {
        return (j != 0 && (j2 == 0 || j < j2)) ? j : j2;
    }

    public x a(long j, TimeUnit timeUnit) {
        if (j < 0) {
            throw new IllegalArgumentException("timeout < 0: ".concat(String.valueOf(j)));
        }
        if (timeUnit == null) {
            throw new IllegalArgumentException("unit == null");
        }
        this.d = timeUnit.toNanos(j);
        return this;
    }

    public long i_() {
        return this.d;
    }

    public boolean f_() {
        return this.f4242a;
    }

    public long g_() {
        if (!this.f4242a) {
            throw new IllegalStateException("No deadline");
        }
        return this.b;
    }

    public x a(long j) {
        this.f4242a = true;
        this.b = j;
        return this;
    }

    private x b(long j, TimeUnit timeUnit) {
        if (j <= 0) {
            throw new IllegalArgumentException("duration <= 0: ".concat(String.valueOf(j)));
        }
        if (timeUnit == null) {
            throw new IllegalArgumentException("unit == null");
        }
        return a(System.nanoTime() + timeUnit.toNanos(j));
    }

    public x h_() {
        this.d = 0L;
        return this;
    }

    public x f() {
        this.f4242a = false;
        return this;
    }

    public void g() {
        if (Thread.interrupted()) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException("interrupted");
        }
        if (this.f4242a && this.b - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    private void a(Object obj) {
        try {
            boolean f_ = f_();
            long i_ = i_();
            long j = 0;
            if (!f_ && i_ == 0) {
                obj.wait();
                return;
            }
            long nanoTime = System.nanoTime();
            if (f_ && i_ != 0) {
                i_ = Math.min(i_, g_() - nanoTime);
            } else if (f_) {
                i_ = g_() - nanoTime;
            }
            if (i_ > 0) {
                long j2 = i_ / 1000000;
                obj.wait(j2, (int) (i_ - (1000000 * j2)));
                j = System.nanoTime() - nanoTime;
            }
            if (j >= i_) {
                throw new InterruptedIOException("timeout");
            }
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException("interrupted");
        }
    }
}
