package com.yandex.mobile.ads.impl;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes5.dex */
final class vb1 extends Lambda implements Function1<zb2<kb1>, String> {
    public static final vb1 b = new vb1();

    vb1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final String invoke(zb2<kb1> zb2Var) {
        zb2<kb1> it = zb2Var;
        Intrinsics.checkNotNullParameter(it, "it");
        return it.d().getUrl();
    }
}
