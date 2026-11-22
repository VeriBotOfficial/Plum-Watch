package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class we1 {
    public static ga2 a(od2 od2Var, ad2 videoAdPosition) {
        Intrinsics.checkNotNullParameter(videoAdPosition, "videoAdPosition");
        Intrinsics.checkNotNullParameter(videoAdPosition, "videoAdPosition");
        int ordinal = videoAdPosition.ordinal();
        oj1 oj1Var = ordinal != 0 ? ordinal != 1 ? ordinal != 2 ? ordinal != 3 ? oj1.f : oj1.f : oj1.e : oj1.d : oj1.c;
        if (od2Var != null) {
            ga2 a2 = ga2.a(od2Var.a() / 1000, oj1Var);
            Intrinsics.checkNotNull(a2);
            return a2;
        }
        ga2 a3 = ga2.a(oj1Var);
        Intrinsics.checkNotNull(a3);
        return a3;
    }
}
