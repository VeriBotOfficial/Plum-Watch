package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class xe2 {

    /* renamed from: a, reason: collision with root package name */
    private final yf2 f17331a;
    private final boolean b;
    private final boolean c;
    private final Double d;

    public xe2(yf2 yf2Var, boolean z, boolean z2, Double d) {
        this.f17331a = yf2Var;
        this.b = z;
        this.c = z2;
        this.d = d;
    }

    public final yf2 c() {
        return this.f17331a;
    }

    public final boolean d() {
        return this.b;
    }

    public final boolean b() {
        return this.c;
    }

    public final Double a() {
        return this.d;
    }

    public final boolean e() {
        return Intrinsics.areEqual(this.d, 0.0d) || this.d == null;
    }
}
