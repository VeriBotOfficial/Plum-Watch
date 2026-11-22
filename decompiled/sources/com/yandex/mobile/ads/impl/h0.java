package com.yandex.mobile.ads.impl;

/* loaded from: classes5.dex */
public final class h0 {
    public static i0 a() {
        i0 i0Var;
        Object obj;
        i0 i0Var2;
        i0Var = i0.g;
        if (i0Var != null) {
            return i0Var;
        }
        obj = i0.f;
        synchronized (obj) {
            i0Var2 = i0.g;
            if (i0Var2 == null) {
                i0Var2 = new i0();
                i0.g = i0Var2;
            }
        }
        return i0Var2;
    }
}
