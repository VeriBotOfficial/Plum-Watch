package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class cb1 implements yc0, jb1 {

    /* renamed from: a, reason: collision with root package name */
    private final db1 f15174a;
    private final Long b;
    private k3 c;
    private yl1 d;

    public cb1(o8<?> adResponse, db1 nativeVideoController, k3 adCompleteListener, yl1 progressListener, Long l) {
        Intrinsics.checkNotNullParameter(adResponse, "adResponse");
        Intrinsics.checkNotNullParameter(nativeVideoController, "nativeVideoController");
        Intrinsics.checkNotNullParameter(adCompleteListener, "adCompleteListener");
        Intrinsics.checkNotNullParameter(progressListener, "progressListener");
        this.f15174a = nativeVideoController;
        this.b = l;
        this.c = adCompleteListener;
        this.d = progressListener;
    }

    @Override // com.yandex.mobile.ads.impl.yc0
    public final void pause() {
    }

    @Override // com.yandex.mobile.ads.impl.yc0
    public final void resume() {
    }

    @Override // com.yandex.mobile.ads.impl.jb1
    public final void b() {
        yl1 yl1Var = this.d;
        if (yl1Var != null) {
            yl1Var.a();
        }
        k3 k3Var = this.c;
        if (k3Var != null) {
            k3Var.b();
        }
        this.f15174a.b(this);
        this.c = null;
        this.d = null;
    }

    @Override // com.yandex.mobile.ads.impl.yc0
    public final void invalidate() {
        this.f15174a.b(this);
        this.c = null;
        this.d = null;
    }

    @Override // com.yandex.mobile.ads.impl.yc0
    public final void start() {
        this.f15174a.a(this);
    }

    @Override // com.yandex.mobile.ads.impl.jb1
    public final void a(long j, long j2) {
        yl1 yl1Var = this.d;
        if (yl1Var != null) {
            yl1Var.a(j, j2);
        }
        Long l = this.b;
        if (l == null || j2 <= l.longValue()) {
            return;
        }
        yl1 yl1Var2 = this.d;
        if (yl1Var2 != null) {
            yl1Var2.a();
        }
        k3 k3Var = this.c;
        if (k3Var != null) {
            k3Var.b();
        }
        this.f15174a.b(this);
        this.c = null;
        this.d = null;
    }

    @Override // com.yandex.mobile.ads.impl.jb1
    public final void a() {
        k3 k3Var = this.c;
        if (k3Var != null) {
            k3Var.a();
        }
        this.c = null;
    }
}
