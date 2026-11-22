package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.ac0;
import java.util.Arrays;

/* loaded from: classes5.dex */
public final class xb0 {
    public static ac0.a a(ag1 ag1Var) {
        ag1Var.f(1);
        int w = ag1Var.w();
        long d = ag1Var.d() + w;
        int i = w / 18;
        long[] jArr = new long[i];
        long[] jArr2 = new long[i];
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                break;
            }
            long p = ag1Var.p();
            if (p == -1) {
                jArr = Arrays.copyOf(jArr, i2);
                jArr2 = Arrays.copyOf(jArr2, i2);
                break;
            }
            jArr[i2] = p;
            jArr2[i2] = ag1Var.p();
            ag1Var.f(2);
            i2++;
        }
        ag1Var.f((int) (d - ag1Var.d()));
        return new ac0.a(jArr, jArr2);
    }
}
