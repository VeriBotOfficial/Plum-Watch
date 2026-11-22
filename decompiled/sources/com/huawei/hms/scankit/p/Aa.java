package com.huawei.hms.scankit.p;

import com.huawei.hms.scankit.aiscan.common.C2967a;

/* compiled from: BitMatrixParser.java */
/* loaded from: classes14.dex */
final class Aa {

    /* renamed from: a, reason: collision with root package name */
    private final C3074y f10549a;
    private Ya b;
    private Ua c;
    private boolean d;

    Aa(C3074y c3074y) throws C2967a {
        int b = c3074y.b();
        if (b < 21 || (b & 3) != 1) {
            throw C2967a.a();
        }
        this.f10549a = c3074y;
    }

    private int a(int i, int i2, int i3) {
        return this.d ? this.f10549a.b(i2, i) : this.f10549a.b(i, i2) ? (i3 << 1) | 1 : i3 << 1;
    }

    byte[] b() throws C2967a {
        Ua c = c();
        Ya d = d();
        Ka ka = Ka.values()[c.a()];
        int b = this.f10549a.b();
        ka.a(this.f10549a, b);
        C3074y a2 = d.a();
        byte[] bArr = new byte[d.d()];
        int i = b - 1;
        boolean z = true;
        int i2 = i;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (i2 > 0) {
            if (i2 == 6) {
                i2--;
            }
            for (int i6 = 0; i6 < b; i6++) {
                int i7 = z ? i - i6 : i6;
                for (int i8 = 0; i8 < 2; i8++) {
                    int i9 = i2 - i8;
                    if (!a2.b(i9, i7)) {
                        i5++;
                        i4 <<= 1;
                        if (this.f10549a.b(i9, i7)) {
                            i4 |= 1;
                        }
                        if (i5 == 8) {
                            bArr[i3] = (byte) i4;
                            i3++;
                            i4 = 0;
                            i5 = 0;
                        }
                    }
                }
            }
            z = !z;
            i2 -= 2;
        }
        if (i3 == d.d()) {
            return bArr;
        }
        throw C2967a.a();
    }

    Ua c() throws C2967a {
        Ua ua = this.c;
        if (ua != null) {
            return ua;
        }
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < 6; i3++) {
            i2 = a(i3, 8, i2);
        }
        int a2 = a(8, 7, a(8, 8, a(7, 8, i2)));
        for (int i4 = 5; i4 >= 0; i4--) {
            a2 = a(8, i4, a2);
        }
        int b = this.f10549a.b();
        int i5 = b - 7;
        for (int i6 = b - 1; i6 >= i5; i6--) {
            i = a(8, i6, i);
        }
        for (int i7 = b - 8; i7 < b; i7++) {
            i = a(i7, 8, i);
        }
        Ua a3 = Ua.a(a2, i);
        this.c = a3;
        if (a3 != null) {
            return a3;
        }
        throw C2967a.a();
    }

    Ya d() throws C2967a {
        Ya ya = this.b;
        if (ya != null) {
            return ya;
        }
        int b = this.f10549a.b();
        int i = (b - 17) / 4;
        if (i <= 6) {
            return Ya.c(i);
        }
        int i2 = b - 11;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 5; i5 >= 0; i5--) {
            for (int i6 = b - 9; i6 >= i2; i6--) {
                i4 = a(i6, i5, i4);
            }
        }
        Ya a2 = Ya.a(i4);
        if (a2 != null && a2.c() == b) {
            this.b = a2;
            return a2;
        }
        for (int i7 = 5; i7 >= 0; i7--) {
            for (int i8 = b - 9; i8 >= i2; i8--) {
                i3 = a(i7, i8, i3);
            }
        }
        Ya a3 = Ya.a(i3);
        if (a3 == null || a3.c() != b) {
            throw C2967a.a();
        }
        this.b = a3;
        return a3;
    }

    void e() {
        if (this.c == null) {
            return;
        }
        Ka.values()[this.c.a()].a(this.f10549a, this.f10549a.b());
    }

    void a(boolean z) {
        this.b = null;
        this.c = null;
        this.d = z;
    }

    void a() {
        int i = 0;
        while (i < this.f10549a.d()) {
            int i2 = i + 1;
            for (int i3 = i2; i3 < this.f10549a.b(); i3++) {
                if (this.f10549a.b(i, i3) != this.f10549a.b(i3, i)) {
                    this.f10549a.a(i3, i);
                    this.f10549a.a(i, i3);
                }
            }
            i = i2;
        }
    }
}
