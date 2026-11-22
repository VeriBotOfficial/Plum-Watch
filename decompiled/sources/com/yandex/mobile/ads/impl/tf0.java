package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.e41;
import java.util.Collections;
import java.util.List;

/* loaded from: classes5.dex */
public final class tf0 {

    /* renamed from: a, reason: collision with root package name */
    public final List<byte[]> f16962a;
    public final int b;
    public final float c;
    public final String d;

    private tf0(List list, int i, float f, String str) {
        this.f16962a = list;
        this.b = i;
        this.c = f;
        this.d = str;
    }

    public static tf0 a(ag1 ag1Var) throws eg1 {
        boolean z;
        List singletonList;
        int i;
        try {
            ag1Var.f(21);
            int t = ag1Var.t() & 3;
            int t2 = ag1Var.t();
            int d = ag1Var.d();
            int i2 = 0;
            int i3 = 0;
            int i4 = 0;
            while (true) {
                z = true;
                if (i3 >= t2) {
                    break;
                }
                ag1Var.f(1);
                int z2 = ag1Var.z();
                for (int i5 = 0; i5 < z2; i5++) {
                    int z3 = ag1Var.z();
                    i4 += z3 + 4;
                    ag1Var.f(z3);
                }
                i3++;
            }
            ag1Var.e(d);
            byte[] bArr = new byte[i4];
            float f = 1.0f;
            String str = null;
            int i6 = 0;
            int i7 = 0;
            while (i6 < t2) {
                int t3 = ag1Var.t() & 127;
                int z4 = ag1Var.z();
                int i8 = i2;
                while (i8 < z4) {
                    int z5 = ag1Var.z();
                    boolean z6 = z;
                    System.arraycopy(e41.f15342a, i2, bArr, i7, 4);
                    int i9 = i7 + 4;
                    System.arraycopy(ag1Var.c(), ag1Var.d(), bArr, i9, z5);
                    if (t3 == 33 && i8 == 0) {
                        e41.a a2 = e41.a(bArr, i9, i9 + z5);
                        float f2 = a2.g;
                        i = t;
                        str = oq.a(a2.f15343a, a2.b, a2.c, a2.d, a2.e, a2.f);
                        f = f2;
                    } else {
                        i = t;
                    }
                    i7 = i9 + z5;
                    ag1Var.f(z5);
                    i8++;
                    z = z6;
                    t = i;
                    i2 = 0;
                }
                i6++;
                i2 = 0;
            }
            int i10 = t;
            if (i4 == 0) {
                singletonList = Collections.emptyList();
            } else {
                singletonList = Collections.singletonList(bArr);
            }
            return new tf0(singletonList, i10 + 1, f, str);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw eg1.a("Error parsing HEVC config", e);
        }
    }
}
