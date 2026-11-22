package com.yandex.mobile.ads.impl;

import androidx.media3.common.AdPlaybackState;
import androidx.media3.exoplayer.source.ads.AdsLoader;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class o5 {

    /* renamed from: a, reason: collision with root package name */
    private AdsLoader.EventListener f16409a;
    private AdPlaybackState b;

    public o5(AdsLoader.EventListener eventListener) {
        this.f16409a = eventListener;
        AdPlaybackState NONE = AdPlaybackState.NONE;
        Intrinsics.checkNotNullExpressionValue(NONE, "NONE");
        this.b = NONE;
    }

    public final AdPlaybackState a() {
        return this.b;
    }

    public final void b() {
        this.f16409a = null;
        AdPlaybackState NONE = AdPlaybackState.NONE;
        Intrinsics.checkNotNullExpressionValue(NONE, "NONE");
        this.b = NONE;
    }

    public final void a(AdsLoader.EventListener eventListener) {
        this.f16409a = eventListener;
    }

    public final void a(AdPlaybackState adPlaybackState) {
        Intrinsics.checkNotNullParameter(adPlaybackState, "adPlaybackState");
        this.b = adPlaybackState;
        AdsLoader.EventListener eventListener = this.f16409a;
        if (eventListener != null) {
            eventListener.onAdPlaybackState(adPlaybackState);
        }
    }
}
