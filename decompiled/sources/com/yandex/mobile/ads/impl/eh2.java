package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.dy;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes5.dex */
final class eh2 extends Lambda implements Function1<String, Unit> {
    final /* synthetic */ hh2 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    eh2(hh2 hh2Var) {
        super(1);
        this.b = hh2Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(String str) {
        Function1 function1;
        String message = str;
        Intrinsics.checkNotNullParameter(message, "message");
        function1 = this.b.f15692a;
        function1.invoke(new dy.h(message));
        return Unit.INSTANCE;
    }
}
