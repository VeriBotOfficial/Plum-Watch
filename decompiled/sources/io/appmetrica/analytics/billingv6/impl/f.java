package io.appmetrica.analytics.billingv6.impl;

import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* loaded from: classes6.dex */
public final class f extends SafeRunnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g f17653a;

    public f(g gVar) {
        this.f17653a = gVar;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        this.f17653a.f17654a.endConnection();
    }
}
