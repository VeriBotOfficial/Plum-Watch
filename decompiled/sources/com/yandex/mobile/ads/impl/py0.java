package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.monetization.ads.mediation.interstitial.MediatedInterstitialAdapter;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class py0 implements sx0<MediatedInterstitialAdapter> {

    /* renamed from: a, reason: collision with root package name */
    private final zx0<MediatedInterstitialAdapter> f16606a;

    public py0(zx0<MediatedInterstitialAdapter> mediatedAdProvider) {
        Intrinsics.checkNotNullParameter(mediatedAdProvider, "mediatedAdProvider");
        this.f16606a = mediatedAdProvider;
    }

    @Override // com.yandex.mobile.ads.impl.sx0
    public final qx0<MediatedInterstitialAdapter> a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return this.f16606a.a(context, MediatedInterstitialAdapter.class);
    }
}
