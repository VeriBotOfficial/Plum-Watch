package com.yandex.mobile.ads.impl;

import android.view.View;
import android.view.ViewGroup;
import com.yandex.mobile.ads.R;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class yc<V extends ViewGroup> implements b10<V> {

    /* renamed from: a, reason: collision with root package name */
    private final rt f17411a;
    private final n51 b;

    public yc(rt nativeAdAssets, n51 nativeAdDividerViewProvider) {
        Intrinsics.checkNotNullParameter(nativeAdAssets, "nativeAdAssets");
        Intrinsics.checkNotNullParameter(nativeAdDividerViewProvider, "nativeAdDividerViewProvider");
        this.f17411a = nativeAdAssets;
        this.b = nativeAdDividerViewProvider;
    }

    @Override // com.yandex.mobile.ads.impl.b10
    public final void a(V container) {
        Intrinsics.checkNotNullParameter(container, "container");
        this.b.getClass();
        Intrinsics.checkNotNullParameter(container, "container");
        View findViewById = container.findViewById(R.id.age_divider);
        if (findViewById == null || this.f17411a.a() != null) {
            return;
        }
        findViewById.setVisibility(8);
    }

    @Override // com.yandex.mobile.ads.impl.b10
    public final void c() {
    }
}
