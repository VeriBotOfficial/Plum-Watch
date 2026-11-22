package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
final class px1 implements ox1 {
    private final ps0 b;

    public px1(ps0 localStorage) {
        Intrinsics.checkNotNullParameter(localStorage, "localStorage");
        this.b = localStorage;
    }

    @Override // com.yandex.mobile.ads.impl.ox1
    public final String a() {
        return this.b.d("ServerSideClientIP");
    }

    @Override // com.yandex.mobile.ads.impl.ox1
    public final void a(String str) {
        this.b.a("ServerSideClientIP", str);
    }
}
