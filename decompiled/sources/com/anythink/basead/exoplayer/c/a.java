package com.anythink.basead.exoplayer.c;

/* loaded from: classes11.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    private int f2404a;

    public void a() {
        this.f2404a = 0;
    }

    public final boolean b() {
        return c(Integer.MIN_VALUE);
    }

    public final boolean c() {
        return c(4);
    }

    public final boolean d() {
        return c(1);
    }

    public final void a(int i) {
        this.f2404a = i;
    }

    public final void b(int i) {
        this.f2404a = i | this.f2404a;
    }

    private void d(int i) {
        this.f2404a = (~i) & this.f2404a;
    }

    protected final boolean c(int i) {
        return (this.f2404a & i) == i;
    }
}
