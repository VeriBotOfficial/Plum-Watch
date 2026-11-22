package com.yandex.mobile.ads.impl;

import android.graphics.Bitmap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class zj0 {
    public static boolean a(xj0 imageValue, Map images) {
        Intrinsics.checkNotNullParameter(imageValue, "imageValue");
        Intrinsics.checkNotNullParameter(images, "images");
        Bitmap bitmap = (Bitmap) images.get(imageValue.f());
        return (bitmap != null && bitmap.getWidth() > 1 && bitmap.getHeight() > 1) || !imageValue.b();
    }
}
