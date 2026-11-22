package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.rewarded.Reward;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class an2 implements Reward {

    /* renamed from: a, reason: collision with root package name */
    private final vr1 f15022a;

    public an2(vr1 rewardData) {
        Intrinsics.checkNotNullParameter(rewardData, "rewardData");
        this.f15022a = rewardData;
    }

    @Override // com.yandex.mobile.ads.rewarded.Reward
    public final int getAmount() {
        return this.f15022a.getAmount();
    }

    @Override // com.yandex.mobile.ads.rewarded.Reward
    public final String getType() {
        return this.f15022a.getType();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof an2) && Intrinsics.areEqual(((an2) obj).f15022a, this.f15022a);
    }

    public final int hashCode() {
        return this.f15022a.hashCode();
    }
}
