package com.yandex.mobile.ads.impl;

import android.content.res.Resources;
import kotlin.math.MathKt;

/* loaded from: classes5.dex */
public final class e82 {
    public static final int a(int i) {
        return i >= 0 ? MathKt.roundToInt(i / Resources.getSystem().getDisplayMetrics().density) : i;
    }
}
