package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class pa2 {

    /* renamed from: a, reason: collision with root package name */
    private final jn1 f16540a;
    private final hq b;
    private final kx1 c;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ pa2() {
        /*
            r4 = this;
            com.yandex.mobile.ads.impl.jn1 r0 = new com.yandex.mobile.ads.impl.jn1
            r0.<init>()
            com.yandex.mobile.ads.impl.bq1 r1 = new com.yandex.mobile.ads.impl.bq1
            r1.<init>()
            com.yandex.mobile.ads.impl.hq r2 = new com.yandex.mobile.ads.impl.hq
            r2.<init>(r1)
            com.yandex.mobile.ads.impl.kx1 r3 = new com.yandex.mobile.ads.impl.kx1
            r3.<init>()
            r4.<init>(r0, r1, r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.pa2.<init>():void");
    }

    public pa2(jn1 randomGenerator, bq1 requestHelper, hq cmpRequestConfigurator, kx1 sensitiveModeChecker) {
        Intrinsics.checkNotNullParameter(randomGenerator, "randomGenerator");
        Intrinsics.checkNotNullParameter(requestHelper, "requestHelper");
        Intrinsics.checkNotNullParameter(cmpRequestConfigurator, "cmpRequestConfigurator");
        Intrinsics.checkNotNullParameter(sensitiveModeChecker, "sensitiveModeChecker");
        this.f16540a = randomGenerator;
        this.b = cmpRequestConfigurator;
        this.c = sensitiveModeChecker;
    }
}
