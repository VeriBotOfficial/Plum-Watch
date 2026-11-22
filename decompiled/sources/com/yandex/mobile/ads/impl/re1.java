package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class re1 {

    /* renamed from: a, reason: collision with root package name */
    private final ps0 f16758a;

    public re1(ps0 localStorage) {
        Intrinsics.checkNotNullParameter(localStorage, "localStorage");
        this.f16758a = localStorage;
    }

    public final String a() {
        return this.f16758a.d("YmadOmSdkJs");
    }

    public final String b() {
        return this.f16758a.d("YmadOmSdkJsUrl");
    }

    public final void a(String str) {
        this.f16758a.a("YmadOmSdkJs", str);
    }

    public final void b(String str) {
        this.f16758a.a("YmadOmSdkJsUrl", str);
    }
}
