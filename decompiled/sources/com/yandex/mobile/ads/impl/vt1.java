package com.yandex.mobile.ads.impl;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class vt1 implements s8 {

    /* renamed from: a, reason: collision with root package name */
    private final o8<?> f17194a;

    public vt1(o8<?> adResponse) {
        Intrinsics.checkNotNullParameter(adResponse, "adResponse");
        this.f17194a = adResponse;
    }

    @Override // com.yandex.mobile.ads.impl.s8
    public final pp1 a() {
        pp1 pp1Var = new pp1((Map) null, 3);
        pp1Var.b(this.f17194a.m(), FirebaseAnalytics.Param.AD_SOURCE);
        pp1Var.b(this.f17194a.o(), "ad_type_format");
        pp1Var.b(this.f17194a.p(), "block_id");
        pp1Var.b(this.f17194a.p(), "ad_unit_id");
        pp1Var.b(this.f17194a.H(), "product_type");
        pp1Var.a(this.f17194a.L(), "server_log_id");
        pp1Var.b(this.f17194a.M().a().a(), "size_type");
        pp1Var.b(Integer.valueOf(this.f17194a.M().getWidth()), "width");
        pp1Var.b(Integer.valueOf(this.f17194a.M().getHeight()), "height");
        pp1Var.a(this.f17194a.a());
        return pp1Var;
    }
}
