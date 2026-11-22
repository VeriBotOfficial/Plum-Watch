package com.yandex.mobile.ads.impl;

import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class c61 {
    private static final int b = Color.parseColor("#eaeaea");

    /* renamed from: a, reason: collision with root package name */
    private final ImageView[] f15160a;

    public c61(ImageView... imageViews) {
        Intrinsics.checkNotNullParameter(imageViews, "imageViews");
        this.f15160a = imageViews;
        b();
    }

    public final void a() {
        for (ImageView imageView : this.f15160a) {
            Drawable background = imageView.getBackground();
            Intrinsics.checkNotNull(background, "null cannot be cast to non-null type android.graphics.drawable.ColorDrawable");
            ColorDrawable colorDrawable = (ColorDrawable) background;
            Drawable drawable = imageView.getDrawable();
            if (drawable != null && colorDrawable.getAlpha() == 255) {
                ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(colorDrawable, PropertyValuesHolder.ofInt("alpha", 255, 0));
                Intrinsics.checkNotNullExpressionValue(ofPropertyValuesHolder, "ofPropertyValuesHolder(...)");
                ofPropertyValuesHolder.setTarget(colorDrawable);
                ofPropertyValuesHolder.setDuration(500L);
                ofPropertyValuesHolder.start();
                ObjectAnimator ofPropertyValuesHolder2 = ObjectAnimator.ofPropertyValuesHolder(drawable, PropertyValuesHolder.ofInt("alpha", 0, 255));
                Intrinsics.checkNotNullExpressionValue(ofPropertyValuesHolder2, "ofPropertyValuesHolder(...)");
                ofPropertyValuesHolder2.setTarget(drawable);
                ofPropertyValuesHolder2.setDuration(500L);
                ofPropertyValuesHolder2.start();
            }
        }
    }

    public final void b() {
        for (ImageView imageView : this.f15160a) {
            if (imageView != null) {
                if (imageView.getDrawable() != null) {
                    imageView.setBackgroundColor(0);
                } else {
                    imageView.setBackgroundColor(b);
                }
            }
        }
    }
}
