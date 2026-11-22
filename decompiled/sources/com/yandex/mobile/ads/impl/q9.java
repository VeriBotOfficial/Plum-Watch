package com.yandex.mobile.ads.impl;

import java.util.Collection;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class q9 {

    /* renamed from: a, reason: collision with root package name */
    private bj1 f16642a;
    private final LinkedHashMap b = new LinkedHashMap();

    public q9(bj1 bj1Var) {
        this.f16642a = bj1Var;
    }

    public final bj1 c() {
        return this.f16642a;
    }

    public final boolean b() {
        Collection values = this.b.values();
        return values.contains(vm0.d) || values.contains(vm0.e);
    }

    public final void a() {
        this.b.clear();
    }

    public final vm0 a(go0 videoAd) {
        Intrinsics.checkNotNullParameter(videoAd, "videoAd");
        vm0 vm0Var = (vm0) this.b.get(videoAd);
        return vm0Var == null ? vm0.b : vm0Var;
    }

    public final void a(go0 videoAd, vm0 instreamAdStatus) {
        Intrinsics.checkNotNullParameter(videoAd, "videoAd");
        Intrinsics.checkNotNullParameter(instreamAdStatus, "instreamAdStatus");
        this.b.put(videoAd, instreamAdStatus);
    }

    public final void a(bj1 bj1Var) {
        this.f16642a = bj1Var;
    }
}
