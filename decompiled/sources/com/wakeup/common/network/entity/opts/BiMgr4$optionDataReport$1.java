package com.wakeup.common.network.entity.opts;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: BiMgr4.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.wakeup.common.network.entity.opts.BiMgr4", f = "BiMgr4.kt", i = {}, l = {51}, m = "optionDataReport", n = {}, s = {})
/* loaded from: classes2.dex */
final class BiMgr4$optionDataReport$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ BiMgr4 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BiMgr4$optionDataReport$1(BiMgr4 biMgr4, Continuation<? super BiMgr4$optionDataReport$1> continuation) {
        super(continuation);
        this.this$0 = biMgr4;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.optionDataReport(null, null, null, null, null, this);
    }
}
