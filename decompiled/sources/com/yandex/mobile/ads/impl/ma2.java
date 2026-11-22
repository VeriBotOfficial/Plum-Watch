package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class ma2<T> implements cd2 {

    /* renamed from: a, reason: collision with root package name */
    private final mg2 f16222a;
    private final wc2<T> b;
    private final tg2 c;
    private boolean d;

    public /* synthetic */ ma2(sg2 sg2Var, ng2 ng2Var, wc2 wc2Var) {
        this(sg2Var, ng2Var, wc2Var, new tg2(sg2Var));
    }

    public ma2(sg2 videoViewProvider, ng2 videoTracker, wc2 videoAdPlayer, tg2 singlePercentAreaValidator) {
        Intrinsics.checkNotNullParameter(videoViewProvider, "videoViewProvider");
        Intrinsics.checkNotNullParameter(videoTracker, "videoTracker");
        Intrinsics.checkNotNullParameter(videoAdPlayer, "videoAdPlayer");
        Intrinsics.checkNotNullParameter(singlePercentAreaValidator, "singlePercentAreaValidator");
        this.f16222a = videoTracker;
        this.b = videoAdPlayer;
        this.c = singlePercentAreaValidator;
    }

    @Override // com.yandex.mobile.ads.impl.cd2
    public final void a(long j, long j2) {
        if (this.d || j2 <= 0 || !this.c.a()) {
            return;
        }
        this.d = true;
        this.f16222a.a(this.b.getVolume(), j);
    }
}
