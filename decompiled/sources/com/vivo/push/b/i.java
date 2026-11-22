package com.vivo.push.b;

/* compiled from: OnAppReceiveCommand.java */
/* loaded from: classes2.dex */
public final class i extends t {

    /* renamed from: a, reason: collision with root package name */
    private String f14047a;
    private String b;
    private String c;
    private String d;

    public i(int i) {
        super(i);
    }

    public final String e() {
        return this.f14047a;
    }

    public final String f() {
        return this.c;
    }

    @Override // com.vivo.push.b.t, com.vivo.push.v
    protected final void c(com.vivo.push.d dVar) {
        super.c(dVar);
        dVar.a("app_id", this.f14047a);
        dVar.a("client_id", this.b);
        dVar.a("client_token", this.c);
        dVar.a("client_token_validity_period", this.d);
    }

    @Override // com.vivo.push.b.t, com.vivo.push.v
    protected final void d(com.vivo.push.d dVar) {
        super.d(dVar);
        this.f14047a = dVar.a("app_id");
        this.b = dVar.a("client_id");
        this.c = dVar.a("client_token");
        this.d = dVar.a("client_token_validity_period");
    }

    @Override // com.vivo.push.b.t, com.vivo.push.v
    public final String toString() {
        return "OnBindCommand";
    }
}
