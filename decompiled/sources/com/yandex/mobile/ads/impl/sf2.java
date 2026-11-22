package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class sf2 implements am1 {

    /* renamed from: a, reason: collision with root package name */
    private final q9 f16859a;
    private final tj1 b;
    private final oe2 c;
    private final ui1 d;

    public sf2(q9 adStateHolder, si1 playerStateController, tj1 positionProviderHolder, oe2 videoDurationHolder, ui1 playerStateHolder) {
        Intrinsics.checkNotNullParameter(adStateHolder, "adStateHolder");
        Intrinsics.checkNotNullParameter(playerStateController, "playerStateController");
        Intrinsics.checkNotNullParameter(positionProviderHolder, "positionProviderHolder");
        Intrinsics.checkNotNullParameter(videoDurationHolder, "videoDurationHolder");
        Intrinsics.checkNotNullParameter(playerStateHolder, "playerStateHolder");
        this.f16859a = adStateHolder;
        this.b = positionProviderHolder;
        this.c = videoDurationHolder;
        this.d = playerStateHolder;
    }

    @Override // com.yandex.mobile.ads.impl.am1
    public final di1 a() {
        long a2;
        rj1 a3 = this.b.a();
        oi1 b = this.b.b();
        if (a3 != null) {
            a2 = a3.a();
        } else {
            a2 = (b == null || this.f16859a.b() || this.d.c()) ? -1L : b.a();
        }
        return new di1(a2, this.c.a() != -9223372036854775807L ? this.c.a() : -1L);
    }
}
