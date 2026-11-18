package com.amap.api.col.p0003sl;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: ThreadPoolExecutorUtil.java */
/* JADX INFO: loaded from: classes7.dex */
public class s7 {
    private static volatile s7 c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private BlockingQueue<Runnable> f1874a = new LinkedBlockingQueue();
    private ExecutorService b;

    private s7() {
        this.b = null;
        int r2 = Runtime.getRuntime().availableProcessors();
        this.b = new ThreadPoolExecutor(r2, r2 * 2, 1, TimeUnit.SECONDS, this.f1874a, new ThreadPoolExecutor.AbortPolicy());
    }

    public static void a() {
        if (c != null) {
            synchronized (s7.class) {
                if (c != null) {
                    c.b.shutdownNow();
                    c.b = null;
                    c = null;
                }
            }
        }
    }

    public static s7 b() {
        if (c == null) {
            synchronized (s7.class) {
                if (c == null) {
                    c = new s7();
                }
            }
        }
        return c;
    }

    public void a(Runnable runnable) {
        ExecutorService executorService = this.b;
        if (executorService != null) {
            executorService.execute(runnable);
        }
    }
}
