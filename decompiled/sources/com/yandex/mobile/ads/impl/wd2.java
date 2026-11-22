package com.yandex.mobile.ads.impl;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class wd2 {

    /* renamed from: a, reason: collision with root package name */
    private final List<mb2> f17241a;
    private final List<mb2> b;

    public wd2(List<mb2> inLineAds, List<mb2> wrapperAds) {
        Intrinsics.checkNotNullParameter(inLineAds, "inLineAds");
        Intrinsics.checkNotNullParameter(wrapperAds, "wrapperAds");
        this.f17241a = inLineAds;
        this.b = wrapperAds;
    }

    public final List<mb2> a() {
        return this.f17241a;
    }

    public final List<mb2> b() {
        return this.b;
    }
}
