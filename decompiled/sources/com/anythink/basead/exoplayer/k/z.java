package com.anythink.basead.exoplayer.k;

/* loaded from: classes11.dex */
public final class z implements n {

    /* renamed from: a, reason: collision with root package name */
    private final c f2700a;
    private boolean b;
    private long c;
    private long d;
    private com.anythink.basead.exoplayer.v e = com.anythink.basead.exoplayer.v.f2734a;

    public z(c cVar) {
        this.f2700a = cVar;
    }

    public final void a() {
        if (this.b) {
            return;
        }
        this.d = this.f2700a.a();
        this.b = true;
    }

    public final void b() {
        if (this.b) {
            a(d());
            this.b = false;
        }
    }

    public final void a(long j) {
        this.c = j;
        if (this.b) {
            this.d = this.f2700a.a();
        }
    }

    @Override // com.anythink.basead.exoplayer.k.n
    public final long d() {
        long a2;
        long j = this.c;
        if (!this.b) {
            return j;
        }
        long a3 = this.f2700a.a() - this.d;
        if (this.e.b == 1.0f) {
            a2 = com.anythink.basead.exoplayer.b.b(a3);
        } else {
            a2 = this.e.a(a3);
        }
        return j + a2;
    }

    @Override // com.anythink.basead.exoplayer.k.n
    public final com.anythink.basead.exoplayer.v a(com.anythink.basead.exoplayer.v vVar) {
        if (this.b) {
            a(d());
        }
        this.e = vVar;
        return vVar;
    }

    @Override // com.anythink.basead.exoplayer.k.n
    public final com.anythink.basead.exoplayer.v e() {
        return this.e;
    }
}
