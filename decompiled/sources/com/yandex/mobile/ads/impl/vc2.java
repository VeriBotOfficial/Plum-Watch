package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class vc2 {

    /* renamed from: a, reason: collision with root package name */
    private final mg2 f17151a;
    private boolean b;

    public vc2(wc2<?> videoAdPlayer, mg2 videoTracker) {
        Intrinsics.checkNotNullParameter(videoAdPlayer, "videoAdPlayer");
        Intrinsics.checkNotNullParameter(videoTracker, "videoTracker");
        this.f17151a = videoTracker;
        this.b = videoAdPlayer.getVolume() == 0.0f;
    }

    public final void a(float f) {
        if (f == 0.0f) {
            if (this.b) {
                return;
            }
            this.b = true;
            this.f17151a.l();
            return;
        }
        if (this.b) {
            this.b = false;
            this.f17151a.a();
        }
    }
}
