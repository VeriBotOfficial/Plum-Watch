package com.anythink.basead.exoplayer;

/* loaded from: classes11.dex */
public abstract class a implements y, z {
    private final int n;
    private aa o;
    private int p;

    /* renamed from: q, reason: collision with root package name */
    private int f2353q;
    private com.anythink.basead.exoplayer.h.y r;
    private m[] s;
    private long t;
    private boolean u = true;
    private boolean v;

    @Override // com.anythink.basead.exoplayer.x.b
    public void a(int i, Object obj) {
    }

    protected void a(long j, boolean z) {
    }

    protected void a(boolean z) {
    }

    protected void a(m[] mVarArr, long j) {
    }

    @Override // com.anythink.basead.exoplayer.y
    public final z b() {
        return this;
    }

    @Override // com.anythink.basead.exoplayer.y
    public com.anythink.basead.exoplayer.k.n c() {
        return null;
    }

    @Override // com.anythink.basead.exoplayer.z
    public int m() {
        return 0;
    }

    protected void n() {
    }

    protected void o() {
    }

    protected void p() {
    }

    public a(int i) {
        this.n = i;
    }

    @Override // com.anythink.basead.exoplayer.y, com.anythink.basead.exoplayer.z
    public final int a() {
        return this.n;
    }

    @Override // com.anythink.basead.exoplayer.y
    public final void a(int i) {
        this.p = i;
    }

    @Override // com.anythink.basead.exoplayer.y
    public final int a_() {
        return this.f2353q;
    }

    @Override // com.anythink.basead.exoplayer.y
    public final void a(aa aaVar, m[] mVarArr, com.anythink.basead.exoplayer.h.y yVar, long j, boolean z, long j2) {
        com.anythink.basead.exoplayer.k.a.b(this.f2353q == 0);
        this.o = aaVar;
        this.f2353q = 1;
        a(z);
        a(mVarArr, yVar, j2);
        a(j, z);
    }

    @Override // com.anythink.basead.exoplayer.y
    public final void b_() {
        com.anythink.basead.exoplayer.k.a.b(this.f2353q == 1);
        this.f2353q = 2;
        n();
    }

    @Override // com.anythink.basead.exoplayer.y
    public final void a(m[] mVarArr, com.anythink.basead.exoplayer.h.y yVar, long j) {
        com.anythink.basead.exoplayer.k.a.b(!this.v);
        this.r = yVar;
        this.u = false;
        this.s = mVarArr;
        this.t = j;
        a(mVarArr, j);
    }

    @Override // com.anythink.basead.exoplayer.y
    public final com.anythink.basead.exoplayer.h.y f() {
        return this.r;
    }

    @Override // com.anythink.basead.exoplayer.y
    public final boolean g() {
        return this.u;
    }

    @Override // com.anythink.basead.exoplayer.y
    public final void h() {
        this.v = true;
    }

    @Override // com.anythink.basead.exoplayer.y
    public final boolean i() {
        return this.v;
    }

    @Override // com.anythink.basead.exoplayer.y
    public final void j() {
        this.r.c();
    }

    @Override // com.anythink.basead.exoplayer.y
    public final void a(long j) {
        this.v = false;
        this.u = false;
        a(j, false);
    }

    @Override // com.anythink.basead.exoplayer.y
    public final void k() {
        com.anythink.basead.exoplayer.k.a.b(this.f2353q == 2);
        this.f2353q = 1;
        o();
    }

    @Override // com.anythink.basead.exoplayer.y
    public final void l() {
        com.anythink.basead.exoplayer.k.a.b(this.f2353q == 1);
        this.f2353q = 0;
        this.r = null;
        this.s = null;
        this.v = false;
        p();
    }

    protected final m[] q() {
        return this.s;
    }

    protected final aa r() {
        return this.o;
    }

    protected final int s() {
        return this.p;
    }

    protected final int a(n nVar, com.anythink.basead.exoplayer.c.e eVar, boolean z) {
        int a2 = this.r.a(nVar, eVar, z);
        if (a2 == -4) {
            if (eVar.c()) {
                this.u = true;
                return this.v ? -4 : -3;
            }
            eVar.f += this.t;
            return a2;
        }
        if (a2 == -5) {
            m mVar = nVar.f2723a;
            if (mVar.l != Long.MAX_VALUE) {
                nVar.f2723a = mVar.a(mVar.l + this.t);
            }
        }
        return a2;
    }

    protected final int b(long j) {
        return this.r.a(j - this.t);
    }

    protected final boolean t() {
        return this.u ? this.v : this.r.b();
    }

    protected static boolean a(com.anythink.basead.exoplayer.d.g<?> gVar, com.anythink.basead.exoplayer.d.e eVar) {
        if (eVar == null) {
            return true;
        }
        if (gVar == null) {
            return false;
        }
        return gVar.a(eVar);
    }
}
