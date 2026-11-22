package com.yandex.mobile.ads.impl;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes5.dex */
final class ub1 extends Lambda implements Function1<lb2, zb2<kb1>> {
    public static final ub1 b = new ub1();

    ub1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final zb2<kb1> invoke(lb2 lb2Var) {
        lb2 it = lb2Var;
        Intrinsics.checkNotNullParameter(it, "it");
        return it.b();
    }
}
