package com.yandex.mobile.ads.impl;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class cj1 {

    /* renamed from: a, reason: collision with root package name */
    private final v4 f15191a;
    private final go0 b;

    public cj1(v4 playingAdInfo, go0 playingVideoAd) {
        Intrinsics.checkNotNullParameter(playingAdInfo, "playingAdInfo");
        Intrinsics.checkNotNullParameter(playingVideoAd, "playingVideoAd");
        this.f15191a = playingAdInfo;
        this.b = playingVideoAd;
    }

    public final v4 a() {
        return this.f15191a;
    }

    public final go0 b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cj1)) {
            return false;
        }
        cj1 cj1Var = (cj1) obj;
        return Intrinsics.areEqual(this.f15191a, cj1Var.f15191a) && Intrinsics.areEqual(this.b, cj1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f15191a.hashCode() * 31);
    }

    public final String toString() {
        return "PlayingAdData(playingAdInfo=" + this.f15191a + ", playingVideoAd=" + this.b + Separators.RPAREN;
    }

    public final v4 c() {
        return this.f15191a;
    }

    public final go0 d() {
        return this.b;
    }
}
