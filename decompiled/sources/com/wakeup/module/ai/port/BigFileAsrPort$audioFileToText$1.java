package com.wakeup.module.ai.port;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: BigFileAsrPort.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.wakeup.module.ai.port.BigFileAsrPort", f = "BigFileAsrPort.kt", i = {0}, l = {62}, m = "audioFileToText", n = {"this"}, s = {"L$0"})
/* loaded from: classes4.dex */
final class BigFileAsrPort$audioFileToText$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ BigFileAsrPort this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BigFileAsrPort$audioFileToText$1(BigFileAsrPort bigFileAsrPort, Continuation<? super BigFileAsrPort$audioFileToText$1> continuation) {
        super(continuation);
        this.this$0 = bigFileAsrPort;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object audioFileToText;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        audioFileToText = this.this$0.audioFileToText(0, 0, null, this);
        return audioFileToText;
    }
}
