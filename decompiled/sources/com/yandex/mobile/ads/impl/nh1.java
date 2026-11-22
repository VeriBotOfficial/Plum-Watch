package com.yandex.mobile.ads.impl;

import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.yandex.mobile.ads.R;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class nh1<V extends ViewGroup> implements b10<V> {

    /* renamed from: a, reason: collision with root package name */
    private final rt f16343a;
    private final h41 b;
    private final k41 c;

    public nh1(rt nativeAdAssets, h41 nativeAdAdditionalViewProvider, k41 nativeAdAssetViewProvider) {
        Intrinsics.checkNotNullParameter(nativeAdAssets, "nativeAdAssets");
        Intrinsics.checkNotNullParameter(nativeAdAdditionalViewProvider, "nativeAdAdditionalViewProvider");
        Intrinsics.checkNotNullParameter(nativeAdAssetViewProvider, "nativeAdAssetViewProvider");
        this.f16343a = nativeAdAssets;
        this.b = nativeAdAdditionalViewProvider;
        this.c = nativeAdAssetViewProvider;
    }

    @Override // com.yandex.mobile.ads.impl.b10
    public final void a(V container) {
        Intrinsics.checkNotNullParameter(container, "container");
        this.b.getClass();
        Intrinsics.checkNotNullParameter(container, "container");
        ImageView imageView = (ImageView) container.findViewById(R.id.icon_placeholder);
        tt g = this.f16343a.g();
        tt e = this.f16343a.e();
        if (imageView != null && g == null && e == null) {
            this.c.getClass();
            Intrinsics.checkNotNullParameter(container, "container");
            kh2 kh2Var = new kh2((TextView) container.findViewById(R.id.title));
            imageView.setVisibility(0);
            imageView.setOnClickListener(kh2Var);
        }
    }

    @Override // com.yandex.mobile.ads.impl.b10
    public final void c() {
    }
}
