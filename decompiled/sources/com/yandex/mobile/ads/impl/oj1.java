package com.yandex.mobile.ads.impl;

import com.applovin.mediation.adapters.google.BuildConfig;
import com.yandex.mobile.ads.instream.InstreamAdBreakType;

/* loaded from: classes5.dex */
public enum oj1 {
    c(InstreamAdBreakType.PREROLL),
    d(InstreamAdBreakType.MIDROLL),
    e(InstreamAdBreakType.POSTROLL),
    f(BuildConfig.FLAVOR);

    private final String b;

    @Override // java.lang.Enum
    public final String toString() {
        return this.b;
    }

    oj1(String str) {
        this.b = str;
    }
}
