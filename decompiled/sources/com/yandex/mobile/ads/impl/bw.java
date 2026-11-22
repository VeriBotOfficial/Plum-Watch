package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class bw {

    /* renamed from: a, reason: collision with root package name */
    private final pw1 f15141a;

    public bw(pw1 sdkSettings) {
        Intrinsics.checkNotNullParameter(sdkSettings, "sdkSettings");
        this.f15141a = sdkSettings;
    }

    public final void a(boolean z) {
        this.f15141a.b(z);
    }

    public final hx a() {
        return new hx(this.f15141a.i());
    }
}
