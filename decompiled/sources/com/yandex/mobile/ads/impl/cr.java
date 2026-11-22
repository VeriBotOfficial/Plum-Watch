package com.yandex.mobile.ads.impl;

import android.widget.ImageView;
import com.monetization.ads.nativeads.ExtendedNativeAdView;
import com.yandex.mobile.ads.R;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class cr implements b10<ExtendedNativeAdView> {

    /* renamed from: a, reason: collision with root package name */
    private final rt f15218a;
    private final int b;

    public cr(rt nativeAdAssets, int i) {
        Intrinsics.checkNotNullParameter(nativeAdAssets, "nativeAdAssets");
        this.f15218a = nativeAdAssets;
        this.b = i;
    }

    @Override // com.yandex.mobile.ads.impl.b10
    public final void c() {
    }

    @Override // com.yandex.mobile.ads.impl.b10
    public final void a(ExtendedNativeAdView extendedNativeAdView) {
        ExtendedNativeAdView adView = extendedNativeAdView;
        Intrinsics.checkNotNullParameter(adView, "adView");
        dr drVar = new dr(this.f15218a, this.b, new h41());
        ImageView a2 = drVar.a(adView);
        ImageView b = drVar.b(adView);
        if (a2 != null) {
            a2.setId(R.id.favicon);
        }
        if (b != null) {
            b.setId(R.id.icon);
        }
    }
}
