package com.huawei.hms.scankit.p;

import com.google.zxing.pdf417.PDF417Common;
import com.huawei.hms.scankit.aiscan.common.C2967a;
import java.util.Formatter;

/* compiled from: DetectionResult.java */
/* renamed from: com.huawei.hms.scankit.p.la, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
final class C3024la {

    /* renamed from: a, reason: collision with root package name */
    private final C3000fa f10664a;
    private final C3028ma[] b;
    private C3008ha c;
    private final int d;

    C3024la(C3000fa c3000fa, C3008ha c3008ha) {
        this.f10664a = c3000fa;
        int a2 = c3000fa.a();
        this.d = a2;
        this.c = c3008ha;
        this.b = new C3028ma[a2 + 2];
    }

    private void a(C3028ma c3028ma) throws C2967a {
        if (c3028ma != null) {
            try {
                ((C3032na) c3028ma).a(this.f10664a);
            } catch (ClassCastException unused) {
                throw C2967a.a();
            }
        }
    }

    private int f() {
        int g = g();
        if (g == 0) {
            return 0;
        }
        for (int i = 1; i < this.d + 1; i++) {
            C3012ia[] b = this.b[i].b();
            for (int i2 = 0; i2 < b.length; i2++) {
                C3012ia c3012ia = b[i2];
                if (c3012ia != null && !c3012ia.g()) {
                    a(i, i2, b);
                }
            }
        }
        return g;
    }

    private int g() {
        h();
        return i() + j();
    }

    private void h() {
        C3028ma[] c3028maArr = this.b;
        C3028ma c3028ma = c3028maArr[0];
        if (c3028ma == null || c3028maArr[this.d + 1] == null) {
            return;
        }
        C3012ia[] b = c3028ma.b();
        C3012ia[] b2 = this.b[this.d + 1].b();
        for (int i = 0; i < b.length; i++) {
            C3012ia c3012ia = b[i];
            if (c3012ia != null && b2[i] != null && c3012ia.c() == b2[i].c()) {
                for (int i2 = 1; i2 <= this.d; i2++) {
                    C3012ia c3012ia2 = this.b[i2].b()[i];
                    if (c3012ia2 != null) {
                        c3012ia2.b(b[i].c());
                        if (!c3012ia2.g()) {
                            this.b[i2].b()[i] = null;
                        }
                    }
                }
            }
        }
    }

    private int i() {
        C3028ma c3028ma = this.b[0];
        if (c3028ma == null) {
            return 0;
        }
        C3012ia[] b = c3028ma.b();
        int i = 0;
        for (int i2 = 0; i2 < b.length; i2++) {
            C3012ia c3012ia = b[i2];
            if (c3012ia != null) {
                int c = c3012ia.c();
                int i3 = 0;
                for (int i4 = 1; i4 < this.d + 1 && i3 < 2; i4++) {
                    C3012ia c3012ia2 = this.b[i4].b()[i2];
                    if (c3012ia2 != null) {
                        i3 = a(c, i3, c3012ia2);
                        if (!c3012ia2.g()) {
                            i++;
                        }
                    }
                }
            }
        }
        return i;
    }

    private int j() {
        C3028ma c3028ma = this.b[this.d + 1];
        if (c3028ma == null) {
            return 0;
        }
        C3012ia[] b = c3028ma.b();
        int i = 0;
        for (int i2 = 0; i2 < b.length; i2++) {
            C3012ia c3012ia = b[i2];
            if (c3012ia != null) {
                int c = c3012ia.c();
                int i3 = 0;
                for (int i4 = this.d + 1; i4 > 0 && i3 < 2; i4--) {
                    C3012ia c3012ia2 = this.b[i4].b()[i2];
                    if (c3012ia2 != null) {
                        i3 = a(c, i3, c3012ia2);
                        if (!c3012ia2.g()) {
                            i++;
                        }
                    }
                }
            }
        }
        return i;
    }

    int b() {
        return this.f10664a.b();
    }

    int c() {
        return this.f10664a.c();
    }

    C3008ha d() {
        return this.c;
    }

    C3028ma[] e() throws C2967a {
        a(this.b[0]);
        a(this.b[this.d + 1]);
        int i = PDF417Common.MAX_CODEWORDS_IN_BARCODE;
        while (true) {
            int f = f();
            if (f <= 0 || f >= i) {
                break;
            }
            i = f;
        }
        return this.b;
    }

    public String toString() {
        C3028ma[] c3028maArr = this.b;
        C3028ma c3028ma = c3028maArr[0];
        if (c3028ma == null) {
            c3028ma = c3028maArr[this.d + 1];
        }
        Formatter formatter = new Formatter();
        for (int i = 0; i < c3028ma.b().length; i++) {
            try {
                formatter.format("CW %3d:", Integer.valueOf(i));
                for (int i2 = 0; i2 < this.d + 2; i2++) {
                    C3028ma c3028ma2 = this.b[i2];
                    if (c3028ma2 == null) {
                        formatter.format("    |   ", new Object[0]);
                    } else {
                        C3012ia c3012ia = c3028ma2.b()[i];
                        if (c3012ia == null) {
                            formatter.format("    |   ", new Object[0]);
                        } else {
                            formatter.format(" %3d|%3d", Integer.valueOf(c3012ia.c()), Integer.valueOf(c3012ia.e()));
                        }
                    }
                }
                formatter.format("%n", new Object[0]);
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    try {
                        formatter.close();
                    } catch (Throwable th3) {
                        th.addSuppressed(th3);
                    }
                    throw th2;
                }
            }
        }
        String formatter2 = formatter.toString();
        formatter.close();
        return formatter2;
    }

    private static int a(int i, int i2, C3012ia c3012ia) {
        if (c3012ia == null || c3012ia.g()) {
            return i2;
        }
        if (!c3012ia.a(i)) {
            return i2 + 1;
        }
        c3012ia.b(i);
        return 0;
    }

    private void a(int i, int i2, C3012ia[] c3012iaArr) {
        C3012ia c3012ia = c3012iaArr[i2];
        C3012ia[] b = this.b[i - 1].b();
        C3028ma c3028ma = this.b[i + 1];
        C3012ia[] b2 = c3028ma != null ? c3028ma.b() : b;
        C3012ia[] c3012iaArr2 = new C3012ia[14];
        c3012iaArr2[2] = b[i2];
        c3012iaArr2[3] = b2[i2];
        if (i2 > 0) {
            int i3 = i2 - 1;
            c3012iaArr2[0] = c3012iaArr[i3];
            c3012iaArr2[4] = b[i3];
            c3012iaArr2[5] = b2[i3];
        }
        if (i2 > 1) {
            int i4 = i2 - 2;
            c3012iaArr2[8] = c3012iaArr[i4];
            c3012iaArr2[10] = b[i4];
            c3012iaArr2[11] = b2[i4];
        }
        if (i2 < c3012iaArr.length - 1) {
            int i5 = i2 + 1;
            c3012iaArr2[1] = c3012iaArr[i5];
            c3012iaArr2[6] = b[i5];
            c3012iaArr2[7] = b2[i5];
        }
        if (i2 < c3012iaArr.length - 2) {
            int i6 = i2 + 2;
            c3012iaArr2[9] = c3012iaArr[i6];
            c3012iaArr2[12] = b[i6];
            c3012iaArr2[13] = b2[i6];
        }
        for (int i7 = 0; i7 < 14 && !a(c3012ia, c3012iaArr2[i7]); i7++) {
        }
    }

    private static boolean a(C3012ia c3012ia, C3012ia c3012ia2) {
        if (c3012ia2 == null || !c3012ia2.g() || c3012ia2.a() != c3012ia.a()) {
            return false;
        }
        c3012ia.b(c3012ia2.c());
        return true;
    }

    int a() {
        return this.d;
    }

    void a(C3008ha c3008ha) {
        this.c = c3008ha;
    }

    void a(int i, C3028ma c3028ma) {
        this.b[i] = c3028ma;
    }

    C3028ma a(int i) {
        return this.b[i];
    }
}
