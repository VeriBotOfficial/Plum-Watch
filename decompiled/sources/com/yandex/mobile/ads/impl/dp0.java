package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class dp0 implements hq1<rx> {

    /* renamed from: a, reason: collision with root package name */
    private final aj2<rx> f15302a;

    public dp0(aj2<rx> responseParser) {
        Intrinsics.checkNotNullParameter(responseParser, "responseParser");
        this.f15302a = responseParser;
    }

    @Override // com.yandex.mobile.ads.impl.hq1
    public final boolean a() {
        return true;
    }

    @Override // com.yandex.mobile.ads.impl.hq1
    public final rx a(xc1 networkResponse) {
        Intrinsics.checkNotNullParameter(networkResponse, "networkResponse");
        return this.f15302a.a(networkResponse);
    }
}
