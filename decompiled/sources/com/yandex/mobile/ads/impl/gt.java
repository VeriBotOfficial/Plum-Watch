package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class gt {

    /* renamed from: a, reason: collision with root package name */
    private final bv1 f15626a;
    private final List<zb2<go0>> b;
    private final List<go0> c;
    private final String d;
    private final p2 e;
    private final ht f;
    private final long g;

    public gt(bv1 sdkEnvironmentModule, ArrayList videoAdInfoList, ArrayList videoAds, String type, p2 adBreak, ht adBreakPosition, long j) {
        Intrinsics.checkNotNullParameter(sdkEnvironmentModule, "sdkEnvironmentModule");
        Intrinsics.checkNotNullParameter(videoAdInfoList, "videoAdInfoList");
        Intrinsics.checkNotNullParameter(videoAds, "videoAds");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(adBreak, "adBreak");
        Intrinsics.checkNotNullParameter(adBreakPosition, "adBreakPosition");
        this.f15626a = sdkEnvironmentModule;
        this.b = videoAdInfoList;
        this.c = videoAds;
        this.d = type;
        this.e = adBreak;
        this.f = adBreakPosition;
        this.g = j;
    }

    public final void a(a00 a00Var) {
    }

    public final a00 c() {
        return null;
    }

    public final bv1 d() {
        return this.f15626a;
    }

    public final List<zb2<go0>> f() {
        return this.b;
    }

    public final List<go0> g() {
        return this.c;
    }

    public final String e() {
        return this.d;
    }

    public final p2 a() {
        return this.e;
    }

    public final ht b() {
        return this.f;
    }

    public final String toString() {
        return "ad_break_#" + this.g;
    }
}
