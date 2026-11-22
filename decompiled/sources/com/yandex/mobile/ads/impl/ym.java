package com.yandex.mobile.ads.impl;

import android.os.Process;
import com.yandex.mobile.ads.impl.tm;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;

/* loaded from: classes5.dex */
public final class ym extends Thread {
    private static final boolean h = ti2.f16972a;
    private final BlockingQueue<up1<?>> b;
    private final BlockingQueue<up1<?>> c;
    private final tm d;
    private final fr1 e;
    private volatile boolean f = false;
    private final hj2 g;

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        if (h) {
            sp0.e(new Object[0]);
        }
        Process.setThreadPriority(10);
        this.d.a();
        while (true) {
            try {
                a();
            } catch (InterruptedException unused) {
                if (this.f) {
                    Thread.currentThread().interrupt();
                    return;
                }
                sp0.b(new Object[0]);
            } catch (Throwable unused2) {
                sp0.b(new Object[0]);
                return;
            }
        }
    }

    public ym(PriorityBlockingQueue priorityBlockingQueue, PriorityBlockingQueue priorityBlockingQueue2, tm tmVar, fr1 fr1Var) {
        this.b = priorityBlockingQueue;
        this.c = priorityBlockingQueue2;
        this.d = tmVar;
        this.e = fr1Var;
        this.g = new hj2(this, priorityBlockingQueue2, fr1Var);
    }

    public final void b() {
        this.f = true;
        interrupt();
    }

    private void a() throws InterruptedException {
        up1<?> take = this.b.take();
        take.a("cache-queue-take");
        take.a(1);
        try {
            if (take.n()) {
                take.c("cache-discard-canceled");
            } else {
                tm.a aVar = this.d.get(take.d());
                if (aVar == null) {
                    take.a("cache-miss");
                    if (!this.g.a(take)) {
                        this.c.put(take);
                    }
                } else {
                    long currentTimeMillis = System.currentTimeMillis();
                    if (aVar.e < currentTimeMillis) {
                        take.a("cache-hit-expired");
                        take.a(aVar);
                        if (!this.g.a(take)) {
                            this.c.put(take);
                        }
                    } else {
                        take.a("cache-hit");
                        xq1<?> a2 = take.a(new xc1(200, aVar.f16982a, aVar.g, false));
                        take.a("cache-hit-parsed");
                        if (a2.c != null) {
                            take.a("cache-parsing-failed");
                            this.d.a(take.d());
                            take.a((tm.a) null);
                            if (!this.g.a(take)) {
                                this.c.put(take);
                            }
                        } else if (aVar.f < currentTimeMillis) {
                            take.a("cache-hit-refresh-needed");
                            take.a(aVar);
                            a2.d = true;
                            if (!this.g.a(take)) {
                                ((h60) this.e).a(take, a2, new xm(this, take));
                            } else {
                                ((h60) this.e).a(take, a2, null);
                            }
                        } else {
                            ((h60) this.e).a(take, a2, null);
                        }
                    }
                }
            }
        } finally {
            take.a(2);
        }
    }
}
