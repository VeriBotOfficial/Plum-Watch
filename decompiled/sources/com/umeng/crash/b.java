package com.umeng.crash;

import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: UCrash */
/* loaded from: classes2.dex */
class b {

    /* renamed from: a, reason: collision with root package name */
    private static volatile ScheduledThreadPoolExecutor f13992a;
    private static final ThreadFactory b = new ThreadFactory() { // from class: com.umeng.crash.b.1

        /* renamed from: a, reason: collision with root package name */
        private final AtomicInteger f13993a = new AtomicInteger(0);

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            return new Thread(runnable, "UCrash #" + this.f13993a.addAndGet(1));
        }
    };

    b() {
    }

    private static ScheduledThreadPoolExecutor a() {
        if (f13992a == null) {
            synchronized (b.class) {
                if (f13992a == null) {
                    ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(2, b);
                    f13992a = scheduledThreadPoolExecutor;
                    scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
                }
            }
        }
        return f13992a;
    }

    public static void a(Runnable runnable) {
        try {
            a().execute(runnable);
        } catch (Throwable th) {
            UCrash.a().a("UCrash.Executor", "execute", th);
        }
    }

    public static void b(Runnable runnable) {
        try {
            a().schedule(runnable, 3L, TimeUnit.SECONDS);
        } catch (Throwable th) {
            UCrash.a().a("UCrash.Executor", "schedule", th);
        }
    }
}
