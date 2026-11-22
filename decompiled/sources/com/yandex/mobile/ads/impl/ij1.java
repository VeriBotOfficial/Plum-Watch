package com.yandex.mobile.ads.impl;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes5.dex */
final class ij1 extends h {
    private final int f;
    private final int g;
    private final int[] h;
    private final int[] i;
    private final i52[] j;
    private final Object[] k;
    private final HashMap<Object, Integer> l;

    public ij1(List list, iy1 iy1Var) {
        super(iy1Var);
        int size = list.size();
        this.h = new int[size];
        this.i = new int[size];
        this.j = new i52[size];
        this.k = new Object[size];
        this.l = new HashMap<>();
        Iterator it = list.iterator();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (it.hasNext()) {
            xw0 xw0Var = (xw0) it.next();
            this.j[i3] = xw0Var.b();
            this.i[i3] = i;
            this.h[i3] = i2;
            i += this.j[i3].b();
            i2 += this.j[i3].a();
            this.k[i3] = xw0Var.a();
            this.l.put(this.k[i3], Integer.valueOf(i3));
            i3++;
        }
        this.f = i;
        this.g = i2;
    }

    final List<i52> d() {
        return Arrays.asList(this.j);
    }

    @Override // com.yandex.mobile.ads.impl.h
    protected final int c(int i) {
        return f92.a(this.i, i + 1, false, false);
    }

    @Override // com.yandex.mobile.ads.impl.h
    protected final int b(Object obj) {
        Integer num = this.l.get(obj);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    @Override // com.yandex.mobile.ads.impl.h
    protected final i52 g(int i) {
        return this.j[i];
    }

    @Override // com.yandex.mobile.ads.impl.h
    protected final int e(int i) {
        return this.h[i];
    }

    @Override // com.yandex.mobile.ads.impl.h
    protected final int f(int i) {
        return this.i[i];
    }

    @Override // com.yandex.mobile.ads.impl.i52
    public final int a() {
        return this.g;
    }

    @Override // com.yandex.mobile.ads.impl.h
    protected final int b(int i) {
        return f92.a(this.h, i + 1, false, false);
    }

    @Override // com.yandex.mobile.ads.impl.h
    protected final Object d(int i) {
        return this.k[i];
    }

    @Override // com.yandex.mobile.ads.impl.i52
    public final int b() {
        return this.f;
    }
}
