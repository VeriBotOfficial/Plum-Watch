package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class kf {

    /* renamed from: a, reason: collision with root package name */
    private final jf f16013a;
    private final ie b;
    private final ue c;

    public kf(jf appMetricaPolicyConfigurator, ie appAdAnalyticsActivator, ue appMetricaAdapter) {
        Intrinsics.checkNotNullParameter(appMetricaPolicyConfigurator, "appMetricaPolicyConfigurator");
        Intrinsics.checkNotNullParameter(appAdAnalyticsActivator, "appAdAnalyticsActivator");
        Intrinsics.checkNotNullParameter(appMetricaAdapter, "appMetricaAdapter");
        this.f16013a = appMetricaPolicyConfigurator;
        this.b = appAdAnalyticsActivator;
        this.c = appMetricaAdapter;
    }

    public final sp1 a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return this.c.a(context, pa.a(context) ? "322a737a-a0ca-44e0-bc85-649b1c7c1db6" : "478cb909-6ad1-4e12-84cc-b3629a789f93", this.f16013a, this.b);
    }
}
