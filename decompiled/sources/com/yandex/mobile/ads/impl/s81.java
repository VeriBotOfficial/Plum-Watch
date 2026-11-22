package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class s81 implements w51 {

    /* renamed from: a, reason: collision with root package name */
    private final ic0 f16840a;

    public s81(sa1 forcePausablePlayer) {
        Intrinsics.checkNotNullParameter(forcePausablePlayer, "forcePausablePlayer");
        this.f16840a = forcePausablePlayer;
    }

    @Override // com.yandex.mobile.ads.impl.w51
    public final void b() {
        this.f16840a.f();
    }

    @Override // com.yandex.mobile.ads.impl.w51
    public final void a() {
        this.f16840a.d();
    }
}
