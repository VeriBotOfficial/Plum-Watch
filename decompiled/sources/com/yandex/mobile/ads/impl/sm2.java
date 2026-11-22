package com.yandex.mobile.ads.impl;

import android.gov.nist.core.Separators;
import android.graphics.Bitmap;
import com.yandex.mobile.ads.nativeads.NativeAdImage;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class sm2 implements NativeAdImage {

    /* renamed from: a, reason: collision with root package name */
    private final tt f16874a;

    public sm2(tt image) {
        Intrinsics.checkNotNullParameter(image, "image");
        this.f16874a = image;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sm2) && Intrinsics.areEqual(this.f16874a, ((sm2) obj).f16874a);
    }

    public final int hashCode() {
        return this.f16874a.hashCode();
    }

    public final String toString() {
        return "YandexNativeAdImageAdapter(image=" + this.f16874a + Separators.RPAREN;
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeAdImage
    public final Bitmap getBitmap() {
        return this.f16874a.a();
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeAdImage
    public final int getWidth() {
        return this.f16874a.d();
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeAdImage
    public final int getHeight() {
        return this.f16874a.b();
    }
}
