package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.monetization.ads.mediation.rewarded.MediatedRewardedAdapter;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class az0 implements sx0<MediatedRewardedAdapter> {

    /* renamed from: a, reason: collision with root package name */
    private final zx0<MediatedRewardedAdapter> f15053a;

    public az0(zx0<MediatedRewardedAdapter> mediatedAdProvider) {
        Intrinsics.checkNotNullParameter(mediatedAdProvider, "mediatedAdProvider");
        this.f15053a = mediatedAdProvider;
    }

    @Override // com.yandex.mobile.ads.impl.sx0
    public final qx0<MediatedRewardedAdapter> a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return this.f15053a.a(context, MediatedRewardedAdapter.class);
    }
}
