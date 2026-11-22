package com.yandex.mobile.ads.impl;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class bk0 {

    /* renamed from: a, reason: collision with root package name */
    private final sj0 f15116a;
    private final ul b;

    public final boolean a(Drawable drawable, xj0 imageValue) {
        Intrinsics.checkNotNullParameter(imageValue, "imageValue");
        Bitmap b = this.f15116a.b(imageValue);
        if (b == null) {
            b = this.f15116a.a(imageValue);
        }
        if (drawable == null || b == null) {
            return false;
        }
        this.b.getClass();
        Intrinsics.checkNotNullParameter(drawable, "drawable");
        return (drawable instanceof BitmapDrawable ? new vl() : new d40(new mt1(), new wl())).a(drawable, b);
    }

    public /* synthetic */ bk0(sj0 sj0Var) {
        this(sj0Var, new ul());
    }

    public bk0(sj0 imageProvider, ul bitmapComparatorFactory) {
        Intrinsics.checkNotNullParameter(imageProvider, "imageProvider");
        Intrinsics.checkNotNullParameter(bitmapComparatorFactory, "bitmapComparatorFactory");
        this.f15116a = imageProvider;
        this.b = bitmapComparatorFactory;
    }
}
