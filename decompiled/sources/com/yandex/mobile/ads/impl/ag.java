package com.yandex.mobile.ads.impl;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class ag {
    private static final Object c = new Object();
    private static ag d;
    public static final /* synthetic */ int e = 0;

    /* renamed from: a, reason: collision with root package name */
    private final xk1<wd0, us> f15005a;
    private final xd0 b;

    public static final class a {
        public static ag a() {
            if (ag.d == null) {
                synchronized (ag.c) {
                    if (ag.d == null) {
                        ag.d = new ag(new xk1(), new xd0());
                    }
                    Unit unit = Unit.INSTANCE;
                }
            }
            ag agVar = ag.d;
            if (agVar != null) {
                return agVar;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    public ag(xk1<wd0, us> preloadingCache, xd0 cacheParamsMapper) {
        Intrinsics.checkNotNullParameter(preloadingCache, "preloadingCache");
        Intrinsics.checkNotNullParameter(cacheParamsMapper, "cacheParamsMapper");
        this.f15005a = preloadingCache;
        this.b = cacheParamsMapper;
    }

    public final synchronized void a(v7 adRequestData, us item) {
        Intrinsics.checkNotNullParameter(adRequestData, "adRequestData");
        Intrinsics.checkNotNullParameter(item, "item");
        xk1<wd0, us> xk1Var = this.f15005a;
        this.b.getClass();
        xk1Var.a(xd0.a(adRequestData), item);
    }

    public final synchronized us a(v7 adRequestData) {
        xk1<wd0, us> xk1Var;
        Intrinsics.checkNotNullParameter(adRequestData, "adRequestData");
        xk1Var = this.f15005a;
        this.b.getClass();
        return (us) xk1Var.a(xd0.a(adRequestData));
    }

    public final synchronized boolean c() {
        return this.f15005a.b();
    }
}
