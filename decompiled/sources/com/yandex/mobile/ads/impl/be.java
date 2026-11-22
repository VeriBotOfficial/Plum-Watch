package com.yandex.mobile.ads.impl;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class be {

    /* renamed from: a, reason: collision with root package name */
    private final sp1 f15098a;

    public be(sp1 reporter) {
        Intrinsics.checkNotNullParameter(reporter, "reporter");
        this.f15098a = reporter;
    }

    public final void a(Map<Thread, StackTraceElement[]> traces) {
        Intrinsics.checkNotNullParameter(traces, "traces");
        this.f15098a.reportAnr(traces);
    }
}
