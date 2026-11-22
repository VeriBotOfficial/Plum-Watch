package com.yandex.mobile.ads.impl;

import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class ey0 implements w1 {

    /* renamed from: a, reason: collision with root package name */
    private final qx0<?> f15436a;
    private final dy0 b;

    public ey0(qx0<?> qx0Var, dy0 mediatedAdapterInfoReportDataProvider) {
        Intrinsics.checkNotNullParameter(mediatedAdapterInfoReportDataProvider, "mediatedAdapterInfoReportDataProvider");
        this.f15436a = qx0Var;
        this.b = mediatedAdapterInfoReportDataProvider;
    }

    @Override // com.yandex.mobile.ads.impl.w1
    public final Map<String, Object> a() {
        pp1 pp1Var = new pp1((Map) null, 3);
        qx0<?> qx0Var = this.f15436a;
        if (qx0Var != null) {
            lz0 c = qx0Var.c();
            tx0 a2 = this.f15436a.a();
            pp1Var.b(c.e(), "adapter");
            pp1Var.b(c.i(), "adapter_parameters");
            this.b.getClass();
            pp1Var.a(new HashMap(dy0.a(a2)));
        }
        return pp1Var.b();
    }
}
