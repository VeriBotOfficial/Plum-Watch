package com.yandex.mobile.ads.impl;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class ah {

    /* renamed from: a, reason: collision with root package name */
    private final ts f15008a;
    private final String b;
    private final w1 c;
    private final s8 d;
    private x71 e;

    public /* synthetic */ ah(y4 y4Var, ts tsVar, String str) {
        this(y4Var, tsVar, str, y4Var.a(), y4Var.b());
    }

    public ah(y4 adInfoReportDataProviderFactory, ts adType, String str, w1 adAdapterReportDataProvider, s8 adResponseReportDataProvider) {
        Intrinsics.checkNotNullParameter(adInfoReportDataProviderFactory, "adInfoReportDataProviderFactory");
        Intrinsics.checkNotNullParameter(adType, "adType");
        Intrinsics.checkNotNullParameter(adAdapterReportDataProvider, "adAdapterReportDataProvider");
        Intrinsics.checkNotNullParameter(adResponseReportDataProvider, "adResponseReportDataProvider");
        this.f15008a = adType;
        this.b = str;
        this.c = adAdapterReportDataProvider;
        this.d = adResponseReportDataProvider;
    }

    public final pp1 a() {
        pp1 a2 = this.d.a();
        a2.b(this.f15008a.a(), "ad_type");
        a2.a(this.b, "ad_id");
        a2.a((Map<String, ? extends Object>) this.c.a());
        x71 x71Var = this.e;
        return x71Var != null ? qp1.a(a2, x71Var.a()) : a2;
    }

    public final void a(x71 reportParameterManager) {
        Intrinsics.checkNotNullParameter(reportParameterManager, "reportParameterManager");
        this.e = reportParameterManager;
    }
}
