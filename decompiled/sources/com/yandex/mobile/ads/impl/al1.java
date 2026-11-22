package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class al1 {

    /* renamed from: a, reason: collision with root package name */
    private final gf2 f15017a;

    public al1(gf2 videoPlayerController) {
        Intrinsics.checkNotNullParameter(videoPlayerController, "videoPlayerController");
        this.f15017a = videoPlayerController;
    }

    public final boolean a() {
        return this.f15017a.c() <= 0;
    }
}
