package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class ks {
    public static final kf1 a(Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        int i = context.getResources().getConfiguration().orientation;
        return i != 1 ? i != 2 ? kf1.e : kf1.c : kf1.d;
    }
}
