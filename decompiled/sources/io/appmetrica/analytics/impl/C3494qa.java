package io.appmetrica.analytics.impl;

import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: io.appmetrica.analytics.impl.qa, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3494qa implements InterfaceC3097ac {
    @Override // io.appmetrica.analytics.impl.InterfaceC3097ac
    public final C3219f9 a(C3491q7 c3491q7) {
        C3219f9 c3219f9 = null;
        if ((c3491q7 != null ? c3491q7.b : null) != null && c3491q7.c != null) {
            c3219f9 = new C3219f9();
            c3219f9.b = c3491q7.b.doubleValue();
            c3219f9.f18269a = c3491q7.c.doubleValue();
            Integer num = c3491q7.d;
            if (num != null) {
                c3219f9.g = num.intValue();
            }
            Integer num2 = c3491q7.e;
            if (num2 != null) {
                c3219f9.e = num2.intValue();
            }
            Integer num3 = c3491q7.f;
            if (num3 != null) {
                c3219f9.d = num3.intValue();
            }
            Integer num4 = c3491q7.g;
            if (num4 != null) {
                c3219f9.f = num4.intValue();
            }
            Long l = c3491q7.h;
            if (l != null) {
                c3219f9.c = TimeUnit.MILLISECONDS.toSeconds(l.longValue());
            }
            String str = c3491q7.i;
            if (str != null) {
                if (Intrinsics.areEqual(str, "gps")) {
                    c3219f9.h = 1;
                } else if (Intrinsics.areEqual(str, "network")) {
                    c3219f9.h = 2;
                }
            }
            String str2 = c3491q7.j;
            if (str2 != null) {
                c3219f9.i = str2;
            }
        }
        return c3219f9;
    }
}
