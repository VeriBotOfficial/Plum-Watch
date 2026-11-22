package io.appmetrica.analytics.impl;

/* loaded from: classes6.dex */
public final class Em implements InterfaceC3307in {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC3307in f17837a;
    public final Object b;

    public Em(InterfaceC3307in interfaceC3307in, Object obj) {
        this.f17837a = interfaceC3307in;
        this.b = obj;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC3307in
    public final Object a(Object obj) {
        return obj != this.f17837a.a(obj) ? this.b : obj;
    }
}
