package com.huawei.hmf.tasks.a;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes16.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final a f10192a = new a();
    private static final int c;
    private static final int d;
    private static final int e;
    private final Executor b = new ExecutorC0698a(0);

    /* JADX INFO: renamed from: com.huawei.hmf.tasks.a.a$a, reason: collision with other inner class name */
    static class ExecutorC0698a implements Executor {
        private ExecutorC0698a() {
        }

        /* synthetic */ ExecutorC0698a(byte b) {
            this();
        }

        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            new Handler(Looper.getMainLooper()).post(runnable);
        }
    }

    static {
        int r0 = Runtime.getRuntime().availableProcessors();
        c = r0;
        d = r0 + 1;
        e = (r0 * 2) + 1;
    }

    public static ExecutorService a() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(d, e, 1L, TimeUnit.SECONDS, new LinkedBlockingQueue());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }

    public static Executor b() {
        return f10192a.b;
    }
}
