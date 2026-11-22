package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class s51 {

    /* renamed from: a, reason: collision with root package name */
    private final y4 f16831a;
    private final q51 b;
    private final ec1 c;
    private final jx0 d;
    private final p62 e;

    public s51(y4 adInfoReportDataProviderFactory, q51 eventControllerFactory, ec1 nativeViewRendererFactory, jx0 mediaViewAdapterFactory, p62 trackingManagerFactory) {
        Intrinsics.checkNotNullParameter(adInfoReportDataProviderFactory, "adInfoReportDataProviderFactory");
        Intrinsics.checkNotNullParameter(eventControllerFactory, "eventControllerFactory");
        Intrinsics.checkNotNullParameter(nativeViewRendererFactory, "nativeViewRendererFactory");
        Intrinsics.checkNotNullParameter(mediaViewAdapterFactory, "mediaViewAdapterFactory");
        Intrinsics.checkNotNullParameter(trackingManagerFactory, "trackingManagerFactory");
        this.f16831a = adInfoReportDataProviderFactory;
        this.b = eventControllerFactory;
        this.c = nativeViewRendererFactory;
        this.d = mediaViewAdapterFactory;
        this.e = trackingManagerFactory;
    }

    public final y4 a() {
        return this.f16831a;
    }

    public final q51 b() {
        return this.b;
    }

    public final ec1 d() {
        return this.c;
    }

    public final jx0 c() {
        return this.d;
    }

    public final p62 e() {
        return this.e;
    }
}
