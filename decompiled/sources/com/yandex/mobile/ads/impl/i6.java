package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class i6 implements kp {

    /* renamed from: a, reason: collision with root package name */
    private final g6 f15782a;
    private final int b;

    public i6(g6 adPod, int i) {
        Intrinsics.checkNotNullParameter(adPod, "adPod");
        this.f15782a = adPod;
        this.b = i;
    }

    @Override // com.yandex.mobile.ads.impl.kp
    public final boolean a() {
        return this.f15782a.a() <= this.b;
    }
}
