package com.yandex.mobile.ads.impl;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class u92 {

    /* renamed from: a, reason: collision with root package name */
    private final String f17032a;
    private final List<mb2> b;

    public u92(String version, List<mb2> videoAds) {
        Intrinsics.checkNotNullParameter(version, "version");
        Intrinsics.checkNotNullParameter(videoAds, "videoAds");
        this.f17032a = version;
        this.b = videoAds;
    }

    public final String a() {
        return this.f17032a;
    }

    public final List<mb2> b() {
        return this.b;
    }
}
