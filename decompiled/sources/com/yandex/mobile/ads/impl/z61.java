package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class z61 implements aj2<y61> {

    /* renamed from: a, reason: collision with root package name */
    private final hq1<y61> f17488a;

    public z61(hq1<y61> requestPolicy) {
        Intrinsics.checkNotNullParameter(requestPolicy, "requestPolicy");
        this.f17488a = requestPolicy;
    }

    @Override // com.yandex.mobile.ads.impl.aj2
    public final y61 a(xc1 networkResponse) {
        Intrinsics.checkNotNullParameter(networkResponse, "networkResponse");
        return this.f17488a.a(networkResponse);
    }
}
