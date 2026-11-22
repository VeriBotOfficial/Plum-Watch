package com.huawei.hms.scankit.p;

/* compiled from: ModulusPoly.java */
/* renamed from: com.huawei.hms.scankit.p.ra, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
final class C3047ra {

    /* renamed from: a, reason: collision with root package name */
    private final C3044qa f10681a;
    private final int[] b;

    C3047ra(C3044qa c3044qa, int[] iArr) {
        if (iArr.length == 0) {
            throw new IllegalArgumentException();
        }
        this.f10681a = c3044qa;
        int length = iArr.length;
        int i = 1;
        if (length <= 1 || iArr[0] != 0) {
            this.b = iArr;
            return;
        }
        while (i < length && iArr[i] == 0) {
            i++;
        }
        if (i == length) {
            this.b = new int[]{0};
            return;
        }
        int[] iArr2 = new int[length - i];
        this.b = iArr2;
        System.arraycopy(iArr, i, iArr2, 0, iArr2.length);
    }

    int a() {
        return this.b.length - 1;
    }

    boolean b() {
        return this.b[0] == 0;
    }

    C3047ra c(C3047ra c3047ra) {
        if (this.f10681a.equals(c3047ra.f10681a)) {
            return c3047ra.b() ? this : a(c3047ra.c());
        }
        throw new IllegalArgumentException("ModulusPolys do not have same ModulusGF field");
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(a() * 8);
        for (int a2 = a(); a2 >= 0; a2--) {
            int b = b(a2);
            if (b != 0) {
                if (b < 0) {
                    sb.append(" - ");
                    b = -b;
                } else if (sb.length() > 0) {
                    sb.append(" + ");
                }
                if (a2 == 0 || b != 1) {
                    sb.append(b);
                }
                if (a2 != 0) {
                    if (a2 == 1) {
                        sb.append('x');
                    } else {
                        sb.append("x^");
                        sb.append(a2);
                    }
                }
            }
        }
        return sb.toString();
    }

    int a(int i) {
        if (i == 0) {
            return b(0);
        }
        if (i == 1) {
            int i2 = 0;
            for (int i3 : this.b) {
                i2 = this.f10681a.a(i2, i3);
            }
            return i2;
        }
        int[] iArr = this.b;
        int i4 = iArr[0];
        int length = iArr.length;
        for (int i5 = 1; i5 < length; i5++) {
            C3044qa c3044qa = this.f10681a;
            i4 = c3044qa.a(c3044qa.c(i, i4), this.b[i5]);
        }
        return i4;
    }

    int b(int i) {
        return this.b[(r0.length - 1) - i];
    }

    C3047ra b(C3047ra c3047ra) {
        if (this.f10681a.equals(c3047ra.f10681a)) {
            if (!b() && !c3047ra.b()) {
                int[] iArr = this.b;
                int length = iArr.length;
                int[] iArr2 = c3047ra.b;
                int length2 = iArr2.length;
                int[] iArr3 = new int[(length + length2) - 1];
                for (int i = 0; i < length; i++) {
                    int i2 = iArr[i];
                    for (int i3 = 0; i3 < length2; i3++) {
                        int i4 = i + i3;
                        C3044qa c3044qa = this.f10681a;
                        iArr3[i4] = c3044qa.a(iArr3[i4], c3044qa.c(i2, iArr2[i3]));
                    }
                }
                return new C3047ra(this.f10681a, iArr3);
            }
            return this.f10681a.c();
        }
        throw new IllegalArgumentException("ModulusPolys do not have same ModulusGF field");
    }

    C3047ra c() {
        int length = this.b.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            iArr[i] = this.f10681a.d(0, this.b[i]);
        }
        return new C3047ra(this.f10681a, iArr);
    }

    C3047ra a(C3047ra c3047ra) {
        if (this.f10681a.equals(c3047ra.f10681a)) {
            if (b()) {
                return c3047ra;
            }
            if (c3047ra.b()) {
                return this;
            }
            int[] iArr = this.b;
            int[] iArr2 = c3047ra.b;
            if (iArr.length <= iArr2.length) {
                iArr = iArr2;
                iArr2 = iArr;
            }
            int[] iArr3 = new int[iArr.length];
            int length = iArr.length - iArr2.length;
            System.arraycopy(iArr, 0, iArr3, 0, length);
            for (int i = length; i < iArr.length; i++) {
                iArr3[i] = this.f10681a.a(iArr2[i - length], iArr[i]);
            }
            return new C3047ra(this.f10681a, iArr3);
        }
        throw new IllegalArgumentException("ModulusPolys do not have same ModulusGF field");
    }

    C3047ra c(int i) {
        if (i == 0) {
            return this.f10681a.c();
        }
        if (i == 1) {
            return this;
        }
        int length = this.b.length;
        int[] iArr = new int[length];
        for (int i2 = 0; i2 < length; i2++) {
            iArr[i2] = this.f10681a.c(this.b[i2], i);
        }
        return new C3047ra(this.f10681a, iArr);
    }

    C3047ra a(int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException();
        }
        if (i2 == 0) {
            return this.f10681a.c();
        }
        int length = this.b.length;
        int[] iArr = new int[i + length];
        for (int i3 = 0; i3 < length; i3++) {
            iArr[i3] = this.f10681a.c(this.b[i3], i2);
        }
        return new C3047ra(this.f10681a, iArr);
    }
}
