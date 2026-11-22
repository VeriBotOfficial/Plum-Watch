package com.yandex.mobile.ads.impl;

import android.view.TextureView;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class ab1 implements gb1 {

    /* renamed from: a, reason: collision with root package name */
    private final sa1 f14990a;
    private final yb1 b;

    public ab1(sa1 player, yb1 videoView) {
        Intrinsics.checkNotNullParameter(player, "player");
        Intrinsics.checkNotNullParameter(videoView, "videoView");
        this.f14990a = player;
        this.b = videoView;
    }

    @Override // com.yandex.mobile.ads.impl.gb1
    public final void b() {
        this.f14990a.a(this.b.c());
    }

    @Override // com.yandex.mobile.ads.impl.gb1
    public final void a() {
        this.b.b().b().clearAnimation();
        this.f14990a.a((TextureView) null);
    }
}
