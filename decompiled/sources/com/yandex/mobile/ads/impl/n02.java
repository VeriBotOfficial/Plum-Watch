package com.yandex.mobile.ads.impl;

import android.graphics.RectF;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class n02 {
    public static final float a(j02 j02Var, RectF view, RectF image) {
        Intrinsics.checkNotNullParameter(j02Var, "<this>");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(image, "image");
        float height = view.height();
        float width = view.width();
        float height2 = image.height();
        float width2 = image.width();
        if (height == 0.0f || width == 0.0f || height2 == 0.0f || width2 == 0.0f) {
            return Float.MAX_VALUE;
        }
        float min = Math.min(1.0f, width2 / height2 > width / height ? height / height2 : width / width2);
        if (width < ((int) (j02Var.c() * min)) || height < ((int) (j02Var.b() * min))) {
            return Float.MAX_VALUE;
        }
        return Math.abs(height - (j02Var.b() * min)) + Math.abs(width - (j02Var.c() * min));
    }
}
