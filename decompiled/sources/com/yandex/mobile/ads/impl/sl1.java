package com.yandex.mobile.ads.impl;

import com.google.android.exoplayer2.Player;
import com.yandex.mobile.ads.impl.ci1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class sl1 implements bm1, xi1 {

    /* renamed from: a, reason: collision with root package name */
    private final bm1 f16870a;
    private ci1 b;
    private ob0 c;

    public sl1(bm1 progressProvider) {
        Intrinsics.checkNotNullParameter(progressProvider, "progressProvider");
        this.f16870a = progressProvider;
        this.b = ci1.a.a();
    }

    @Override // com.yandex.mobile.ads.impl.bm1
    public final ci1 a() {
        bm1 bm1Var = this.c;
        if (bm1Var == null) {
            bm1Var = this.f16870a;
        }
        ci1 a2 = bm1Var.a();
        this.b = a2;
        return a2;
    }

    @Override // com.yandex.mobile.ads.impl.xi1
    public final void a(Player player) {
        this.c = player == null ? new ob0(this.b) : null;
    }
}
