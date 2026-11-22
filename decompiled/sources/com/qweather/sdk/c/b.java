package com.qweather.sdk.c;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* compiled from: Platform.java */
/* loaded from: classes17.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private static final b f13521a = c();
    private final ExecutorService b = Executors.newCachedThreadPool();

    public static b a() {
        return f13521a;
    }

    private b() {
    }

    private static b c() {
        return new b();
    }

    public Executor b() {
        return this.b;
    }

    public void a(Runnable runnable) {
        b().execute(runnable);
    }
}
