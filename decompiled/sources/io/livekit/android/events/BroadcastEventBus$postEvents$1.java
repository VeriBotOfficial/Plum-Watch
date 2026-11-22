package io.livekit.android.events;

import java.util.Collection;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: BroadcastEventBus.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "io.livekit.android.events.BroadcastEventBus", f = "BroadcastEventBus.kt", i = {0}, l = {46}, m = "postEvents", n = {"this"}, s = {"L$0"})
/* loaded from: classes6.dex */
final class BroadcastEventBus$postEvents$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ BroadcastEventBus<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BroadcastEventBus$postEvents$1(BroadcastEventBus<T> broadcastEventBus, Continuation<? super BroadcastEventBus$postEvents$1> continuation) {
        super(continuation);
        this.this$0 = broadcastEventBus;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.postEvents((Collection) null, this);
    }
}
