package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class jn0 {

    /* renamed from: a, reason: collision with root package name */
    private final kn0 f15933a;

    public jn0(gt coreInstreamAdBreak, zb2<go0> videoAdInfo) {
        Intrinsics.checkNotNullParameter(coreInstreamAdBreak, "coreInstreamAdBreak");
        Intrinsics.checkNotNullParameter(videoAdInfo, "videoAdInfo");
        this.f15933a = new kn0(coreInstreamAdBreak, videoAdInfo);
    }

    public final void a(ob2 uiElements) {
        Intrinsics.checkNotNullParameter(uiElements, "uiElements");
        uiElements.a().setTag(this.f15933a.a());
    }
}
