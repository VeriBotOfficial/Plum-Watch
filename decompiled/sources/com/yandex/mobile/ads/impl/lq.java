package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.nq;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class lq implements f72 {
    @Override // com.yandex.mobile.ads.impl.f72
    public final nq a(ps0 localStorage, gq type) {
        Intrinsics.checkNotNullParameter(localStorage, "localStorage");
        Intrinsics.checkNotNullParameter(type, "type");
        if (type.a() == null || !localStorage.c(type.a())) {
            type = null;
        }
        if (type != null) {
            return b(localStorage, type);
        }
        return null;
    }

    private static nq b(ps0 ps0Var, gq gqVar) {
        int ordinal;
        String a2 = gqVar.a();
        if (a2 == null) {
            return null;
        }
        try {
            ordinal = gqVar.ordinal();
        } catch (ClassCastException unused) {
        }
        if (ordinal == 0) {
            return new nq.c(ps0Var.d(a2));
        }
        if (ordinal == 1) {
            return new nq.d(ps0Var.d(a2));
        }
        if (ordinal == 2) {
            return new nq.b(ps0Var.a(a2, false));
        }
        if (ordinal == 3) {
            return new nq.e(ps0Var.d(a2));
        }
        if (ordinal == 4) {
            return new nq.f(ps0Var.d(a2));
        }
        if (ordinal == 5) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.yandex.mobile.ads.impl.f72
    public final nq a(ps0 localStorage, String v1) {
        gq gqVar;
        Intrinsics.checkNotNullParameter(localStorage, "localStorage");
        Intrinsics.checkNotNullParameter(v1, "key");
        if (!localStorage.c(v1)) {
            v1 = null;
        }
        if (v1 != null) {
            gq.d.getClass();
            Intrinsics.checkNotNullParameter(v1, "v1");
            gq[] values = gq.values();
            int length = values.length;
            for (int i = 0; i < length; i++) {
                gqVar = values[i];
                if (Intrinsics.areEqual(gqVar.a(), v1)) {
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
