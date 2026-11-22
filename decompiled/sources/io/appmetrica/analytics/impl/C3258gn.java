package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.gn, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C3258gn implements InterfaceC3651wi {

    /* renamed from: a, reason: collision with root package name */
    public final int f18297a;
    public final int b;
    public int c = 0;

    public C3258gn(int i, int i2) {
        this.f18297a = i;
        this.b = i2;
    }

    public final int a() {
        return this.b;
    }

    public final boolean b() {
        int i = this.c;
        this.c = i + 1;
        return i < this.f18297a;
    }

    public final void c() {
        this.c = 0;
    }
}
