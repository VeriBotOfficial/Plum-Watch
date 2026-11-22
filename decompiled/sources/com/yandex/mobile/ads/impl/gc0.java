package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;

/* loaded from: classes5.dex */
public final class gc0 implements hc0 {
    static final /* synthetic */ KProperty<Object>[] b = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(gc0.class, "forceImpressionTrackingListenerReference", "getForceImpressionTrackingListenerReference()Lcom/monetization/ads/base/impression/ForceImpressionTrackingListener;", 0))};

    /* renamed from: a, reason: collision with root package name */
    private final go1 f15574a = ho1.a();

    @Override // com.yandex.mobile.ads.impl.hc0
    public final void a() {
        hc0 hc0Var = (hc0) this.f15574a.getValue(this, b[0]);
        if (hc0Var != null) {
            hc0Var.a();
        }
    }

    public final void a(hc0 trackingListener) {
        Intrinsics.checkNotNullParameter(trackingListener, "trackingListener");
        this.f15574a.setValue(this, b[0], trackingListener);
    }
}
