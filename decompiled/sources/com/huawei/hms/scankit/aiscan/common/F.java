package com.huawei.hms.scankit.aiscan.common;

import com.huawei.hms.scankit.p.C3074y;

/* compiled from: WhiteRectangleDetector.java */
/* loaded from: classes14.dex */
public final class F {

    /* renamed from: a, reason: collision with root package name */
    private final C3074y f10510a;
    private final int b;
    private final int c;
    private final int d;
    private final int e;
    private final int f;
    private final int g;

    public F(C3074y c3074y) throws C2967a {
        this(c3074y, 10, c3074y.d() / 2, c3074y.b() / 2);
    }

    private z[] b(int[] iArr) throws C2967a {
        int i = iArr[1] - iArr[0];
        z zVar = null;
        z zVar2 = null;
        for (int i2 = 1; zVar2 == null && i2 < i; i2++) {
            zVar2 = a(iArr[0], r6 - i2, r4 + i2, iArr[3]);
        }
        if (zVar2 == null) {
            throw C2967a.a();
        }
        z zVar3 = null;
        for (int i3 = 1; zVar3 == null && i3 < i; i3++) {
            zVar3 = a(iArr[0], r8 + i3, r5 + i3, iArr[2]);
        }
        if (zVar3 == null) {
            throw C2967a.a();
        }
        z zVar4 = null;
        for (int i4 = 1; zVar4 == null && i4 < i; i4++) {
            zVar4 = a(iArr[1], r10 + i4, r2 - i4, iArr[2]);
        }
        if (zVar4 == null) {
            throw C2967a.a();
        }
        for (int i5 = 1; zVar == null && i5 < i; i5++) {
            zVar = a(iArr[1], r9 - i5, r3 - i5, iArr[3]);
        }
        if (zVar != null) {
            return a(zVar, zVar2, zVar4, zVar3);
        }
        throw C2967a.a();
    }

    private void c(int[] iArr) {
        int i;
        boolean z = true;
        while (true) {
            if ((!z && iArr[9] == 1) || (i = iArr[0]) < 0) {
                return;
            }
            boolean a2 = a(iArr[2], iArr[3], i, false);
            if (a2) {
                iArr[0] = iArr[0] - 1;
                iArr[5] = 1;
                iArr[9] = 1;
            } else if (iArr[9] != 1) {
                iArr[0] = iArr[0] - 1;
            }
            z = a2;
        }
    }

    private void d(int[] iArr) {
        int i;
        boolean z = true;
        while (true) {
            if ((!z && iArr[7] == 1) || (i = iArr[1]) >= this.c) {
                return;
            }
            z = a(iArr[2], iArr[3], i, false);
            if (z) {
                iArr[1] = iArr[1] + 1;
                iArr[5] = 1;
                iArr[7] = 1;
            } else if (iArr[7] != 1) {
                iArr[1] = iArr[1] + 1;
            }
        }
    }

    private void e(int[] iArr) {
        int i;
        boolean z = true;
        while (true) {
            if ((!z && iArr[10] == 1) || (i = iArr[2]) < 0) {
                return;
            }
            boolean a2 = a(iArr[0], iArr[1], i, true);
            if (a2) {
                iArr[2] = iArr[2] - 1;
                iArr[5] = 1;
                iArr[10] = 1;
            } else if (iArr[10] != 1) {
                iArr[2] = iArr[2] - 1;
            }
            z = a2;
        }
    }

    public z[] a() throws C2967a {
        int[] iArr = {this.d, this.e, this.g, this.f, 0, 1, 0, 0, 0, 0, 0};
        while (true) {
            if (iArr[5] != 1) {
                break;
            }
            iArr[5] = 0;
            d(iArr);
            if (iArr[1] >= this.c) {
                iArr[4] = 1;
                break;
            }
            a(iArr);
            if (iArr[3] >= this.b) {
                iArr[4] = 1;
                break;
            }
            c(iArr);
            if (iArr[0] < 0) {
                iArr[4] = 1;
                break;
            }
            e(iArr);
            if (iArr[2] < 0) {
                iArr[4] = 1;
                break;
            }
            if (iArr[5] == 1) {
                iArr[6] = 1;
            }
        }
        if (iArr[4] == 1 || iArr[6] != 1) {
            throw C2967a.a();
        }
        return b(iArr);
    }

    public F(C3074y c3074y, int i, int i2, int i3) throws C2967a {
        this.f10510a = c3074y;
        int b = c3074y.b();
        this.b = b;
        int d = c3074y.d();
        this.c = d;
        int i4 = i / 2;
        int i5 = i2 - i4;
        this.d = i5;
        int i6 = i2 + i4;
        this.e = i6;
        int i7 = i3 - i4;
        this.g = i7;
        int i8 = i3 + i4;
        this.f = i8;
        if (i7 < 0 || i5 < 0 || i8 >= b || i6 >= d) {
            throw C2967a.a();
        }
    }

    private void a(int[] iArr) {
        int i;
        boolean z = true;
        while (true) {
            if ((!z && iArr[8] == 1) || (i = iArr[3]) >= this.b) {
                return;
            }
            boolean a2 = a(iArr[0], iArr[1], i, true);
            if (a2) {
                iArr[3] = iArr[3] + 1;
                iArr[5] = 1;
                iArr[8] = 1;
            } else if (iArr[8] != 1) {
                iArr[3] = iArr[3] + 1;
            }
            z = a2;
        }
    }

    private z a(float f, float f2, float f3, float f4) {
        int a2 = n.a(n.a(f, f2, f3, f4));
        float f5 = a2;
        float f6 = (f3 - f) / f5;
        float f7 = (f4 - f2) / f5;
        for (int i = 0; i < a2; i++) {
            float f8 = i;
            int a3 = n.a((f8 * f6) + f);
            int a4 = n.a((f8 * f7) + f2);
            if (this.f10510a.b(a3, a4)) {
                return new z(a3, a4);
            }
        }
        return null;
    }

    private z[] a(z zVar, z zVar2, z zVar3, z zVar4) {
        float b = zVar.b();
        float c = zVar.c();
        float b2 = zVar2.b();
        float c2 = zVar2.c();
        float b3 = zVar3.b();
        float c3 = zVar3.c();
        float b4 = zVar4.b();
        float c4 = zVar4.c();
        if (b < this.c / 2.0f) {
            return new z[]{new z(b4 - 1.0f, c4 + 1.0f), new z(b2 + 1.0f, c2 + 1.0f), new z(b3 - 1.0f, c3 - 1.0f), new z(b + 1.0f, c - 1.0f)};
        }
        return new z[]{new z(b4 + 1.0f, c4 + 1.0f), new z(b2 + 1.0f, c2 - 1.0f), new z(b3 - 1.0f, c3 + 1.0f), new z(b - 1.0f, c - 1.0f)};
    }

    private boolean a(int i, int i2, int i3, boolean z) {
        if (z) {
            while (i <= i2) {
                if (this.f10510a.b(i, i3)) {
                    return true;
                }
                i++;
            }
            return false;
        }
        while (i <= i2) {
            if (this.f10510a.b(i3, i)) {
                return true;
            }
            i++;
        }
        return false;
    }
}
