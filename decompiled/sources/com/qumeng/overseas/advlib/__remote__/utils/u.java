package com.qumeng.overseas.advlib.__remote__.utils;

import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;

/* loaded from: classes17.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    private static final int f13250a = 2;
    private static final int b = 2;
    private static final ThreadPoolExecutor c = oqm.a.a(2, 2, "CpcThreadPool");

    private static class b {

        /* renamed from: a, reason: collision with root package name */
        private static final u f13251a = new u();

        private b() {
        }
    }

    public static u a() {
        return b.f13251a;
    }

    public void b() {
        c.shutdownNow();
    }

    private u() {
    }

    public void a(Runnable runnable) {
        c.execute(runnable);
    }

    public <T> Future<T> a(Callable<T> callable) {
        return c.submit(callable);
    }
}
