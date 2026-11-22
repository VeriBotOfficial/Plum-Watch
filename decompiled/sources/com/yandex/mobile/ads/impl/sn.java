package com.yandex.mobile.ads.impl;

import android.view.ViewGroup;
import android.widget.TextView;
import com.monetization.ads.fullscreen.template.view.CallToActionView;
import com.yandex.mobile.ads.R;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class sn<V extends ViewGroup> implements b10<V> {

    /* renamed from: a, reason: collision with root package name */
    private final q61 f16875a;
    private final k41 b;

    public sn(q61 nativeAd, k41 nativeAdAssetViewProvider) {
        Intrinsics.checkNotNullParameter(nativeAd, "nativeAd");
        Intrinsics.checkNotNullParameter(nativeAdAssetViewProvider, "nativeAdAssetViewProvider");
        this.f16875a = nativeAd;
        this.b = nativeAdAssetViewProvider;
    }

    @Override // com.yandex.mobile.ads.impl.b10
    public final void a(V container) {
        Intrinsics.checkNotNullParameter(container, "container");
        this.b.getClass();
        Intrinsics.checkNotNullParameter(container, "container");
        TextView textView = (TextView) container.findViewById(R.id.call_to_action);
        gr1 adType = this.f16875a.getAdType();
        if (!(textView instanceof CallToActionView) || adType == gr1.d) {
            return;
        }
        ((CallToActionView) textView).a();
    }

    @Override // com.yandex.mobile.ads.impl.b10
    public final void c() {
    }
}
