package io.appmetrica.analytics.impl;

import java.util.Collection;

/* loaded from: classes6.dex */
public final class Qd implements Pn {

    /* renamed from: a, reason: collision with root package name */
    public final String f18029a;

    public Qd(String str) {
        this.f18029a = str;
    }

    @Override // io.appmetrica.analytics.impl.Pn
    public final Nn a(Collection<Object> collection) {
        return In.a((Collection) collection) ? new Nn(this, false, this.f18029a + " is null or empty.") : new Nn(this, true, "");
    }
}
