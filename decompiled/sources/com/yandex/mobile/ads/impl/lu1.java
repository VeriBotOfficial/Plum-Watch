package com.yandex.mobile.ads.impl;

import android.content.Context;
import io.appmetrica.analytics.AppMetricaLibraryAdapter;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class lu1 implements zu1 {

    /* renamed from: a, reason: collision with root package name */
    private final sp1 f16173a;
    private final jf b;

    public lu1(s01 s01Var, jf appMetricaPolicyConfigurator) {
        Intrinsics.checkNotNullParameter(appMetricaPolicyConfigurator, "appMetricaPolicyConfigurator");
        this.f16173a = s01Var;
        this.b = appMetricaPolicyConfigurator;
    }

    @Override // com.yandex.mobile.ads.impl.zu1
    public final void a(Context context, ju1 sdkConfiguration) {
        Object m14057constructorimpl;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sdkConfiguration, "sdkConfiguration");
        boolean b = this.b.b(context);
        kd configuration = this.b.a(context);
        sp1 sp1Var = this.f16173a;
        if (sp1Var != null) {
            sp1Var.a(b);
        }
        fd.f15477a.getClass();
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        try {
            Result.Companion companion = Result.INSTANCE;
            AppMetricaLibraryAdapter.setAdvIdentifiersTracking(configuration.a());
            m14057constructorimpl = Result.m14057constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m14057constructorimpl = Result.m14057constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m14060exceptionOrNullimpl(m14057constructorimpl) != null) {
            sp0.b(new Object[0]);
        }
    }
}
