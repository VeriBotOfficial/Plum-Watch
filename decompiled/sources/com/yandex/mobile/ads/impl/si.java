package com.yandex.mobile.ads.impl;

import android.graphics.RectF;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class si {
    public static String a(RectF viewRect, xj0 imageValue) {
        ui a2;
        j02 b;
        float width;
        int c;
        Intrinsics.checkNotNullParameter(viewRect, "viewRect");
        Intrinsics.checkNotNullParameter(imageValue, "imageValue");
        r02 e = imageValue.e();
        if (e == null || (a2 = e.a()) == null || (b = imageValue.e().b()) == null) {
            return null;
        }
        float width2 = viewRect.width();
        float height = viewRect.height();
        float g = imageValue.g();
        float a3 = imageValue.a();
        float c2 = b.c();
        float b2 = b.b();
        if (width2 == 0.0f || height == 0.0f || g == 0.0f || a3 == 0.0f || c2 == 0.0f || b2 == 0.0f) {
            return null;
        }
        if (viewRect.width() / viewRect.height() > b.c() / b.b()) {
            width = viewRect.height();
            c = b.b();
        } else {
            width = viewRect.width();
            c = b.c();
        }
        if (width / c <= 1.0f) {
            if (width2 / height > c2 / b2) {
                if (Intrinsics.areEqual(a2.c(), a2.b())) {
                    return a2.c();
                }
            } else if (Intrinsics.areEqual(a2.d(), a2.a())) {
                return a2.d();
            }
        } else if (width2 / height > g / a3) {
            if (Intrinsics.areEqual(a2.c(), a2.b())) {
                return a2.c();
            }
        } else if (Intrinsics.areEqual(a2.d(), a2.a())) {
            return a2.d();
        }
        return null;
    }
}
