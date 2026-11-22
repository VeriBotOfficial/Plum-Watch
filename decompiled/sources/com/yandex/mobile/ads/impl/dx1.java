package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.p72;

/* loaded from: classes5.dex */
public final class dx1 implements p72 {

    /* renamed from: a, reason: collision with root package name */
    private final cx1 f15317a;
    private final ag1 b = new ag1(32);
    private int c;
    private int d;
    private boolean e;
    private boolean f;

    @Override // com.yandex.mobile.ads.impl.p72
    public final void a(int i, ag1 ag1Var) {
        boolean z = (i & 1) != 0;
        int d = z ? ag1Var.d() + ag1Var.t() : -1;
        if (this.f) {
            if (!z) {
                return;
            }
            this.f = false;
            ag1Var.e(d);
            this.d = 0;
        }
        while (ag1Var.a() > 0) {
            int i2 = this.d;
            if (i2 < 3) {
                if (i2 == 0) {
                    int t = ag1Var.t();
                    ag1Var.e(ag1Var.d() - 1);
                    if (t == 255) {
                        this.f = true;
                        return;
                    }
                }
                int min = Math.min(ag1Var.a(), 3 - this.d);
                ag1Var.a(this.b.c(), this.d, min);
                int i3 = this.d + min;
                this.d = i3;
                if (i3 == 3) {
                    this.b.e(0);
                    this.b.d(3);
                    this.b.f(1);
                    int t2 = this.b.t();
                    int t3 = this.b.t();
                    this.e = (t2 & 128) != 0;
                    this.c = (((t2 & 15) << 8) | t3) + 3;
                    int b = this.b.b();
                    int i4 = this.c;
                    if (b < i4) {
                        this.b.a(Math.min(4098, Math.max(i4, this.b.b() * 2)));
                    }
                }
            } else {
                int min2 = Math.min(ag1Var.a(), this.c - this.d);
                ag1Var.a(this.b.c(), this.d, min2);
                int i5 = this.d + min2;
                this.d = i5;
                int i6 = this.c;
                if (i5 != i6) {
                    continue;
                } else {
                    if (this.e) {
                        if (f92.a(this.c, this.b.c()) != 0) {
                            this.f = true;
                            return;
                        }
                        this.b.d(this.c - 4);
                    } else {
                        this.b.d(i6);
                    }
                    this.b.e(0);
                    this.f15317a.a(this.b);
                    this.d = 0;
                }
            }
        }
    }

    public dx1(cx1 cx1Var) {
        this.f15317a = cx1Var;
    }

    @Override // com.yandex.mobile.ads.impl.p72
    public final void a(p52 p52Var, b80 b80Var, p72.d dVar) {
        this.f15317a.a(p52Var, b80Var, dVar);
        this.f = true;
    }

    @Override // com.yandex.mobile.ads.impl.p72
    public final void a() {
        this.f = true;
    }
}
