package com.yandex.mobile.ads.impl;

import android.view.ViewGroup;
import com.monetization.ads.fullscreen.template.view.ExtendedViewContainer;
import com.yandex.mobile.ads.R;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class xv0<V extends ViewGroup> implements b10<V> {

    /* renamed from: a, reason: collision with root package name */
    private final rt f17372a;
    private final a51 b;

    public xv0(rt nativeAdAssets, a51 nativeAdContainerViewProvider) {
        Intrinsics.checkNotNullParameter(nativeAdAssets, "nativeAdAssets");
        Intrinsics.checkNotNullParameter(nativeAdContainerViewProvider, "nativeAdContainerViewProvider");
        this.f17372a = nativeAdAssets;
        this.b = nativeAdContainerViewProvider;
    }

    @Override // com.yandex.mobile.ads.impl.b10
    public final void a(V container) {
        Intrinsics.checkNotNullParameter(container, "container");
        this.b.getClass();
        Intrinsics.checkNotNullParameter(container, "container");
        ExtendedViewContainer extendedViewContainer = (ExtendedViewContainer) container.findViewById(R.id.media_container);
        if (extendedViewContainer != null && this.f17372a.h() == null && this.f17372a.i() == null) {
            extendedViewContainer.setVisibility(8);
        }
    }

    @Override // com.yandex.mobile.ads.impl.b10
    public final void c() {
    }
}
