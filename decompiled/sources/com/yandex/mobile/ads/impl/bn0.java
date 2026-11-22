package com.yandex.mobile.ads.impl;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* loaded from: classes5.dex */
public final class bn0 {
    static final /* synthetic */ KProperty<Object>[] c = {ta.a(bn0.class, "view", "getView()Lcom/monetization/ads/instream/view/ExtendedInstreamAdView;", 0)};

    /* renamed from: a, reason: collision with root package name */
    private final List<xb2> f15125a;
    private final go1 b;

    public bn0(t70 instreamAdView, List<xb2> friendlyOverlays) {
        Intrinsics.checkNotNullParameter(instreamAdView, "instreamAdView");
        Intrinsics.checkNotNullParameter(friendlyOverlays, "friendlyOverlays");
        this.f15125a = friendlyOverlays;
        this.b = ho1.a(instreamAdView);
    }

    public final List<xb2> a() {
        return this.f15125a;
    }

    public final t70 b() {
        return (t70) this.b.getValue(this, c[0]);
    }
}
