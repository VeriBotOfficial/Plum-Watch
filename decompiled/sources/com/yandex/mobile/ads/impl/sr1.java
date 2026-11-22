package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class sr1 implements y1 {

    /* renamed from: a, reason: collision with root package name */
    private final ks1 f16889a;
    private final tr1 b;

    public sr1(j1 adActivityListener, ks1 closeVerificationController, tr1 rewardController) {
        Intrinsics.checkNotNullParameter(adActivityListener, "adActivityListener");
        Intrinsics.checkNotNullParameter(closeVerificationController, "closeVerificationController");
        Intrinsics.checkNotNullParameter(rewardController, "rewardController");
        this.f16889a = closeVerificationController;
        this.b = rewardController;
    }

    @Override // com.yandex.mobile.ads.impl.y1
    public final void b() {
        this.f16889a.a();
        this.b.a();
    }
}
