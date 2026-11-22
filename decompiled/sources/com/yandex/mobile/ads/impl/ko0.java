package com.yandex.mobile.ads.impl;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class ko0 {

    /* renamed from: a, reason: collision with root package name */
    private final LinkedHashMap f16042a = new LinkedHashMap();

    public final ln0 a(zb2<go0> videoAdInfo) {
        Intrinsics.checkNotNullParameter(videoAdInfo, "videoAdInfo");
        return (ln0) this.f16042a.get(videoAdInfo);
    }

    public final void a(zb2<go0> videoAdInfo, ln0 controlsState) {
        Intrinsics.checkNotNullParameter(videoAdInfo, "videoAdInfo");
        Intrinsics.checkNotNullParameter(controlsState, "controlsState");
        this.f16042a.put(videoAdInfo, controlsState);
    }
}
