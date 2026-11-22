package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;

/* renamed from: io.appmetrica.analytics.impl.v4, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3612v4 {

    /* renamed from: a, reason: collision with root package name */
    public final SystemTimeProvider f18545a;

    public C3612v4() {
        this(new SystemTimeProvider());
    }

    public final void a() {
        this.f18545a.elapsedRealtime();
    }

    public C3612v4(SystemTimeProvider systemTimeProvider) {
        this.f18545a = systemTimeProvider;
    }
}
