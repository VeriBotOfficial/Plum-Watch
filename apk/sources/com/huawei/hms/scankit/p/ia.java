package com.huawei.hms.scankit.p;

/* JADX INFO: compiled from: Codeword.java */
/* JADX INFO: loaded from: classes11.dex */
final class ia {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f10649a;
    private final int b;
    private final int c;
    private final int d;
    private int e = -1;

    ia(int r2, int r3, int r4, int r5) {
        this.f10649a = r2;
        this.b = r3;
        this.c = r4;
        this.d = r5;
    }

    boolean a(int r2) {
        return r2 != -1 && this.c == (r2 % 3) * 3;
    }

    int b() {
        return this.b;
    }

    int c() {
        return this.e;
    }

    int d() {
        return this.f10649a;
    }

    int e() {
        return this.d;
    }

    int f() {
        return this.b - this.f10649a;
    }

    boolean g() {
        return a(this.e);
    }

    void h() {
        this.e = ((this.d / 30) * 3) + (this.c / 3);
    }

    public String toString() {
        return this.e + "|" + this.d;
    }

    int a() {
        return this.c;
    }

    void b(int r1) {
        this.e = r1;
    }
}
