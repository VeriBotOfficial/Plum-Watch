package com.yandex.mobile.ads.impl;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class z4 {

    /* renamed from: a, reason: collision with root package name */
    private final LinkedHashMap f17481a = new LinkedHashMap();
    private final LinkedHashMap b = new LinkedHashMap();

    public final u4 a(go0 videoAd) {
        Intrinsics.checkNotNullParameter(videoAd, "videoAd");
        return (u4) this.f17481a.get(videoAd);
    }

    public final go0 a(u4 adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        return (go0) this.b.get(adInfo);
    }

    public final void a(u4 adInfo, go0 videoAd) {
        Intrinsics.checkNotNullParameter(videoAd, "videoAd");
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.f17481a.put(videoAd, adInfo);
        this.b.put(adInfo, videoAd);
    }
}
