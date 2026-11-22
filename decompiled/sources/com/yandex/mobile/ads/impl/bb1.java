package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class bb1 implements yc0, jb1 {

    /* renamed from: a, reason: collision with root package name */
    private final db1 f15090a;
    private final zp b;
    private final Long c;
    private final aq d;
    private final kp e;

    public bb1(o8<?> adResponse, db1 nativeVideoController, zp closeShowListener, f52 timeProviderContainer, Long l, aq closeTimerProgressIncrementer, kp closableAdChecker) {
        Intrinsics.checkNotNullParameter(adResponse, "adResponse");
        Intrinsics.checkNotNullParameter(nativeVideoController, "nativeVideoController");
        Intrinsics.checkNotNullParameter(closeShowListener, "closeShowListener");
        Intrinsics.checkNotNullParameter(timeProviderContainer, "timeProviderContainer");
        Intrinsics.checkNotNullParameter(closeTimerProgressIncrementer, "closeTimerProgressIncrementer");
        Intrinsics.checkNotNullParameter(closableAdChecker, "closableAdChecker");
        this.f15090a = nativeVideoController;
        this.b = closeShowListener;
        this.c = l;
        this.d = closeTimerProgressIncrementer;
        this.e = closableAdChecker;
    }

    @Override // com.yandex.mobile.ads.impl.yc0
    public final void pause() {
    }

    @Override // com.yandex.mobile.ads.impl.yc0
    public final void resume() {
    }

    @Override // com.yandex.mobile.ads.impl.yc0
    public final void invalidate() {
        this.f15090a.b(this);
    }

    @Override // com.yandex.mobile.ads.impl.jb1
    public final void b() {
        if (this.e.a()) {
            this.b.a();
            this.f15090a.b(this);
        }
    }

    @Override // com.yandex.mobile.ads.impl.jb1
    public final void a(long j, long j2) {
        if (this.e.a()) {
            this.d.a(j - j2, j2);
            long a2 = this.d.a() + j2;
            Long l = this.c;
            if (l == null || a2 < l.longValue()) {
                return;
            }
            this.b.a();
            this.f15090a.b(this);
        }
    }

    @Override // com.yandex.mobile.ads.impl.jb1
    public final void a() {
        this.b.a();
        this.f15090a.b(this);
    }

    @Override // com.yandex.mobile.ads.impl.yc0
    public final void start() {
        this.f15090a.a(this);
        if (!this.e.a() || this.c == null || this.d.a() < this.c.longValue()) {
            return;
        }
        this.b.a();
        this.f15090a.b(this);
    }
}
