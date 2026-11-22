package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class p81 {
    public static long a(o8 adResponse) {
        Intrinsics.checkNotNullParameter(adResponse, "adResponse");
        ts n = adResponse.n();
        Long u = adResponse.u();
        if (u == null) {
            u = n == ts.f ? 5000L : 0L;
        }
        return u.longValue();
    }
}
