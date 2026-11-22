package io.livekit.android.webrtc;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* compiled from: DataChannelManager.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "it", ""}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "io.livekit.android.webrtc.DataChannelManager$waitForBufferedAmountLow$3", f = "DataChannelManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
final class DataChannelManager$waitForBufferedAmountLow$3 extends SuspendLambda implements Function2<Long, Continuation<? super Boolean>, Object> {
    final /* synthetic */ long $amount;
    /* synthetic */ long J$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DataChannelManager$waitForBufferedAmountLow$3(long j, Continuation<? super DataChannelManager$waitForBufferedAmountLow$3> continuation) {
        super(2, continuation);
        this.$amount = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        DataChannelManager$waitForBufferedAmountLow$3 dataChannelManager$waitForBufferedAmountLow$3 = new DataChannelManager$waitForBufferedAmountLow$3(this.$amount, continuation);
        dataChannelManager$waitForBufferedAmountLow$3.J$0 = ((Number) obj).longValue();
        return dataChannelManager$waitForBufferedAmountLow$3;
    }

    public final Object invoke(long j, Continuation<? super Boolean> continuation) {
        return ((DataChannelManager$waitForBufferedAmountLow$3) create(Long.valueOf(j), continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Long l, Continuation<? super Boolean> continuation) {
        return invoke(l.longValue(), continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return Boxing.boxBoolean(this.J$0 > this.$amount);
    }
}
