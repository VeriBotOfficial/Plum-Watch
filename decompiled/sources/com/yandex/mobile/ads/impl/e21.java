package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.f21;
import com.yandex.mobile.ads.impl.jc0;
import com.yandex.mobile.ads.impl.p72;

/* loaded from: classes5.dex */
public final class e21 implements b50 {

    /* renamed from: a, reason: collision with root package name */
    private final ag1 f15336a;
    private final f21.a b;
    private final String c;
    private a62 d;
    private String e;
    private int f = 0;
    private int g;
    private boolean h;
    private boolean i;
    private long j;
    private int k;
    private long l;

    @Override // com.yandex.mobile.ads.impl.b50
    public final void b() {
    }

    public e21(String str) {
        ag1 ag1Var = new ag1(4);
        this.f15336a = ag1Var;
        ag1Var.c()[0] = -1;
        this.b = new f21.a();
        this.l = -9223372036854775807L;
        this.c = str;
    }

    @Override // com.yandex.mobile.ads.impl.b50
    public final void a(ag1 ag1Var) {
        if (this.d != null) {
            while (ag1Var.a() > 0) {
                int i = this.f;
                if (i == 0) {
                    byte[] c = ag1Var.c();
                    int d = ag1Var.d();
                    int e = ag1Var.e();
                    while (true) {
                        if (d < e) {
                            byte b = c[d];
                            boolean z = (b & 255) == 255;
                            boolean z2 = this.i && (b & 224) == 224;
                            this.i = z;
                            if (z2) {
                                ag1Var.e(d + 1);
                                this.i = false;
                                this.f15336a.c()[1] = c[d];
                                this.g = 2;
                                this.f = 1;
                                break;
                            }
                            d++;
                        } else {
                            ag1Var.e(e);
                            break;
                        }
                    }
                } else if (i == 1) {
                    int min = Math.min(ag1Var.a(), 4 - this.g);
                    ag1Var.a(this.f15336a.c(), this.g, min);
                    int i2 = this.g + min;
                    this.g = i2;
                    if (i2 >= 4) {
                        this.f15336a.e(0);
                        if (!this.b.a(this.f15336a.h())) {
                            this.g = 0;
                            this.f = 1;
                        } else {
                            this.k = this.b.c;
                            if (!this.h) {
                                this.j = (r0.g * 1000000) / r0.d;
                                this.d.a(new jc0.a().b(this.e).e(this.b.b).h(4096).c(this.b.e).l(this.b.d).d(this.c).a());
                                this.h = true;
                            }
                            this.f15336a.e(0);
                            this.d.a(4, this.f15336a);
                            this.f = 2;
                        }
                    }
                } else if (i == 2) {
                    int min2 = Math.min(ag1Var.a(), this.k - this.g);
                    this.d.a(min2, ag1Var);
                    int i3 = this.g + min2;
                    this.g = i3;
                    int i4 = this.k;
                    if (i3 >= i4) {
                        long j = this.l;
                        if (j != -9223372036854775807L) {
                            this.d.a(j, 1, i4, 0, null);
                            this.l += this.j;
                        }
                        this.g = 0;
                        this.f = 0;
                    }
                } else {
                    throw new IllegalStateException();
                }
            }
            return;
        }
        throw new IllegalStateException();
    }

    @Override // com.yandex.mobile.ads.impl.b50
    public final void a(b80 b80Var, p72.d dVar) {
        dVar.a();
        this.e = dVar.b();
        this.d = b80Var.a(dVar.c(), 1);
    }

    @Override // com.yandex.mobile.ads.impl.b50
    public final void a(int i, long j) {
        if (j != -9223372036854775807L) {
            this.l = j;
        }
    }

    @Override // com.yandex.mobile.ads.impl.b50
    public final void a() {
        this.f = 0;
        this.g = 0;
        this.i = false;
        this.l = -9223372036854775807L;
    }
}
