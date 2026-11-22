package com.wakeup.module.ai.port;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: ASRSinglePort.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.wakeup.module.ai.port.ASRSinglePort", f = "ASRSinglePort.kt", i = {}, l = {51}, m = "startSync", n = {}, s = {})
/* loaded from: classes4.dex */
final class ASRSinglePort$startSync$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ASRSinglePort this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ASRSinglePort$startSync$1(ASRSinglePort aSRSinglePort, Continuation<? super ASRSinglePort$startSync$1> continuation) {
        super(continuation);
        this.this$0 = aSRSinglePort;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.startSync(0, null, 0, this);
    }
}
