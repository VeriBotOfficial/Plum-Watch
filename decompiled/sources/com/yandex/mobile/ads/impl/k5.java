package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class k5 implements r81 {

    /* renamed from: a, reason: collision with root package name */
    private final hc0 f15983a;

    public k5(hc0 forceImpressionTrackingListener) {
        Intrinsics.checkNotNullParameter(forceImpressionTrackingListener, "forceImpressionTrackingListener");
        this.f15983a = forceImpressionTrackingListener;
    }

    @Override // com.yandex.mobile.ads.impl.r81
    public final void a(pk0 eventsObservable) {
        Intrinsics.checkNotNullParameter(eventsObservable, "eventsObservable");
        eventsObservable.a(this.f15983a);
    }
}
