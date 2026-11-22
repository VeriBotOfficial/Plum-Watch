package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class wa1 {

    /* renamed from: a, reason: collision with root package name */
    private final sa1 f17232a;

    public wa1(sa1 videoAdPlayer) {
        Intrinsics.checkNotNullParameter(videoAdPlayer, "videoAdPlayer");
        this.f17232a = videoAdPlayer;
    }

    public final void a(Double d) {
        this.f17232a.setVolume((float) (d != null ? d.doubleValue() : 0.0d));
    }
}
