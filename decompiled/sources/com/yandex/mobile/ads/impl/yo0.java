package com.yandex.mobile.ads.impl;

import java.util.Map;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class yo0 implements kq1 {

    /* renamed from: a, reason: collision with root package name */
    private final oi2 f17443a;

    public yo0(oi2 requestConfig) {
        Intrinsics.checkNotNullParameter(requestConfig, "requestConfig");
        this.f17443a = requestConfig;
    }

    @Override // com.yandex.mobile.ads.impl.kq1
    public final Map<String, Object> a() {
        return MapsKt.mapOf(TuplesKt.to("ad_type", ts.h.a()), TuplesKt.to("page_id", this.f17443a.a()), TuplesKt.to("category_id", this.f17443a.b()));
    }
}
