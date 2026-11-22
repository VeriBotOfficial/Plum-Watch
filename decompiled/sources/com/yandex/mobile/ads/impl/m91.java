package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class m91 {

    /* renamed from: a, reason: collision with root package name */
    private final rt f16219a;
    private final gr1 b;

    public m91(rt adAssets, gr1 responseNativeType) {
        Intrinsics.checkNotNullParameter(adAssets, "adAssets");
        Intrinsics.checkNotNullParameter(responseNativeType, "responseNativeType");
        this.f16219a = adAssets;
        this.b = responseNativeType;
    }

    private final boolean b() {
        if (this.f16219a.c() != null) {
            return gr1.c == this.b || !d();
        }
        return false;
    }

    public final boolean f() {
        return this.f16219a.c() != null || d();
    }

    public final boolean h() {
        if (this.f16219a.c() != null) {
            return b() || c();
        }
        return false;
    }

    public final boolean c() {
        if (this.f16219a.h() != null) {
            return Intrinsics.areEqual("large", this.f16219a.h().c()) || Intrinsics.areEqual("wide", this.f16219a.h().c());
        }
        return false;
    }

    private final boolean d() {
        return (this.f16219a.k() == null && this.f16219a.l() == null) ? false : true;
    }

    public final boolean g() {
        return b();
    }

    public final boolean j() {
        if (b()) {
            return true;
        }
        return c() && !d();
    }

    public final boolean a() {
        return (this.f16219a.n() == null && this.f16219a.b() == null && this.f16219a.d() == null && this.f16219a.g() == null && this.f16219a.e() == null) ? false : true;
    }

    public final boolean e() {
        return (this.f16219a.a() == null && this.f16219a.m() == null && !a()) ? false : true;
    }

    public final boolean i() {
        return this.f16219a.o() != null;
    }
}
