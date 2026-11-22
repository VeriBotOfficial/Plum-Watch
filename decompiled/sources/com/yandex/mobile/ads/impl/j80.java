package com.yandex.mobile.ads.impl;

import com.google.android.exoplayer2.source.ads.AdPlaybackState;
import com.google.android.exoplayer2.util.Util;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class j80 {

    /* renamed from: a, reason: collision with root package name */
    private final uj1 f15888a;
    private final pe2 b;

    public j80(uj1 positionProviderHolder, pe2 videoDurationHolder) {
        Intrinsics.checkNotNullParameter(positionProviderHolder, "positionProviderHolder");
        Intrinsics.checkNotNullParameter(videoDurationHolder, "videoDurationHolder");
        this.f15888a = positionProviderHolder;
        this.b = videoDurationHolder;
    }

    public final void a(AdPlaybackState adPlaybackState, int i) {
        Intrinsics.checkNotNullParameter(adPlaybackState, "adPlaybackState");
        long usToMs = Util.usToMs(adPlaybackState.getAdGroup(i).timeUs);
        if (usToMs == Long.MIN_VALUE) {
            usToMs = this.b.a();
        }
        this.f15888a.a(new l80(usToMs));
    }

    public final void a() {
        this.f15888a.a((l80) null);
    }
}
