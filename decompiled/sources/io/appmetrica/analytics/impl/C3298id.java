package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AdRevenue;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* renamed from: io.appmetrica.analytics.impl.id, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3298id extends SafeRunnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3422nd f18327a;
    public final /* synthetic */ AdRevenue b;
    public final /* synthetic */ boolean c;

    public C3298id(C3422nd c3422nd, AdRevenue adRevenue, boolean z) {
        this.f18327a = c3422nd;
        this.b = adRevenue;
        this.c = z;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        C3422nd.a(this.f18327a).reportAdRevenue(this.b, this.c);
    }
}
