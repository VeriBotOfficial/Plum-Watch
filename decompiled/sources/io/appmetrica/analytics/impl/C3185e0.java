package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.HashMap;

/* renamed from: io.appmetrica.analytics.impl.e0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3185e0 {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f18246a = new HashMap();

    public final synchronized C3160d0 a(C3215f5 c3215f5, PublicLogger publicLogger, Le le) {
        C3160d0 c3160d0;
        c3160d0 = (C3160d0) this.f18246a.get(c3215f5.toString());
        if (c3160d0 == null) {
            C3135c0 d = le.d();
            c3160d0 = new C3160d0(d.f18206a, d.b, new Tk(publicLogger, "[App Environment]"));
            this.f18246a.put(c3215f5.toString(), c3160d0);
        }
        return c3160d0;
    }

    public final synchronized void a(C3135c0 c3135c0, Le le) {
        le.a(c3135c0).b();
    }
}
