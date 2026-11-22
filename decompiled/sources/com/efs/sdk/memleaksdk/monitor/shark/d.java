package com.efs.sdk.memleaksdk.monitor.shark;

import android.os.Handler;
import android.os.HandlerThread;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes14.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    private static final Handler f9901a;
    private static volatile ScheduledThreadPoolExecutor b;
    private static final ThreadFactory c;

    static {
        HandlerThread handlerThread = new HandlerThread("UMonitor Loop");
        handlerThread.start();
        f9901a = new Handler(handlerThread.getLooper());
        c = new ThreadFactory() { // from class: com.efs.sdk.memleaksdk.monitor.internal.d.1

            /* renamed from: a, reason: collision with root package name */
            private final AtomicInteger f9902a = new AtomicInteger(0);

            @Override // java.util.concurrent.ThreadFactory
            public Thread newThread(Runnable runnable) {
                return new Thread(runnable, "UMonitor #" + this.f9902a.addAndGet(1));
            }
        };
    }

    public static Handler a() {
        return f9901a;
    }

    private static ScheduledThreadPoolExecutor b() {
        if (b == null) {
            synchronized (d.class) {
                if (b == null) {
                    b = new ScheduledThreadPoolExecutor(2, c);
                    b.allowCoreThreadTimeOut(true);
                }
            }
        }
        return b;
    }

    public static void a(Runnable runnable, long j) {
        try {
            b().schedule(runnable, j, TimeUnit.MILLISECONDS);
        } catch (Throwable th) {
            g.b("UMonitor.Executor", "schedule", th);
        }
    }
}
