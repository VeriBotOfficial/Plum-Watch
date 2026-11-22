package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.dy;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes5.dex */
final class fh2 extends Lambda implements Function0<Unit> {
    final /* synthetic */ hh2 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    fh2(hh2 hh2Var) {
        super(0);
        this.b = hh2Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        Function1 function1;
        function1 = this.b.f15692a;
        function1.invoke(dy.c.f15320a);
        return Unit.INSTANCE;
    }
}
