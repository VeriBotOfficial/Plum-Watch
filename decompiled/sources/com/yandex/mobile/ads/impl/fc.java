package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class fc implements zb {

    /* renamed from: a, reason: collision with root package name */
    private final String f15473a;
    private final Runnable b;

    public fc(String request, Runnable adtuneRequestRunnable) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(adtuneRequestRunnable, "adtuneRequestRunnable");
        this.f15473a = request;
        this.b = adtuneRequestRunnable;
    }

    @Override // com.yandex.mobile.ads.impl.zb
    public final void a() {
        this.b.run();
    }

    @Override // com.yandex.mobile.ads.impl.zb
    public final boolean a(String str, String str2) {
        return Intrinsics.areEqual("mobileads", str) && Intrinsics.areEqual(this.f15473a, str2);
    }
}
