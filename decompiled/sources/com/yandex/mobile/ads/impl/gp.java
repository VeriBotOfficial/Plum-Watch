package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class gp implements ns1 {

    /* renamed from: a, reason: collision with root package name */
    private final ps1 f15620a;
    private final ow1 b;

    public gp(hp clientSideReward, ps1 rewardedListener, ow1 reward) {
        Intrinsics.checkNotNullParameter(clientSideReward, "clientSideReward");
        Intrinsics.checkNotNullParameter(rewardedListener, "rewardedListener");
        Intrinsics.checkNotNullParameter(reward, "reward");
        this.f15620a = rewardedListener;
        this.b = reward;
    }

    @Override // com.yandex.mobile.ads.impl.ns1
    public final void a() {
        this.f15620a.a(this.b);
    }
}
