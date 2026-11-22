package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import com.yandex.mobile.ads.R;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class pu {
    public static ou a(Context context, View roundView, AttributeSet attributeSet, int i) {
        float f;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(roundView, "view");
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.MonetizationAdsInternalRoundImageView, i, 0);
            Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "obtainStyledAttributes(...)");
            f = obtainStyledAttributes.getDimensionPixelSize(R.styleable.MonetizationAdsInternalRoundImageView_monetization_internal_corner_radius, 0);
            obtainStyledAttributes.recycle();
        } else {
            f = 0.0f;
        }
        float f2 = f;
        Intrinsics.checkNotNullParameter(roundView, "roundView");
        return new ou(roundView, f2, f2, f2, f2);
    }
}
