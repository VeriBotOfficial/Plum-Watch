package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.jj0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class d91 implements jj0.a {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f15260a;

    public d91(o8<?> adResponse) {
        Intrinsics.checkNotNullParameter(adResponse, "adResponse");
        this.f15260a = Intrinsics.areEqual(adResponse.E(), c91.c.a()) || Intrinsics.areEqual(adResponse.E(), c91.d.a());
    }

    @Override // com.yandex.mobile.ads.impl.jj0.a
    public final boolean a() {
        return this.f15260a;
    }
}
