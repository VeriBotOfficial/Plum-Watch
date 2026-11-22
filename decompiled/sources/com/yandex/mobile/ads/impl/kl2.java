package com.yandex.mobile.ads.impl;

import android.gov.nist.core.Separators;
import com.yandex.mobile.ads.video.playback.model.AdPodInfo;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class kl2 implements AdPodInfo {

    /* renamed from: a, reason: collision with root package name */
    private final zc2 f16034a;

    public kl2(zc2 adPodInfo) {
        Intrinsics.checkNotNullParameter(adPodInfo, "adPodInfo");
        this.f16034a = adPodInfo;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kl2) && Intrinsics.areEqual(this.f16034a, ((kl2) obj).f16034a);
    }

    public final int hashCode() {
        return this.f16034a.hashCode();
    }

    public final String toString() {
        return "YandexAdPodInfo(adPodInfo=" + this.f16034a + Separators.RPAREN;
    }

    @Override // com.yandex.mobile.ads.video.playback.model.AdPodInfo
    public final int getAdsCount() {
        return this.f16034a.b();
    }

    @Override // com.yandex.mobile.ads.video.playback.model.AdPodInfo
    public final int getAdPosition() {
        return this.f16034a.a();
    }
}
