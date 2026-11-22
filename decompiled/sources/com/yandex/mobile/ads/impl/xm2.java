package com.yandex.mobile.ads.impl;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class xm2 implements com.yandex.mobile.ads.nativeads.video.b {

    /* renamed from: a, reason: collision with root package name */
    private final yt f17351a;

    public xm2(yt nativeAdVideoController) {
        Intrinsics.checkNotNullParameter(nativeAdVideoController, "nativeAdVideoController");
        this.f17351a = nativeAdVideoController;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xm2) && Intrinsics.areEqual(this.f17351a, ((xm2) obj).f17351a);
    }

    public final int hashCode() {
        return this.f17351a.hashCode();
    }

    public final String toString() {
        return "YandexNativeAdVideoControllerAdapter(nativeAdVideoController=" + this.f17351a + Separators.RPAREN;
    }

    @Override // com.yandex.mobile.ads.nativeads.video.b, com.yandex.mobile.ads.nativeads.video.NativeAdVideoController
    public final void pauseAd() {
        this.f17351a.a();
    }

    @Override // com.yandex.mobile.ads.nativeads.video.b, com.yandex.mobile.ads.nativeads.video.NativeAdVideoController
    public final void resumeAd() {
        this.f17351a.b();
    }
}
