package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class rb1 implements yc0, jb1 {

    /* renamed from: a, reason: collision with root package name */
    private final db1 f16751a;
    private final yl1 b;
    private final xl1 c;
    private final z1 d;

    public rb1(db1 nativeVideoController, yl1 progressListener, f52 timeProviderContainer, xl1 progressIncrementer, z1 adBlockDurationProvider) {
        Intrinsics.checkNotNullParameter(nativeVideoController, "nativeVideoController");
        Intrinsics.checkNotNullParameter(progressListener, "progressListener");
        Intrinsics.checkNotNullParameter(timeProviderContainer, "timeProviderContainer");
        Intrinsics.checkNotNullParameter(progressIncrementer, "progressIncrementer");
        Intrinsics.checkNotNullParameter(adBlockDurationProvider, "adBlockDurationProvider");
        this.f16751a = nativeVideoController;
        this.b = progressListener;
        this.c = progressIncrementer;
        this.d = adBlockDurationProvider;
    }

    @Override // com.yandex.mobile.ads.impl.yc0
    public final void pause() {
    }

    @Override // com.yandex.mobile.ads.impl.yc0
    public final void resume() {
    }

    @Override // com.yandex.mobile.ads.impl.yc0
    public final void start() {
        this.f16751a.a(this);
    }

    @Override // com.yandex.mobile.ads.impl.yc0
    public final void invalidate() {
        this.f16751a.b(this);
    }

    @Override // com.yandex.mobile.ads.impl.jb1
    public final void b() {
        this.b.a();
        this.f16751a.b(this);
    }

    @Override // com.yandex.mobile.ads.impl.jb1
    public final void a(long j, long j2) {
        long a2 = this.c.a() + j2;
        long a3 = this.d.a(j);
        if (a2 >= a3) {
            this.f16751a.b(this);
            this.b.a();
        } else {
            this.b.a(a3, a2);
        }
    }

    @Override // com.yandex.mobile.ads.impl.jb1
    public final void a() {
        this.b.a();
        this.f16751a.b(this);
    }
}
