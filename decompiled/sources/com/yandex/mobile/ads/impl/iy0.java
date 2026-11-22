package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.monetization.ads.mediation.banner.MediatedBannerAdapter;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class iy0 implements sx0<MediatedBannerAdapter> {

    /* renamed from: a, reason: collision with root package name */
    private final zx0<MediatedBannerAdapter> f15865a;

    public iy0(zx0<MediatedBannerAdapter> mediatedAdProvider) {
        Intrinsics.checkNotNullParameter(mediatedAdProvider, "mediatedAdProvider");
        this.f15865a = mediatedAdProvider;
    }

    @Override // com.yandex.mobile.ads.impl.sx0
    public final qx0<MediatedBannerAdapter> a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return this.f15865a.a(context, MediatedBannerAdapter.class);
    }
}
