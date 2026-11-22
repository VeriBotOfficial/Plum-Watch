package io.appmetrica.analytics.billingv6.impl;

import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* loaded from: classes6.dex */
public final class n extends SafeRunnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p f17661a;
    public final /* synthetic */ k b;

    public n(p pVar, k kVar) {
        this.f17661a = pVar;
        this.b = kVar;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        this.f17661a.e.a(this.b);
    }
}
