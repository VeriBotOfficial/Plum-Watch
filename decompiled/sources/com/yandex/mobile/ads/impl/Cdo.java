package com.yandex.mobile.ads.impl;

/* renamed from: com.yandex.mobile.ads.impl.do, reason: invalid class name */
/* loaded from: classes5.dex */
public final class Cdo {
    public static void a(long j, ag1 ag1Var, a62[] a62VarArr) {
        int i;
        while (true) {
            if (ag1Var.a() <= 1) {
                return;
            }
            int i2 = 0;
            while (true) {
                if (ag1Var.a() == 0) {
                    i = -1;
                    break;
                }
                int t = ag1Var.t();
                i2 += t;
                if (t != 255) {
                    i = i2;
                    break;
                }
            }
            int i3 = 0;
            while (true) {
                if (ag1Var.a() == 0) {
                    i3 = -1;
                    break;
                }
                int t2 = ag1Var.t();
                i3 += t2;
                if (t2 != 255) {
                    break;
                }
            }
            int d = ag1Var.d() + i3;
            if (i3 == -1 || i3 > ag1Var.a()) {
                et0.d("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                d = ag1Var.e();
            } else if (i == 4 && i3 >= 8) {
                int t3 = ag1Var.t();
                int z = ag1Var.z();
                int h = z == 49 ? ag1Var.h() : 0;
                int t4 = ag1Var.t();
                if (z == 47) {
                    ag1Var.f(1);
                }
                boolean z2 = t3 == 181 && (z == 49 || z == 47) && t4 == 3;
                if (z == 49) {
                    z2 &= h == 1195456820;
                }
                if (z2) {
                    b(j, ag1Var, a62VarArr);
                }
            }
            ag1Var.e(d);
        }
    }

    public static void b(long j, ag1 ag1Var, a62[] a62VarArr) {
        long j2;
        int t = ag1Var.t();
        if ((t & 64) != 0) {
            ag1Var.f(1);
            int i = (t & 31) * 3;
            int d = ag1Var.d();
            int length = a62VarArr.length;
            int i2 = 0;
            while (i2 < length) {
                a62 a62Var = a62VarArr[i2];
                ag1Var.e(d);
                a62Var.a(i, ag1Var);
                if (j != -9223372036854775807L) {
                    j2 = j;
                    a62Var.a(j2, 1, i, 0, null);
                } else {
                    j2 = j;
                }
                i2++;
                j = j2;
            }
        }
    }
}
