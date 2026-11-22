package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class p9 {

    /* renamed from: a, reason: collision with root package name */
    private final r9 f16535a;
    private final p5 b;
    private final a5 c;

    public p9(r9 adStateHolder, p5 playbackStateController, a5 adInfoStorage) {
        Intrinsics.checkNotNullParameter(adStateHolder, "adStateHolder");
        Intrinsics.checkNotNullParameter(playbackStateController, "playbackStateController");
        Intrinsics.checkNotNullParameter(adInfoStorage, "adInfoStorage");
        this.f16535a = adStateHolder;
        this.b = playbackStateController;
        this.c = adInfoStorage;
    }

    public final r9 b() {
        return this.f16535a;
    }

    public final p5 c() {
        return this.b;
    }

    public final a5 a() {
        return this.c;
    }
}
