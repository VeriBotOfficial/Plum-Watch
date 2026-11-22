package com.anythink.basead.exoplayer.e.a;

import com.anythink.basead.exoplayer.k.af;
import com.anythink.basead.exoplayer.k.s;

/* loaded from: classes11.dex */
final class i {

    /* renamed from: a, reason: collision with root package name */
    private static final int f2464a = 4096;
    private static final int[] b = {af.f("isom"), af.f("iso2"), af.f("iso3"), af.f("iso4"), af.f("iso5"), af.f("iso6"), af.f("avc1"), af.f("hvc1"), af.f("hev1"), af.f("mp41"), af.f("mp42"), af.f("3g2a"), af.f("3g2b"), af.f("3gr6"), af.f("3gs6"), af.f("3ge6"), af.f("3gg6"), af.f("M4V "), af.f("M4A "), af.f("f4v "), af.f("kddi"), af.f("M4VP"), af.f("qt  "), af.f("MSNV")};

    public static boolean a(com.anythink.basead.exoplayer.e.f fVar) {
        return a(fVar, true);
    }

    public static boolean b(com.anythink.basead.exoplayer.e.f fVar) {
        return a(fVar, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean a(com.anythink.basead.exoplayer.e.f fVar, boolean z) {
        boolean z2;
        int i;
        long d = fVar.d();
        long j = -1;
        if (d == -1 || d > 4096) {
            d = 4096;
        }
        int i2 = (int) d;
        s sVar = new s(64);
        boolean z3 = false;
        int i3 = 0;
        Object[] objArr = false;
        while (i3 < i2) {
            sVar.a(8);
            fVar.d(sVar.f2693a, z3 ? 1 : 0, 8);
            long h = sVar.h();
            int i4 = sVar.i();
            if (h == 1) {
                fVar.d(sVar.f2693a, 8, 8);
                sVar.b(16);
                i = 16;
                h = sVar.n();
            } else {
                if (h == 0) {
                    long d2 = fVar.d();
                    if (d2 != j) {
                        h = 8 + (d2 - fVar.c());
                    }
                }
                i = 8;
            }
            long j2 = i;
            if (h >= j2) {
                i3 += i;
                if (i4 != a.G) {
                    if (i4 != a.P && i4 != a.R) {
                        long j3 = (i3 + h) - j2;
                        boolean z4 = z3 ? 1 : 0;
                        if (j3 >= i2) {
                            break;
                        }
                        int i5 = (int) (h - j2);
                        i3 += i5;
                        if (i4 == a.f) {
                            if (i5 < 8) {
                                return z4;
                            }
                            sVar.a(i5);
                            fVar.d(sVar.f2693a, z4 ? 1 : 0, i5);
                            int i6 = i5 / 4;
                            int i7 = 0;
                            while (true) {
                                if (i7 >= i6) {
                                    break;
                                }
                                if (i7 == 1) {
                                    sVar.d(4);
                                } else if (a(sVar.i())) {
                                    objArr = true;
                                    break;
                                }
                                i7++;
                            }
                            if (objArr == false) {
                                return false;
                            }
                        } else if (i5 != 0) {
                            fVar.e(i5);
                        }
                        j = -1;
                        z3 = false;
                    } else {
                        z2 = true;
                        break;
                    }
                }
            } else {
                return z3;
            }
        }
        z2 = false;
        return objArr == true && z == z2;
    }

    private static boolean a(int i) {
        if ((i >>> 8) == af.f("3gp")) {
            return true;
        }
        for (int i2 : b) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    private i() {
    }
}
