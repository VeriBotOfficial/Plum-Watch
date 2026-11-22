package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class jo0 {

    /* renamed from: a, reason: collision with root package name */
    private final ko0 f15935a;
    private final zz b;

    public jo0(ko0 instreamVideoAdControlsStateStorage, aj1 playerVolumeProvider) {
        Intrinsics.checkNotNullParameter(instreamVideoAdControlsStateStorage, "instreamVideoAdControlsStateStorage");
        Intrinsics.checkNotNullParameter(playerVolumeProvider, "playerVolumeProvider");
        this.f15935a = instreamVideoAdControlsStateStorage;
        this.b = new zz(playerVolumeProvider);
    }

    public final ln0 a(zb2<go0> videoAdInfo) {
        Intrinsics.checkNotNullParameter(videoAdInfo, "videoAdInfo");
        ln0 a2 = this.f15935a.a(videoAdInfo);
        return a2 == null ? this.b.a() : a2;
    }
}
