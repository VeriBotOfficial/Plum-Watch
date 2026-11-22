package com.wakeup.module.tts.lfa;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: LfaMgr.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.wakeup.module.tts.lfa.LfaMgr", f = "LfaMgr.kt", i = {0, 1, 1}, l = {43, 52, 53}, m = "start", n = {"this", "this", "postResult"}, s = {"L$0", "L$0", "L$1"})
/* loaded from: classes4.dex */
final class LfaMgr$start$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ LfaMgr this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LfaMgr$start$1(LfaMgr lfaMgr, Continuation<? super LfaMgr$start$1> continuation) {
        super(continuation);
        this.this$0 = lfaMgr;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.start(null, null, this);
    }
}
