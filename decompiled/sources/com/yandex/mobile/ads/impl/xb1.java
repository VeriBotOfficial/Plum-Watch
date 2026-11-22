package com.yandex.mobile.ads.impl;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes5.dex */
final class xb1 extends Lambda implements Function1<ex0, lb2> {
    public static final xb1 b = new xb1();

    xb1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final lb2 invoke(ex0 ex0Var) {
        ex0 it = ex0Var;
        Intrinsics.checkNotNullParameter(it, "it");
        return it.c();
    }
}
