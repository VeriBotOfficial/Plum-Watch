package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class ku1 {

    /* renamed from: a, reason: collision with root package name */
    private final lu1 f16053a;
    private final pu1 b;

    public ku1(jf appMetricaPolicyConfigurator, lu1 sdkConfigurationChangeListener, pu1 sdkConfigurationProvider) {
        Intrinsics.checkNotNullParameter(appMetricaPolicyConfigurator, "appMetricaPolicyConfigurator");
        Intrinsics.checkNotNullParameter(sdkConfigurationChangeListener, "sdkConfigurationChangeListener");
        Intrinsics.checkNotNullParameter(sdkConfigurationProvider, "sdkConfigurationProvider");
        this.f16053a = sdkConfigurationChangeListener;
        this.b = sdkConfigurationProvider;
    }

    public final void a() {
        this.b.a(this.f16053a);
    }
}
