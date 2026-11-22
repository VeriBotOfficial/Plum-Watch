package com.yandex.mobile.ads.impl;

import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class y62 {

    /* renamed from: a, reason: collision with root package name */
    private final v9 f17398a;

    public y62(v9 adTracker) {
        Intrinsics.checkNotNullParameter(adTracker, "adTracker");
        this.f17398a = adTracker;
    }

    public final void a(List<String> trackingUrls) {
        Intrinsics.checkNotNullParameter(trackingUrls, "trackingUrls");
        Iterator<T> it = trackingUrls.iterator();
        while (it.hasNext()) {
            this.f17398a.a((String) it.next(), z62.d);
        }
    }
}
