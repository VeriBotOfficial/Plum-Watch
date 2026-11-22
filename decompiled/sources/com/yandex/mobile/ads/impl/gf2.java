package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class gf2 implements aj1 {

    /* renamed from: a, reason: collision with root package name */
    private final mu f15585a;
    private final gg2 b;
    private final lf2 c;

    public final void a(cf2 listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.c.a(listener);
    }

    public /* synthetic */ gf2(mu muVar) {
        this(muVar, new gg2(), new lf2());
    }

    public gf2(mu videoPlayer, gg2 statusController, lf2 videoPlayerEventsController) {
        Intrinsics.checkNotNullParameter(videoPlayer, "videoPlayer");
        Intrinsics.checkNotNullParameter(statusController, "statusController");
        Intrinsics.checkNotNullParameter(videoPlayerEventsController, "videoPlayerEventsController");
        this.f15585a = videoPlayer;
        this.b = statusController;
        this.c = videoPlayerEventsController;
    }

    public final gg2 a() {
        return this.b;
    }

    public final long b() {
        return this.f15585a.getVideoDuration();
    }

    public final long c() {
        return this.f15585a.getVideoPosition();
    }

    @Override // com.yandex.mobile.ads.impl.aj1
    public final float getVolume() {
        return this.f15585a.getVolume();
    }

    public final void e() {
        this.f15585a.prepareVideo();
    }

    public final void d() {
        this.f15585a.pauseVideo();
    }

    public final void f() {
        this.f15585a.resumeVideo();
    }

    public final void g() {
        this.f15585a.a(this.c);
    }

    public final void h() {
        this.f15585a.a(null);
        this.c.b();
    }
}
