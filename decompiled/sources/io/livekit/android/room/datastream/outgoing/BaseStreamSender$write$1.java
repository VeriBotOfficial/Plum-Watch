package io.livekit.android.room.datastream.outgoing;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: BaseStreamSender.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "io.livekit.android.room.datastream.outgoing.BaseStreamSender", f = "BaseStreamSender.kt", i = {}, l = {38}, m = "write-gIAlu-s", n = {}, s = {})
/* loaded from: classes6.dex */
final class BaseStreamSender$write$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ BaseStreamSender<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BaseStreamSender$write$1(BaseStreamSender<T> baseStreamSender, Continuation<? super BaseStreamSender$write$1> continuation) {
        super(continuation);
        this.this$0 = baseStreamSender;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object m13869writegIAlus = this.this$0.m13869writegIAlus(null, this);
        return m13869writegIAlus == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? m13869writegIAlus : Result.m14056boximpl(m13869writegIAlus);
    }
}
