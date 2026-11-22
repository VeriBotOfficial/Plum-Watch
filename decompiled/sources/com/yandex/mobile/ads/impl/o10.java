package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.util.TypedValue;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;

/* loaded from: classes5.dex */
public final class o10 {
    public static int a(Context context, float f) {
        Intrinsics.checkNotNullParameter(context, "context");
        return MathKt.roundToInt(TypedValue.applyDimension(1, f, context.getResources().getDisplayMetrics()));
    }
}
