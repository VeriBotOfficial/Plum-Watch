package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.nq;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class mq implements f72 {
    @Override // com.yandex.mobile.ads.impl.f72
    public final nq a(ps0 localStorage, gq type) {
        Intrinsics.checkNotNullParameter(localStorage, "localStorage");
        Intrinsics.checkNotNullParameter(type, "type");
        if (!localStorage.c(type.b())) {
            type = null;
        }
        if (type != null) {
            return b(localStorage, type);
        }
        return null;
    }

    private static nq b(ps0 ps0Var, gq gqVar) {
        String b = gqVar.b();
        try {
            int ordinal = gqVar.ordinal();
            if (ordinal == 0) {
                return new nq.c(ps0Var.d(b));
            }
            boolean z = true;
            if (ordinal == 1) {
                int b2 = ps0Var.b(-1, b);
                Integer valueOf = Integer.valueOf(b2);
                if (b2 == -1) {
                    valueOf = null;
                }
                return new nq.d(valueOf != null ? String.valueOf(valueOf.intValue()) : null);
            }
            if (ordinal == 2) {
                if (ps0Var.b(-1, b) == -1) {
                    z = false;
                }
                return new nq.b(z);
            }
            if (ordinal == 3) {
                return new nq.e(ps0Var.d(b));
            }
            if (ordinal == 4) {
                return new nq.f(ps0Var.d(b));
            }
            if (ordinal == 5) {
                return new nq.a(ps0Var.d(b));
            }
            throw new NoWhenBranchMatchedException();
        } catch (ClassCastException unused) {
            return null;
        }
    }

    @Override // com.yandex.mobile.ads.impl.f72
    public final nq a(ps0 localStorage, String v2) {
        gq gqVar;
        Intrinsics.checkNotNullParameter(localStorage, "localStorage");
        Intrinsics.checkNotNullParameter(v2, "key");
        if (!localStorage.c(v2)) {
            v2 = null;
        }
        if (v2 != null) {
            gq.d.getClass();
            Intrinsics.checkNotNullParameter(v2, "v2");
            gq[] values = gq.values();
            int length = values.length;
            for (int i = 0; i < length; i++) {
                gqVar = values[i];
                if (Intrinsics.areEqual(gqVar.b(), v2)) {
                    break;
                }
            }
        }
        gqVar = null;
        if (gqVar != null) {
            return b(localStorage, gqVar);
        }
        return null;
    }
}
