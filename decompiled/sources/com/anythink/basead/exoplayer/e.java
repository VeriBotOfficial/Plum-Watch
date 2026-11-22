package com.anythink.basead.exoplayer;

/* loaded from: classes11.dex */
final class e implements com.anythink.basead.exoplayer.k.n {

    /* renamed from: a, reason: collision with root package name */
    private final com.anythink.basead.exoplayer.k.z f2441a;
    private final a b;
    private y c;
    private com.anythink.basead.exoplayer.k.n d;

    public interface a {
        void a(v vVar);
    }

    public e(a aVar, com.anythink.basead.exoplayer.k.c cVar) {
        this.b = aVar;
        this.f2441a = new com.anythink.basead.exoplayer.k.z(cVar);
    }

    public final void a() {
        this.f2441a.a();
    }

    public final void b() {
        this.f2441a.b();
    }

    public final void a(long j) {
        this.f2441a.a(j);
    }

    public final void a(y yVar) {
        com.anythink.basead.exoplayer.k.n nVar;
        com.anythink.basead.exoplayer.k.n c = yVar.c();
        if (c == null || c == (nVar = this.d)) {
            return;
        }
        if (nVar != null) {
            throw g.a(new IllegalStateException("Multiple renderer media clocks enabled."));
        }
        this.d = c;
        this.c = yVar;
        c.a(this.f2441a.e());
        f();
    }

    public final void b(y yVar) {
        if (yVar == this.c) {
            this.d = null;
            this.c = null;
        }
    }

    public final long c() {
        if (g()) {
            f();
            return this.d.d();
        }
        return this.f2441a.d();
    }

    @Override // com.anythink.basead.exoplayer.k.n
    public final long d() {
        if (g()) {
            return this.d.d();
        }
        return this.f2441a.d();
    }

    @Override // com.anythink.basead.exoplayer.k.n
    public final v a(v vVar) {
        com.anythink.basead.exoplayer.k.n nVar = this.d;
        if (nVar != null) {
            vVar = nVar.a(vVar);
        }
        this.f2441a.a(vVar);
        this.b.a(vVar);
        return vVar;
    }

    @Override // com.anythink.basead.exoplayer.k.n
    public final v e() {
        com.anythink.basead.exoplayer.k.n nVar = this.d;
        return nVar != null ? nVar.e() : this.f2441a.e();
    }

    private void f() {
        this.f2441a.a(this.d.d());
        v e = this.d.e();
        if (e.equals(this.f2441a.e())) {
            return;
        }
        this.f2441a.a(e);
        this.b.a(e);
    }

    private boolean g() {
        y yVar = this.c;
        if (yVar == null || yVar.v()) {
            return false;
        }
        return this.c.u() || !this.c.g();
    }
}
