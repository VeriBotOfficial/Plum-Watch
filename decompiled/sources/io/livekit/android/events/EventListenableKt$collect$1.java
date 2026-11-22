package io.livekit.android.events;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: EventListenable.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 176)
@DebugMetadata(c = "io.livekit.android.events.EventListenableKt", f = "EventListenable.kt", i = {}, l = {34}, m = "collect", n = {}, s = {})
/* loaded from: classes6.dex */
final class EventListenableKt$collect$1<T> extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;

    EventListenableKt$collect$1(Continuation<? super EventListenableKt$collect$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return EventListenableKt.collect(null, null, this);
    }
}
