package com.yandex.mobile.ads.impl;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class by0 implements s8 {

    /* renamed from: a, reason: collision with root package name */
    private final o8<?> f15143a;

    public by0(o8<?> adResponse) {
        Intrinsics.checkNotNullParameter(adResponse, "adResponse");
        this.f15143a = adResponse;
    }

    @Override // com.yandex.mobile.ads.impl.s8
    public final pp1 a() {
        pp1 pp1Var = new pp1(new HashMap(), 2);
        pp1Var.b(this.f15143a.m(), FirebaseAnalytics.Param.AD_SOURCE);
        pp1Var.b(this.f15143a.p(), "block_id");
        pp1Var.b(this.f15143a.p(), "ad_unit_id");
        pp1Var.a(this.f15143a.L(), "server_log_id");
        pp1Var.a(this.f15143a.a());
        return pp1Var;
    }
}
