package com.yandex.mobile.ads.impl;

import android.gov.nist.core.Separators;
import com.yandex.mobile.ads.nativeads.NativeAdAssets;
import com.yandex.mobile.ads.nativeads.NativeAdImage;
import com.yandex.mobile.ads.nativeads.NativeAdMedia;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class qm2 implements NativeAdAssets {

    /* renamed from: a, reason: collision with root package name */
    private final rt f16686a;

    public qm2(rt assets) {
        Intrinsics.checkNotNullParameter(assets, "assets");
        this.f16686a = assets;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qm2) && Intrinsics.areEqual(this.f16686a, ((qm2) obj).f16686a);
    }

    public final int hashCode() {
        return this.f16686a.hashCode();
    }

    public final String toString() {
        return "YandexNativeAdAssetsAdapter(assets=" + this.f16686a + Separators.RPAREN;
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeAdAssets
    public final String getAge() {
        return this.f16686a.a();
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeAdAssets
    public final String getBody() {
        return this.f16686a.b();
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeAdAssets
    public final String getCallToAction() {
        return this.f16686a.c();
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeAdAssets
    public final String getDomain() {
        return this.f16686a.d();
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeAdAssets
    public final NativeAdImage getFavicon() {
        tt e = this.f16686a.e();
        if (e != null) {
            return new sm2(e);
        }
        return null;
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeAdAssets
    public final boolean isFeedbackAvailable() {
        return this.f16686a.f();
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeAdAssets
    public final NativeAdImage getIcon() {
        tt g = this.f16686a.g();
        if (g != null) {
            return new sm2(g);
        }
        return null;
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeAdAssets
    public final NativeAdImage getImage() {
        tt h = this.f16686a.h();
        if (h != null) {
            return new sm2(h);
        }
        return null;
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeAdAssets
    public final NativeAdMedia getMedia() {
        xt i = this.f16686a.i();
        if (i != null) {
            return new vm2(i);
        }
        return null;
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeAdAssets
    public final String getPrice() {
        return this.f16686a.j();
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeAdAssets
    public final Float getRating() {
        return this.f16686a.k();
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeAdAssets
    public final String getReviewCount() {
        return this.f16686a.l();
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeAdAssets
    public final String getSponsored() {
        return this.f16686a.m();
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeAdAssets
    public final String getTitle() {
        return this.f16686a.n();
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeAdAssets
    public final String getWarning() {
        return this.f16686a.o();
    }
}
