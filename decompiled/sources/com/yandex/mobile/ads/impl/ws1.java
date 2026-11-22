package com.yandex.mobile.ads.impl;

import java.util.LinkedHashSet;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class ws1 {

    /* renamed from: a, reason: collision with root package name */
    private final LinkedHashSet f17280a = new LinkedHashSet();

    public final synchronized void a(vs1 route) {
        Intrinsics.checkNotNullParameter(route, "route");
        this.f17280a.remove(route);
    }

    public final synchronized void b(vs1 failedRoute) {
        Intrinsics.checkNotNullParameter(failedRoute, "failedRoute");
        this.f17280a.add(failedRoute);
    }

    public final synchronized boolean c(vs1 route) {
        Intrinsics.checkNotNullParameter(route, "route");
        return this.f17280a.contains(route);
    }
}
