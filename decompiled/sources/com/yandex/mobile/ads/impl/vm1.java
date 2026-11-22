package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class vm1 implements k3 {

    /* renamed from: a, reason: collision with root package name */
    private final y1 f17177a;

    public vm1(y1 adBlockCompleteListener) {
        Intrinsics.checkNotNullParameter(adBlockCompleteListener, "adBlockCompleteListener");
        this.f17177a = adBlockCompleteListener;
    }

    @Override // com.yandex.mobile.ads.impl.k3
    public final void a() {
    }

    @Override // com.yandex.mobile.ads.impl.k3
    public final void b() {
        this.f17177a.b();
    }
}
