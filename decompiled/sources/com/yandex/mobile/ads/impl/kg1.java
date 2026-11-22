package com.yandex.mobile.ads.impl;

import java.util.Map;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class kg1 {

    /* renamed from: a, reason: collision with root package name */
    private final String f16018a;
    private final hz0 b;

    public kg1(String str, hz0 mediationData) {
        Intrinsics.checkNotNullParameter(mediationData, "mediationData");
        this.f16018a = str;
        this.b = mediationData;
    }

    public final Map<String, String> a() {
        String str = this.f16018a;
        if (str != null && str.length() != 0) {
            return MapsKt.plus(this.b.d(), MapsKt.mapOf(TuplesKt.to("adf-resp_time", this.f16018a)));
        }
        return this.b.d();
    }
}
