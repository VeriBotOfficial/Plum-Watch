package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class zi0 {

    /* renamed from: a, reason: collision with root package name */
    private final p50 f17526a;

    public zi0(p50 environmentController) {
        Intrinsics.checkNotNullParameter(environmentController, "environmentController");
        this.f17526a = environmentController;
    }

    public final xi0 a() {
        bj0 d = this.f17526a.d();
        return new xi0(d.b(), d.a(), d.c());
    }
}
