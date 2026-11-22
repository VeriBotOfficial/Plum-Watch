package com.yandex.mobile.ads.impl;

/* loaded from: classes5.dex */
public final class t30 {

    /* renamed from: a, reason: collision with root package name */
    public final String f16927a;

    private t30(String str) {
        this.f16927a = str;
    }

    public static t30 a(ag1 ag1Var) {
        String str;
        ag1Var.f(2);
        int t = ag1Var.t();
        int i = t >> 1;
        int t2 = ((ag1Var.t() >> 3) & 31) | ((t & 1) << 5);
        if (i == 4 || i == 5 || i == 7) {
            str = "dvhe";
        } else if (i == 8) {
            str = "hev1";
        } else {
            if (i != 9) {
                return null;
            }
            str = "avc3";
        }
        return new t30(str + ".0" + i + (t2 >= 10 ? "." : ".0") + t2);
    }
}
