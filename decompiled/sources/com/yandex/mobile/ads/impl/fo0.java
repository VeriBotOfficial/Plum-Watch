package com.yandex.mobile.ads.impl;

import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class fo0 implements ia2 {

    /* renamed from: a, reason: collision with root package name */
    private final ha2 f15514a;

    public fo0(ha2 requestConfiguration) {
        Intrinsics.checkNotNullParameter(requestConfiguration, "requestConfiguration");
        this.f15514a = requestConfiguration;
    }

    @Override // com.yandex.mobile.ads.impl.ia2
    public final Map<String, String> a() {
        a8 a8Var = new a8(this.f15514a.a());
        Map createMapBuilder = MapsKt.createMapBuilder();
        Map<String, String> b = this.f15514a.b();
        if (b != null) {
            createMapBuilder.putAll(b);
        }
        String e = a8Var.e();
        if (e != null) {
            createMapBuilder.put("video-session-id", e);
        }
        return MapsKt.build(createMapBuilder);
    }
}
