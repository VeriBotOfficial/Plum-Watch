package com.yandex.mobile.ads.impl;

import android.content.Context;
import io.appmetrica.analytics.AppMetricaLibraryAdapter;
import io.appmetrica.analytics.AppMetricaLibraryAdapterConfig;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class gd {
    private static final AtomicBoolean d = new AtomicBoolean(false);

    /* renamed from: a, reason: collision with root package name */
    private final jf f15577a;
    private final mt0 b;
    private final pw1 c;

    public final void a(Context context) {
        Object m14057constructorimpl;
        Intrinsics.checkNotNullParameter(context, "context");
        ju1 a2 = this.c.a(context);
        boolean z = a2 != null && a2.l();
        this.b.getClass();
        if (mt0.d(context) && !z && d.compareAndSet(false, true)) {
            kd configuration = this.f15577a.a(context);
            fd.f15477a.getClass();
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(configuration, "configuration");
            try {
                Result.Companion companion = Result.INSTANCE;
                AppMetricaLibraryAdapterConfig build = AppMetricaLibraryAdapterConfig.newConfigBuilder().withAdvIdentifiersTracking(configuration.a()).build();
                Intrinsics.checkNotNullExpressionValue(build, "build(...)");
                AppMetricaLibraryAdapter.activate(context, build);
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

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ gd() {
        /*
            r3 = this;
            com.yandex.mobile.ads.impl.jf r0 = new com.yandex.mobile.ads.impl.jf
            r0.<init>()
            com.yandex.mobile.ads.impl.mt0 r1 = new com.yandex.mobile.ads.impl.mt0
            r1.<init>()
            int r2 = com.yandex.mobile.ads.impl.pw1.l
            com.yandex.mobile.ads.impl.pw1 r2 = com.yandex.mobile.ads.impl.pw1.a.a()
            r3.<init>(r0, r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.gd.<init>():void");
    }

    public gd(jf appMetricaPolicyConfigurator, mt0 manifestAnalyzer, pw1 sdkSettings) {
        Intrinsics.checkNotNullParameter(appMetricaPolicyConfigurator, "appMetricaPolicyConfigurator");
        Intrinsics.checkNotNullParameter(manifestAnalyzer, "manifestAnalyzer");
        Intrinsics.checkNotNullParameter(sdkSettings, "sdkSettings");
        this.f15577a = appMetricaPolicyConfigurator;
        this.b = manifestAnalyzer;
        this.c = sdkSettings;
    }
}
