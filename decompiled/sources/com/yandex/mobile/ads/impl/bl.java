package com.yandex.mobile.ads.impl;

import android.graphics.RectF;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class bl {

    /* renamed from: a, reason: collision with root package name */
    private final k02 f15119a = new k02();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v9 */
    public final j02 a(RectF viewSize, xj0 imageValue) {
        List<j02> c;
        Intrinsics.checkNotNullParameter(viewSize, "viewRect");
        Intrinsics.checkNotNullParameter(imageValue, "imageValue");
        RectF imageSize = new RectF(0.0f, 0.0f, imageValue.g(), imageValue.a());
        r02 e = imageValue.e();
        Object first = 0;
        if (e == null || (c = e.c()) == null) {
            return null;
        }
        Iterator<T> it = c.iterator();
        if (it.hasNext()) {
            first = it.next();
            while (it.hasNext()) {
                j02 second = (j02) it.next();
                first = (j02) first;
                this.f15119a.getClass();
                Intrinsics.checkNotNullParameter(first, "first");
                Intrinsics.checkNotNullParameter(second, "second");
                Intrinsics.checkNotNullParameter(imageSize, "imageSize");
                Intrinsics.checkNotNullParameter(viewSize, "viewSize");
                float a2 = n02.a(first, viewSize, imageSize);
                float a3 = n02.a(second, viewSize, imageSize);
                if (a2 != Float.MAX_VALUE) {
                    if (a2 == a3) {
                        if (first.a() > second.a()) {
                        }
                    } else if (a2 > a3) {
                    }
                }
                first = second;
            }
        }
        return (j02) first;
    }
}
