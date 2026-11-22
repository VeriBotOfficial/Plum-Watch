package com.wakeup.module.ai.port;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: P2PTransPort.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.wakeup.module.ai.port.P2PTransPort", f = "P2PTransPort.kt", i = {0}, l = {34}, m = "startOcr", n = {"this"}, s = {"L$0"})
/* loaded from: classes4.dex */
final class P2PTransPort$startOcr$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ P2PTransPort this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    P2PTransPort$startOcr$1(P2PTransPort p2PTransPort, Continuation<? super P2PTransPort$startOcr$1> continuation) {
        super(continuation);
        this.this$0 = p2PTransPort;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.startOcr(0, 0, null, this);
    }
}
