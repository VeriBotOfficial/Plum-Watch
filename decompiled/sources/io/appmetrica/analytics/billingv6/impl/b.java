package io.appmetrica.analytics.billingv6.impl;

import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* loaded from: classes6.dex */
public final class b extends SafeRunnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d f17649a;
    public final /* synthetic */ p b;

    public b(d dVar, p pVar) {
        this.f17649a = dVar;
        this.b = pVar;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        this.f17649a.d.a(this.b);
    }
}
