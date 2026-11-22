package com.hihonor.push.sdk;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes11.dex */
public final class w0 {
    public static final w0 d = new w0();

    /* renamed from: a, reason: collision with root package name */
    public volatile Executor f10165a;
    public volatile ExecutorService b;
    public final Object c = new Object();

    public static Executor a() {
        w0 w0Var = d;
        if (w0Var.f10165a == null) {
            synchronized (w0Var.c) {
                if (w0Var.f10165a == null) {
                    w0Var.f10165a = new k0(new Handler(Looper.getMainLooper()));
                }
            }
        }
        return w0Var.f10165a;
    }

    public static Executor b() {
        w0 w0Var = d;
        if (w0Var.b == null) {
            synchronized (w0Var.c) {
                if (w0Var.b == null) {
                    w0Var.b = w0Var.c();
                }
            }
        }
        return w0Var.b;
    }

    public static ExecutorService d() {
        return d.c();
    }

    public final ExecutorService c() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 10, 1L, TimeUnit.SECONDS, new LinkedBlockingQueue());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }
}
