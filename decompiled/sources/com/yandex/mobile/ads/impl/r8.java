package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.ek;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class r8 implements ek.a<String> {

    /* renamed from: a, reason: collision with root package name */
    private final wq f16741a;

    @Override // com.yandex.mobile.ads.impl.ek.a
    public final pp1 a(xq1<o8<String>> xq1Var, o3 adConfiguration) {
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        return this.f16741a.a(xq1Var != null ? xq1Var.f17360a : null, adConfiguration);
    }

    public /* synthetic */ r8() {
        this(new wq());
    }

    public r8(wq commonReportDataProvider) {
        Intrinsics.checkNotNullParameter(commonReportDataProvider, "commonReportDataProvider");
        this.f16741a = commonReportDataProvider;
    }
}
