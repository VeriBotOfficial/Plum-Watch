package com.yandex.mobile.ads.impl;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class cn0 {

    /* renamed from: a, reason: collision with root package name */
    private bn0 f15208a;

    public final bn0 a() {
        return this.f15208a;
    }

    public final void a(t70 instreamAdView, List<xb2> friendlyOverlays) {
        Intrinsics.checkNotNullParameter(instreamAdView, "instreamAdView");
        Intrinsics.checkNotNullParameter(friendlyOverlays, "friendlyOverlays");
        this.f15208a = new bn0(instreamAdView, friendlyOverlays);
    }

    public final void b() {
        this.f15208a = null;
    }
}
