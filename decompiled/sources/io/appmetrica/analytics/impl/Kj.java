package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import io.appmetrica.analytics.coreutils.internal.time.TimeProvider;
import java.util.concurrent.TimeUnit;

/* loaded from: classes6.dex */
public final class Kj {

    /* renamed from: a, reason: collision with root package name */
    public volatile long f17941a;
    public Oe b;
    public TimeProvider c;

    public static Kj c() {
        return Jj.f17923a;
    }

    public final synchronized long a() {
        return (System.currentTimeMillis() / 1000) + this.f17941a;
    }

    public final synchronized void b() {
        this.b.d(false);
        this.b.b();
    }

    public final synchronized long d() {
        return this.f17941a;
    }

    public final synchronized void e() {
        a(C3593ua.E.x(), new SystemTimeProvider());
    }

    public final synchronized boolean f() {
        return this.b.b(true);
    }

    public final synchronized void a(long j, Long l) {
        this.f17941a = (j - this.c.currentTimeMillis()) / 1000;
        boolean z = true;
        if (this.b.b(true)) {
            if (l != null) {
                long abs = Math.abs(j - this.c.currentTimeMillis());
                Oe oe = this.b;
                if (abs <= TimeUnit.SECONDS.toMillis(l.longValue())) {
                    z = false;
                }
                oe.d(z);
            } else {
                this.b.d(false);
            }
        }
        this.b.d(this.f17941a);
        this.b.b();
    }

    public final void a(Oe oe, TimeProvider timeProvider) {
        this.b = oe;
        this.f17941a = oe.a(0);
        this.c = timeProvider;
    }
}
