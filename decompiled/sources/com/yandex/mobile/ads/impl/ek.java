package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.op1;
import com.yandex.mobile.ads.impl.p82;
import java.util.HashMap;
import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public abstract class ek<T> implements lq1<o3, o8<T>> {

    /* renamed from: a, reason: collision with root package name */
    private final c8 f15390a;
    private final q8<T> b;

    public interface a<K> {
        pp1 a(xq1<o8<K>> xq1Var, o3 o3Var);
    }

    public ek(a<T> responseReportDataProvider) {
        Intrinsics.checkNotNullParameter(responseReportDataProvider, "responseReportDataProvider");
        this.f15390a = new c8();
        this.b = new q8<>(responseReportDataProvider);
    }

    @Override // com.yandex.mobile.ads.impl.lq1
    public final op1 a(o3 o3Var) {
        o3 adConfiguration = o3Var;
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        pp1 a2 = a2(adConfiguration);
        op1.b bVar = op1.b.k;
        Map<String, Object> b = a2.b();
        return new op1(bVar.a(), (Map<String, Object>) MapsKt.toMutableMap(b), df1.a(a2, bVar, "reportType", b, "reportData"));
    }

    /* renamed from: a, reason: avoid collision after fix types in other method */
    protected pp1 a2(o3 adConfiguration) {
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        pp1 pp1Var = new pp1(new HashMap(), 2);
        v7 a2 = adConfiguration.a();
        if (a2 != null) {
            pp1Var = qp1.a(pp1Var, this.f15390a.a(a2));
        }
        pp1Var.b(adConfiguration.c(), "block_id");
        pp1Var.b(adConfiguration.c(), "ad_unit_id");
        pp1Var.b(adConfiguration.b().a(), "ad_type");
        gz1 r = adConfiguration.r();
        if (r != null) {
            pp1Var.b(r.a().a(), "size_type");
        }
        pp1Var.b(Boolean.valueOf(adConfiguration.t() == p82.a.c), "is_passback");
        return pp1Var;
    }

    @Override // com.yandex.mobile.ads.impl.lq1
    public final op1 a(xq1 xq1Var, int i, o3 o3Var) {
        o3 adConfiguration = o3Var;
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        pp1 a2 = a(i, adConfiguration, xq1Var);
        op1.b bVar = op1.b.l;
        Map<String, Object> b = a2.b();
        return new op1(bVar.a(), (Map<String, Object>) MapsKt.toMutableMap(b), df1.a(a2, bVar, "reportType", b, "reportData"));
    }

    protected pp1 a(int i, o3 adConfiguration, xq1 xq1Var) {
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        return this.b.a(i, adConfiguration, xq1Var);
    }
}
