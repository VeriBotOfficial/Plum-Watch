package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class yu0 {

    /* renamed from: a, reason: collision with root package name */
    private final rt f17455a;

    public yu0(rt nativeAdAssets) {
        Intrinsics.checkNotNullParameter(nativeAdAssets, "nativeAdAssets");
        this.f17455a = nativeAdAssets;
    }

    public final Float a() {
        xt i = this.f17455a.i();
        tt h = this.f17455a.h();
        if (i != null) {
            return Float.valueOf(i.a());
        }
        if (h == null || h.d() <= 0 || h.b() <= 0) {
            return null;
        }
        return Float.valueOf(h.d() / h.b());
    }
}
