package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import com.monetization.ads.mediation.nativeads.MediatedNativeAdImage;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class ny0 {

    /* renamed from: a, reason: collision with root package name */
    private final e40 f16392a;
    private final vj0 b;
    private final Point c;

    public final LinkedHashSet a(List images) {
        Intrinsics.checkNotNullParameter(images, "images");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = images.iterator();
        while (it.hasNext()) {
            MediatedNativeAdImage mediatedNativeAdImage = (MediatedNativeAdImage) it.next();
            String url = mediatedNativeAdImage.getUrl();
            int width = mediatedNativeAdImage.getWidth();
            int height = mediatedNativeAdImage.getHeight();
            if (url.length() > 0) {
                this.b.getClass();
                if (width <= 0 || height <= 0) {
                    Point point = this.c;
                    linkedHashSet.add(new xj0(point.x, point.y, url, null, 120));
                }
            }
        }
        return linkedHashSet;
    }

    public final LinkedHashMap b(List nativeAdImages) {
        Intrinsics.checkNotNullParameter(nativeAdImages, "nativeAdImages");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = nativeAdImages.iterator();
        while (it.hasNext()) {
            MediatedNativeAdImage mediatedNativeAdImage = (MediatedNativeAdImage) it.next();
            Drawable drawable = mediatedNativeAdImage.getCom.anythink.expressad.foundation.h.k.c java.lang.String();
            String url = mediatedNativeAdImage.getUrl();
            if (drawable != null && url.length() > 0) {
                this.f16392a.getClass();
                Bitmap a2 = e40.a(drawable);
                if (a2 != null) {
                    linkedHashMap.put(url, a2);
                }
            }
        }
        return linkedHashMap;
    }

    public /* synthetic */ ny0(Context context) {
        this(context, new e40(), new vj0());
    }

    public ny0(Context context, e40 drawableConverter, vj0 imageSizeValidator) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(drawableConverter, "drawableConverter");
        Intrinsics.checkNotNullParameter(imageSizeValidator, "imageSizeValidator");
        this.f16392a = drawableConverter;
        this.b = imageSizeValidator;
        this.c = ih1.b(context);
    }
}
