package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.monetization.ads.mediation.appopenad.MediatedAppOpenAdAdapter;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class hy0 implements sx0<MediatedAppOpenAdAdapter> {

    /* renamed from: a, reason: collision with root package name */
    private final zx0<MediatedAppOpenAdAdapter> f15741a;

    public hy0(zx0<MediatedAppOpenAdAdapter> mediatedAdProvider) {
        Intrinsics.checkNotNullParameter(mediatedAdProvider, "mediatedAdProvider");
        this.f15741a = mediatedAdProvider;
    }

    @Override // com.yandex.mobile.ads.impl.sx0
    public final qx0<MediatedAppOpenAdAdapter> a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return this.f15741a.a(context, MediatedAppOpenAdAdapter.class);
    }
}
