package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class zw1 implements mu {

    /* renamed from: a, reason: collision with root package name */
    private final am1 f17564a;
    private final yi1 b;
    private final kf2 c;

    public zw1(rl1 progressProvider, yi1 playerVolumeController, kf2 eventsController) {
        Intrinsics.checkNotNullParameter(progressProvider, "progressProvider");
        Intrinsics.checkNotNullParameter(playerVolumeController, "playerVolumeController");
        Intrinsics.checkNotNullParameter(eventsController, "eventsController");
        this.f17564a = progressProvider;
        this.b = playerVolumeController;
        this.c = eventsController;
    }

    @Override // com.yandex.mobile.ads.impl.mu
    public final void a(lf2 lf2Var) {
        this.c.a(lf2Var);
    }

    @Override // com.yandex.mobile.ads.impl.mu
    public final float getVolume() {
        Float a2 = this.b.a();
        if (a2 != null) {
            return a2.floatValue();
        }
        return 0.0f;
    }

    @Override // com.yandex.mobile.ads.impl.mu
    public final long getVideoPosition() {
        return this.f17564a.a().c();
    }

    @Override // com.yandex.mobile.ads.impl.mu
    public final long getVideoDuration() {
        return this.f17564a.a().b();
    }

    @Override // com.yandex.mobile.ads.impl.mu
    public final void prepareVideo() {
        this.c.onVideoPrepared();
    }

    @Override // com.yandex.mobile.ads.impl.mu
    public final void pauseVideo() {
        this.c.onVideoPaused();
    }

    @Override // com.yandex.mobile.ads.impl.mu
    public final void resumeVideo() {
        this.c.onVideoResumed();
    }
}
