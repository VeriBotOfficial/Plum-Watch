package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.monetization.ads.mediation.nativeads.MediatedNativeAdapter;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class sy0 implements sx0<MediatedNativeAdapter> {

    /* renamed from: a, reason: collision with root package name */
    private final zx0<MediatedNativeAdapter> f16906a;

    public sy0(zx0<MediatedNativeAdapter> mediatedAdProvider) {
        Intrinsics.checkNotNullParameter(mediatedAdProvider, "mediatedAdProvider");
        this.f16906a = mediatedAdProvider;
    }

    @Override // com.yandex.mobile.ads.impl.sx0
    public final qx0<MediatedNativeAdapter> a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return this.f16906a.a(context, MediatedNativeAdapter.class);
    }
}
