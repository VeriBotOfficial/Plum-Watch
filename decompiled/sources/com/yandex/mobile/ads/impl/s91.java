package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class s91 {

    /* renamed from: a, reason: collision with root package name */
    private final v9 f16842a;
    private final f42 b;

    public s91(v9 adTracker, f42 targetUrlHandler) {
        Intrinsics.checkNotNullParameter(adTracker, "adTracker");
        Intrinsics.checkNotNullParameter(targetUrlHandler, "targetUrlHandler");
        this.f16842a = adTracker;
        this.b = targetUrlHandler;
    }

    public final r91 a(tp1 clickReporter) {
        Intrinsics.checkNotNullParameter(clickReporter, "clickReporter");
        return new r91(this.f16842a, this.b, clickReporter);
    }
}
