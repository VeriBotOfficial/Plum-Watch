package com.wakeup.module.ai.port;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: TSPort.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.wakeup.module.ai.port.TSPort", f = "TSPort.kt", i = {0}, l = {26}, m = "getLangList", n = {"this"}, s = {"L$0"})
/* loaded from: classes4.dex */
final class TSPort$getLangList$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ TSPort this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TSPort$getLangList$1(TSPort tSPort, Continuation<? super TSPort$getLangList$1> continuation) {
        super(continuation);
        this.this$0 = tSPort;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.getLangList(this);
    }
}
