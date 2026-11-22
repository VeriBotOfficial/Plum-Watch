package io.appmetrica.analytics.impl;

import android.content.Context;

/* renamed from: io.appmetrica.analytics.impl.t4, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3562t4 {
    public static volatile C3562t4 r;

    /* renamed from: a, reason: collision with root package name */
    public final C3371lc f18505a;
    public final L7 b;
    public final C3313j4 c;
    public final M1 d;
    public final C3458p e;
    public final Ak f;
    public final P5 g;
    public final C3358l h;
    public final Km i;
    public C3596ud j;
    public final C3334k0 k;
    public volatile C3488q4 l;
    public final Xc m;
    public volatile Ke n;
    public Ri o;
    public final C3484q0 p;

    /* renamed from: q, reason: collision with root package name */
    public final C3319ja f18506q;

    public C3562t4(C3371lc c3371lc, C3458p c3458p, C3313j4 c3313j4) {
        this(c3371lc, c3458p, c3313j4, new C3358l(c3458p));
    }

    public static C3562t4 i() {
        if (r == null) {
            synchronized (C3562t4.class) {
                if (r == null) {
                    r = new C3562t4(new C3371lc(), new C3458p(), new C3313j4());
                }
            }
        }
        return r;
    }

    public final C3458p a() {
        return this.e;
    }

    public final C3334k0 b() {
        return this.k;
    }

    public final C3484q0 c() {
        return this.p;
    }

    public final M1 d() {
        return this.d;
    }

    public final C3313j4 e() {
        return this.c;
    }

    public final P5 f() {
        return this.g;
    }

    public final L7 g() {
        return this.b;
    }

    public final C3319ja h() {
        return this.f18506q;
    }

    public final C3371lc j() {
        return this.f18505a;
    }

    public final C3488q4 k() {
        C3488q4 c3488q4;
        C3488q4 c3488q42 = this.l;
        if (c3488q42 != null) {
            return c3488q42;
        }
        synchronized (this) {
            c3488q4 = this.l;
            if (c3488q4 == null) {
                c3488q4 = new C3488q4();
                this.l = c3488q4;
            }
        }
        return c3488q4;
    }

    public final C3371lc l() {
        return this.f18505a;
    }

    public final Ak m() {
        return this.f;
    }

    public C3562t4(C3371lc c3371lc, C3458p c3458p, C3313j4 c3313j4, C3358l c3358l) {
        this(c3371lc, new L7(), c3313j4, c3358l, new M1(), c3458p, new Ak(c3458p, c3358l), new P5(c3458p), new Km(), new C3334k0());
    }

    public final synchronized C3596ud a(Context context) {
        if (this.j == null) {
            this.j = new C3596ud(context, new Jn());
        }
        return this.j;
    }

    public final Ke b(Context context) {
        Ke ke;
        Ke ke2 = this.n;
        if (ke2 != null) {
            return ke2;
        }
        synchronized (this) {
            ke = this.n;
            if (ke == null) {
                ke = new Ke(C3242g7.a(context).a());
                this.n = ke;
            }
        }
        return ke;
    }

    public C3562t4(C3371lc c3371lc, L7 l7, C3313j4 c3313j4, C3358l c3358l, M1 m1, C3458p c3458p, Ak ak, P5 p5, Km km, C3334k0 c3334k0) {
        this.m = new Xc();
        this.p = new C3484q0();
        this.f18506q = new C3319ja();
        new K7();
        this.f18505a = c3371lc;
        this.b = l7;
        this.c = c3313j4;
        this.h = c3358l;
        this.d = m1;
        this.e = c3458p;
        this.f = ak;
        this.g = p5;
        this.i = km;
        this.k = c3334k0;
    }
}
