package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class d92 implements c92 {

    /* renamed from: a, reason: collision with root package name */
    private final b92 f15261a;

    public d92(b92 userAgentCreator) {
        Intrinsics.checkNotNullParameter(userAgentCreator, "userAgentCreator");
        this.f15261a = userAgentCreator;
    }

    @Override // com.yandex.mobile.ads.impl.c92
    public final String a() {
        return this.f15261a.a();
    }
}
