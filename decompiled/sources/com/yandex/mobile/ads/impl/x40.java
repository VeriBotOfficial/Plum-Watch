package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.jc0;
import com.yandex.mobile.ads.impl.p72;
import java.util.Collections;
import java.util.List;

/* loaded from: classes5.dex */
public final class x40 implements b50 {

    /* renamed from: a, reason: collision with root package name */
    private final List<p72.a> f17309a;
    private final a62[] b;
    private boolean c;
    private int d;
    private int e;
    private long f = -9223372036854775807L;

    public x40(List<p72.a> list) {
        this.f17309a = list;
        this.b = new a62[list.size()];
    }

    @Override // com.yandex.mobile.ads.impl.b50
    public final void b() {
        if (this.c) {
            if (this.f != -9223372036854775807L) {
                for (a62 a62Var : this.b) {
                    a62Var.a(this.f, 1, this.e, 0, null);
                }
            }
            this.c = false;
        }
    }

    @Override // com.yandex.mobile.ads.impl.b50
    public final void a(ag1 ag1Var) {
        if (this.c) {
            if (this.d == 2) {
                if (ag1Var.a() == 0) {
                    return;
                }
                if (ag1Var.t() != 32) {
                    this.c = false;
                }
                this.d--;
                if (!this.c) {
                    return;
                }
            }
            if (this.d == 1) {
                if (ag1Var.a() == 0) {
                    return;
                }
                if (ag1Var.t() != 0) {
                    this.c = false;
                }
                this.d--;
                if (!this.c) {
                    return;
                }
            }
            int d = ag1Var.d();
            int a2 = ag1Var.a();
            for (a62 a62Var : this.b) {
                ag1Var.e(d);
                a62Var.a(a2, ag1Var);
            }
            this.e += a2;
        }
    }

    @Override // com.yandex.mobile.ads.impl.b50
    public final void a(b80 b80Var, p72.d dVar) {
        for (int i = 0; i < this.b.length; i++) {
            p72.a aVar = this.f17309a.get(i);
            dVar.a();
            a62 a2 = b80Var.a(dVar.c(), 3);
            a2.a(new jc0.a().b(dVar.b()).e("application/dvbsubs").a(Collections.singletonList(aVar.b)).d(aVar.f16530a).a());
            this.b[i] = a2;
        }
    }

    @Override // com.yandex.mobile.ads.impl.b50
    public final void a(int i, long j) {
        if ((i & 4) == 0) {
            return;
        }
        this.c = true;
        if (j != -9223372036854775807L) {
            this.f = j;
        }
        this.e = 0;
        this.d = 2;
    }

    @Override // com.yandex.mobile.ads.impl.b50
    public final void a() {
        this.c = false;
        this.f = -9223372036854775807L;
    }
}
