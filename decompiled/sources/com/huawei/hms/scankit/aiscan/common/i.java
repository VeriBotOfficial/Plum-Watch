package com.huawei.hms.scankit.aiscan.common;

/* compiled from: GenericGFPoly.java */
/* loaded from: classes14.dex */
final class i {

    /* renamed from: a, reason: collision with root package name */
    private final h f10518a;
    private final int[] b;

    i(h hVar, int[] iArr) {
        if (iArr.length == 0) {
            throw new IllegalArgumentException();
        }
        this.f10518a = hVar;
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

    int[] a() {
        return this.b;
    }

    int b() {
        return this.b.length - 1;
    }

    boolean c() {
        return this.b[0] == 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(b() * 8);
        for (int b = b(); b >= 0; b--) {
            int b2 = b(b);
            if (b2 != 0) {
                if (b2 < 0) {
                    sb.append(" - ");
                    b2 = -b2;
                } else if (sb.length() > 0) {
                    sb.append(" + ");
                }
                if (b == 0 || b2 != 1) {
                    int c = this.f10518a.c(b2);
                    if (c == 0) {
                        sb.append('1');
                    } else if (c == 1) {
                        sb.append('a');
                    } else {
                        sb.append("a^");
                        sb.append(c);
                    }
                }
                if (b != 0) {
                    if (b == 1) {
                        sb.append('x');
                    } else {
                        sb.append("x^");
                        sb.append(b);
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
                i2 = h.a(i2, i3);
            }
            return i2;
        }
        int[] iArr = this.b;
        int i4 = iArr[0];
        int length = iArr.length;
        for (int i5 = 1; i5 < length; i5++) {
            i4 = h.a(this.f10518a.c(i, i4), this.b[i5]);
        }
        return i4;
    }

    int b(int i) {
        return this.b[(r0.length - 1) - i];
    }

    i c(i iVar) {
        if (!this.f10518a.equals(iVar.f10518a)) {
            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        }
        if (c() || iVar.c()) {
            return this.f10518a.d();
        }
        int[] iArr = this.b;
        int length = iArr.length;
        int[] iArr2 = iVar.b;
        int length2 = iArr2.length;
        int[] iArr3 = new int[(length + length2) - 1];
        for (int i = 0; i < length; i++) {
            int i2 = iArr[i];
            for (int i3 = 0; i3 < length2; i3++) {
                int i4 = i + i3;
                iArr3[i4] = h.a(iArr3[i4], this.f10518a.c(i2, iArr2[i3]));
            }
        }
        return new i(this.f10518a, iArr3);
    }

    i[] b(i iVar) {
        if (this.f10518a.equals(iVar.f10518a)) {
            if (!iVar.c()) {
                i d = this.f10518a.d();
                int b = this.f10518a.b(iVar.b(iVar.b()));
                i iVar2 = this;
                while (iVar2.b() >= iVar.b() && !iVar2.c()) {
                    int b2 = iVar2.b() - iVar.b();
                    int c = this.f10518a.c(iVar2.b(iVar2.b()), b);
                    i a2 = iVar.a(b2, c);
                    d = d.a(this.f10518a.b(b2, c));
                    iVar2 = iVar2.a(a2);
                }
                return new i[]{d, iVar2};
            }
            throw new IllegalArgumentException("Divide by 0");
        }
        throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
    }

    i a(i iVar) {
        if (this.f10518a.equals(iVar.f10518a)) {
            if (c()) {
                return iVar;
            }
            if (iVar.c()) {
                return this;
            }
            int[] iArr = this.b;
            int[] iArr2 = iVar.b;
            if (iArr.length <= iArr2.length) {
                iArr = iArr2;
                iArr2 = iArr;
            }
            int[] iArr3 = new int[iArr.length];
            int length = iArr.length - iArr2.length;
            System.arraycopy(iArr, 0, iArr3, 0, length);
            for (int i = length; i < iArr.length; i++) {
                iArr3[i] = h.a(iArr2[i - length], iArr[i]);
            }
            return new i(this.f10518a, iArr3);
        }
        throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
    }

    i c(int i) {
        if (i == 0) {
            return this.f10518a.d();
        }
        if (i == 1) {
            return this;
        }
        int length = this.b.length;
        int[] iArr = new int[length];
        for (int i2 = 0; i2 < length; i2++) {
            iArr[i2] = this.f10518a.c(this.b[i2], i);
        }
        return new i(this.f10518a, iArr);
    }

    i a(int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException();
        }
        if (i2 == 0) {
            return this.f10518a.d();
        }
        int length = this.b.length;
        int[] iArr = new int[i + length];
        for (int i3 = 0; i3 < length; i3++) {
            iArr[i3] = this.f10518a.c(this.b[i3], i2);
        }
        return new i(this.f10518a, iArr);
    }
}
