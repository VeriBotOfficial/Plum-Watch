package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ICrashTransformer;

/* renamed from: io.appmetrica.analytics.impl.t6, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC3564t6 implements Ma {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC3539s6 f18508a;
    public final ICrashTransformer b;
    public final T9 c;

    public AbstractC3564t6(InterfaceC3539s6 interfaceC3539s6, ICrashTransformer iCrashTransformer, T9 t9) {
        this.f18508a = interfaceC3539s6;
        this.b = iCrashTransformer;
        this.c = t9;
    }

    @Override // io.appmetrica.analytics.impl.Ma
    public final void a(Throwable th, S s) {
        if (this.f18508a.a(th)) {
            ICrashTransformer iCrashTransformer = this.b;
            if (iCrashTransformer == null || th == null || (th = iCrashTransformer.process(th)) != null) {
                C3432nn a2 = AbstractC3507qn.a(th, s, null, (String) this.c.b.a(), (Boolean) this.c.c.a());
                C3346kc c3346kc = (C3346kc) ((C3575th) this).d;
                c3346kc.f18520a.a().b(c3346kc.b).a(a2);
            }
        }
    }

    public final InterfaceC3539s6 b() {
        return this.f18508a;
    }

    public final ICrashTransformer a() {
        return this.b;
    }
}
