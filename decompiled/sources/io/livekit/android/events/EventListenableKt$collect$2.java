package io.livekit.android.events;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;

/* compiled from: EventListenable.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "T", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0}, xi = 176)
/* loaded from: classes6.dex */
public final class EventListenableKt$collect$2<T> implements FlowCollector {
    final /* synthetic */ Function2<T, Continuation<? super Unit>, Object> $action;

    /* JADX WARN: Multi-variable type inference failed */
    public EventListenableKt$collect$2(Function2<? super T, ? super Continuation<? super Unit>, ? extends Object> function2) {
        this.$action = function2;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(T t, Continuation<? super Unit> continuation) {
        Object invoke = this.$action.invoke(t, continuation);
        return invoke == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? invoke : Unit.INSTANCE;
    }

    public final Object emit$$forInline(T t, final Continuation<? super Unit> continuation) {
        new ContinuationImpl(this, continuation) { // from class: io.livekit.android.events.EventListenableKt$collect$2$emit$1
            int label;
            /* synthetic */ Object result;
            final /* synthetic */ EventListenableKt$collect$2<T> this$0;

            /* JADX WARN: Multi-variable type inference failed */
            {
                this.this$0 = this;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.result = obj;
                this.label |= Integer.MIN_VALUE;
                return this.this$0.emit(null, this);
            }
        };
        this.$action.invoke(t, continuation);
        return Unit.INSTANCE;
    }
}
