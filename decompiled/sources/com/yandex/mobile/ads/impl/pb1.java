package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class pb1 implements uf2 {

    /* renamed from: a, reason: collision with root package name */
    private final tg2 f16543a;

    public pb1(cc1 videoViewProvider) {
        Intrinsics.checkNotNullParameter(videoViewProvider, "videoViewProvider");
        this.f16543a = new tg2(videoViewProvider);
    }

    @Override // com.yandex.mobile.ads.impl.uf2
    public final boolean a() {
        return this.f16543a.a();
    }
}
