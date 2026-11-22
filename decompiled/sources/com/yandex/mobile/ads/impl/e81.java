package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class e81 implements jb1 {

    /* renamed from: a, reason: collision with root package name */
    private final db1 f15357a;
    private ve2 b;

    public e81(db1 nativeVideoController, qe2 videoLifecycleListener, ve2 ve2Var) {
        Intrinsics.checkNotNullParameter(nativeVideoController, "nativeVideoController");
        Intrinsics.checkNotNullParameter(videoLifecycleListener, "videoLifecycleListener");
        this.f15357a = nativeVideoController;
        this.b = ve2Var;
    }

    @Override // com.yandex.mobile.ads.impl.jb1
    public final void a() {
    }

    @Override // com.yandex.mobile.ads.impl.jb1
    public final void a(long j, long j2) {
    }

    @Override // com.yandex.mobile.ads.impl.jb1
    public final void b() {
        ve2 ve2Var = this.b;
        if (ve2Var != null) {
            ve2Var.onVideoComplete();
        }
    }

    public final void c() {
        this.f15357a.b(this);
        this.b = null;
    }

    public final void d() {
        this.f15357a.a(this);
    }
}
