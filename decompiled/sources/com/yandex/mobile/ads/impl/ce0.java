package com.yandex.mobile.ads.impl;

import com.monetization.ads.nativeads.ExtendedNativeAdView;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class ce0 implements yd0 {

    /* renamed from: a, reason: collision with root package name */
    private final kr0<ExtendedNativeAdView> f15179a;
    private final zr b;

    public ce0(kr0<ExtendedNativeAdView> layoutDesignsController, zr contentCloseListener) {
        Intrinsics.checkNotNullParameter(layoutDesignsController, "layoutDesignsController");
        Intrinsics.checkNotNullParameter(contentCloseListener, "contentCloseListener");
        this.f15179a = layoutDesignsController;
        this.b = contentCloseListener;
    }

    @Override // com.yandex.mobile.ads.impl.yd0
    public final void c() {
        if (this.f15179a.a()) {
            return;
        }
        this.b.f();
    }

    @Override // com.yandex.mobile.ads.impl.yd0
    public final void invalidate() {
        this.f15179a.b();
    }
}
