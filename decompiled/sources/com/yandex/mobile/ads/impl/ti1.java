package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class ti1 {

    /* renamed from: a, reason: collision with root package name */
    private final vi1 f16971a;
    private final pe2 b;
    private final b70 c;
    private final zi1 d;
    private final ji1 e;

    public ti1(vi1 stateHolder, pe2 durationHolder, b70 playerProvider, zi1 volumeController, ji1 playerPlaybackController) {
        Intrinsics.checkNotNullParameter(stateHolder, "stateHolder");
        Intrinsics.checkNotNullParameter(durationHolder, "durationHolder");
        Intrinsics.checkNotNullParameter(playerProvider, "playerProvider");
        Intrinsics.checkNotNullParameter(volumeController, "volumeController");
        Intrinsics.checkNotNullParameter(playerPlaybackController, "playerPlaybackController");
        this.f16971a = stateHolder;
        this.b = durationHolder;
        this.c = playerProvider;
        this.d = volumeController;
        this.e = playerPlaybackController;
    }

    public final vi1 d() {
        return this.f16971a;
    }

    public final pe2 a() {
        return this.b;
    }

    public final b70 c() {
        return this.c;
    }

    public final zi1 e() {
        return this.d;
    }

    public final ji1 b() {
        return this.e;
    }
}
