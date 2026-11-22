package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.uk, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3603uk {

    /* renamed from: a, reason: collision with root package name */
    public final Un f18540a;

    public C3603uk(Un un) {
        this.f18540a = un;
    }

    public final long a() {
        long optLong;
        Un un = this.f18540a;
        synchronized (un) {
            optLong = un.f18102a.a().optLong("session_id", -1L);
        }
        long j = optLong >= 10000000000L ? 1 + optLong : 10000000000L;
        this.f18540a.c(j);
        return j;
    }
}
