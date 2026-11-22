package com.huawei.hms.scankit.p;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.parser.TokenTypes;
import com.huawei.hms.scankit.aiscan.common.C2967a;
import kotlin.text.Typography;
import org.opencv.videoio.Videoio;

/* compiled from: Detector.java */
/* renamed from: com.huawei.hms.scankit.p.u, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C3058u {

    /* renamed from: a, reason: collision with root package name */
    private static final int[] f10691a = {3808, Videoio.CAP_PROP_XI_GAMMAY, TokenTypes.REASON, 1799};
    private final C3074y b;
    private boolean c;
    private int d;
    private int e;
    private int f;
    private int g;

    /* compiled from: Detector.java */
    /* renamed from: com.huawei.hms.scankit.p.u$a */
    static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final int f10692a;
        private final int b;

        a(int i, int i2) {
            this.f10692a = i;
            this.b = i2;
        }

        com.huawei.hms.scankit.aiscan.common.z c() {
            return new com.huawei.hms.scankit.aiscan.common.z(this.f10692a, this.b);
        }

        public String toString() {
            return Separators.LESS_THAN + this.f10692a + ' ' + this.b + Typography.greater;
        }

        int a() {
            return this.f10692a;
        }

        int b() {
            return this.b;
        }
    }

    public C3058u(C3074y c3074y) {
        this.b = c3074y;
    }

    private a b() {
        com.huawei.hms.scankit.aiscan.common.z c;
        com.huawei.hms.scankit.aiscan.common.z zVar;
        com.huawei.hms.scankit.aiscan.common.z zVar2;
        com.huawei.hms.scankit.aiscan.common.z zVar3;
        com.huawei.hms.scankit.aiscan.common.z c2;
        com.huawei.hms.scankit.aiscan.common.z c3;
        com.huawei.hms.scankit.aiscan.common.z c4;
        com.huawei.hms.scankit.aiscan.common.z c5;
        try {
            com.huawei.hms.scankit.aiscan.common.z[] a2 = new com.huawei.hms.scankit.aiscan.common.F(this.b).a();
            zVar2 = a2[0];
            zVar3 = a2[1];
            zVar = a2[2];
            c = a2[3];
        } catch (C2967a unused) {
            int d = this.b.d() / 2;
            int b = this.b.b() / 2;
            int i = d + 7;
            int i2 = b - 7;
            com.huawei.hms.scankit.aiscan.common.z c6 = a(new a(i, i2), false, 1, -1).c();
            int i3 = b + 7;
            com.huawei.hms.scankit.aiscan.common.z c7 = a(new a(i, i3), false, 1, 1).c();
            int i4 = d - 7;
            com.huawei.hms.scankit.aiscan.common.z c8 = a(new a(i4, i3), false, -1, 1).c();
            c = a(new a(i4, i2), false, -1, -1).c();
            zVar = c8;
            zVar2 = c6;
            zVar3 = c7;
        }
        int a3 = com.huawei.hms.scankit.aiscan.common.n.a((((zVar2.b() + c.b()) + zVar3.b()) + zVar.b()) / 4.0f);
        int a4 = com.huawei.hms.scankit.aiscan.common.n.a((((zVar2.c() + c.c()) + zVar3.c()) + zVar.c()) / 4.0f);
        try {
            com.huawei.hms.scankit.aiscan.common.z[] a5 = new com.huawei.hms.scankit.aiscan.common.F(this.b, 15, a3, a4).a();
            c2 = a5[0];
            c3 = a5[1];
            c4 = a5[2];
            c5 = a5[3];
        } catch (C2967a unused2) {
            int i5 = a3 + 7;
            int i6 = a4 - 7;
            c2 = a(new a(i5, i6), false, 1, -1).c();
            int i7 = a4 + 7;
            c3 = a(new a(i5, i7), false, 1, 1).c();
            int i8 = a3 - 7;
            c4 = a(new a(i8, i7), false, -1, 1).c();
            c5 = a(new a(i8, i6), false, -1, -1).c();
        }
        return new a(com.huawei.hms.scankit.aiscan.common.n.a((((c2.b() + c5.b()) + c3.b()) + c4.b()) / 4.0f), com.huawei.hms.scankit.aiscan.common.n.a((((c2.c() + c5.c()) + c3.c()) + c4.c()) / 4.0f));
    }

    public C3043q a(boolean z) throws C2967a {
        com.huawei.hms.scankit.aiscan.common.z[] a2 = a(b());
        if (z) {
            com.huawei.hms.scankit.aiscan.common.z zVar = a2[0];
            a2[0] = a2[2];
            a2[2] = zVar;
        }
        a(a2);
        C3074y c3074y = this.b;
        int i = this.g;
        return new C3043q(a(c3074y, a2[i % 4], a2[(i + 1) % 4], a2[(i + 2) % 4], a2[(i + 3) % 4]), b(a2), this.c, this.e, this.d);
    }

    private void a(com.huawei.hms.scankit.aiscan.common.z[] zVarArr) throws C2967a {
        long j;
        long j2;
        if (a(zVarArr[0]) && a(zVarArr[1]) && a(zVarArr[2]) && a(zVarArr[3])) {
            int i = this.f * 2;
            int[] iArr = {a(zVarArr[0], zVarArr[1], i), a(zVarArr[1], zVarArr[2], i), a(zVarArr[2], zVarArr[3], i), a(zVarArr[3], zVarArr[0], i)};
            this.g = a(iArr, i);
            long j3 = 0;
            for (int i2 = 0; i2 < 4; i2++) {
                int i3 = iArr[(this.g + i2) % 4];
                if (this.c) {
                    j = j3 << 7;
                    j2 = (i3 >> 1) & 127;
                } else {
                    j = j3 << 10;
                    j2 = ((i3 >> 2) & 992) + ((i3 >> 1) & 31);
                }
                j3 = j + j2;
            }
            int a2 = a(j3, this.c);
            if (this.c) {
                this.d = (a2 >> 6) + 1;
                this.e = (a2 & 63) + 1;
                return;
            } else {
                this.d = (a2 >> 11) + 1;
                this.e = (a2 & 2047) + 1;
                return;
            }
        }
        throw C2967a.a();
    }

    private com.huawei.hms.scankit.aiscan.common.z[] b(com.huawei.hms.scankit.aiscan.common.z[] zVarArr) {
        return a(zVarArr, this.f * 2, a());
    }

    private boolean b(a aVar, a aVar2, a aVar3, a aVar4) {
        a aVar5 = new a(aVar.a() - 3, aVar.b() + 3);
        a aVar6 = new a(aVar2.a() - 3, aVar2.b() - 3);
        a aVar7 = new a(aVar3.a() + 3, aVar3.b() - 3);
        a aVar8 = new a(aVar4.a() + 3, aVar4.b() + 3);
        int b = b(aVar8, aVar5);
        return b != 0 && b(aVar5, aVar6) == b && b(aVar6, aVar7) == b && b(aVar7, aVar8) == b;
    }

    private static int a(int[] iArr, int i) throws C2967a {
        int i2 = 0;
        for (int i3 : iArr) {
            i2 = (i2 << 3) + ((i3 >> (i - 2)) << 1) + (i3 & 1);
        }
        int i4 = ((i2 & 1) << 11) + (i2 >> 1);
        for (int i5 = 0; i5 < 4; i5++) {
            if (Integer.bitCount(f10691a[i5] ^ i4) <= 2) {
                return i5;
            }
        }
        throw C2967a.a();
    }

    private static int a(long j, boolean z) throws C2967a {
        int i;
        int i2;
        if (z) {
            i = 7;
            i2 = 2;
        } else {
            i = 10;
            i2 = 4;
        }
        int i3 = i - i2;
        int[] iArr = new int[i];
        for (int i4 = i - 1; i4 >= 0; i4--) {
            iArr[i4] = ((int) j) & 15;
            j >>= 4;
        }
        try {
            new com.huawei.hms.scankit.aiscan.common.u(com.huawei.hms.scankit.aiscan.common.h.d).a(iArr, i3);
            int i5 = 0;
            for (int i6 = 0; i6 < i2; i6++) {
                i5 = (i5 << 4) + iArr[i6];
            }
            return i5;
        } catch (C2967a unused) {
            throw C2967a.a();
        }
    }

    private int b(a aVar, a aVar2) {
        float a2 = a(aVar, aVar2);
        float a3 = (aVar2.a() - aVar.a()) / a2;
        float b = (aVar2.b() - aVar.b()) / a2;
        float a4 = aVar.a();
        float b2 = aVar.b();
        boolean b3 = this.b.b(aVar.a(), aVar.b());
        int ceil = (int) Math.ceil(a2);
        int i = 0;
        for (int i2 = 0; i2 < ceil; i2++) {
            a4 += a3;
            b2 += b;
            if (this.b.b(com.huawei.hms.scankit.aiscan.common.n.a(a4), com.huawei.hms.scankit.aiscan.common.n.a(b2)) != b3) {
                i++;
            }
        }
        float f = i / a2;
        if (f <= 0.1f || f >= 0.9f) {
            return (f <= 0.1f) == b3 ? 1 : -1;
        }
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private com.huawei.hms.scankit.aiscan.common.z[] a(a aVar) throws C2967a {
        int i;
        int i2 = 1;
        this.f = 1;
        a aVar2 = aVar;
        a aVar3 = aVar2;
        a aVar4 = aVar3;
        a aVar5 = aVar4;
        boolean z = true;
        while (true) {
            if (this.f >= 9) {
                i = i2;
                break;
            }
            a a2 = a(aVar5, z, i2, -1);
            a a3 = a(aVar4, z, i2, i2);
            a a4 = a(aVar3, z, -1, i2);
            a a5 = a(aVar2, z, -1, -1);
            if (this.f > 2) {
                i = i2;
                double a6 = (a(a5, a2) * this.f) / (a(aVar2, aVar5) * (this.f + 2));
                if (a6 < 0.75d) {
                    break;
                }
                if (a6 > 1.25d) {
                    break;
                }
                if (!a(a2, a3, a4, a5)) {
                    break;
                }
                if (!b(a2, a3, a4, a5)) {
                    int i3 = this.f;
                    if (i3 == 5 || i3 == 7) {
                        break;
                    }
                } else {
                    continue;
                }
            } else {
                i = i2;
            }
            z = !z;
            this.f++;
            aVar2 = a5;
            aVar5 = a2;
            aVar4 = a3;
            aVar3 = a4;
            i2 = i;
        }
        int i4 = this.f;
        if (i4 != 5 && i4 != 7) {
            throw C2967a.a();
        }
        this.c = i4 == 5 ? i : 0;
        com.huawei.hms.scankit.aiscan.common.z zVar = new com.huawei.hms.scankit.aiscan.common.z(aVar5.a() + 0.5f, aVar5.b() - 0.5f);
        com.huawei.hms.scankit.aiscan.common.z zVar2 = new com.huawei.hms.scankit.aiscan.common.z(aVar4.a() + 0.5f, aVar4.b() + 0.5f);
        com.huawei.hms.scankit.aiscan.common.z zVar3 = new com.huawei.hms.scankit.aiscan.common.z(aVar3.a() - 0.5f, aVar3.b() + 0.5f);
        com.huawei.hms.scankit.aiscan.common.z zVar4 = new com.huawei.hms.scankit.aiscan.common.z(aVar2.a() - 0.5f, aVar2.b() - 0.5f);
        com.huawei.hms.scankit.aiscan.common.z[] zVarArr = new com.huawei.hms.scankit.aiscan.common.z[4];
        zVarArr[0] = zVar;
        zVarArr[i] = zVar2;
        zVarArr[2] = zVar3;
        zVarArr[3] = zVar4;
        int i5 = this.f * 2;
        return a(zVarArr, i5 - 3, i5);
    }

    private C3074y a(C3074y c3074y, com.huawei.hms.scankit.aiscan.common.z zVar, com.huawei.hms.scankit.aiscan.common.z zVar2, com.huawei.hms.scankit.aiscan.common.z zVar3, com.huawei.hms.scankit.aiscan.common.z zVar4) throws C2967a {
        com.huawei.hms.scankit.aiscan.common.j a2 = com.huawei.hms.scankit.aiscan.common.j.a();
        int a3 = a();
        float f = a3 / 2.0f;
        float f2 = this.f;
        float f3 = f - f2;
        float f4 = f + f2;
        return a2.a(c3074y, a3, a3, f3, f3, f4, f3, f4, f4, f3, f4, zVar.b(), zVar.c(), zVar2.b(), zVar2.c(), zVar3.b(), zVar3.c(), zVar4.b(), zVar4.c());
    }

    private int a(com.huawei.hms.scankit.aiscan.common.z zVar, com.huawei.hms.scankit.aiscan.common.z zVar2, int i) {
        float a2 = a(zVar, zVar2);
        float f = a2 / i;
        float b = zVar.b();
        float c = zVar.c();
        float b2 = ((zVar2.b() - zVar.b()) * f) / a2;
        float c2 = (f * (zVar2.c() - zVar.c())) / a2;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            float f2 = i3;
            if (this.b.b(com.huawei.hms.scankit.aiscan.common.n.a((f2 * b2) + b), com.huawei.hms.scankit.aiscan.common.n.a((f2 * c2) + c))) {
                i2 |= 1 << ((i - i3) - 1);
            }
        }
        return i2;
    }

    private boolean a(a aVar, a aVar2, a aVar3, a aVar4) {
        a aVar5 = new a((int) Math.ceil((((aVar.f10692a + aVar2.f10692a) + aVar3.f10692a) + aVar4.f10692a) / 4.0f), (int) Math.ceil((((aVar.b + aVar2.b) + aVar3.b) + aVar4.b) / 4.0f));
        float a2 = a(aVar5, aVar);
        float a3 = a(aVar5, aVar2);
        float a4 = a(aVar5, aVar3);
        float a5 = a(aVar5, aVar4);
        double d = a2 / a3;
        if (d <= 0.75d || d >= 1.25d) {
            return false;
        }
        double d2 = a2 / a4;
        if (d2 <= 0.75d || d2 >= 1.25d) {
            return false;
        }
        double d3 = a2 / a5;
        return d3 > 0.75d && d3 < 1.25d;
    }

    private a a(a aVar, boolean z, int i, int i2) {
        int a2 = aVar.a() + i;
        int b = aVar.b();
        while (true) {
            b += i2;
            if (!a(a2, b) || this.b.b(a2, b) != z) {
                break;
            }
            a2 += i;
        }
        int i3 = a2 - i;
        int i4 = b - i2;
        while (a(i3, i4) && this.b.b(i3, i4) == z) {
            i3 += i;
        }
        int i5 = i3 - i;
        while (a(i5, i4) && this.b.b(i5, i4) == z) {
            i4 += i2;
        }
        return new a(i5, i4 - i2);
    }

    private static com.huawei.hms.scankit.aiscan.common.z[] a(com.huawei.hms.scankit.aiscan.common.z[] zVarArr, int i, int i2) {
        float f = i2 / (i * 2.0f);
        float b = zVarArr[0].b() - zVarArr[2].b();
        float c = zVarArr[0].c() - zVarArr[2].c();
        float b2 = (zVarArr[0].b() + zVarArr[2].b()) / 2.0f;
        float c2 = (zVarArr[0].c() + zVarArr[2].c()) / 2.0f;
        float f2 = b * f;
        float f3 = c * f;
        com.huawei.hms.scankit.aiscan.common.z zVar = new com.huawei.hms.scankit.aiscan.common.z(b2 + f2, c2 + f3);
        com.huawei.hms.scankit.aiscan.common.z zVar2 = new com.huawei.hms.scankit.aiscan.common.z(b2 - f2, c2 - f3);
        float b3 = zVarArr[1].b() - zVarArr[3].b();
        float c3 = zVarArr[1].c() - zVarArr[3].c();
        float b4 = (zVarArr[1].b() + zVarArr[3].b()) / 2.0f;
        float c4 = (zVarArr[1].c() + zVarArr[3].c()) / 2.0f;
        float f4 = b3 * f;
        float f5 = f * c3;
        return new com.huawei.hms.scankit.aiscan.common.z[]{zVar, new com.huawei.hms.scankit.aiscan.common.z(b4 + f4, c4 + f5), zVar2, new com.huawei.hms.scankit.aiscan.common.z(b4 - f4, c4 - f5)};
    }

    private boolean a(int i, int i2) {
        return i >= 0 && i < this.b.d() && i2 > 0 && i2 < this.b.b();
    }

    private boolean a(com.huawei.hms.scankit.aiscan.common.z zVar) {
        return a(com.huawei.hms.scankit.aiscan.common.n.a(zVar.b()), com.huawei.hms.scankit.aiscan.common.n.a(zVar.c()));
    }

    private static float a(a aVar, a aVar2) {
        return com.huawei.hms.scankit.aiscan.common.n.a(aVar.a(), aVar.b(), aVar2.a(), aVar2.b());
    }

    private static float a(com.huawei.hms.scankit.aiscan.common.z zVar, com.huawei.hms.scankit.aiscan.common.z zVar2) {
        return com.huawei.hms.scankit.aiscan.common.n.a(zVar.b(), zVar.c(), zVar2.b(), zVar2.c());
    }

    private int a() {
        if (this.c) {
            return (this.d * 4) + 11;
        }
        int i = this.d;
        return i <= 4 ? (i * 4) + 15 : (i * 4) + ((((i - 4) / 8) + 1) * 2) + 15;
    }
}
