package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ModuleEvent;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* renamed from: io.appmetrica.analytics.impl.jd, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3322jd extends SafeRunnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3422nd f18342a;
    public final /* synthetic */ ModuleEvent b;

    public C3322jd(C3422nd c3422nd, ModuleEvent moduleEvent) {
        this.f18342a = c3422nd;
        this.b = moduleEvent;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        C3422nd.a(this.f18342a).reportEvent(this.b);
    }
}
