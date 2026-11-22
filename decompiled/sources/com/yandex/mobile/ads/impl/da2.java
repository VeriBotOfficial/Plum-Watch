package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class da2<T> implements cd2 {

    /* renamed from: a, reason: collision with root package name */
    private final zb2<T> f15264a;
    private final mg2 b;
    private final pc2<T> c;
    private final tg2 d;
    private boolean e;

    public /* synthetic */ da2(zb2 zb2Var, sg2 sg2Var, ng2 ng2Var, pc2 pc2Var) {
        this(zb2Var, sg2Var, ng2Var, pc2Var, new tg2(sg2Var));
    }

    public da2(zb2 videoAdInfo, sg2 videoViewProvider, ng2 videoTracker, pc2 playbackEventsListener, tg2 videoVisibleAreaValidator) {
        Intrinsics.checkNotNullParameter(videoAdInfo, "videoAdInfo");
        Intrinsics.checkNotNullParameter(videoViewProvider, "videoViewProvider");
        Intrinsics.checkNotNullParameter(videoTracker, "videoTracker");
        Intrinsics.checkNotNullParameter(playbackEventsListener, "playbackEventsListener");
        Intrinsics.checkNotNullParameter(videoVisibleAreaValidator, "videoVisibleAreaValidator");
        this.f15264a = videoAdInfo;
        this.b = videoTracker;
        this.c = playbackEventsListener;
        this.d = videoVisibleAreaValidator;
    }

    @Override // com.yandex.mobile.ads.impl.cd2
    public final void a(long j, long j2) {
        if (this.e || j2 <= 0 || !this.d.a()) {
            return;
        }
        this.e = true;
        this.b.h();
        this.c.i(this.f15264a);
    }
}
