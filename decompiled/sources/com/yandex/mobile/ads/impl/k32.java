package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class k32 implements st {

    /* renamed from: a, reason: collision with root package name */
    private final st f15980a;

    public k32(st nativeAdEventListener) {
        Intrinsics.checkNotNullParameter(nativeAdEventListener, "nativeAdEventListener");
        this.f15980a = nativeAdEventListener;
    }

    @Override // com.yandex.mobile.ads.impl.st
    public final void a(t4 t4Var) {
    }

    @Override // com.yandex.mobile.ads.impl.st
    public final void closeNativeAd() {
        this.f15980a.closeNativeAd();
    }

    @Override // com.yandex.mobile.ads.impl.st
    public final void onAdClicked() {
        this.f15980a.onAdClicked();
    }

    @Override // com.yandex.mobile.ads.impl.st
    public final void onLeftApplication() {
        this.f15980a.onLeftApplication();
    }

    @Override // com.yandex.mobile.ads.impl.st
    public final void onReturnedToApplication() {
        this.f15980a.onReturnedToApplication();
    }
}
