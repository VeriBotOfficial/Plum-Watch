package com.anythink.basead.exoplayer.c;

/* JADX INFO: loaded from: classes7.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
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

    public final void a(int r1) {
        this.f2404a = r1;
    }

    public final void b(int r2) {
        this.f2404a = r2 | this.f2404a;
    }

    private void d(int r2) {
        this.f2404a = (~r2) & this.f2404a;
    }

    protected final boolean c(int r2) {
        return (this.f2404a & r2) == r2;
    }
}
