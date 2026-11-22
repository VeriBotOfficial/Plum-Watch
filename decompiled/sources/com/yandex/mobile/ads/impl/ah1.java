package com.yandex.mobile.ads.impl;

import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes5.dex */
final class ah1 extends Lambda implements Function1<e5, Boolean> {
    final /* synthetic */ Set<f5> b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    ah1(Set<? extends f5> set) {
        super(1);
        this.b = set;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(e5 e5Var) {
        e5 it = e5Var;
        Intrinsics.checkNotNullParameter(it, "it");
        return Boolean.valueOf(this.b.contains(it.a()));
    }
}
