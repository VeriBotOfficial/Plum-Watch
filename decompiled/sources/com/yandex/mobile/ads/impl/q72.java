package com.yandex.mobile.ads.impl;

/* loaded from: classes5.dex */
public final class q72 {
    public static long a(int i, int i2, ag1 ag1Var) {
        ag1Var.e(i);
        if (ag1Var.a() < 5) {
            return -9223372036854775807L;
        }
        int h = ag1Var.h();
        if ((8388608 & h) != 0 || ((2096896 & h) >> 8) != i2 || (h & 32) == 0 || ag1Var.t() < 7 || ag1Var.a() < 7 || (ag1Var.t() & 16) != 16) {
            return -9223372036854775807L;
        }
        ag1Var.a(new byte[6], 0, 6);
        return ((255 & r0[4]) >> 7) | ((r0[0] & 255) << 25) | ((r0[1] & 255) << 17) | ((r0[2] & 255) << 9) | ((r0[3] & 255) << 1);
    }
}
