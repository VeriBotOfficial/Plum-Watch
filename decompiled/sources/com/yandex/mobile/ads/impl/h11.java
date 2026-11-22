package com.yandex.mobile.ads.impl;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes5.dex */
public abstract class h11 {
    protected abstract void a(Function1<? super bp0, Unit> function1);

    static final class a extends Lambda implements Function1<bp0, Unit> {
        public static final a b = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(bp0 bp0Var) {
            bp0 it = bp0Var;
            Intrinsics.checkNotNullParameter(it, "it");
            throw it;
        }
    }

    public final void a() {
        a(a.b);
    }
}
