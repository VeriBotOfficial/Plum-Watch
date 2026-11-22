package com.wakeup.feature.plans.data;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: PlansRepository.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.wakeup.feature.plans.data.PlansRepository", f = "PlansRepository.kt", i = {}, l = {24}, m = "getTasks", n = {}, s = {})
/* loaded from: classes3.dex */
final class PlansRepository$getTasks$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ PlansRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PlansRepository$getTasks$1(PlansRepository plansRepository, Continuation<? super PlansRepository$getTasks$1> continuation) {
        super(continuation);
        this.this$0 = plansRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.getTasks(this);
    }
}
