package com.yandex.mobile.ads.impl;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class rs1 {
    private static final Object c = new Object();
    private static rs1 d;
    public static final /* synthetic */ int e = 0;

    /* renamed from: a, reason: collision with root package name */
    private final xk1<wd0, gu> f16795a;
    private final xd0 b;

    public static final class a {
        public static rs1 a() {
            if (rs1.d == null) {
                synchronized (rs1.c) {
                    if (rs1.d == null) {
                        rs1.d = new rs1(new xk1(), new xd0());
                    }
                    Unit unit = Unit.INSTANCE;
                }
            }
            rs1 rs1Var = rs1.d;
            if (rs1Var != null) {
                return rs1Var;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    public rs1(xk1<wd0, gu> preloadingCache, xd0 cacheParamsMapper) {
        Intrinsics.checkNotNullParameter(preloadingCache, "preloadingCache");
        Intrinsics.checkNotNullParameter(cacheParamsMapper, "cacheParamsMapper");
        this.f16795a = preloadingCache;
        this.b = cacheParamsMapper;
    }

    public final synchronized void a(v7 adRequestData, gu item) {
        Intrinsics.checkNotNullParameter(adRequestData, "adRequestData");
        Intrinsics.checkNotNullParameter(item, "item");
        xk1<wd0, gu> xk1Var = this.f16795a;
        this.b.getClass();
        xk1Var.a(xd0.a(adRequestData), item);
    }

    public final synchronized gu a(v7 adRequestData) {
        xk1<wd0, gu> xk1Var;
        Intrinsics.checkNotNullParameter(adRequestData, "adRequestData");
        xk1Var = this.f16795a;
        this.b.getClass();
        return (gu) xk1Var.a(xd0.a(adRequestData));
    }

    public final synchronized boolean c() {
        return this.f16795a.b();
    }
}
