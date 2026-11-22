package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* renamed from: io.appmetrica.analytics.impl.kd, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3347kd extends SafeRunnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3422nd f18362a;
    public final /* synthetic */ int b;
    public final /* synthetic */ String c;

    public C3347kd(C3422nd c3422nd, int i, String str) {
        this.f18362a = c3422nd;
        this.b = i;
        this.c = str;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        C3422nd.a(this.f18362a).a(new M9(this.b, this.c));
    }
}
