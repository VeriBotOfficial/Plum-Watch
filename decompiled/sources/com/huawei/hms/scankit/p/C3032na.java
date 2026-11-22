package com.huawei.hms.scankit.p;

import com.huawei.hms.scankit.aiscan.common.C2967a;

/* compiled from: DetectionResultRowIndicatorColumn.java */
/* renamed from: com.huawei.hms.scankit.p.na, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
final class C3032na extends C3028ma {
    private final boolean c;

    C3032na(C3008ha c3008ha, boolean z) {
        super(c3008ha);
        this.c = z;
    }

    private void b(C3000fa c3000fa) {
        C3008ha a2 = a();
        com.huawei.hms.scankit.aiscan.common.z g = this.c ? a2.g() : a2.h();
        com.huawei.hms.scankit.aiscan.common.z a3 = this.c ? a2.a() : a2.b();
        int c = c((int) a3.c());
        C3012ia[] b = b();
        int i = -1;
        int i2 = 0;
        int i3 = 1;
        for (int c2 = c((int) g.c()); c2 < c; c2++) {
            C3012ia c3012ia = b[c2];
            if (c3012ia != null) {
                c3012ia.h();
                int c3 = c3012ia.c() - i;
                if (c3 == 0) {
                    i2++;
                } else {
                    if (c3 == 1) {
                        i3 = Math.max(i3, i2);
                        i = c3012ia.c();
                    } else if (c3012ia.c() >= c3000fa.c()) {
                        b[c2] = null;
                    } else {
                        i = c3012ia.c();
                    }
                    i2 = 1;
                }
            }
        }
    }

    private void f() {
        for (C3012ia c3012ia : b()) {
            if (c3012ia != null) {
                c3012ia.h();
            }
        }
    }

    void a(C3000fa c3000fa) throws C2967a {
        C3012ia[] b = b();
        f();
        a(b, c3000fa);
        C3008ha a2 = a();
        com.huawei.hms.scankit.aiscan.common.z g = this.c ? a2.g() : a2.h();
        com.huawei.hms.scankit.aiscan.common.z a3 = this.c ? a2.a() : a2.b();
        int c = c((int) g.c());
        int c2 = c((int) a3.c());
        int i = -1;
        int i2 = 0;
        int i3 = 1;
        while (c < c2) {
            C3012ia c3012ia = b[c];
            if (c3012ia != null) {
                int c3 = c3012ia.c() - i;
                if (c3 == 0) {
                    i2++;
                } else {
                    if (c3 == 1) {
                        i3 = Math.max(i3, i2);
                        i = c3012ia.c();
                    } else if (c3 < 0 || c3012ia.c() >= c3000fa.c() || c3 > c) {
                        b[c] = null;
                    } else {
                        if (i3 > 2) {
                            c3 *= i3 - 2;
                        }
                        boolean z = c3 >= c;
                        for (int i4 = 1; i4 <= c3 && !z; i4++) {
                            z = b[c - i4] != null;
                        }
                        if (z) {
                            b[c] = null;
                        } else {
                            i = c3012ia.c();
                        }
                    }
                    i2 = 1;
                }
            }
            c++;
        }
    }

    C3000fa c() throws C2967a {
        C3012ia[] b = b();
        C3004ga c3004ga = new C3004ga();
        C3004ga c3004ga2 = new C3004ga();
        C3004ga c3004ga3 = new C3004ga();
        C3004ga c3004ga4 = new C3004ga();
        for (C3012ia c3012ia : b) {
            if (c3012ia != null) {
                c3012ia.h();
                int e = c3012ia.e() % 30;
                int c = c3012ia.c();
                if (!this.c) {
                    c += 2;
                }
                int i = c % 3;
                if (i == 0) {
                    c3004ga2.a((e * 3) + 1);
                } else if (i == 1) {
                    c3004ga4.a(e / 3);
                    c3004ga3.a(e % 3);
                } else {
                    if (i != 2) {
                        throw C2967a.a();
                    }
                    c3004ga.a(e + 1);
                }
            }
        }
        if (c3004ga.a().length == 0 || c3004ga2.a().length == 0 || c3004ga3.a().length == 0 || c3004ga4.a().length == 0 || c3004ga.a()[0] < 1 || c3004ga2.a()[0] + c3004ga3.a()[0] < 3 || c3004ga2.a()[0] + c3004ga3.a()[0] > 90) {
            return null;
        }
        C3000fa c3000fa = new C3000fa(c3004ga.a()[0], c3004ga2.a()[0], c3004ga3.a()[0], c3004ga4.a()[0]);
        a(b, c3000fa);
        return c3000fa;
    }

    int[] d() throws C2967a {
        int c;
        C3000fa c2 = c();
        if (c2 == null) {
            return null;
        }
        b(c2);
        int c3 = c2.c();
        int[] iArr = new int[c3];
        for (C3012ia c3012ia : b()) {
            if (c3012ia != null && (c = c3012ia.c()) < c3) {
                iArr[c] = iArr[c] + 1;
            }
        }
        return iArr;
    }

    boolean e() {
        return this.c;
    }

    @Override // com.huawei.hms.scankit.p.C3028ma
    public String toString() {
        return "IsLeft: " + this.c + '\n' + super.toString();
    }

    private void a(C3012ia[] c3012iaArr, C3000fa c3000fa) throws C2967a {
        for (int i = 0; i < c3012iaArr.length; i++) {
            C3012ia c3012ia = c3012iaArr[i];
            if (c3012ia != null) {
                int e = c3012ia.e() % 30;
                int c = c3012ia.c();
                if (c > c3000fa.c()) {
                    c3012iaArr[i] = null;
                } else {
                    if (!this.c) {
                        c += 2;
                    }
                    int i2 = c % 3;
                    if (i2 != 0) {
                        if (i2 != 1) {
                            if (i2 == 2) {
                                if (e + 1 != c3000fa.a()) {
                                    c3012iaArr[i] = null;
                                }
                            } else {
                                throw C2967a.a();
                            }
                        } else if (e / 3 != c3000fa.b() || e % 3 != c3000fa.d()) {
                            c3012iaArr[i] = null;
                        }
                    } else if ((e * 3) + 1 != c3000fa.e()) {
                        c3012iaArr[i] = null;
                    }
                }
            }
        }
    }
}
