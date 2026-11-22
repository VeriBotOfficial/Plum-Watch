package com.yandex.mobile.ads.impl;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class tl0 {

    /* renamed from: a, reason: collision with root package name */
    private final ft f16981a;

    public tl0(ft instreamAdBinder) {
        Intrinsics.checkNotNullParameter(instreamAdBinder, "instreamAdBinder");
        this.f16981a = instreamAdBinder;
    }

    public final void a(t70 instreamAdView, List<xb2> friendlyOverlays) {
        Intrinsics.checkNotNullParameter(instreamAdView, "instreamAdView");
        Intrinsics.checkNotNullParameter(friendlyOverlays, "friendlyOverlays");
        this.f16981a.a(instreamAdView, friendlyOverlays);
    }

    public final void b() {
        this.f16981a.d();
    }

    public final void a() {
        this.f16981a.c();
    }
}
