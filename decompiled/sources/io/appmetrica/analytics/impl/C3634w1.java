package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* renamed from: io.appmetrica.analytics.impl.w1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3634w1 extends SafeRunnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ F1 f18558a;

    public C3634w1(F1 f1) {
        this.f18558a = f1;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        synchronized (this.f18558a) {
            F1 f1 = this.f18558a;
            if (f1.c) {
                f1.b.onCreate();
            }
        }
    }
}
