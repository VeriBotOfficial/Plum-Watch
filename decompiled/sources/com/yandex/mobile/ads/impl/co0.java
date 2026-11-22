package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class co0 implements wc2<go0> {

    /* renamed from: a, reason: collision with root package name */
    private final go0 f15211a;
    private final jm0 b;
    private a c;

    public co0(go0 instreamVideoAd, jm0 instreamAdPlayerController) {
        Intrinsics.checkNotNullParameter(instreamVideoAd, "instreamVideoAd");
        Intrinsics.checkNotNullParameter(instreamAdPlayerController, "instreamAdPlayerController");
        this.f15211a = instreamVideoAd;
        this.b = instreamAdPlayerController;
    }

    @Override // com.yandex.mobile.ads.impl.wc2
    public final void a(zb2<go0> videoAdInfo) {
        Intrinsics.checkNotNullParameter(videoAdInfo, "videoAdInfo");
        this.b.g(videoAdInfo.d());
    }

    @Override // com.yandex.mobile.ads.impl.wc2
    public final long b() {
        return this.b.a(this.f15211a);
    }

    @Override // com.yandex.mobile.ads.impl.wc2
    public final long getAdPosition() {
        return this.b.b(this.f15211a);
    }

    @Override // com.yandex.mobile.ads.impl.wc2
    public final float getVolume() {
        return this.b.c(this.f15211a);
    }

    @Override // com.yandex.mobile.ads.impl.wc2
    public final boolean isPlayingAd() {
        return this.b.d(this.f15211a);
    }

    @Override // com.yandex.mobile.ads.impl.wc2
    public final void a(oc2 oc2Var) {
        a aVar = this.c;
        if (aVar != null) {
            this.b.b(this.f15211a, aVar);
            this.c = null;
        }
        if (oc2Var != null) {
            a aVar2 = new a(oc2Var);
            this.b.a(this.f15211a, aVar2);
            this.c = aVar2;
        }
    }

    @Override // com.yandex.mobile.ads.impl.wc2
    public final void c() {
        this.b.f(this.f15211a);
    }

    public final void e() {
        this.b.j(this.f15211a);
    }

    @Override // com.yandex.mobile.ads.impl.wc2
    public final void pauseAd() {
        this.b.e(this.f15211a);
    }

    @Override // com.yandex.mobile.ads.impl.wc2
    public final void resumeAd() {
        this.b.i(this.f15211a);
    }

    public final void d() {
        this.b.h(this.f15211a);
    }

    public final void a(float f) {
        this.b.a(this.f15211a, f);
    }

    private static final class a implements lt {

        /* renamed from: a, reason: collision with root package name */
        private final yc2 f15212a;

        public a(oc2 listener) {
            Intrinsics.checkNotNullParameter(listener, "listener");
            this.f15212a = listener;
        }

        @Override // com.yandex.mobile.ads.impl.lt
        public final void a(go0 videoAd) {
            Intrinsics.checkNotNullParameter(videoAd, "videoAd");
            this.f15212a.a(videoAd.g());
        }

        @Override // com.yandex.mobile.ads.impl.lt
        public final void b(go0 videoAd) {
            Intrinsics.checkNotNullParameter(videoAd, "videoAd");
            this.f15212a.d(videoAd.g());
        }

        @Override // com.yandex.mobile.ads.impl.lt
        public final void c(go0 videoAd) {
            Intrinsics.checkNotNullParameter(videoAd, "videoAd");
            this.f15212a.b(videoAd.g());
        }

        @Override // com.yandex.mobile.ads.impl.lt
        public final void d(go0 videoAd) {
            Intrinsics.checkNotNullParameter(videoAd, "videoAd");
            this.f15212a.h(videoAd.g());
        }

        @Override // com.yandex.mobile.ads.impl.lt
        public final void e(go0 videoAd) {
            Intrinsics.checkNotNullParameter(videoAd, "videoAd");
            this.f15212a.g(videoAd.g());
        }

        @Override // com.yandex.mobile.ads.impl.lt
        public final void f(go0 videoAd) {
            Intrinsics.checkNotNullParameter(videoAd, "videoAd");
            this.f15212a.e(videoAd.g());
        }

        @Override // com.yandex.mobile.ads.impl.lt
        public final void g(go0 videoAd) {
            Intrinsics.checkNotNullParameter(videoAd, "videoAd");
            this.f15212a.a((rc2) videoAd.g());
        }

        @Override // com.yandex.mobile.ads.impl.lt
        public final void h(go0 videoAd) {
            Intrinsics.checkNotNullParameter(videoAd, "videoAd");
            this.f15212a.c(videoAd.g());
        }

        @Override // com.yandex.mobile.ads.impl.lt
        public final void i(go0 videoAd) {
            Intrinsics.checkNotNullParameter(videoAd, "videoAd");
            this.f15212a.f(videoAd.g());
        }

        @Override // com.yandex.mobile.ads.impl.lt
        public final void a(go0 videoAd, xc2 error) {
            Intrinsics.checkNotNullParameter(videoAd, "videoAd");
            Intrinsics.checkNotNullParameter(error, "error");
            this.f15212a.a(videoAd.g(), error);
        }

        @Override // com.yandex.mobile.ads.impl.lt
        public final void a(go0 videoAd, float f) {
            Intrinsics.checkNotNullParameter(videoAd, "videoAd");
            this.f15212a.a(videoAd.g(), f);
        }
    }

    @Override // com.yandex.mobile.ads.impl.wc2
    public final void a() {
        this.b.k(this.f15211a);
    }
}
