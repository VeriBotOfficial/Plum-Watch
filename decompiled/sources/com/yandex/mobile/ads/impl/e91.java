package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class e91 implements yc0 {

    /* renamed from: a, reason: collision with root package name */
    private final yl1 f15359a;
    private final mg1 b;
    private final xl1 c;
    private final z1 d;
    private final mz e;

    public e91(yl1 progressListener, f52 timeProviderContainer, mg1 pausableTimer, xl1 progressIncrementer, z1 adBlockDurationProvider, mz defaultContentDelayProvider) {
        Intrinsics.checkNotNullParameter(progressListener, "progressListener");
        Intrinsics.checkNotNullParameter(timeProviderContainer, "timeProviderContainer");
        Intrinsics.checkNotNullParameter(pausableTimer, "pausableTimer");
        Intrinsics.checkNotNullParameter(progressIncrementer, "progressIncrementer");
        Intrinsics.checkNotNullParameter(adBlockDurationProvider, "adBlockDurationProvider");
        Intrinsics.checkNotNullParameter(defaultContentDelayProvider, "defaultContentDelayProvider");
        this.f15359a = progressListener;
        this.b = pausableTimer;
        this.c = progressIncrementer;
        this.d = adBlockDurationProvider;
        this.e = defaultContentDelayProvider;
    }

    @Override // com.yandex.mobile.ads.impl.yc0
    public final void start() {
        a aVar = new a();
        this.b.a(this.e.a(), aVar);
        this.b.a(aVar);
    }

    @Override // com.yandex.mobile.ads.impl.yc0
    public final void resume() {
        this.b.resume();
    }

    @Override // com.yandex.mobile.ads.impl.yc0
    public final void pause() {
        this.b.pause();
    }

    @Override // com.yandex.mobile.ads.impl.yc0
    public final void invalidate() {
        this.b.invalidate();
    }

    private final class a implements og1, m52 {
        public a() {
        }

        @Override // com.yandex.mobile.ads.impl.og1
        public final void a() {
            e91.this.f15359a.a();
        }

        @Override // com.yandex.mobile.ads.impl.m52
        public final void a(long j, long j2) {
            long a2 = e91.this.c.a() + (e91.this.e.a() - j);
            e91.this.f15359a.a(e91.this.d.a(), a2);
        }
    }
}
