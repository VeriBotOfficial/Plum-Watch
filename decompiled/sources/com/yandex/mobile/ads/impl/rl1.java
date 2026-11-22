package com.yandex.mobile.ads.impl;

import androidx.media3.common.Player;
import com.yandex.mobile.ads.impl.di1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class rl1 implements am1, wi1 {

    /* renamed from: a, reason: collision with root package name */
    private final am1 f16776a;
    private di1 b;
    private nb0 c;

    public rl1(am1 progressProvider) {
        Intrinsics.checkNotNullParameter(progressProvider, "progressProvider");
        this.f16776a = progressProvider;
        this.b = di1.a.a();
    }

    @Override // com.yandex.mobile.ads.impl.am1
    public final di1 a() {
        am1 am1Var = this.c;
        if (am1Var == null) {
            am1Var = this.f16776a;
        }
        di1 a2 = am1Var.a();
        this.b = a2;
        return a2;
    }

    @Override // com.yandex.mobile.ads.impl.wi1
    public final void a(Player player) {
        this.c = player == null ? new nb0(this.b) : null;
    }
}
