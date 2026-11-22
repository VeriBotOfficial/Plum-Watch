package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.instream.InstreamAd;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class mt {
    public static et a(InstreamAd instreamAd) {
        Intrinsics.checkNotNullParameter(instreamAd, "instreamAd");
        if (instreamAd instanceof am2) {
            return ((am2) instreamAd).a();
        }
        throw new IllegalArgumentException("You should pass InstreamAd received from InstreamAdLoader");
    }
}
