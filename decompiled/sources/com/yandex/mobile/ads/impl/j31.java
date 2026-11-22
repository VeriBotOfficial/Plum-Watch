package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.widget.FrameLayout;
import com.monetization.ads.nativeads.view.pager.MultiBannerControlsContainer;
import com.yandex.mobile.ads.R;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class j31 {

    /* renamed from: a, reason: collision with root package name */
    private final gt1<MultiBannerControlsContainer> f15879a = new gt1<>();

    public final MultiBannerControlsContainer a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        gt1<MultiBannerControlsContainer> gt1Var = this.f15879a;
        int i = R.layout.monetization_ads_internal_multibanner_controls;
        gt1Var.getClass();
        MultiBannerControlsContainer multiBannerControlsContainer = (MultiBannerControlsContainer) gt1.a(context, MultiBannerControlsContainer.class, i, null);
        if (multiBannerControlsContainer == null) {
            return multiBannerControlsContainer;
        }
        multiBannerControlsContainer.setLayoutParams(layoutParams);
        return multiBannerControlsContainer;
    }
}
