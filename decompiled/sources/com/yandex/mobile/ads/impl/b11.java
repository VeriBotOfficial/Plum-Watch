package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class b11 {

    /* renamed from: a, reason: collision with root package name */
    private final c11 f15059a;

    public b11(c11 mobileAdsExecutorProvider) {
        Intrinsics.checkNotNullParameter(mobileAdsExecutorProvider, "mobileAdsExecutorProvider");
        this.f15059a = mobileAdsExecutorProvider;
    }

    public final void a(Runnable runnable) {
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        this.f15059a.a().execute(runnable);
    }

    public final void b(Runnable runnable) {
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        this.f15059a.b().execute(runnable);
    }
}
