package com.huawei.hms.scankit.p;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Locale;

/* compiled from: State.java */
/* loaded from: classes14.dex */
final class Wb {

    /* renamed from: a, reason: collision with root package name */
    static final Wb f10611a = new Wb(Xb.f10615a, 0, 0, 0);
    private final int b;
    private final Xb c;
    private final int d;
    private final int e;

    private Wb(Xb xb, int i, int i2, int i3) {
        this.c = xb;
        this.b = i;
        this.d = i2;
        this.e = i3;
    }

    int a() {
        return this.d;
    }

    int b() {
        return this.e;
    }

    int c() {
        return this.b;
    }

    public String toString() {
        if (com.huawei.hms.scankit.util.b.a(Ub.f10605a, this.b)) {
            return String.format(Locale.ENGLISH, "%s bits=%d bytes=%d", Ub.f10605a[this.b], Integer.valueOf(this.e), Integer.valueOf(this.d));
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    Wb a(int i, int i2) {
        int i3 = this.e;
        Xb xb = this.c;
        int i4 = this.b;
        if (i != i4) {
            int i5 = Ub.b[i4][i];
            int i6 = 65535 & i5;
            int i7 = i5 >> 16;
            xb = xb.a(i6, i7);
            i3 += i7;
        }
        int i8 = i == 2 ? 4 : 5;
        return new Wb(xb.a(i2, i8), i, 0, i3 + i8);
    }

    Wb b(int i, int i2) {
        Xb xb = this.c;
        int i3 = this.b;
        int i4 = i3 == 2 ? 4 : 5;
        if (i3 >= 0) {
            int[][] iArr = Ub.d;
            if (i3 < iArr.length && i > 0) {
                int[] iArr2 = iArr[i3];
                if (i < iArr2.length) {
                    xb = xb.a(iArr2[i], i4);
                }
            }
        }
        return new Wb(xb.a(i2, 5), this.b, 0, this.e + i4 + 5);
    }

    Wb a(int i) {
        Xb xb = this.c;
        int i2 = this.b;
        int i3 = this.e;
        if (i2 == 4 || i2 == 2) {
            int i4 = Ub.b[i2][0];
            int i5 = 65535 & i4;
            int i6 = i4 >> 16;
            xb = xb.a(i5, i6);
            i3 += i6;
            i2 = 0;
        }
        int i7 = this.d;
        Wb wb = new Wb(xb, i2, i7 + 1, i3 + ((i7 == 0 || i7 == 31) ? 18 : i7 == 62 ? 9 : 8));
        return wb.d == 2078 ? wb.b(i + 1) : wb;
    }

    Wb b(int i) {
        int i2 = this.d;
        return i2 == 0 ? this : new Wb(this.c.b(i - i2, i2), this.b, 0, this.e);
    }

    boolean a(Wb wb) {
        int i;
        int i2 = this.e + (Ub.b[this.b][wb.b] >> 16);
        int i3 = wb.d;
        if (i3 > 0 && ((i = this.d) == 0 || i > i3)) {
            i2 += 10;
        }
        return i2 <= wb.e;
    }

    C3070x a(byte[] bArr) {
        LinkedList linkedList = new LinkedList();
        for (Xb xb = b(bArr.length).c; xb != null; xb = xb.a()) {
            linkedList.addFirst(xb);
        }
        C3070x c3070x = new C3070x();
        Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            ((Xb) it.next()).a(c3070x, bArr);
        }
        return c3070x;
    }
}
