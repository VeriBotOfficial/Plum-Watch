package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class mu1 {

    /* renamed from: a, reason: collision with root package name */
    private final z32 f16276a;

    public final boolean a(ju1 sdkConfiguration) {
        Intrinsics.checkNotNullParameter(sdkConfiguration, "sdkConfiguration");
        this.f16276a.getClass();
        return System.currentTimeMillis() >= sdkConfiguration.w();
    }

    public /* synthetic */ mu1() {
        this(new z32());
    }

    public mu1(z32 systemCurrentTimeProvider) {
        Intrinsics.checkNotNullParameter(systemCurrentTimeProvider, "systemCurrentTimeProvider");
        this.f16276a = systemCurrentTimeProvider;
    }
}
