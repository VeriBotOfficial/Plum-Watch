package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class x71 {

    /* renamed from: a, reason: collision with root package name */
    private final o3 f17314a;
    private final String b;
    private final o8<?> c;
    private final y61 d;
    private final i81 e;
    private f81 f;

    public x71(o3 adConfiguration, String responseNativeType, o8<?> adResponse, y61 nativeAdResponse, i81 nativeCommonReportDataProvider, f81 f81Var) {
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(responseNativeType, "responseNativeType");
        Intrinsics.checkNotNullParameter(adResponse, "adResponse");
        Intrinsics.checkNotNullParameter(nativeAdResponse, "nativeAdResponse");
        Intrinsics.checkNotNullParameter(nativeCommonReportDataProvider, "nativeCommonReportDataProvider");
        this.f17314a = adConfiguration;
        this.b = responseNativeType;
        this.c = adResponse;
        this.d = nativeAdResponse;
        this.e = nativeCommonReportDataProvider;
        this.f = f81Var;
    }

    public final pp1 a() {
        pp1 a2 = this.e.a(this.c, this.f17314a, this.d);
        f81 f81Var = this.f;
        if (f81Var != null) {
            a2.b(f81Var.a(), "bind_type");
        }
        a2.a(this.b, "native_ad_type");
        gz1 r = this.f17314a.r();
        if (r != null) {
            a2.b(r.a().a(), "size_type");
            a2.b(Integer.valueOf(r.getWidth()), "width");
            a2.b(Integer.valueOf(r.getHeight()), "height");
        }
        a2.a(this.c.a());
        return a2;
    }

    public final void a(f81 bindType) {
        Intrinsics.checkNotNullParameter(bindType, "bindType");
        this.f = bindType;
    }
}
