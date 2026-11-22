package com.yandex.mobile.ads.impl;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class cp {

    /* renamed from: a, reason: collision with root package name */
    private final ig<?> f15214a;
    private final j3 b;
    private final g71 c;
    private final wo1 d;
    private final hc0 e;

    public cp(ig<?> asset, j3 adClickable, g71 nativeAdViewAdapter, wo1 renderedTimer, hc0 forceImpressionTrackingListener) {
        Intrinsics.checkNotNullParameter(asset, "asset");
        Intrinsics.checkNotNullParameter(adClickable, "adClickable");
        Intrinsics.checkNotNullParameter(nativeAdViewAdapter, "nativeAdViewAdapter");
        Intrinsics.checkNotNullParameter(renderedTimer, "renderedTimer");
        Intrinsics.checkNotNullParameter(forceImpressionTrackingListener, "forceImpressionTrackingListener");
        this.f15214a = asset;
        this.b = adClickable;
        this.c = nativeAdViewAdapter;
        this.d = renderedTimer;
        this.e = forceImpressionTrackingListener;
    }

    public final View.OnClickListener a(vr0 link) {
        Intrinsics.checkNotNullParameter(link, "link");
        return this.c.f().a(this.f15214a, link, this.b, this.c, this.d, this.e);
    }
}
