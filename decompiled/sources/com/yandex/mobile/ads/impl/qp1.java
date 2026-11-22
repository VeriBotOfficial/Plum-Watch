package com.yandex.mobile.ads.impl;

import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class qp1 {
    public static final pp1 a(pp1 pp1Var, pp1 pp1Var2) {
        Intrinsics.checkNotNullParameter(pp1Var, "<this>");
        if (pp1Var2 == null) {
            return new pp1((Map<String, ? extends Object>) pp1Var.b(), pp1Var.a());
        }
        f a2 = pp1Var.a();
        if (a2 == null) {
            a2 = pp1Var2.a();
        }
        return new pp1((Map<String, ? extends Object>) MapsKt.plus(pp1Var.b(), pp1Var2.b()), a2);
    }
}
