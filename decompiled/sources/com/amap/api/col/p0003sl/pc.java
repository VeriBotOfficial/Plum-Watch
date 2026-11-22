package com.amap.api.col.p0003sl;

import com.amap.api.col.p0003sl.oc;
import java.lang.Thread;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: ThreadPool.java */
/* loaded from: classes11.dex */
public final class pc extends rc {
    private static Thread.UncaughtExceptionHandler e = new a();
    private static final int f;
    private static final int g;
    private static final int h;
    private static final int i;
    private static final int j;
    private static pc k;
    private static pc l;

    /* compiled from: ThreadPool.java */
    static class a implements Thread.UncaughtExceptionHandler {
        a() {
        }

        @Override // java.lang.Thread.UncaughtExceptionHandler
        public final void uncaughtException(Thread thread, Throwable th) {
            ja.a(th, "TPool", "ThreadPool");
        }
    }

    static {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        f = availableProcessors;
        int max = Math.max(4, Math.min(availableProcessors, 8));
        g = max;
        int min = Math.min(availableProcessors * 2, 16);
        h = min;
        int max2 = Math.max(2, Math.min(availableProcessors / 2, 4));
        i = max2;
        int min2 = Math.min(availableProcessors, 8);
        j = min2;
        k = new pc(new oc.a().a(e).a("amap-global-threadPool").a(max2).b(min2).a());
        l = new pc(new oc.a().a(e).a("amap-network-threadPool").a(max).b(min).c(9).a());
    }

    private pc(oc ocVar) {
        try {
            this.b = ocVar.f();
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(ocVar.c(), ocVar.e(), ocVar.d(), TimeUnit.SECONDS, ocVar.g(), ocVar);
            this.f1861a = threadPoolExecutor;
            threadPoolExecutor.allowCoreThreadTimeOut(true);
        } catch (Throwable th) {
            ja.a(th, "TPool", "ThreadPool");
            th.printStackTrace();
        }
    }

    public static pc a(oc ocVar) {
        return new pc(ocVar);
    }

    @Deprecated
    public static pc c() {
        return new pc(new oc.a().a(e).a());
    }

    public static pc d() {
        return k;
    }

    @Deprecated
    public static synchronized pc e() {
        pc pcVar;
        synchronized (pc.class) {
            if (k == null) {
                k = new pc(new oc.a().a(e).a());
            }
            pcVar = k;
        }
        return pcVar;
    }

    public static pc f() {
        return l;
    }
}
