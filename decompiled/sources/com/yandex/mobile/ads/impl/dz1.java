package com.yandex.mobile.ads.impl;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class dz1 {

    /* renamed from: a, reason: collision with root package name */
    private final Object f15327a = new Object();
    private boolean b;

    public final void a(Runnable runnable) {
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        synchronized (this.f15327a) {
            if (this.b) {
                return;
            }
            this.b = true;
            Unit unit = Unit.INSTANCE;
            runnable.run();
        }
    }
}
