package com.yandex.mobile.ads.impl;

import android.graphics.Bitmap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes5.dex */
final class a61 extends Lambda implements Function0<Bitmap> {
    final /* synthetic */ sj0 b;
    final /* synthetic */ xj0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    a61(sj0 sj0Var, xj0 xj0Var) {
        super(0);
        this.b = sj0Var;
        this.c = xj0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Bitmap invoke() {
        return this.b.b(this.c);
    }
}
