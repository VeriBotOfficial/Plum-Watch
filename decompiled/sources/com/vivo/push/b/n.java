package com.vivo.push.b;

/* compiled from: OnLogReceiveCommand.java */
/* loaded from: classes2.dex */
public final class n extends t {

    /* renamed from: a, reason: collision with root package name */
    private String f14051a;
    private int b;
    private boolean c;

    public n() {
        super(7);
        this.b = 0;
        this.c = false;
    }

    public final String e() {
        return this.f14051a;
    }

    public final void b(String str) {
        this.f14051a = str;
    }

    public final int f() {
        return this.b;
    }

    public final void a(int i) {
        this.b = i;
    }

    public final boolean g() {
        return this.c;
    }

    public final void h() {
        this.c = false;
    }

    @Override // com.vivo.push.b.t, com.vivo.push.v
    protected final void c(com.vivo.push.d dVar) {
        super.c(dVar);
        dVar.a("content", this.f14051a);
        dVar.a("log_level", this.b);
        dVar.a("is_server_log", this.c);
    }

    @Override // com.vivo.push.b.t, com.vivo.push.v
    protected final void d(com.vivo.push.d dVar) {
        super.d(dVar);
        this.f14051a = dVar.a("content");
        this.b = dVar.b("log_level", 0);
        this.c = dVar.e("is_server_log");
    }

    @Override // com.vivo.push.b.t, com.vivo.push.v
    public final String toString() {
        return "OnLogCommand";
    }
}
