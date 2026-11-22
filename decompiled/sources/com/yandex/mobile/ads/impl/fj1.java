package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class fj1 implements zl1 {

    /* renamed from: a, reason: collision with root package name */
    private final rf2 f15502a;
    private final yn1 b;
    private final xn1 c;
    private final hj1 d;
    private boolean e;

    public fj1(rf2 videoProgressMonitoringManager, yn1 readyToPrepareProvider, xn1 readyToPlayProvider, hj1 playlistSchedulerListener) {
        Intrinsics.checkNotNullParameter(videoProgressMonitoringManager, "videoProgressMonitoringManager");
        Intrinsics.checkNotNullParameter(readyToPrepareProvider, "readyToPrepareProvider");
        Intrinsics.checkNotNullParameter(readyToPlayProvider, "readyToPlayProvider");
        Intrinsics.checkNotNullParameter(playlistSchedulerListener, "playlistSchedulerListener");
        this.f15502a = videoProgressMonitoringManager;
        this.b = readyToPrepareProvider;
        this.c = readyToPlayProvider;
        this.d = playlistSchedulerListener;
    }

    public final void b() {
        if (this.e) {
            this.f15502a.a((zl1) null);
            this.f15502a.b();
            this.e = false;
        }
    }

    @Override // com.yandex.mobile.ads.impl.zl1
    public final void a(long j) {
        gt a2 = this.c.a(j);
        if (a2 != null) {
            this.d.a(a2);
            return;
        }
        gt a3 = this.b.a(j);
        if (a3 != null) {
            this.d.b(a3);
        }
    }

    public final void a() {
        if (this.e) {
            return;
        }
        this.e = true;
        this.f15502a.a(this);
        this.f15502a.a();
    }
}
