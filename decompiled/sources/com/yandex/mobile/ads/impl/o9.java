package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class o9 {

    /* renamed from: a, reason: collision with root package name */
    private final q9 f16426a;
    private final o5 b;
    private final z4 c;

    public o9(q9 adStateHolder, o5 playbackStateController, z4 adInfoStorage) {
        Intrinsics.checkNotNullParameter(adStateHolder, "adStateHolder");
        Intrinsics.checkNotNullParameter(playbackStateController, "playbackStateController");
        Intrinsics.checkNotNullParameter(adInfoStorage, "adInfoStorage");
        this.f16426a = adStateHolder;
        this.b = playbackStateController;
        this.c = adInfoStorage;
    }

    public final q9 b() {
        return this.f16426a;
    }

    public final o5 c() {
        return this.b;
    }

    public final z4 a() {
        return this.c;
    }
}
