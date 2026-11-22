package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class in2 implements r92 {

    /* renamed from: a, reason: collision with root package name */
    private final we f15836a;
    private final ju1 b;

    public in2(we appMetricaAdapter, Context context, ju1 ju1Var) {
        Intrinsics.checkNotNullParameter(appMetricaAdapter, "appMetricaAdapter");
        Intrinsics.checkNotNullParameter(context, "context");
        this.f15836a = appMetricaAdapter;
        this.b = ju1Var;
    }

    @Override // com.yandex.mobile.ads.impl.r92
    public final void setExperiments(String experiments) {
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        ju1 ju1Var = this.b;
        if (ju1Var == null || !ju1Var.B0()) {
            return;
        }
        this.f15836a.b(experiments);
    }

    @Override // com.yandex.mobile.ads.impl.r92
    public final void setTriggeredTestIds(Set<Long> testIds) {
        Intrinsics.checkNotNullParameter(testIds, "testIds");
        ju1 ju1Var = this.b;
        if (ju1Var == null || !ju1Var.B0()) {
            return;
        }
        this.f15836a.a(testIds);
    }
}
