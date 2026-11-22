package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.rh1;
import com.yandex.mobile.ads.impl.zn1;
import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class co1 {

    /* renamed from: a, reason: collision with root package name */
    private final int f15213a;
    private final long b;
    private final k42 c;
    private final bo1 d;
    private final ConcurrentLinkedQueue<ao1> e;

    public co1(l42 taskRunner, TimeUnit timeUnit) {
        Intrinsics.checkNotNullParameter(taskRunner, "taskRunner");
        Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
        this.f15213a = 5;
        this.b = timeUnit.toNanos(5L);
        this.c = taskRunner.e();
        this.d = new bo1(this, g92.g + " ConnectionPool");
        this.e = new ConcurrentLinkedQueue<>();
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0026, code lost:
    
        if (r1.h() != false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a(com.yandex.mobile.ads.impl.ab r4, com.yandex.mobile.ads.impl.zn1 r5, java.util.List<com.yandex.mobile.ads.impl.vs1> r6, boolean r7) {
        /*
            r3 = this;
            java.lang.String r0 = "address"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "call"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.util.concurrent.ConcurrentLinkedQueue<com.yandex.mobile.ads.impl.ao1> r0 = r3.e
            java.util.Iterator r0 = r0.iterator()
        L10:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L3b
            java.lang.Object r1 = r0.next()
            com.yandex.mobile.ads.impl.ao1 r1 = (com.yandex.mobile.ads.impl.ao1) r1
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
            monitor-enter(r1)
            if (r7 == 0) goto L28
            boolean r2 = r1.h()     // Catch: java.lang.Throwable -> L38
            if (r2 == 0) goto L34
        L28:
            boolean r2 = r1.a(r4, r6)     // Catch: java.lang.Throwable -> L38
            if (r2 == 0) goto L34
            r5.a(r1)     // Catch: java.lang.Throwable -> L38
            monitor-exit(r1)
            r4 = 1
            return r4
        L34:
            kotlin.Unit r2 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L38
            monitor-exit(r1)
            goto L10
        L38:
            r4 = move-exception
            monitor-exit(r1)
            throw r4
        L3b:
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.co1.a(com.yandex.mobile.ads.impl.ab, com.yandex.mobile.ads.impl.zn1, java.util.List, boolean):boolean");
    }

    public final void b(ao1 connection) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        if (g92.f && !Thread.holdsLock(connection)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + connection);
        }
        this.e.add(connection);
        this.c.a(this.d, 0L);
    }

    public final long a(long j) {
        Iterator<ao1> it = this.e.iterator();
        int i = 0;
        long j2 = Long.MIN_VALUE;
        ao1 ao1Var = null;
        int i2 = 0;
        while (it.hasNext()) {
            ao1 next = it.next();
            Intrinsics.checkNotNull(next);
            synchronized (next) {
                if (a(next, j) > 0) {
                    i2++;
                } else {
                    i++;
                    long c = j - next.c();
                    if (c > j2) {
                        ao1Var = next;
                        j2 = c;
                    }
                    Unit unit = Unit.INSTANCE;
                }
            }
        }
        long j3 = this.b;
        if (j2 < j3 && i <= this.f15213a) {
            if (i > 0) {
                return j3 - j2;
            }
            if (i2 > 0) {
                return j3;
            }
            return -1L;
        }
        Intrinsics.checkNotNull(ao1Var);
        synchronized (ao1Var) {
            if (!ao1Var.b().isEmpty()) {
                return 0L;
            }
            if (ao1Var.c() + j2 != j) {
                return 0L;
            }
            ao1Var.l();
            this.e.remove(ao1Var);
            g92.a(ao1Var.m());
            if (this.e.isEmpty()) {
                this.c.a();
            }
            return 0L;
        }
    }

    public final boolean a(ao1 connection) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        if (g92.f && !Thread.holdsLock(connection)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + connection);
        }
        if (connection.d() || this.f15213a == 0) {
            connection.l();
            this.e.remove(connection);
            if (!this.e.isEmpty()) {
                return true;
            }
            this.c.a();
            return true;
        }
        this.c.a(this.d, 0L);
        return false;
    }

    private final int a(ao1 ao1Var, long j) {
        if (g92.f && !Thread.holdsLock(ao1Var)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + ao1Var);
        }
        ArrayList b = ao1Var.b();
        int i = 0;
        while (i < b.size()) {
            Reference reference = (Reference) b.get(i);
            if (reference.get() != null) {
                i++;
            } else {
                Intrinsics.checkNotNull(reference, "null cannot be cast to non-null type com.monetization.ads.embedded.okhttp.src.main.kotlin.okhttp3.internal.connection.RealCall.CallReference");
                String str = "A connection to " + ao1Var.k().a().k() + " was leaked. Did you forget to close a response body?";
                int i2 = rh1.c;
                rh1.a.a().a(((zn1.b) reference).a(), str);
                b.remove(i);
                ao1Var.l();
                if (b.isEmpty()) {
                    ao1Var.a(j - this.b);
                    return 0;
                }
            }
        }
        return b.size();
    }
}
