package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;

/* loaded from: classes5.dex */
public final class ev0 implements c10 {

    /* renamed from: a, reason: collision with root package name */
    private final int f15423a;
    private final yu0 b;

    public ev0(rt nativeAdAssets, int i, yu0 mediaAspectRatioProvider) {
        Intrinsics.checkNotNullParameter(nativeAdAssets, "nativeAdAssets");
        Intrinsics.checkNotNullParameter(mediaAspectRatioProvider, "mediaAspectRatioProvider");
        this.f15423a = i;
        this.b = mediaAspectRatioProvider;
    }

    @Override // com.yandex.mobile.ads.impl.c10
    public final boolean a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        int i = wh2.b;
        int i2 = eb0.a(context, "context").heightPixels;
        int i3 = eb0.a(context, "context").widthPixels;
        Float a2 = this.b.a();
        return i3 - (a2 != null ? MathKt.roundToInt(a2.floatValue() * ((float) i2)) : 0) >= this.f15423a;
    }
}
