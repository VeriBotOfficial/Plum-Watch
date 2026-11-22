package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class tf2 implements bm1 {

    /* renamed from: a, reason: collision with root package name */
    private final r9 f16963a;
    private final uj1 b;
    private final pe2 c;
    private final vi1 d;

    public tf2(r9 adStateHolder, ti1 playerStateController, uj1 positionProviderHolder, pe2 videoDurationHolder, vi1 playerStateHolder) {
        Intrinsics.checkNotNullParameter(adStateHolder, "adStateHolder");
        Intrinsics.checkNotNullParameter(playerStateController, "playerStateController");
        Intrinsics.checkNotNullParameter(positionProviderHolder, "positionProviderHolder");
        Intrinsics.checkNotNullParameter(videoDurationHolder, "videoDurationHolder");
        Intrinsics.checkNotNullParameter(playerStateHolder, "playerStateHolder");
        this.f16963a = adStateHolder;
        this.b = positionProviderHolder;
        this.c = videoDurationHolder;
        this.d = playerStateHolder;
    }

    @Override // com.yandex.mobile.ads.impl.bm1
    public final ci1 a() {
        long a2;
        sj1 a3 = this.b.a();
        pi1 b = this.b.b();
        if (a3 != null) {
            a2 = a3.a();
        } else {
            a2 = (b == null || this.f16963a.b() || this.d.c()) ? -1L : b.a();
        }
        return new ci1(a2, this.c.a() != -9223372036854775807L ? this.c.a() : -1L);
    }
}
