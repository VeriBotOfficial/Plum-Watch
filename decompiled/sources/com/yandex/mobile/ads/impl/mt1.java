package com.yandex.mobile.ads.impl;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class mt1 {

    /* renamed from: a, reason: collision with root package name */
    private final wl f16275a;

    public final Bitmap a(Drawable drawable) {
        Bitmap createBitmap;
        Intrinsics.checkNotNullParameter(drawable, "drawable");
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            wl wlVar = this.f16275a;
            Bitmap.Config config = Bitmap.Config.ARGB_8888;
            wlVar.getClass();
            Intrinsics.checkNotNullParameter(config, "config");
            createBitmap = Bitmap.createBitmap(1, 1, config);
            Intrinsics.checkNotNullExpressionValue(createBitmap, "createBitmap(...)");
        } else {
            wl wlVar2 = this.f16275a;
            Bitmap.Config config2 = Bitmap.Config.ARGB_8888;
            wlVar2.getClass();
            Intrinsics.checkNotNullParameter(config2, "config");
            createBitmap = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, config2);
            Intrinsics.checkNotNullExpressionValue(createBitmap, "createBitmap(...)");
        }
        Canvas canvas = new Canvas(createBitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        return createBitmap;
    }

    public /* synthetic */ mt1() {
        this(new wl());
    }

    public mt1(wl bitmapProvider) {
        Intrinsics.checkNotNullParameter(bitmapProvider, "bitmapProvider");
        this.f16275a = bitmapProvider;
    }
}
