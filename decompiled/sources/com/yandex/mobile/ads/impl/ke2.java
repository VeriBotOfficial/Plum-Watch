package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class ke2 {

    /* renamed from: a, reason: collision with root package name */
    private final pe2 f16012a;
    private final uj1 b;

    public ke2(uj1 positionProviderHolder, pe2 videoDurationHolder) {
        Intrinsics.checkNotNullParameter(videoDurationHolder, "videoDurationHolder");
        Intrinsics.checkNotNullParameter(positionProviderHolder, "positionProviderHolder");
        this.f16012a = videoDurationHolder;
        this.b = positionProviderHolder;
    }

    public final boolean a() {
        long a2 = this.f16012a.a();
        if (a2 == -9223372036854775807L) {
            return false;
        }
        pi1 b = this.b.b();
        return (b != null ? b.a() : -1L) + 1000 >= a2;
    }
}
