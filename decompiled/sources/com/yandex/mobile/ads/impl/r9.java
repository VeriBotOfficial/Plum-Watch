package com.yandex.mobile.ads.impl;

import java.util.Collection;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class r9 {

    /* renamed from: a, reason: collision with root package name */
    private cj1 f16743a;
    private final LinkedHashMap b = new LinkedHashMap();

    public r9(cj1 cj1Var) {
        this.f16743a = cj1Var;
    }

    public final cj1 c() {
        return this.f16743a;
    }

    public final boolean b() {
        Collection values = this.b.values();
        return values.contains(wm0.d) || values.contains(wm0.e);
    }

    public final void a() {
        this.b.clear();
    }

    public final wm0 a(go0 videoAd) {
        Intrinsics.checkNotNullParameter(videoAd, "videoAd");
        wm0 wm0Var = (wm0) this.b.get(videoAd);
        return wm0Var == null ? wm0.b : wm0Var;
    }

    public final void a(go0 videoAd, wm0 instreamAdStatus) {
        Intrinsics.checkNotNullParameter(videoAd, "videoAd");
        Intrinsics.checkNotNullParameter(instreamAdStatus, "instreamAdStatus");
        this.b.put(videoAd, instreamAdStatus);
    }

    public final void a(cj1 cj1Var) {
        this.f16743a = cj1Var;
    }
}
