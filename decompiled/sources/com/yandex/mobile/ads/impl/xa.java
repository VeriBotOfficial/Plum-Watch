package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.op1;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class xa implements zg1 {

    /* renamed from: a, reason: collision with root package name */
    private final op1.c f17320a;
    private final String b;

    public xa(op1.c status, String str) {
        Intrinsics.checkNotNullParameter(status, "status");
        this.f17320a = status;
        this.b = str;
    }

    @Override // com.yandex.mobile.ads.impl.zg1
    public final Map<String, Object> a(long j) {
        pp1 pp1Var = new pp1((Map) null, 3);
        pp1Var.b(this.b, "adapter");
        pp1Var.b(this.f17320a.a(), "status");
        pp1Var.b(Long.valueOf(j), "duration");
        return pp1Var.b();
    }
}
