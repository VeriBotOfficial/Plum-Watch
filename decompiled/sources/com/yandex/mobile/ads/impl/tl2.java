package com.yandex.mobile.ads.impl;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes5.dex */
final class tl2 extends Lambda implements Function0<Unit> {
    final /* synthetic */ ul2 b;
    final /* synthetic */ String c = "Cannot load bidder token. Token generation failed";

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    tl2(ul2 ul2Var) {
        super(0);
        this.b = ul2Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.b.f17067a.onBidderTokenFailedToLoad(this.c);
        return Unit.INSTANCE;
    }
}
