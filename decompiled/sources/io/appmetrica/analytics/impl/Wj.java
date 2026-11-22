package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;

/* loaded from: classes6.dex */
public final class Wj {

    /* renamed from: a, reason: collision with root package name */
    public final SystemTimeProvider f18125a;
    public final long b;

    public Wj() {
        SystemTimeProvider systemTimeProvider = new SystemTimeProvider();
        this.f18125a = systemTimeProvider;
        this.b = systemTimeProvider.currentTimeMillis();
    }
}
