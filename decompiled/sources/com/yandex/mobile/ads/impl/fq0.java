package com.yandex.mobile.ads.impl;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class fq0 {
    private static final Object c = new Object();
    private static fq0 d;
    public static final /* synthetic */ int e = 0;

    /* renamed from: a, reason: collision with root package name */
    private final xk1<wd0, nt> f15519a;
    private final xd0 b;

    public static final class a {
        public static fq0 a() {
            if (fq0.d == null) {
                synchronized (fq0.c) {
                    if (fq0.d == null) {
                        fq0.d = new fq0(new xk1(), new xd0());
                    }
                    Unit unit = Unit.INSTANCE;
                }
            }
            fq0 fq0Var = fq0.d;
            if (fq0Var != null) {
                return fq0Var;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    public fq0(xk1<wd0, nt> preloadingCache, xd0 cacheParamsMapper) {
        Intrinsics.checkNotNullParameter(preloadingCache, "preloadingCache");
        Intrinsics.checkNotNullParameter(cacheParamsMapper, "cacheParamsMapper");
        this.f15519a = preloadingCache;
        this.b = cacheParamsMapper;
    }

    public final synchronized void a(v7 adRequestData, nt item) {
        Intrinsics.checkNotNullParameter(adRequestData, "adRequestData");
        Intrinsics.checkNotNullParameter(item, "item");
        xk1<wd0, nt> xk1Var = this.f15519a;
        this.b.getClass();
        xk1Var.a(xd0.a(adRequestData), item);
    }

    public final synchronized nt a(v7 adRequestData) {
        xk1<wd0, nt> xk1Var;
        Intrinsics.checkNotNullParameter(adRequestData, "adRequestData");
        xk1Var = this.f15519a;
        this.b.getClass();
        return (nt) xk1Var.a(xd0.a(adRequestData));
    }

    public final synchronized boolean c() {
        return this.f15519a.b();
    }
}
