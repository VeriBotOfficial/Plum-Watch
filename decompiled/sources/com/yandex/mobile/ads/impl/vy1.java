package com.yandex.mobile.ads.impl;

import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class vy1 implements z1 {
    private static final long b = TimeUnit.SECONDS.toMillis(5);

    /* renamed from: a, reason: collision with root package name */
    private final o8<?> f17204a;

    public vy1(o8<?> adResponse) {
        Intrinsics.checkNotNullParameter(adResponse, "adResponse");
        this.f17204a = adResponse;
    }

    @Override // com.yandex.mobile.ads.impl.z1
    public final long a() {
        Long K = this.f17204a.K();
        return K != null ? K.longValue() : b;
    }

    @Override // com.yandex.mobile.ads.impl.z1
    public final long a(long j) {
        Long K = this.f17204a.K();
        return K != null ? Math.min(j, K.longValue()) : j;
    }
}
