package io.appmetrica.analytics.impl;

/* loaded from: classes6.dex */
public final class Td implements Pn {

    /* renamed from: a, reason: collision with root package name */
    public final String f18082a;

    public Td(String str) {
        this.f18082a = str;
    }

    @Override // io.appmetrica.analytics.impl.Pn
    public final Nn a(Object obj) {
        return obj == null ? new Nn(this, false, this.f18082a + " is null.") : new Nn(this, true, "");
    }

    public final String a() {
        return this.f18082a;
    }
}
