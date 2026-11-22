package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AnrListener;

/* renamed from: io.appmetrica.analytics.impl.oc, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3446oc {

    /* renamed from: a, reason: collision with root package name */
    public int f18432a = 5;
    public final C3184e b;

    public C3446oc(InterfaceC3085a0 interfaceC3085a0) {
        this.b = new C3184e(new Ib(interfaceC3085a0));
    }

    public static final void b(AnrListener anrListener) {
        anrListener.onAppNotResponding();
    }

    public final void a(final AnrListener anrListener) {
        C3184e c3184e = this.b;
        c3184e.f18245a.add(new InterfaceC3134c() { // from class: io.appmetrica.analytics.impl.oc$$ExternalSyntheticLambda0
            @Override // io.appmetrica.analytics.impl.InterfaceC3134c
            public final void onAppNotResponding() {
                C3446oc.b(AnrListener.this);
            }
        });
    }
}
