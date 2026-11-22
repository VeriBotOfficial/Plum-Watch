package com.yandex.mobile.ads.impl;

import android.gov.nist.core.Separators;
import com.yandex.mobile.ads.nativeads.NativeAdMedia;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class vm2 implements NativeAdMedia {

    /* renamed from: a, reason: collision with root package name */
    private final xt f17178a;

    public vm2(xt media) {
        Intrinsics.checkNotNullParameter(media, "media");
        this.f17178a = media;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vm2) && Intrinsics.areEqual(this.f17178a, ((vm2) obj).f17178a);
    }

    public final int hashCode() {
        return this.f17178a.hashCode();
    }

    public final String toString() {
        return "YandexNativeAdMediaAdapter(media=" + this.f17178a + Separators.RPAREN;
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeAdMedia
    public final float getAspectRatio() {
        return this.f17178a.a();
    }
}
