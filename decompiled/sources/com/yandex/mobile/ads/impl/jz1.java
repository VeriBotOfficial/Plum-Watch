package com.yandex.mobile.ads.impl;

import android.widget.ImageView;
import com.yandex.mobile.ads.impl.id1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class jz1 extends oj0 {
    private final hj0 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jz1(iq1 queue, id1.b imageCache, hj0 imageCacheKeyGenerator) {
        super(queue, imageCache);
        Intrinsics.checkNotNullParameter(queue, "queue");
        Intrinsics.checkNotNullParameter(imageCache, "imageCache");
        Intrinsics.checkNotNullParameter(imageCacheKeyGenerator, "imageCacheKeyGenerator");
        this.g = imageCacheKeyGenerator;
    }

    @Override // com.yandex.mobile.ads.impl.oj0
    public final String a(String url, int i, int i2, ImageView.ScaleType scaleType) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(scaleType, "scaleType");
        this.g.getClass();
        return hj0.b(url, scaleType);
    }
}
