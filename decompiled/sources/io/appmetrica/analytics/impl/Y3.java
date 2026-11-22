package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.toggle.SimpleThreadSafeToggle;

/* loaded from: classes6.dex */
public final class Y3 extends SimpleThreadSafeToggle {

    /* renamed from: a, reason: collision with root package name */
    public final Oe f18147a;

    public Y3(Oe oe) {
        super(oe.e(), "[ClientApiTrackingStatusToggle]");
        this.f18147a = oe;
    }

    public final void a(boolean z) {
        updateState(z);
        this.f18147a.f(z);
    }
}
