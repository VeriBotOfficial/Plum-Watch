package com.yandex.mobile.ads.impl;

import java.util.ArrayList;

/* loaded from: classes5.dex */
public abstract class jk implements tv {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f15918a;
    private final ArrayList<d72> b = new ArrayList<>(1);
    private int c;
    private xv d;

    @Override // com.yandex.mobile.ads.impl.tv
    public final void a(d72 d72Var) {
        d72Var.getClass();
        if (this.b.contains(d72Var)) {
            return;
        }
        this.b.add(d72Var);
        this.c++;
    }

    protected jk(boolean z) {
        this.f15918a = z;
    }

    protected final void b(xv xvVar) {
        for (int i = 0; i < this.c; i++) {
            this.b.get(i).getClass();
        }
    }

    protected final void c(int i) {
        xv xvVar = this.d;
        int i2 = f92.f15466a;
        for (int i3 = 0; i3 < this.c; i3++) {
            this.b.get(i3).a(xvVar, this.f15918a, i);
        }
    }

    protected final void e() {
        xv xvVar = this.d;
        int i = f92.f15466a;
        for (int i2 = 0; i2 < this.c; i2++) {
            this.b.get(i2).a(xvVar, this.f15918a);
        }
        this.d = null;
    }

    protected final void c(xv xvVar) {
        this.d = xvVar;
        for (int i = 0; i < this.c; i++) {
            this.b.get(i).b(xvVar, this.f15918a);
        }
    }
}
