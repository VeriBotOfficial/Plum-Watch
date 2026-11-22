package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class h2 {

    /* renamed from: a, reason: collision with root package name */
    private final d2 f15644a;
    private final k2 b;
    private final j2 c;

    public /* synthetic */ h2(Context context) {
        this(context, new d2(context), new k2(context), new j2(context));
    }

    public h2(Context context, d2 adBlockerDetectorHttpUsageChecker, k2 adBlockerStateProvider, j2 adBlockerStateExpiredValidator) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adBlockerDetectorHttpUsageChecker, "adBlockerDetectorHttpUsageChecker");
        Intrinsics.checkNotNullParameter(adBlockerStateProvider, "adBlockerStateProvider");
        Intrinsics.checkNotNullParameter(adBlockerStateExpiredValidator, "adBlockerStateExpiredValidator");
        this.f15644a = adBlockerDetectorHttpUsageChecker;
        this.b = adBlockerStateProvider;
        this.c = adBlockerStateExpiredValidator;
    }

    public final g2 a() {
        i2 a2 = this.b.a();
        if (!this.c.a(a2)) {
            return null;
        }
        if (this.f15644a.a(a2)) {
            return g2.c;
        }
        return g2.b;
    }
}
