package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.p72;

/* loaded from: classes5.dex */
public final class vg1 implements p72 {

    /* renamed from: a, reason: collision with root package name */
    private final b50 f17160a;
    private final zf1 b = new zf1(new byte[10]);
    private int c = 0;
    private int d;
    private p52 e;
    private boolean f;
    private boolean g;
    private boolean h;
    private int i;
    private int j;
    private boolean k;
    private long l;

    @Override // com.yandex.mobile.ads.impl.p72
    public final void a(int i, ag1 ag1Var) throws eg1 {
        int i2;
        int i3;
        int i4;
        if (this.e == null) {
            throw new IllegalStateException();
        }
        int i5 = -1;
        int i6 = 0;
        if ((i & 1) != 0) {
            int i7 = this.c;
            if (i7 != 0 && i7 != 1) {
                if (i7 == 2) {
                    et0.d("PesReader", "Unexpected start indicator reading extended header");
                } else {
                    if (i7 != 3) {
                        throw new IllegalStateException();
                    }
                    if (this.j != -1) {
                        et0.d("PesReader", "Unexpected start indicator: expected " + this.j + " more bytes");
                    }
                    this.f17160a.b();
                }
            }
            this.c = 1;
            this.d = 0;
        }
        int i8 = i;
        while (ag1Var.a() > 0) {
            int i9 = this.c;
            if (i9 == 0) {
                i2 = i5;
                i3 = i6;
                ag1Var.f(ag1Var.a());
            } else if (i9 != 1) {
                if (i9 != 2) {
                    if (i9 != 3) {
                        throw new IllegalStateException();
                    }
                    int a2 = ag1Var.a();
                    int i10 = this.j;
                    int i11 = i10 == i5 ? i6 : a2 - i10;
                    if (i11 > 0) {
                        a2 -= i11;
                        ag1Var.d(ag1Var.d() + a2);
                    }
                    this.f17160a.a(ag1Var);
                    int i12 = this.j;
                    if (i12 != i5) {
                        int i13 = i12 - a2;
                        this.j = i13;
                        if (i13 == 0) {
                            this.f17160a.b();
                            this.c = 1;
                            this.d = i6;
                        }
                    }
                } else if (a(Math.min(10, this.i), ag1Var, this.b.f17516a) && a(this.i, ag1Var, (byte[]) null)) {
                    this.b.c(i6);
                    this.l = -9223372036854775807L;
                    if (this.f) {
                        this.b.d(4);
                        this.b.d(1);
                        this.b.d(1);
                        long b = (this.b.b(15) << 15) | (this.b.b(3) << 30) | this.b.b(15);
                        this.b.d(1);
                        if (!this.h && this.g) {
                            this.b.d(4);
                            this.b.d(1);
                            this.b.d(1);
                            this.b.d(1);
                            this.e.b((this.b.b(3) << 30) | (this.b.b(15) << 15) | this.b.b(15));
                            this.h = true;
                        }
                        this.l = this.e.b(b);
                    }
                    i8 |= this.k ? 4 : 0;
                    this.f17160a.a(i8, this.l);
                    this.c = 3;
                    this.d = 0;
                    i6 = 0;
                    i5 = -1;
                }
                i2 = i5;
                i3 = i6;
            } else {
                i3 = i6;
                if (a(9, ag1Var, this.b.f17516a)) {
                    this.b.c(i3);
                    int b2 = this.b.b(24);
                    if (b2 != 1) {
                        xr0.a("Unexpected start code prefix: ", b2, "PesReader");
                        this.j = -1;
                        i4 = 0;
                        i2 = -1;
                    } else {
                        this.b.d(8);
                        int b3 = this.b.b(16);
                        this.b.d(5);
                        this.k = this.b.f();
                        this.b.d(2);
                        this.f = this.b.f();
                        this.g = this.b.f();
                        this.b.d(6);
                        int b4 = this.b.b(8);
                        this.i = b4;
                        if (b3 == 0) {
                            this.j = -1;
                        } else {
                            int i14 = (b3 - 3) - b4;
                            this.j = i14;
                            if (i14 < 0) {
                                et0.d("PesReader", "Found negative packet payload size: " + this.j);
                                i2 = -1;
                                this.j = -1;
                                i4 = 2;
                            }
                        }
                        i2 = -1;
                        i4 = 2;
                    }
                    this.c = i4;
                    i3 = 0;
                    this.d = 0;
                } else {
                    i2 = -1;
                }
            }
            i6 = i3;
            i5 = i2;
        }
    }

    public vg1(b50 b50Var) {
        this.f17160a = b50Var;
    }

    private boolean a(int i, ag1 ag1Var, byte[] bArr) {
        int min = Math.min(ag1Var.a(), i - this.d);
        if (min <= 0) {
            return true;
        }
        if (bArr == null) {
            ag1Var.f(min);
        } else {
            ag1Var.a(bArr, this.d, min);
        }
        int i2 = this.d + min;
        this.d = i2;
        return i2 == i;
    }

    @Override // com.yandex.mobile.ads.impl.p72
    public final void a(p52 p52Var, b80 b80Var, p72.d dVar) {
        this.e = p52Var;
        this.f17160a.a(b80Var, dVar);
    }

    @Override // com.yandex.mobile.ads.impl.p72
    public final void a() {
        this.c = 0;
        this.d = 0;
        this.h = false;
        this.f17160a.a();
    }
}
