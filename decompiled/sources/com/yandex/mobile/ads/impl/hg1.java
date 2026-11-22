package com.yandex.mobile.ads.impl;

import android.os.Handler;
import android.os.Looper;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class hg1 {
    public static gg1 a(eh0 htmlWebViewRenderer) {
        Intrinsics.checkNotNullParameter(htmlWebViewRenderer, "htmlWebViewRenderer");
        return new gg1(htmlWebViewRenderer, new Handler(Looper.getMainLooper()), new dz1(), new r7());
    }
}
