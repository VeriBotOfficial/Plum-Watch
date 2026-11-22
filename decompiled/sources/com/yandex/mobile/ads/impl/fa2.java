package com.yandex.mobile.ads.impl;

import java.util.Map;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class fa2 implements zg1 {

    /* renamed from: a, reason: collision with root package name */
    private final String f15467a;
    private final sb2 b;

    public fa2(String responseStatus, sb2 sb2Var) {
        Intrinsics.checkNotNullParameter(responseStatus, "responseStatus");
        this.f15467a = responseStatus;
        this.b = sb2Var;
    }

    @Override // com.yandex.mobile.ads.impl.zg1
    public final Map<String, Object> a(long j) {
        Map<String, Object> mutableMapOf = MapsKt.mutableMapOf(TuplesKt.to("duration", Long.valueOf(j)), TuplesKt.to("status", this.f15467a));
        sb2 sb2Var = this.b;
        if (sb2Var != null) {
            mutableMapOf.put("failure_reason", sb2Var.a());
        }
        return mutableMapOf;
    }
}
