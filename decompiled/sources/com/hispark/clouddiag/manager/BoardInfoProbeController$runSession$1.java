package com.hispark.clouddiag.manager;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: BoardInfoProbeController.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.hispark.clouddiag.manager.BoardInfoProbeController", f = "BoardInfoProbeController.kt", i = {0, 0, 0}, l = {144}, m = "runSession", n = {"this", "session", "attempt"}, s = {"L$0", "L$1", "I$0"})
/* loaded from: classes11.dex */
final class BoardInfoProbeController$runSession$1 extends ContinuationImpl {
    int I$0;
    int I$1;
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ BoardInfoProbeController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BoardInfoProbeController$runSession$1(BoardInfoProbeController boardInfoProbeController, Continuation<? super BoardInfoProbeController$runSession$1> continuation) {
        super(continuation);
        this.this$0 = boardInfoProbeController;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object runSession;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        runSession = this.this$0.runSession(null, this);
        return runSession;
    }
}
