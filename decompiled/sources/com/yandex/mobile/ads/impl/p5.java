package com.yandex.mobile.ads.impl;

import com.google.android.exoplayer2.source.ads.AdPlaybackState;
import com.google.android.exoplayer2.source.ads.AdsLoader;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class p5 {

    /* renamed from: a, reason: collision with root package name */
    private AdsLoader.EventListener f16521a;
    private AdPlaybackState b;

    public p5(AdsLoader.EventListener eventListener) {
        this.f16521a = eventListener;
        AdPlaybackState NONE = AdPlaybackState.NONE;
        Intrinsics.checkNotNullExpressionValue(NONE, "NONE");
        this.b = NONE;
    }

    public final AdPlaybackState a() {
        return this.b;
    }

    public final void b() {
        this.f16521a = null;
        AdPlaybackState NONE = AdPlaybackState.NONE;
        Intrinsics.checkNotNullExpressionValue(NONE, "NONE");
        this.b = NONE;
    }

    public final void a(AdsLoader.EventListener eventListener) {
        this.f16521a = eventListener;
    }

    public final void a(AdPlaybackState adPlaybackState) {
        Intrinsics.checkNotNullParameter(adPlaybackState, "adPlaybackState");
        this.b = adPlaybackState;
        AdsLoader.EventListener eventListener = this.f16521a;
        if (eventListener != null) {
            eventListener.onAdPlaybackState(adPlaybackState);
        }
    }
}
