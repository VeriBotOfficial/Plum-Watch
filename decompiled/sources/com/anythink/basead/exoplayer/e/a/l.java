package com.anythink.basead.exoplayer.e.a;

import com.anythink.basead.exoplayer.k.s;

/* loaded from: classes11.dex */
final class l {

    /* renamed from: a, reason: collision with root package name */
    public c f2467a;
    public long b;
    public long c;
    public long d;
    public int e;
    public int f;
    public long[] g;
    public int[] h;
    public int[] i;
    public int[] j;
    public long[] k;
    public boolean[] l;
    public boolean m;
    public boolean[] n;
    public k o;
    public int p;

    /* renamed from: q, reason: collision with root package name */
    public s f2468q;
    public boolean r;
    public long s;

    l() {
    }

    public final void a() {
        this.e = 0;
        this.s = 0L;
        this.m = false;
        this.r = false;
        this.o = null;
    }

    public final void a(int i, int i2) {
        this.e = i;
        this.f = i2;
        int[] iArr = this.h;
        if (iArr == null || iArr.length < i) {
            this.g = new long[i];
            this.h = new int[i];
        }
        int[] iArr2 = this.i;
        if (iArr2 == null || iArr2.length < i2) {
            int i3 = (i2 * 125) / 100;
            this.i = new int[i3];
            this.j = new int[i3];
            this.k = new long[i3];
            this.l = new boolean[i3];
            this.n = new boolean[i3];
        }
    }

    public final void a(int i) {
        s sVar = this.f2468q;
        if (sVar == null || sVar.b() < i) {
            this.f2468q = new s(i);
        }
        this.p = i;
        this.m = true;
        this.r = true;
    }

    private void a(com.anythink.basead.exoplayer.e.f fVar) {
        fVar.b(this.f2468q.f2693a, 0, this.p);
        this.f2468q.c(0);
        this.r = false;
    }

    public final void a(s sVar) {
        sVar.a(this.f2468q.f2693a, 0, this.p);
        this.f2468q.c(0);
        this.r = false;
    }

    public final long b(int i) {
        return this.k[i] + this.j[i];
    }
}
