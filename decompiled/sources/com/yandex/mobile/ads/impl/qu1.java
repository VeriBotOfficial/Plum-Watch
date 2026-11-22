package com.yandex.mobile.ads.impl;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes5.dex */
final class qu1 extends Lambda implements Function1<hn1, CharSequence> {
    public static final qu1 b = new qu1();

    qu1() {
        super(1);
    }

    public static String a(hn1 it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getKey() + "=" + it.getValue();
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ CharSequence invoke(hn1 hn1Var) {
        return a(hn1Var);
    }
}
