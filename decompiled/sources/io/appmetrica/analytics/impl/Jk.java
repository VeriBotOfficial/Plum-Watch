package io.appmetrica.analytics.impl;

/* loaded from: classes6.dex */
public final class Jk implements Pn {

    /* renamed from: a, reason: collision with root package name */
    public final C3484q0 f17924a;

    public Jk(C3484q0 c3484q0) {
        this.f17924a = c3484q0;
    }

    @Override // io.appmetrica.analytics.impl.Pn
    public final Nn a(Void r3) {
        boolean z;
        this.f17924a.getClass();
        synchronized (C3459p0.class) {
            z = C3459p0.f;
        }
        return z ? new Nn(this, true, "") : new Nn(this, false, "AppMetrica isn't initialized. Use AppMetrica#activate(android.content.Context, String) method to activate.");
    }

    public final Nn a() {
        return a((Void) null);
    }
}
