package com.yandex.mobile.ads.impl;

import androidx.media3.common.AdPlaybackState;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class le2 {

    /* renamed from: a, reason: collision with root package name */
    private final o5 f16108a;
    private final kf2 b;
    private final je2 c;
    private boolean d;

    public le2(o5 adPlaybackStateController, oe2 videoDurationHolder, tj1 positionProviderHolder, kf2 videoPlayerEventsController, je2 videoCompleteNotifyPolicy) {
        Intrinsics.checkNotNullParameter(adPlaybackStateController, "adPlaybackStateController");
        Intrinsics.checkNotNullParameter(videoDurationHolder, "videoDurationHolder");
        Intrinsics.checkNotNullParameter(positionProviderHolder, "positionProviderHolder");
        Intrinsics.checkNotNullParameter(videoPlayerEventsController, "videoPlayerEventsController");
        Intrinsics.checkNotNullParameter(videoCompleteNotifyPolicy, "videoCompleteNotifyPolicy");
        this.f16108a = adPlaybackStateController;
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
        AdPlaybackState a2 = this.f16108a.a();
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
                this.f16108a.a(a2);
            }
        }
        this.b.onVideoCompleted();
    }
}
