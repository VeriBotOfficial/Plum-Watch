package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class hw0 {

    /* renamed from: a, reason: collision with root package name */
    private final fw0 f15734a;
    private final xl b;

    public final ew0 a(uu creative) {
        Intrinsics.checkNotNullParameter(creative, "creative");
        double d = -1.0d;
        ew0 ew0Var = null;
        for (ew0 ew0Var2 : creative.h()) {
            double d2 = Intrinsics.areEqual("video/mp4", ew0Var2.e()) ? 1.5d : 1.0d;
            int a2 = this.b.a(ew0Var2);
            int a3 = this.f15734a.a();
            double abs = d2 / ((((int) Math.max(0.0d, a2)) < 100 ? 10.0d : ((int) Math.abs(a3 - r4)) / a3) + 1.0d);
            if (abs > d) {
                ew0Var = ew0Var2;
                d = abs;
            }
        }
        return ew0Var;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ hw0(android.content.Context r3) {
        /*
            r2 = this;
            com.yandex.mobile.ads.impl.io1 r0 = new com.yandex.mobile.ads.impl.io1
            r0.<init>(r3)
            com.yandex.mobile.ads.impl.fw0 r0 = r0.a()
            com.yandex.mobile.ads.impl.xl r1 = new com.yandex.mobile.ads.impl.xl
            r1.<init>(r0)
            r2.<init>(r3, r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.hw0.<init>(android.content.Context):void");
    }

    public hw0(Context context, fw0 referenceMediaFileInfo, xl bitrateProvider) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(referenceMediaFileInfo, "referenceMediaFileInfo");
        Intrinsics.checkNotNullParameter(bitrateProvider, "bitrateProvider");
        this.f15734a = referenceMediaFileInfo;
        this.b = bitrateProvider;
    }
}
