package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.e42;
import com.yandex.mobile.ads.impl.jc0;

/* loaded from: classes5.dex */
final class ig2 extends e42 {
    private final ag1 b;
    private final ag1 c;
    private int d;
    private boolean e;
    private boolean f;
    private int g;

    public ig2(a62 a62Var) {
        super(a62Var);
        this.b = new ag1(e41.f15342a);
        this.c = new ag1(4);
    }

    protected final boolean a(ag1 ag1Var) throws e42.a {
        int t = ag1Var.t();
        int i = (t >> 4) & 15;
        int i2 = t & 15;
        if (i2 == 7) {
            this.g = i;
            return i != 5;
        }
        throw new e42.a(oe.a("Video format not supported: ", i2));
    }

    protected final boolean a(long j, ag1 ag1Var) throws eg1 {
        int t = ag1Var.t();
        long i = (ag1Var.i() * 1000) + j;
        if (t == 0 && !this.e) {
            ag1 ag1Var2 = new ag1(new byte[ag1Var.a()]);
            ag1Var.a(ag1Var2.c(), 0, ag1Var.a());
            ni a2 = ni.a(ag1Var2);
            this.d = a2.b;
            this.f15346a.a(new jc0.a().e("video/avc").a(a2.f).o(a2.c).f(a2.d).b(a2.e).a(a2.f16345a).a());
            this.e = true;
            return false;
        }
        if (t != 1 || !this.e) {
            return false;
        }
        int i2 = this.g == 1 ? 1 : 0;
        if (!this.f && i2 == 0) {
            return false;
        }
        byte[] c = this.c.c();
        c[0] = 0;
        c[1] = 0;
        c[2] = 0;
        int i3 = 4 - this.d;
        int i4 = 0;
        while (ag1Var.a() > 0) {
            ag1Var.a(this.c.c(), i3, this.d);
            this.c.e(0);
            int x = this.c.x();
            this.b.e(0);
            this.f15346a.a(4, this.b);
            this.f15346a.a(x, ag1Var);
            i4 = i4 + 4 + x;
        }
        this.f15346a.a(i, i2, i4, 0, null);
        this.f = true;
        return true;
    }
}
