package com.yandex.mobile.ads.impl;

import com.google.android.exoplayer2.source.ads.AdPlaybackState;
import com.google.android.exoplayer2.util.Util;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class e4 {

    /* renamed from: a, reason: collision with root package name */
    private final p5 f15341a;
    private final c3 b;

    public e4(pe2 videoDurationHolder, p5 adPlaybackStateController, c3 adBreakTimingProvider) {
        Intrinsics.checkNotNullParameter(videoDurationHolder, "videoDurationHolder");
        Intrinsics.checkNotNullParameter(adPlaybackStateController, "adPlaybackStateController");
        Intrinsics.checkNotNullParameter(adBreakTimingProvider, "adBreakTimingProvider");
        this.f15341a = adPlaybackStateController;
        this.b = adBreakTimingProvider;
    }

    public final int a(ht adBreakPosition) {
        Intrinsics.checkNotNullParameter(adBreakPosition, "adBreakPosition");
        long a2 = this.b.a(adBreakPosition);
        AdPlaybackState a3 = this.f15341a.a();
        if (a2 == Long.MIN_VALUE) {
            int i = a3.adGroupCount;
            if (i <= 0 || a3.getAdGroup(i - 1).timeUs != Long.MIN_VALUE) {
                return -1;
            }
            return a3.adGroupCount - 1;
        }
        long msToUs = Util.msToUs(a2);
        int i2 = a3.adGroupCount;
        for (int i3 = 0; i3 < i2; i3++) {
            long j = a3.getAdGroup(i3).timeUs;
            if (j != Long.MIN_VALUE && Math.abs(j - msToUs) <= 1000) {
                return i3;
            }
        }
        return -1;
    }
}
