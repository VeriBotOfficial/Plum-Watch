package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class kn0 {

    /* renamed from: a, reason: collision with root package name */
    private final gt f16040a;
    private final zb2<go0> b;

    public kn0(gt adBreak, zb2<go0> videoAdInfo) {
        Intrinsics.checkNotNullParameter(adBreak, "adBreak");
        Intrinsics.checkNotNullParameter(videoAdInfo, "videoAdInfo");
        this.f16040a = adBreak;
        this.b = videoAdInfo;
    }

    public final String a() {
        return "yma_" + this.f16040a + "_position_" + this.b.d().b().a();
    }
}
