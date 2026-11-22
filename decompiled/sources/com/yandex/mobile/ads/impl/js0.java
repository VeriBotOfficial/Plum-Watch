package com.yandex.mobile.ads.impl;

import com.google.android.exoplayer2.source.ads.AdPlaybackState;
import com.google.android.exoplayer2.util.Util;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class js0 {

    /* renamed from: a, reason: collision with root package name */
    private final uj1 f15942a;
    private final pe2 b;

    public js0(uj1 positionProviderHolder, pe2 videoDurationHolder) {
        Intrinsics.checkNotNullParameter(positionProviderHolder, "positionProviderHolder");
        Intrinsics.checkNotNullParameter(videoDurationHolder, "videoDurationHolder");
        this.f15942a = positionProviderHolder;
        this.b = videoDurationHolder;
    }

    public final int a(AdPlaybackState adPlaybackState) {
        Intrinsics.checkNotNullParameter(adPlaybackState, "adPlaybackState");
        pi1 b = this.f15942a.b();
        if (b == null) {
            return -1;
        }
        long msToUs = Util.msToUs(this.b.a());
        long msToUs2 = Util.msToUs(b.a());
        int adGroupIndexForPositionUs = adPlaybackState.getAdGroupIndexForPositionUs(msToUs2, msToUs);
        return adGroupIndexForPositionUs == -1 ? adPlaybackState.getAdGroupIndexAfterPositionUs(msToUs2, msToUs) : adGroupIndexForPositionUs;
    }
}
