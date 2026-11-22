package com.wakeup.module.ai.port;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: IRPort2.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.wakeup.module.ai.port.IRPort2", f = "IRPort2.kt", i = {0}, l = {17}, m = "start", n = {"this"}, s = {"L$0"})
/* loaded from: classes4.dex */
final class IRPort2$start$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ IRPort2 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    IRPort2$start$1(IRPort2 iRPort2, Continuation<? super IRPort2$start$1> continuation) {
        super(continuation);
        this.this$0 = iRPort2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.start(0, null, this);
    }
}
