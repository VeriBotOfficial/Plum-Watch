package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class wi2 implements vi2 {

    /* renamed from: a, reason: collision with root package name */
    private final ui2 f17256a;
    private final zc1 b;

    public wi2(ui2 volleyMapper, zc1 networkResponseDecoder) {
        Intrinsics.checkNotNullParameter(volleyMapper, "volleyMapper");
        Intrinsics.checkNotNullParameter(networkResponseDecoder, "networkResponseDecoder");
        this.f17256a = volleyMapper;
        this.b = networkResponseDecoder;
    }

    @Override // com.yandex.mobile.ads.impl.vi2
    public final String a(xc1 networkResponse) {
        Intrinsics.checkNotNullParameter(networkResponse, "networkResponse");
        this.f17256a.getClass();
        return this.b.a(ui2.a(networkResponse));
    }
}
