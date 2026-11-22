package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class gm0 implements tm0 {

    /* renamed from: a, reason: collision with root package name */
    private final hm0 f15606a;
    private final j32 b;
    private final g5 c;
    private final um0 d;
    private final fc2 e;
    private final sm0 f;

    public gm0(Context context, bv1 sdkEnvironmentModule, hm0 itemFinishedListener, j32 strongReferenceKeepingManager) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sdkEnvironmentModule, "sdkEnvironmentModule");
        Intrinsics.checkNotNullParameter(itemFinishedListener, "itemFinishedListener");
        Intrinsics.checkNotNullParameter(strongReferenceKeepingManager, "strongReferenceKeepingManager");
        this.f15606a = itemFinishedListener;
        this.b = strongReferenceKeepingManager;
        g5 g5Var = new g5();
        this.c = g5Var;
        o3 o3Var = new o3(ts.h, sdkEnvironmentModule);
        um0 um0Var = new um0(context, o3Var, g5Var, this);
        this.d = um0Var;
        fc2 fc2Var = new fc2(context, o3Var, g5Var);
        this.e = fc2Var;
        this.f = new sm0(context, sdkEnvironmentModule, fc2Var, um0Var);
    }

    public final void a(oi2 requestConfig) {
        Intrinsics.checkNotNullParameter(requestConfig, "requestConfig");
        this.b.b(xq0.b, this);
        this.d.a(requestConfig);
        g5 g5Var = this.c;
        f5 f5Var = f5.e;
        bk.a(g5Var, f5Var, "adLoadingPhaseType", f5Var, null);
        this.e.a(requestConfig, this.f);
    }

    @Override // com.yandex.mobile.ads.impl.tm0
    public final void a() {
        this.f15606a.a(this);
        this.b.a(xq0.b, this);
    }

    public final void a(jt jtVar) {
        this.d.a(jtVar);
    }
}
