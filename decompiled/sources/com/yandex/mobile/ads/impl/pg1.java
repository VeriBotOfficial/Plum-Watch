package com.yandex.mobile.ads.impl;

import android.os.Handler;
import android.os.Looper;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class pg1 {
    public static mg1 a() {
        Handler handler = new Handler(Looper.getMainLooper());
        Intrinsics.checkNotNullParameter(handler, "handler");
        int i = mg1.f16237a;
        Intrinsics.checkNotNullParameter(handler, "handler");
        return new ng1(true, handler);
    }

    private pg1() {
    }
}
