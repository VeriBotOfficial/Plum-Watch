package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class nu0 {
    private static final Object c = new Object();

    /* renamed from: a, reason: collision with root package name */
    private final ou0 f16377a;
    private final mu0 b;

    public nu0(ps0 localStorage) {
        Intrinsics.checkNotNullParameter(localStorage, "localStorage");
        this.f16377a = new ou0(localStorage);
        this.b = new mu0();
    }

    public final String a() {
        String a2;
        synchronized (c) {
            a2 = this.f16377a.a();
            if (a2 == null) {
                this.b.getClass();
                a2 = mu0.a();
                this.f16377a.a(a2);
            }
        }
        return a2;
    }
}
