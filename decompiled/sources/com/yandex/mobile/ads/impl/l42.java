package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class l42 {
    public static final l42 h = new l42(new c(g92.a(g92.g + " TaskRunner", true)));
    private static final Logger i;

    /* renamed from: a, reason: collision with root package name */
    private final a f16074a;
    private int b;
    private boolean c;
    private long d;
    private final ArrayList e;
    private final ArrayList f;
    private final m42 g;

    public interface a {
        long a();

        void a(l42 l42Var);

        void a(l42 l42Var, long j);

        void execute(Runnable runnable);
    }

    public static final class b {
        public static Logger a() {
            return l42.i;
        }
    }

    static {
        Logger logger = Logger.getLogger(l42.class.getName());
        Intrinsics.checkNotNullExpressionValue(logger, "getLogger(...)");
        i = logger;
    }

    public l42(c backend) {
        Intrinsics.checkNotNullParameter(backend, "backend");
        this.f16074a = backend;
        this.b = 10000;
        this.e = new ArrayList();
        this.f = new ArrayList();
        this.g = new m42(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b(h42 h42Var) {
        if (g92.f && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        Thread currentThread = Thread.currentThread();
        String name = currentThread.getName();
        currentThread.setName(h42Var.b());
        try {
            long e = h42Var.e();
            synchronized (this) {
                a(h42Var, e);
                Unit unit = Unit.INSTANCE;
            }
            currentThread.setName(name);
        } catch (Throwable th) {
            synchronized (this) {
                a(h42Var, -1L);
                Unit unit2 = Unit.INSTANCE;
                currentThread.setName(name);
                throw th;
            }
        }
    }

    public final h42 b() {
        boolean z;
        if (g92.f && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
        }
        while (!this.f.isEmpty()) {
            long a2 = this.f16074a.a();
            Iterator it = this.f.iterator();
            long j = Long.MAX_VALUE;
            h42 h42Var = null;
            while (true) {
                if (!it.hasNext()) {
                    z = false;
                    break;
                }
                h42 h42Var2 = (h42) ((k42) it.next()).e().get(0);
                long max = Math.max(0L, h42Var2.c() - a2);
                if (max > 0) {
                    j = Math.min(max, j);
                } else {
                    if (h42Var != null) {
                        z = true;
                        break;
                    }
                    h42Var = h42Var2;
                }
            }
            if (h42Var != null) {
                a(h42Var);
                if (z || (!this.c && !this.f.isEmpty())) {
                    this.f16074a.execute(this.g);
                }
                return h42Var;
            }
            if (this.c) {
                if (j < this.d - a2) {
                    this.f16074a.a(this);
                }
                return null;
            }
            this.c = true;
            this.d = a2 + j;
            try {
                try {
                    this.f16074a.a(this, j);
                } catch (InterruptedException unused) {
                    c();
                }
            } finally {
                this.c = false;
            }
        }
        return null;
    }

    public final void a(k42 taskQueue) {
        Intrinsics.checkNotNullParameter(taskQueue, "taskQueue");
        if (g92.f && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
        }
        if (taskQueue.c() == null) {
            if (!taskQueue.e().isEmpty()) {
                g92.a(this.f, taskQueue);
            } else {
                this.f.remove(taskQueue);
            }
        }
        if (this.c) {
            this.f16074a.a(this);
        } else {
            this.f16074a.execute(this.g);
        }
    }

    public final a d() {
        return this.f16074a;
    }

    public final k42 e() {
        int i2;
        synchronized (this) {
            i2 = this.b;
            this.b = i2 + 1;
        }
        return new k42(this, "Q" + i2);
    }

    public final void c() {
        int size = this.e.size();
        while (true) {
            size--;
            if (-1 >= size) {
                break;
            } else {
                ((k42) this.e.get(size)).b();
            }
        }
        for (int size2 = this.f.size() - 1; -1 < size2; size2--) {
            k42 k42Var = (k42) this.f.get(size2);
            k42Var.b();
            if (k42Var.e().isEmpty()) {
                this.f.remove(size2);
            }
        }
    }

    public static final class c implements a {

        /* renamed from: a, reason: collision with root package name */
        private final ThreadPoolExecutor f16075a;

        public c(ThreadFactory threadFactory) {
            Intrinsics.checkNotNullParameter(threadFactory, "threadFactory");
            this.f16075a = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), threadFactory);
        }

        @Override // com.yandex.mobile.ads.impl.l42.a
        public final void a(l42 taskRunner) {
            Intrinsics.checkNotNullParameter(taskRunner, "taskRunner");
            taskRunner.notify();
        }

        @Override // com.yandex.mobile.ads.impl.l42.a
        public final void execute(Runnable runnable) {
            Intrinsics.checkNotNullParameter(runnable, "runnable");
            this.f16075a.execute(runnable);
        }

        @Override // com.yandex.mobile.ads.impl.l42.a
        public final void a(l42 taskRunner, long j) throws InterruptedException {
            Intrinsics.checkNotNullParameter(taskRunner, "taskRunner");
            long j2 = j / 1000000;
            long j3 = j - (1000000 * j2);
            if (j2 > 0 || j > 0) {
                taskRunner.wait(j2, (int) j3);
            }
        }

        @Override // com.yandex.mobile.ads.impl.l42.a
        public final long a() {
            return System.nanoTime();
        }
    }

    private final void a(h42 h42Var) {
        if (g92.f && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
        }
        h42Var.a(-1L);
        k42 d = h42Var.d();
        Intrinsics.checkNotNull(d);
        d.e().remove(h42Var);
        this.f.remove(d);
        d.a(h42Var);
        this.e.add(d);
    }

    private final void a(h42 h42Var, long j) {
        if (g92.f && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
        }
        k42 d = h42Var.d();
        Intrinsics.checkNotNull(d);
        if (d.c() == h42Var) {
            boolean d2 = d.d();
            d.i();
            d.a(null);
            this.e.remove(d);
            if (j != -1 && !d2 && !d.g()) {
                d.a(h42Var, j, true);
            }
            if (d.e().isEmpty()) {
                return;
            }
            this.f.add(d);
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }
}
