package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class d22 {

    /* renamed from: a, reason: collision with root package name */
    private final ic f15240a;

    public d22(ic advertiserPresentController) {
        Intrinsics.checkNotNullParameter(advertiserPresentController, "advertiserPresentController");
        this.f15240a = advertiserPresentController;
    }

    public final c22 a(zb2<go0> videoAdInfo) {
        Intrinsics.checkNotNullParameter(videoAdInfo, "videoAdInfo");
        return videoAdInfo.f() != null ? c22.c : this.f15240a.a() ? c22.d : c22.b;
    }
}
