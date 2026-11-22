package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class a8 {

    /* renamed from: a, reason: collision with root package name */
    private final p2 f14981a;

    public a8(p2 adBreak) {
        Intrinsics.checkNotNullParameter(adBreak, "adBreak");
        this.f14981a = adBreak;
    }

    public final t9 a() {
        return this.f14981a.b().a();
    }

    public final String c() {
        return this.f14981a.b().b();
    }

    public final String d() {
        r2 e = this.f14981a.e();
        if (e != null) {
            return e.d();
        }
        return null;
    }

    public final String b() {
        r2 e = this.f14981a.e();
        if (e != null) {
            return e.c();
        }
        return null;
    }

    public final String e() {
        r2 e = this.f14981a.e();
        if (e != null) {
            return e.e();
        }
        return null;
    }
}
