package com.yandex.mobile.ads.impl;

import android.graphics.Bitmap;
import android.util.LruCache;
import com.yandex.mobile.ads.impl.id1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class o82 implements id1.c {

    /* renamed from: a, reason: collision with root package name */
    private final LruCache<String, Bitmap> f16425a;
    private final hj0 b;

    public o82(jd1 bitmapLruCache, hj0 imageCacheKeyGenerator) {
        Intrinsics.checkNotNullParameter(bitmapLruCache, "bitmapLruCache");
        Intrinsics.checkNotNullParameter(imageCacheKeyGenerator, "imageCacheKeyGenerator");
        this.f16425a = bitmapLruCache;
        this.b = imageCacheKeyGenerator;
    }

    public final Bitmap a(String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        this.b.getClass();
        return this.f16425a.get(hj0.a(url));
    }

    @Override // com.yandex.mobile.ads.impl.id1.c
    public final void a(String url, Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        this.b.getClass();
        this.f16425a.put(hj0.a(url), bitmap);
    }
}
