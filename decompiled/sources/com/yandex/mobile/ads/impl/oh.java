package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.content.res.TypedArray;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class oh {
    public static final int a(Context context, int i) {
        int i2;
        Intrinsics.checkNotNullParameter(context, "<this>");
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{i});
        Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "obtainStyledAttributes(...)");
        try {
            i2 = obtainStyledAttributes.getColor(0, 0);
        } catch (Exception unused) {
            i2 = -16777216;
        }
        obtainStyledAttributes.recycle();
        return i2;
    }
}
