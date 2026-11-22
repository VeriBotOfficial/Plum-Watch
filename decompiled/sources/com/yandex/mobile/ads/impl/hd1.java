package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.pw1;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class hd1 {

    /* renamed from: a, reason: collision with root package name */
    private static final Object f15680a = new Object();
    private static volatile iq1 b;

    @JvmStatic
    public static final iq1 a(Context context) {
        iq1 iq1Var;
        int i;
        Integer E;
        Intrinsics.checkNotNullParameter(context, "context");
        iq1 iq1Var2 = b;
        if (iq1Var2 != null) {
            return iq1Var2;
        }
        synchronized (f15680a) {
            iq1Var = b;
            if (iq1Var == null) {
                Intrinsics.checkNotNullParameter(context, "context");
                int i2 = pw1.l;
                ju1 a2 = pw1.a.a().a(context);
                if (a2 != null && (E = a2.E()) != null) {
                    if (E.intValue() == 0) {
                        E = null;
                    }
                    if (E != null) {
                        i = E.intValue();
                        iq1Var = jq1.a(context, i);
                        b = iq1Var;
                        iq1Var.a();
                    }
                }
                i = 1;
                iq1Var = jq1.a(context, i);
                b = iq1Var;
                iq1Var.a();
            }
        }
        return iq1Var;
    }
}
