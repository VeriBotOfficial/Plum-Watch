package com.wakeup.module.ai.port;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: BigFileAsrPort.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.wakeup.module.ai.port.BigFileAsrPort", f = "BigFileAsrPort.kt", i = {0, 0, 1}, l = {44, 50}, m = "submitFile", n = {"this", "projectId", "this"}, s = {"L$0", "I$0", "L$0"})
/* loaded from: classes4.dex */
final class BigFileAsrPort$submitFile$1 extends ContinuationImpl {
    int I$0;
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ BigFileAsrPort this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BigFileAsrPort$submitFile$1(BigFileAsrPort bigFileAsrPort, Continuation<? super BigFileAsrPort$submitFile$1> continuation) {
        super(continuation);
        this.this$0 = bigFileAsrPort;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.submitFile(0, null, 0, this);
    }
}
