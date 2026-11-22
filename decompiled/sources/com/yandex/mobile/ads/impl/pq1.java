package com.yandex.mobile.ads.impl;

import com.monetization.ads.nativeads.ExtendedNativeAdView;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class pq1 implements b10<ExtendedNativeAdView> {

    /* renamed from: a, reason: collision with root package name */
    private final j1 f16596a;
    private final int b;

    public pq1(j1 adActivityListener, int i) {
        Intrinsics.checkNotNullParameter(adActivityListener, "adActivityListener");
        this.f16596a = adActivityListener;
        this.b = i;
    }

    @Override // com.yandex.mobile.ads.impl.b10
    public final void c() {
    }

    @Override // com.yandex.mobile.ads.impl.b10
    public final void a(ExtendedNativeAdView extendedNativeAdView) {
        ExtendedNativeAdView container = extendedNativeAdView;
        Intrinsics.checkNotNullParameter(container, "container");
        if (this.b == 1) {
            this.f16596a.a(7);
        } else {
            this.f16596a.a(6);
        }
    }
}
