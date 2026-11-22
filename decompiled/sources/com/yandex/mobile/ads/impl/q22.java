package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.ex1;

/* loaded from: classes5.dex */
public final class q22 implements b80 {
    private final long b;
    private final b80 c;

    public q22(long j, b80 b80Var) {
        this.b = j;
        this.c = b80Var;
    }

    @Override // com.yandex.mobile.ads.impl.b80
    public final void a() {
        this.c.a();
    }

    final class a implements ex1 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ex1 f16625a;

        a(ex1 ex1Var) {
            this.f16625a = ex1Var;
        }

        @Override // com.yandex.mobile.ads.impl.ex1
        public final long c() {
            return this.f16625a.c();
        }

        @Override // com.yandex.mobile.ads.impl.ex1
        public final ex1.a b(long j) {
            ex1.a b = this.f16625a.b(j);
            gx1 gx1Var = b.f15429a;
            long j2 = gx1Var.f15636a;
            long j3 = gx1Var.b;
            long j4 = q22.this.b;
            gx1 gx1Var2 = new gx1(j2, j3 + j4);
            gx1 gx1Var3 = b.b;
            return new ex1.a(gx1Var2, new gx1(gx1Var3.f15636a, gx1Var3.b + j4));
        }

        @Override // com.yandex.mobile.ads.impl.ex1
        public final boolean b() {
            return this.f16625a.b();
        }
    }

    @Override // com.yandex.mobile.ads.impl.b80
    public final void a(ex1 ex1Var) {
        this.c.a(new a(ex1Var));
    }

    @Override // com.yandex.mobile.ads.impl.b80
    public final a62 a(int i, int i2) {
        return this.c.a(i, i2);
    }
}
