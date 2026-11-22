package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class um1 implements ps1 {

    /* renamed from: a, reason: collision with root package name */
    private ps1 f17070a;

    @Override // com.yandex.mobile.ads.impl.ps1
    public final void a(ow1 reward) {
        Intrinsics.checkNotNullParameter(reward, "reward");
        ps1 ps1Var = this.f17070a;
        if (ps1Var != null) {
            ps1Var.a(reward);
        }
    }

    public final void a(ps1 listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f17070a = listener;
    }
}
