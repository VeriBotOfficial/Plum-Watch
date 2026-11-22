package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* renamed from: io.appmetrica.analytics.impl.ld, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3372ld extends SafeRunnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3422nd f18378a;
    public final /* synthetic */ boolean b;

    public C3372ld(C3422nd c3422nd, boolean z) {
        this.f18378a = c3422nd;
        this.b = z;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        C3422nd.a(this.f18378a).b(this.b);
    }
}
