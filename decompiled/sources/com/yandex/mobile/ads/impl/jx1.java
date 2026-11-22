package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.jc0;
import com.yandex.mobile.ads.impl.p72;
import java.util.List;

/* loaded from: classes5.dex */
public final class jx1 {

    /* renamed from: a, reason: collision with root package name */
    private final List<jc0> f15965a;
    private final a62[] b;

    public jx1(List<jc0> list) {
        this.f15965a = list;
        this.b = new a62[list.size()];
    }

    public final void a(long j, ag1 ag1Var) {
        Cdo.a(j, ag1Var, this.b);
    }

    public final void a(b80 b80Var, p72.d dVar) {
        for (int i = 0; i < this.b.length; i++) {
            dVar.a();
            a62 a2 = b80Var.a(dVar.c(), 3);
            jc0 jc0Var = this.f15965a.get(i);
            String str = jc0Var.m;
            hg.a("Invalid closed caption mime type provided: " + str, "application/cea-608".equals(str) || "application/cea-708".equals(str));
            String str2 = jc0Var.b;
            if (str2 == null) {
                str2 = dVar.b();
            }
            a2.a(new jc0.a().b(str2).e(str).m(jc0Var.e).d(jc0Var.d).a(jc0Var.E).a(jc0Var.o).a());
            this.b[i] = a2;
        }
    }
}
