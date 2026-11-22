package com.yandex.mobile.ads.impl;

import com.monetization.ads.nativeads.ExtendedNativeAdView;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class mj {

    /* renamed from: a, reason: collision with root package name */
    private final lj<ExtendedNativeAdView> f16250a;

    public mj(lj<ExtendedNativeAdView> layoutDesignsController) {
        Intrinsics.checkNotNullParameter(layoutDesignsController, "layoutDesignsController");
        this.f16250a = layoutDesignsController;
    }

    public final void a() {
        this.f16250a.a();
    }

    public final void a(gz1 gz1Var, dj attachEventListener) {
        Intrinsics.checkNotNullParameter(attachEventListener, "attachEventListener");
        if (this.f16250a.a(gz1Var)) {
            attachEventListener.a();
        } else {
            attachEventListener.a(w7.i());
        }
    }
}
