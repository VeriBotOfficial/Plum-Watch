package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class lm0 {

    /* renamed from: a, reason: collision with root package name */
    private final h82 f16143a;
    private final im0 b;

    public lm0(h82 unifiedInstreamAdBinder) {
        Intrinsics.checkNotNullParameter(unifiedInstreamAdBinder, "unifiedInstreamAdBinder");
        this.f16143a = unifiedInstreamAdBinder;
        this.b = im0.c.a();
    }

    public final void a(kt player) {
        Intrinsics.checkNotNullParameter(player, "player");
        h82 a2 = this.b.a(player);
        if (Intrinsics.areEqual(this.f16143a, a2)) {
            return;
        }
        if (a2 != null) {
            a2.invalidateAdPlayer();
        }
        this.b.a(player, this.f16143a);
    }

    public final void b(kt player) {
        Intrinsics.checkNotNullParameter(player, "player");
        this.b.b(player);
    }
}
