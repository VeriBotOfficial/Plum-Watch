package com.huawei.hms.scankit.p;

import com.huawei.hms.scankit.aiscan.common.C2967a;

/* compiled from: Detector.java */
/* loaded from: classes14.dex */
public final class I {

    /* renamed from: a, reason: collision with root package name */
    private final C3074y f10566a;
    private final com.huawei.hms.scankit.aiscan.common.F b;

    public I(C3074y c3074y) throws C2967a {
        this.f10566a = c3074y;
        this.b = new com.huawei.hms.scankit.aiscan.common.F(c3074y);
    }

    private com.huawei.hms.scankit.aiscan.common.z[] b(com.huawei.hms.scankit.aiscan.common.z[] zVarArr) {
        com.huawei.hms.scankit.aiscan.common.z zVar = zVarArr[0];
        com.huawei.hms.scankit.aiscan.common.z zVar2 = zVarArr[1];
        com.huawei.hms.scankit.aiscan.common.z zVar3 = zVarArr[3];
        com.huawei.hms.scankit.aiscan.common.z zVar4 = zVarArr[2];
        int a2 = a(zVar, zVar2);
        int a3 = a(zVar2, zVar3);
        int a4 = a(zVar3, zVar4);
        int a5 = a(zVar4, zVar);
        com.huawei.hms.scankit.aiscan.common.z[] zVarArr2 = {zVar4, zVar, zVar2, zVar3};
        if (a2 > a3) {
            zVarArr2[0] = zVar;
            zVarArr2[1] = zVar2;
            zVarArr2[2] = zVar3;
            zVarArr2[3] = zVar4;
            a2 = a3;
        }
        if (a2 > a4) {
            zVarArr2[0] = zVar2;
            zVarArr2[1] = zVar3;
            zVarArr2[2] = zVar4;
            zVarArr2[3] = zVar;
        } else {
            a4 = a2;
        }
        if (a4 > a5) {
            zVarArr2[0] = zVar3;
            zVarArr2[1] = zVar4;
            zVarArr2[2] = zVar;
            zVarArr2[3] = zVar2;
        }
        return zVarArr2;
    }

    private com.huawei.hms.scankit.aiscan.common.z[] c(com.huawei.hms.scankit.aiscan.common.z[] zVarArr) {
        com.huawei.hms.scankit.aiscan.common.z zVar = zVarArr[0];
        com.huawei.hms.scankit.aiscan.common.z zVar2 = zVarArr[1];
        com.huawei.hms.scankit.aiscan.common.z zVar3 = zVarArr[2];
        com.huawei.hms.scankit.aiscan.common.z zVar4 = zVarArr[3];
        int a2 = (a(zVar, zVar4) + 1) * 4;
        if (a(a(zVar2, zVar3, a2), zVar) < a(a(zVar3, zVar2, a2), zVar4)) {
            zVarArr[0] = zVar;
            zVarArr[1] = zVar2;
            zVarArr[2] = zVar3;
            zVarArr[3] = zVar4;
            return zVarArr;
        }
        zVarArr[0] = zVar2;
        zVarArr[1] = zVar3;
        zVarArr[2] = zVar4;
        zVarArr[3] = zVar;
        return zVarArr;
    }

    private com.huawei.hms.scankit.aiscan.common.z[] d(com.huawei.hms.scankit.aiscan.common.z[] zVarArr) {
        com.huawei.hms.scankit.aiscan.common.z zVar = zVarArr[0];
        com.huawei.hms.scankit.aiscan.common.z zVar2 = zVarArr[1];
        com.huawei.hms.scankit.aiscan.common.z zVar3 = zVarArr[2];
        com.huawei.hms.scankit.aiscan.common.z zVar4 = zVarArr[3];
        int a2 = a(zVar, zVar4) + 1;
        com.huawei.hms.scankit.aiscan.common.z a3 = a(zVar, zVar2, (a(zVar3, zVar4) + 1) * 4);
        com.huawei.hms.scankit.aiscan.common.z a4 = a(zVar3, zVar2, a2 * 4);
        int a5 = a(a3, zVar4);
        int i = a5 + 1;
        int a6 = a(a4, zVar4);
        int i2 = a6 + 1;
        if ((i & 1) == 1) {
            i = a5 + 2;
        }
        if ((i2 & 1) == 1) {
            i2 = a6 + 2;
        }
        float b = (((zVar.b() + zVar2.b()) + zVar3.b()) + zVar4.b()) / 4.0f;
        float c = (((zVar.c() + zVar2.c()) + zVar3.c()) + zVar4.c()) / 4.0f;
        com.huawei.hms.scankit.aiscan.common.z a7 = a(zVar, b, c);
        com.huawei.hms.scankit.aiscan.common.z a8 = a(zVar2, b, c);
        com.huawei.hms.scankit.aiscan.common.z a9 = a(zVar3, b, c);
        com.huawei.hms.scankit.aiscan.common.z a10 = a(zVar4, b, c);
        int i3 = i2 * 4;
        int i4 = i * 4;
        return new com.huawei.hms.scankit.aiscan.common.z[]{a(a(a7, a8, i3), a10, i4), a(a(a8, a7, i3), a9, i4), a(a(a9, a10, i3), a8, i4), a(a(a10, a9, i3), a7, i4)};
    }

    public com.huawei.hms.scankit.aiscan.common.g a() throws C2967a {
        int i;
        com.huawei.hms.scankit.aiscan.common.z[] c = c(b(this.b.a()));
        com.huawei.hms.scankit.aiscan.common.z a2 = a(c);
        c[3] = a2;
        if (a2 == null) {
            throw C2967a.a();
        }
        com.huawei.hms.scankit.aiscan.common.z[] d = d(c);
        com.huawei.hms.scankit.aiscan.common.z zVar = d[0];
        com.huawei.hms.scankit.aiscan.common.z zVar2 = d[1];
        com.huawei.hms.scankit.aiscan.common.z zVar3 = d[2];
        com.huawei.hms.scankit.aiscan.common.z zVar4 = d[3];
        int a3 = a(zVar, zVar4);
        int i2 = a3 + 1;
        int a4 = a(zVar3, zVar4);
        int i3 = a4 + 1;
        if ((i2 & 1) == 1) {
            i2 = a3 + 2;
        }
        if ((i3 & 1) == 1) {
            i3 = a4 + 2;
        }
        if (i2 * 4 >= i3 * 7 || i3 * 4 >= i2 * 7) {
            i = i2;
        } else {
            i = Math.max(i2, i3);
            i3 = i;
        }
        return new com.huawei.hms.scankit.aiscan.common.g(a(this.f10566a, zVar, zVar2, zVar3, zVar4, i, i3), new com.huawei.hms.scankit.aiscan.common.z[]{zVar, zVar2, zVar3, zVar4});
    }

    private static com.huawei.hms.scankit.aiscan.common.z a(com.huawei.hms.scankit.aiscan.common.z zVar, com.huawei.hms.scankit.aiscan.common.z zVar2, int i) {
        float f = i + 1;
        return new com.huawei.hms.scankit.aiscan.common.z(zVar.b() + ((zVar2.b() - zVar.b()) / f), zVar.c() + ((zVar2.c() - zVar.c()) / f));
    }

    private static com.huawei.hms.scankit.aiscan.common.z a(com.huawei.hms.scankit.aiscan.common.z zVar, float f, float f2) {
        float b = zVar.b();
        float c = zVar.c();
        return new com.huawei.hms.scankit.aiscan.common.z(b < f ? b - 1.0f : b + 1.0f, c < f2 ? c - 1.0f : c + 1.0f);
    }

    private com.huawei.hms.scankit.aiscan.common.z a(com.huawei.hms.scankit.aiscan.common.z[] zVarArr) {
        com.huawei.hms.scankit.aiscan.common.z zVar = zVarArr[0];
        com.huawei.hms.scankit.aiscan.common.z zVar2 = zVarArr[1];
        com.huawei.hms.scankit.aiscan.common.z zVar3 = zVarArr[2];
        com.huawei.hms.scankit.aiscan.common.z zVar4 = zVarArr[3];
        int a2 = a(zVar, zVar4);
        com.huawei.hms.scankit.aiscan.common.z a3 = a(zVar, zVar2, (a(zVar2, zVar4) + 1) * 4);
        com.huawei.hms.scankit.aiscan.common.z a4 = a(zVar3, zVar2, (a2 + 1) * 4);
        int a5 = a(a3, zVar4);
        int a6 = a(a4, zVar4);
        float f = a5 + 1;
        com.huawei.hms.scankit.aiscan.common.z zVar5 = new com.huawei.hms.scankit.aiscan.common.z(zVar4.b() + ((zVar3.b() - zVar2.b()) / f), zVar4.c() + ((zVar3.c() - zVar2.c()) / f));
        float f2 = a6 + 1;
        com.huawei.hms.scankit.aiscan.common.z zVar6 = new com.huawei.hms.scankit.aiscan.common.z(zVar4.b() + ((zVar.b() - zVar2.b()) / f2), zVar4.c() + ((zVar.c() - zVar2.c()) / f2));
        if (!a(zVar5)) {
            if (!a(zVar6)) {
                return null;
            }
        } else if (!a(zVar6) || a(a3, zVar5) + a(a4, zVar5) > a(a3, zVar6) + a(a4, zVar6)) {
            return zVar5;
        }
        return zVar6;
    }

    private boolean a(com.huawei.hms.scankit.aiscan.common.z zVar) {
        return zVar.b() >= 0.0f && zVar.b() < ((float) this.f10566a.d()) && zVar.c() > 0.0f && zVar.c() < ((float) this.f10566a.b());
    }

    private static C3074y a(C3074y c3074y, com.huawei.hms.scankit.aiscan.common.z zVar, com.huawei.hms.scankit.aiscan.common.z zVar2, com.huawei.hms.scankit.aiscan.common.z zVar3, com.huawei.hms.scankit.aiscan.common.z zVar4, int i, int i2) throws C2967a {
        float f = i - 0.5f;
        float f2 = i2 - 0.5f;
        return com.huawei.hms.scankit.aiscan.common.j.a().a(c3074y, i, i2, 0.5f, 0.5f, f, 0.5f, f, f2, 0.5f, f2, zVar.b(), zVar.c(), zVar4.b(), zVar4.c(), zVar3.b(), zVar3.c(), zVar2.b(), zVar2.c());
    }

    private int a(com.huawei.hms.scankit.aiscan.common.z zVar, com.huawei.hms.scankit.aiscan.common.z zVar2) {
        int i;
        boolean z;
        I i2 = this;
        int b = (int) zVar.b();
        int c = (int) zVar.c();
        int b2 = (int) zVar2.b();
        int c2 = (int) zVar2.c();
        boolean z2 = Math.abs(c2 - c) > Math.abs(b2 - b);
        if (!z2) {
            c = b;
            b = c;
            c2 = b2;
            b2 = c2;
        }
        int abs = Math.abs(c2 - c);
        int abs2 = Math.abs(b2 - b);
        int i3 = (-abs) / 2;
        int i4 = b < b2 ? 1 : -1;
        int i5 = c < c2 ? 1 : -1;
        boolean b3 = i2.f10566a.b(z2 ? b : c, z2 ? c : b);
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        while (c != c2) {
            boolean b4 = i2.f10566a.b(z2 ? b : c, z2 ? c : b);
            i6++;
            if (b4 != b3) {
                i = c2;
                z = z2;
                if (i6 > Math.ceil(i7 / 1.5d)) {
                    i8++;
                    i7 -= (i7 - i6) / i8;
                    b3 = b4;
                    i6 = 0;
                }
            } else {
                i = c2;
                z = z2;
            }
            i3 += abs2;
            if (i3 > 0) {
                if (b == b2) {
                    return i8;
                }
                b += i4;
                i3 -= abs;
            }
            c += i5;
            i2 = this;
            z2 = z;
            c2 = i;
        }
        return i8;
    }
}
