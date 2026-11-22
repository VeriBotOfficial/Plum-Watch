package com.yandex.mobile.ads.impl;

import androidx.media3.common.AdPlaybackState;
import androidx.media3.common.util.Util;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class i80 {

    /* renamed from: a, reason: collision with root package name */
    private final tj1 f15789a;
    private final oe2 b;

    public i80(tj1 positionProviderHolder, oe2 videoDurationHolder) {
        Intrinsics.checkNotNullParameter(positionProviderHolder, "positionProviderHolder");
        Intrinsics.checkNotNullParameter(videoDurationHolder, "videoDurationHolder");
        this.f15789a = positionProviderHolder;
        this.b = videoDurationHolder;
    }

    public final void a(AdPlaybackState adPlaybackState, int i) {
        Intrinsics.checkNotNullParameter(adPlaybackState, "adPlaybackState");
        long usToMs = Util.usToMs(adPlaybackState.getAdGroup(i).timeUs);
        if (usToMs == Long.MIN_VALUE) {
            usToMs = this.b.a();
        }
        this.f15789a.a(new k80(usToMs));
    }

    public final void a() {
        this.f15789a.a((k80) null);
    }
}
