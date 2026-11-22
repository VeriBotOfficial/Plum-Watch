package com.yandex.mobile.ads.impl;

import com.monetization.ads.nativeads.ExtendedNativeAdView;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class ae0 implements b10<ExtendedNativeAdView> {

    /* renamed from: a, reason: collision with root package name */
    private b10<ExtendedNativeAdView> f14999a;

    public ae0(q61 nativeAdPrivate, zr contentCloseListener, st nativeAdEventListener, uo clickConnector, sp1 reporter, b10<ExtendedNativeAdView> divKitAdBinder) {
        Intrinsics.checkNotNullParameter(nativeAdPrivate, "nativeAdPrivate");
        Intrinsics.checkNotNullParameter(contentCloseListener, "contentCloseListener");
        Intrinsics.checkNotNullParameter(nativeAdEventListener, "nativeAdEventListener");
        Intrinsics.checkNotNullParameter(clickConnector, "clickConnector");
        Intrinsics.checkNotNullParameter(reporter, "reporter");
        Intrinsics.checkNotNullParameter(divKitAdBinder, "divKitAdBinder");
        this.f14999a = divKitAdBinder;
    }

    @Override // com.yandex.mobile.ads.impl.b10
    public final void a(ExtendedNativeAdView extendedNativeAdView) {
        ExtendedNativeAdView fullscreenNativeAdView = extendedNativeAdView;
        Intrinsics.checkNotNullParameter(fullscreenNativeAdView, "fullscreenNativeAdView");
        this.f14999a.a(fullscreenNativeAdView);
    }

    @Override // com.yandex.mobile.ads.impl.b10
    public final void c() {
        this.f14999a.c();
    }
}
