package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class ng0 implements q4 {

    /* renamed from: a, reason: collision with root package name */
    private final o8<String> f16338a;

    public ng0(o8<String> adResponse) {
        Intrinsics.checkNotNullParameter(adResponse, "adResponse");
        this.f16338a = adResponse;
    }

    @Override // com.yandex.mobile.ads.impl.q4
    public final String a() {
        return this.f16338a.d();
    }
}
