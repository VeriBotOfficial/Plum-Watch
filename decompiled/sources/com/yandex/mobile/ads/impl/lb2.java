package com.yandex.mobile.ads.impl;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class lb2 {

    /* renamed from: a, reason: collision with root package name */
    private final List<zb2<kb1>> f16097a;
    private final ag2 b;
    private final xj0 c;

    public lb2(List<zb2<kb1>> videoAdsInfo, ag2 ag2Var, xj0 xj0Var) {
        Intrinsics.checkNotNullParameter(videoAdsInfo, "videoAdsInfo");
        this.f16097a = videoAdsInfo;
        this.b = ag2Var;
        this.c = xj0Var;
    }

    public static lb2 a(lb2 lb2Var, List videoAdsInfo) {
        ag2 ag2Var = lb2Var.b;
        xj0 xj0Var = lb2Var.c;
        lb2Var.getClass();
        Intrinsics.checkNotNullParameter(videoAdsInfo, "videoAdsInfo");
        return new lb2(videoAdsInfo, ag2Var, xj0Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lb2)) {
            return false;
        }
        lb2 lb2Var = (lb2) obj;
        return Intrinsics.areEqual(this.f16097a, lb2Var.f16097a) && Intrinsics.areEqual(this.b, lb2Var.b) && Intrinsics.areEqual(this.c, lb2Var.c);
    }

    public final int hashCode() {
        int hashCode = this.f16097a.hashCode() * 31;
        ag2 ag2Var = this.b;
        int hashCode2 = (hashCode + (ag2Var == null ? 0 : ag2Var.hashCode())) * 31;
        xj0 xj0Var = this.c;
        return hashCode2 + (xj0Var != null ? xj0Var.hashCode() : 0);
    }

    public final String toString() {
        return "Video(videoAdsInfo=" + this.f16097a + ", videoSettings=" + this.b + ", preview=" + this.c + Separators.RPAREN;
    }

    public final List<zb2<kb1>> c() {
        return this.f16097a;
    }

    public final ag2 d() {
        return this.b;
    }

    public final xj0 a() {
        return this.c;
    }

    public final zb2<kb1> b() {
        return (zb2) CollectionsKt.first((List) this.f16097a);
    }
}
