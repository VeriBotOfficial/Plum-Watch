package com.yandex.mobile.ads.impl;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes5.dex */
final class f91 extends Lambda implements Function1<sj0, rj0> {
    public static final f91 b = new f91();

    f91() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final rj0 invoke(sj0 sj0Var) {
        sj0 it = sj0Var;
        Intrinsics.checkNotNullParameter(it, "it");
        return new rj0(it, new qj0());
    }
}
