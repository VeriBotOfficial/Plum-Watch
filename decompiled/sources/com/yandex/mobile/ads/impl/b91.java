package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class b91 {

    /* renamed from: a, reason: collision with root package name */
    private final rt f15084a;
    private final gr1 b;

    public b91(rt adAssets, gr1 responseNativeType) {
        Intrinsics.checkNotNullParameter(adAssets, "adAssets");
        Intrinsics.checkNotNullParameter(responseNativeType, "responseNativeType");
        this.f15084a = adAssets;
        this.b = responseNativeType;
    }

    public static boolean a(tt image) {
        Intrinsics.checkNotNullParameter(image, "image");
        return Intrinsics.areEqual("large", image.c()) || Intrinsics.areEqual("wide", image.c());
    }

    public final boolean a() {
        return (b() || this.f15084a.e() == null || !(d() || this.f15084a.h() == null || a(this.f15084a.h()))) ? false : true;
    }

    public final boolean b() {
        if (this.f15084a.g() != null) {
            return gr1.d == this.b || !e();
        }
        return false;
    }

    public final boolean e() {
        return (d() || this.f15084a.h() == null || a(this.f15084a.h()) || gr1.d == this.b) ? false : true;
    }

    public final boolean c() {
        return (d() || this.f15084a.h() == null || !a(this.f15084a.h())) ? false : true;
    }

    public final boolean d() {
        return this.f15084a.i() != null;
    }
}
