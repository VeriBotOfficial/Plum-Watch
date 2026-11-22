package com.yandex.mobile.ads.impl;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class a5 {

    /* renamed from: a, reason: collision with root package name */
    private final LinkedHashMap f14974a = new LinkedHashMap();
    private final LinkedHashMap b = new LinkedHashMap();

    public final v4 a(go0 videoAd) {
        Intrinsics.checkNotNullParameter(videoAd, "videoAd");
        return (v4) this.f14974a.get(videoAd);
    }

    public final go0 a(v4 adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        return (go0) this.b.get(adInfo);
    }

    public final void a(v4 adInfo, go0 videoAd) {
        Intrinsics.checkNotNullParameter(videoAd, "videoAd");
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.f14974a.put(videoAd, adInfo);
        this.b.put(adInfo, videoAd);
    }
}
