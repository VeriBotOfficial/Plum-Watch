package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class je2 {

    /* renamed from: a, reason: collision with root package name */
    private final oe2 f15906a;
    private final tj1 b;

    public je2(tj1 positionProviderHolder, oe2 videoDurationHolder) {
        Intrinsics.checkNotNullParameter(videoDurationHolder, "videoDurationHolder");
        Intrinsics.checkNotNullParameter(positionProviderHolder, "positionProviderHolder");
        this.f15906a = videoDurationHolder;
        this.b = positionProviderHolder;
    }

    public final boolean a() {
        long a2 = this.f15906a.a();
        if (a2 == -9223372036854775807L) {
            return false;
        }
        oi1 b = this.b.b();
        return (b != null ? b.a() : -1L) + 1000 >= a2;
    }
}
