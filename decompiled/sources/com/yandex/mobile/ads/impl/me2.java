package com.yandex.mobile.ads.impl;

import com.google.android.exoplayer2.source.ads.AdPlaybackState;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class me2 {

    /* renamed from: a, reason: collision with root package name */
    private final p5 f16232a;
    private final jf2 b;
    private final ke2 c;
    private boolean d;

    public me2(p5 adPlaybackStateController, pe2 videoDurationHolder, uj1 positionProviderHolder, jf2 videoPlayerEventsController, ke2 videoCompleteNotifyPolicy) {
        Intrinsics.checkNotNullParameter(adPlaybackStateController, "adPlaybackStateController");
        Intrinsics.checkNotNullParameter(videoDurationHolder, "videoDurationHolder");
        Intrinsics.checkNotNullParameter(positionProviderHolder, "positionProviderHolder");
        Intrinsics.checkNotNullParameter(videoPlayerEventsController, "videoPlayerEventsController");
        Intrinsics.checkNotNullParameter(videoCompleteNotifyPolicy, "videoCompleteNotifyPolicy");
        this.f16232a = adPlaybackStateController;
        this.b = videoPlayerEventsController;
        this.c = videoCompleteNotifyPolicy;
    }

    public final boolean b() {
        return this.d;
    }

    public final void c() {
        if (this.c.a()) {
            a();
        }
    }

    public final void a() {
        if (this.d) {
            return;
        }
        this.d = true;
        AdPlaybackState a2 = this.f16232a.a();
        int i = a2.adGroupCount;
        for (int i2 = 0; i2 < i; i2++) {
            AdPlaybackState.AdGroup adGroup = a2.getAdGroup(i2);
            Intrinsics.checkNotNullExpressionValue(adGroup, "getAdGroup(...)");
            if (adGroup.timeUs != Long.MIN_VALUE) {
                if (adGroup.count < 0) {
                    a2 = a2.withAdCount(i2, 1);
                    Intrinsics.checkNotNullExpressionValue(a2, "withAdCount(...)");
                }
                a2 = a2.withSkippedAdGroup(i2);
                Intrinsics.checkNotNullExpressionValue(a2, "withSkippedAdGroup(...)");
                this.f16232a.a(a2);
            }
        }
        this.b.onVideoCompleted();
    }
}
