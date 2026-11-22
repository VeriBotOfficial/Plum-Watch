package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class qz1 implements cd2 {

    /* renamed from: a, reason: collision with root package name */
    private final pz1 f16715a;
    private final od2 b;
    private boolean c;

    public /* synthetic */ qz1(cn0 cn0Var, go0 go0Var) {
        this(cn0Var, go0Var, new pz1(cn0Var), go0Var.h());
    }

    public qz1(cn0 viewHolderManager, go0 instreamVideoAd, pz1 skipCountDownConfigurator, od2 od2Var) {
        Intrinsics.checkNotNullParameter(viewHolderManager, "viewHolderManager");
        Intrinsics.checkNotNullParameter(instreamVideoAd, "instreamVideoAd");
        Intrinsics.checkNotNullParameter(skipCountDownConfigurator, "skipCountDownConfigurator");
        this.f16715a = skipCountDownConfigurator;
        this.b = od2Var;
    }

    @Override // com.yandex.mobile.ads.impl.cd2
    public final void a(long j, long j2) {
        od2 od2Var;
        if (this.c || (od2Var = this.b) == null) {
            return;
        }
        if (j2 >= od2Var.a()) {
            this.f16715a.a();
            this.c = true;
        } else {
            this.f16715a.a(this.b.a(), j2);
        }
    }
}
