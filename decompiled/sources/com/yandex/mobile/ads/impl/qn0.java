package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class qn0 {
    public static pn0 a(ju1 ju1Var) {
        pn0 pn0Var;
        String value;
        pn0 pn0Var2;
        if (ju1Var != null && (value = ju1Var.z()) != null) {
            pn0.c.getClass();
            Intrinsics.checkNotNullParameter(value, "value");
            pn0[] values = pn0.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    pn0Var2 = null;
                    break;
                }
                pn0Var2 = values[i];
                if (Intrinsics.areEqual(pn0Var2.b(), value)) {
                    break;
                }
                i++;
            }
            if (pn0Var2 != null) {
                return pn0Var2;
            }
        }
        pn0.c.getClass();
        pn0Var = pn0.d;
        return pn0Var;
    }
}
