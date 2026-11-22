package com.yandex.mobile.ads.impl;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class bj1 {

    /* renamed from: a, reason: collision with root package name */
    private final u4 f15114a;
    private final go0 b;

    public bj1(u4 playingAdInfo, go0 playingVideoAd) {
        Intrinsics.checkNotNullParameter(playingAdInfo, "playingAdInfo");
        Intrinsics.checkNotNullParameter(playingVideoAd, "playingVideoAd");
        this.f15114a = playingAdInfo;
        this.b = playingVideoAd;
    }

    public final u4 a() {
        return this.f15114a;
    }

    public final go0 b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bj1)) {
            return false;
        }
        bj1 bj1Var = (bj1) obj;
        return Intrinsics.areEqual(this.f15114a, bj1Var.f15114a) && Intrinsics.areEqual(this.b, bj1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f15114a.hashCode() * 31);
    }

    public final String toString() {
        return "PlayingAdData(playingAdInfo=" + this.f15114a + ", playingVideoAd=" + this.b + Separators.RPAREN;
    }

    public final u4 c() {
        return this.f15114a;
    }

    public final go0 d() {
        return this.b;
    }
}
