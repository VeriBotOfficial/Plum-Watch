package com.vivo.push.b;

/* compiled from: OnDispatcherReceiveCommand.java */
/* loaded from: classes2.dex */
public final class l extends t {

    /* renamed from: a, reason: collision with root package name */
    private int f14049a;
    private int b;

    public l() {
        super(2016);
        this.f14049a = -1;
        this.b = -1;
    }

    @Override // com.vivo.push.b.t, com.vivo.push.v
    protected final void c(com.vivo.push.d dVar) {
        super.c(dVar);
        dVar.a("key_dispatch_environment", this.f14049a);
        dVar.a("key_dispatch_area", this.b);
    }

    @Override // com.vivo.push.b.t, com.vivo.push.v
    protected final void d(com.vivo.push.d dVar) {
        super.d(dVar);
        this.f14049a = dVar.b("key_dispatch_environment", 1);
        this.b = dVar.b("key_dispatch_area", 1);
    }

    public final int e() {
        return this.f14049a;
    }

    public final int f() {
        return this.b;
    }
}
