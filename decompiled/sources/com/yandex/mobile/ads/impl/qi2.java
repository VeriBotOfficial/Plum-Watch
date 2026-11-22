package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class qi2 implements dq1<ki2> {

    /* renamed from: a, reason: collision with root package name */
    private final g5 f16672a;
    private final dq1<ki2> b;

    public qi2(g5 adLoadingPhasesManager, dq1<ki2> requestListener) {
        Intrinsics.checkNotNullParameter(adLoadingPhasesManager, "adLoadingPhasesManager");
        Intrinsics.checkNotNullParameter(requestListener, "requestListener");
        this.f16672a = adLoadingPhasesManager;
        this.b = requestListener;
    }

    @Override // com.yandex.mobile.ads.impl.dq1
    public final void a(sb2 error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.f16672a.a(f5.y);
        this.b.a(error);
    }

    @Override // com.yandex.mobile.ads.impl.dq1
    public final void a(ki2 ki2Var) {
        ki2 vmap = ki2Var;
        Intrinsics.checkNotNullParameter(vmap, "vmap");
        this.f16672a.a(f5.y);
        this.b.a((dq1<ki2>) vmap);
    }
}
