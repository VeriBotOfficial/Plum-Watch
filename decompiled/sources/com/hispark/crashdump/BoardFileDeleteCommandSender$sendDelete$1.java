package com.hispark.crashdump;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: BoardFileDeleteCommandSender.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.hispark.crashdump.BoardFileDeleteCommandSender", f = "BoardFileDeleteCommandSender.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1}, l = {34, 49}, m = "sendDelete", n = {"byteTransport", "deviceId", "linkType", "logTag", "normalizedPath", "isDirectory", "ackTimeoutMs", "retryDelayMs", "attempts", "attempt", "byteTransport", "deviceId", "linkType", "logTag", "normalizedPath", "isDirectory", "ackTimeoutMs", "retryDelayMs", "attempts"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "Z$0", "J$0", "J$1", "I$0", "I$2", "L$0", "L$1", "L$2", "L$3", "L$4", "Z$0", "J$0", "J$1", "I$0"})
/* loaded from: classes11.dex */
final class BoardFileDeleteCommandSender$sendDelete$1 extends ContinuationImpl {
    int I$0;
    int I$1;
    int I$2;
    long J$0;
    long J$1;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ BoardFileDeleteCommandSender this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BoardFileDeleteCommandSender$sendDelete$1(BoardFileDeleteCommandSender boardFileDeleteCommandSender, Continuation<? super BoardFileDeleteCommandSender$sendDelete$1> continuation) {
        super(continuation);
        this.this$0 = boardFileDeleteCommandSender;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.sendDelete(null, null, null, false, null, 0L, 0, 0L, null, this);
    }
}
