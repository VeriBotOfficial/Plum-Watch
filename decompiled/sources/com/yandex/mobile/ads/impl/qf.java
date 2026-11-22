package com.yandex.mobile.ads.impl;

import io.appmetrica.analytics.IReporter;
import java.util.Map;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class qf implements sp1 {

    /* renamed from: a, reason: collision with root package name */
    private final Lazy f16664a;

    public qf(Lazy<? extends IReporter> lazyReporter) {
        Intrinsics.checkNotNullParameter(lazyReporter, "lazyReporter");
        this.f16664a = lazyReporter;
    }

    @Override // com.yandex.mobile.ads.impl.sp1
    public final void a(op1 report) {
        Intrinsics.checkNotNullParameter(report, "report");
        try {
            ((IReporter) this.f16664a.getValue()).reportEvent(report.c(), report.b());
        } catch (Throwable unused) {
            sp0.c(new Object[0]);
        }
    }

    @Override // com.yandex.mobile.ads.impl.sp1
    public final void reportAnr(Map<Thread, StackTraceElement[]> traces) {
        Intrinsics.checkNotNullParameter(traces, "traces");
        try {
            ((IReporter) this.f16664a.getValue()).reportAnr(traces);
        } catch (Throwable unused) {
            sp0.c(new Object[0]);
        }
    }

    @Override // com.yandex.mobile.ads.impl.sp1
    public final void reportError(String message, Throwable error) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(error, "error");
        try {
            ((IReporter) this.f16664a.getValue()).reportError(message, error);
        } catch (Throwable unused) {
            sp0.c(new Object[0]);
        }
    }

    @Override // com.yandex.mobile.ads.impl.sp1
    public final void reportUnhandledException(Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        try {
            ((IReporter) this.f16664a.getValue()).reportUnhandledException(throwable);
        } catch (Throwable unused) {
            sp0.c(new Object[0]);
        }
    }

    @Override // com.yandex.mobile.ads.impl.sp1
    public final void a(boolean z) {
        try {
            ((IReporter) this.f16664a.getValue()).setDataSendingEnabled(z);
        } catch (Throwable unused) {
            sp0.c(new Object[0]);
        }
    }
}
