package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class b3 {

    /* renamed from: a, reason: collision with root package name */
    private final oe2 f15067a;

    public b3(oe2 videoDurationHolder) {
        Intrinsics.checkNotNullParameter(videoDurationHolder, "videoDurationHolder");
        this.f15067a = videoDurationHolder;
    }

    public final long a(ht adBreakPosition) {
        Intrinsics.checkNotNullParameter(adBreakPosition, "adBreakPosition");
        long b = adBreakPosition.b();
        int ordinal = adBreakPosition.a().ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                return -1L;
            }
            return b;
        }
        if (b == 100) {
            return Long.MIN_VALUE;
        }
        if (b == 0) {
            return 0L;
        }
        if (this.f15067a.a() == -9223372036854775807L) {
            return -1L;
        }
        return (long) ((b / 100) * this.f15067a.a());
    }
}
