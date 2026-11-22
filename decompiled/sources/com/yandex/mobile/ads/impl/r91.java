package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class r91 implements ff1 {

    /* renamed from: a, reason: collision with root package name */
    private final v9 f16745a;
    private final f42 b;
    private final tp1 c;

    public r91(v9 adTracker, f42 targetUrlHandler, tp1 reporter) {
        Intrinsics.checkNotNullParameter(adTracker, "adTracker");
        Intrinsics.checkNotNullParameter(targetUrlHandler, "targetUrlHandler");
        Intrinsics.checkNotNullParameter(reporter, "reporter");
        this.f16745a = adTracker;
        this.b = targetUrlHandler;
        this.c = reporter;
    }

    @Override // com.yandex.mobile.ads.impl.ff1
    public final void a(String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        this.f16745a.a(url, this.b, this.c);
    }
}
