package com.huawei.hms.scankit.p;

/* compiled from: Codeword.java */
/* renamed from: com.huawei.hms.scankit.p.ia, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
final class C3012ia {

    /* renamed from: a, reason: collision with root package name */
    private final int f10649a;
    private final int b;
    private final int c;
    private final int d;
    private int e = -1;

    C3012ia(int i, int i2, int i3, int i4) {
        this.f10649a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    boolean a(int i) {
        return i != -1 && this.c == (i % 3) * 3;
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

    void b(int i) {
        this.e = i;
    }
}
