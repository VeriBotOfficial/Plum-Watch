package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class tx1 implements sx1 {
    private final ps0 b;

    public tx1(ps0 localStorage) {
        Intrinsics.checkNotNullParameter(localStorage, "localStorage");
        this.b = localStorage;
    }

    @Override // com.yandex.mobile.ads.impl.sx1
    public final String a() {
        return this.b.d("SessionData");
    }

    @Override // com.yandex.mobile.ads.impl.sx1
    public final void a(String str) {
        this.b.a("SessionData", str);
    }
}
