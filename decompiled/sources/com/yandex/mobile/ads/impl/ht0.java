package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class ht0 {

    /* renamed from: a, reason: collision with root package name */
    private final it0 f15725a = new it0();
    private final y42 b = new y42();

    public final void a(Runnable runnable) {
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        this.b.getClass();
        if (y42.a()) {
            runnable.run();
        } else {
            this.f15725a.a(runnable);
        }
    }

    public final void a() {
        this.f15725a.a();
    }
}
