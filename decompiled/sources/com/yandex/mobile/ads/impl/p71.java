package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class p71 implements va {

    /* renamed from: a, reason: collision with root package name */
    private final na1 f16529a;

    public p71(na1 nativeAdValidator) {
        Intrinsics.checkNotNullParameter(nativeAdValidator, "nativeAdValidator");
        this.f16529a = nativeAdValidator;
    }

    @Override // com.yandex.mobile.ads.impl.va
    public final boolean a() {
        return this.f16529a.c();
    }

    @Override // com.yandex.mobile.ads.impl.va
    public final boolean b() {
        return !this.f16529a.b();
    }
}
