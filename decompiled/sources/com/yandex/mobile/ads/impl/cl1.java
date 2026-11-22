package com.yandex.mobile.ads.impl;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import java.util.Iterator;
import kotlin.collections.IntIterator;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.ranges.IntRange;

/* loaded from: classes5.dex */
public final class cl1 {

    /* renamed from: a, reason: collision with root package name */
    private final al f15202a;

    public final Bitmap a(Bitmap bitmap, xj0 imageValue) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        Intrinsics.checkNotNullParameter(imageValue, "imageValue");
        if (bitmap.getWidth() == 0 || bitmap.getHeight() == 0 || imageValue.g() == 0 || imageValue.a() == 0) {
            return bitmap;
        }
        if (imageValue.a() * bitmap.getWidth() == bitmap.getHeight() * imageValue.g()) {
            return bitmap;
        }
        this.f15202a.getClass();
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        Intrinsics.checkNotNullParameter(imageValue, "imageValue");
        fz1 size = new fz1(bitmap.getWidth(), bitmap.getHeight());
        if (bitmap.getWidth() != 0 && bitmap.getHeight() != 0 && imageValue.g() != 0 && imageValue.a() != 0) {
            Iterator<Integer> it = new IntRange(bitmap.getWidth(), Math.max(bitmap.getWidth(), Math.min(100, (imageValue.g() * 100) / imageValue.a()))).iterator();
            double d = 1.0d;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                int nextInt = ((IntIterator) it).nextInt();
                if ((imageValue.a() * nextInt) % imageValue.g() == 0) {
                    size = new fz1(nextInt, (imageValue.a() * nextInt) / imageValue.g());
                    break;
                }
                double a2 = (imageValue.a() * nextInt) / imageValue.g();
                int roundToInt = MathKt.roundToInt(a2);
                double abs = Math.abs(roundToInt - a2) / a2;
                if (abs < d) {
                    size = new fz1(nextInt, roundToInt);
                    d = abs;
                }
            }
        }
        fz1 fz1Var = new fz1(bitmap.getWidth(), bitmap.getHeight());
        Intrinsics.checkNotNullParameter(fz1Var, "<this>");
        Intrinsics.checkNotNullParameter(size, "size");
        fz1 fz1Var2 = (fz1) ComparisonsKt.maxOf(new fz1(size.b(), (fz1Var.a() * size.b()) / fz1Var.b()), new fz1((fz1Var.b() * size.a()) / fz1Var.a(), size.a()));
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, fz1Var2.b(), fz1Var2.a(), false);
        Intrinsics.checkNotNullExpressionValue(createScaledBitmap, "createScaledBitmap(...)");
        Bitmap createBitmap = Bitmap.createBitmap(createScaledBitmap, (createScaledBitmap.getWidth() - size.b()) / 2, (createScaledBitmap.getHeight() - size.a()) / 2, size.b(), size.a(), (Matrix) null, false);
        Intrinsics.checkNotNullExpressionValue(createBitmap, "createBitmap(...)");
        return createBitmap;
    }

    public /* synthetic */ cl1() {
        this(new al());
    }

    public cl1(al bestSizeForScalePreviewCalculator) {
        Intrinsics.checkNotNullParameter(bestSizeForScalePreviewCalculator, "bestSizeForScalePreviewCalculator");
        this.f15202a = bestSizeForScalePreviewCalculator;
    }
}
