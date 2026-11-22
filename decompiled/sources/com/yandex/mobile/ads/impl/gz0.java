package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class gz0 implements jj {
    @Override // com.yandex.mobile.ads.impl.jj
    public final int a(Context context, int i, kf1 orientation) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        return (i <= 632 || 90.0f > ((float) wh2.a(context, orientation)) * 0.15f) ? 50 : 90;
    }
}
