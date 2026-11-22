package com.yandex.mobile.ads.impl;

import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;

@DebugMetadata(c = "com.monetization.ads.feed.domain.FeedItemListUseCase$feedStateStateFlow$1", f = "FeedItemListUseCase.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class s90 extends SuspendLambda implements Function3<ea0, List<? extends n90>, Continuation<? super la0>, Object> {
    /* synthetic */ ea0 b;
    /* synthetic */ List c;

    s90(Continuation<? super s90> continuation) {
        super(3, continuation);
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(ea0 ea0Var, List<? extends n90> list, Continuation<? super la0> continuation) {
        s90 s90Var = new s90(continuation);
        s90Var.b = ea0Var;
        s90Var.c = list;
        return s90Var.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        return new la0(this.b, this.c);
    }
}
