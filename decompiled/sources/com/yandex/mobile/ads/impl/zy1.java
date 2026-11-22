package com.yandex.mobile.ads.impl;

import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class zy1 implements mz {
    private static final long b = TimeUnit.SECONDS.toMillis(5);

    /* renamed from: a, reason: collision with root package name */
    private final o8<?> f17570a;

    public zy1(o8<?> adResponse) {
        Intrinsics.checkNotNullParameter(adResponse, "adResponse");
        this.f17570a = adResponse;
    }

    @Override // com.yandex.mobile.ads.impl.mz
    public final long a() {
        Long K = this.f17570a.K();
        return K != null ? K.longValue() : b;
    }
}
