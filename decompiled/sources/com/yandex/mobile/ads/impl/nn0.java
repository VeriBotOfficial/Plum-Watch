package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class nn0 implements ff1 {

    /* renamed from: a, reason: collision with root package name */
    private final vn0 f16358a;
    private final go0 b;

    public nn0(vn0 instreamInteractionTracker, go0 videoAd, a00 customAdClickHandler) {
        Intrinsics.checkNotNullParameter(instreamInteractionTracker, "instreamInteractionTracker");
        Intrinsics.checkNotNullParameter(videoAd, "videoAd");
        Intrinsics.checkNotNullParameter(customAdClickHandler, "customAdClickHandler");
        this.f16358a = instreamInteractionTracker;
        this.b = videoAd;
    }

    @Override // com.yandex.mobile.ads.impl.ff1
    public final void a(String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        new mn0(this.f16358a);
        throw null;
    }
}
