package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class vj implements xj {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f17167a;
    private final boolean b;

    public vj(o8 adResponse, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(adResponse, "adResponse");
        this.f17167a = z;
        this.b = z2;
    }

    @Override // com.yandex.mobile.ads.impl.xj
    public final boolean b() {
        return this.f17167a;
    }

    @Override // com.yandex.mobile.ads.impl.xj
    public final boolean a() {
        return this.b;
    }
}
