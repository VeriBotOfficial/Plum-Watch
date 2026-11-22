package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class u7 {

    /* renamed from: a, reason: collision with root package name */
    private final va f17024a;
    private final sa b;

    public u7(va adVisibilityValidator, sa adViewRenderingValidator) {
        Intrinsics.checkNotNullParameter(adVisibilityValidator, "adVisibilityValidator");
        Intrinsics.checkNotNullParameter(adViewRenderingValidator, "adViewRenderingValidator");
        this.f17024a = adVisibilityValidator;
        this.b = adViewRenderingValidator;
    }

    public final boolean a() {
        return this.f17024a.a() && this.b.a();
    }
}
