package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class si1 {

    /* renamed from: a, reason: collision with root package name */
    private final ui1 f16864a;
    private final oe2 b;
    private final a70 c;
    private final yi1 d;
    private final ii1 e;

    public si1(ui1 stateHolder, oe2 durationHolder, a70 playerProvider, yi1 volumeController, ii1 playerPlaybackController) {
        Intrinsics.checkNotNullParameter(stateHolder, "stateHolder");
        Intrinsics.checkNotNullParameter(durationHolder, "durationHolder");
        Intrinsics.checkNotNullParameter(playerProvider, "playerProvider");
        Intrinsics.checkNotNullParameter(volumeController, "volumeController");
        Intrinsics.checkNotNullParameter(playerPlaybackController, "playerPlaybackController");
        this.f16864a = stateHolder;
        this.b = durationHolder;
        this.c = playerProvider;
        this.d = volumeController;
        this.e = playerPlaybackController;
    }

    public final ui1 d() {
        return this.f16864a;
    }

    public final oe2 a() {
        return this.b;
    }

    public final a70 c() {
        return this.c;
    }

    public final yi1 e() {
        return this.d;
    }

    public final ii1 b() {
        return this.e;
    }
}
