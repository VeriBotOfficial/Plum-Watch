package io.livekit.android.events;

import com.tencent.connect.common.Constants;
import com.umeng.analytics.pro.d;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;

/* compiled from: BroadcastEventBus.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\b\u0005\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0005¢\u0006\u0002\u0010\u0003J\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00028\u0000H\u0086@¢\u0006\u0002\u0010\rJ\u001b\u0010\n\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00020\u0010¢\u0006\u0002\u0010\u0011J\u001c\u0010\u0012\u001a\u00020\u000b2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014H\u0086@¢\u0006\u0002\u0010\u0015J\u001c\u0010\u0012\u001a\u00020\u000e2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u00142\u0006\u0010\u000f\u001a\u00020\u0010J\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002J\u0013\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00028\u0000¢\u0006\u0002\u0010\u0018R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lio/livekit/android/events/BroadcastEventBus;", "T", "Lio/livekit/android/events/EventListenable;", "()V", d.ar, "Lkotlinx/coroutines/flow/SharedFlow;", "getEvents", "()Lkotlinx/coroutines/flow/SharedFlow;", "mutableEvents", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "postEvent", "", "event", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlinx/coroutines/Job;", Constants.PARAM_SCOPE, "Lkotlinx/coroutines/CoroutineScope;", "(Ljava/lang/Object;Lkotlinx/coroutines/CoroutineScope;)Lkotlinx/coroutines/Job;", "postEvents", "eventsToPost", "", "(Ljava/util/Collection;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "readOnly", "tryPostEvent", "(Ljava/lang/Object;)V", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BroadcastEventBus<T> implements EventListenable<T> {
    private final SharedFlow<T> events;
    private final MutableSharedFlow<T> mutableEvents;

    public BroadcastEventBus() {
        MutableSharedFlow<T> MutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, Integer.MAX_VALUE, null, 5, null);
        this.mutableEvents = MutableSharedFlow$default;
        this.events = FlowKt.asSharedFlow(MutableSharedFlow$default);
    }

    @Override // io.livekit.android.events.EventListenable
    public SharedFlow<T> getEvents() {
        return this.events;
    }

    public final Object postEvent(T t, Continuation<? super Unit> continuation) {
        Object emit = this.mutableEvents.emit(t, continuation);
        return emit == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? emit : Unit.INSTANCE;
    }

    public final void tryPostEvent(T event) {
        this.mutableEvents.tryEmit(event);
    }

    public final Job postEvent(T event, CoroutineScope scope) {
        Job launch$default;
        Intrinsics.checkNotNullParameter(scope, "scope");
        launch$default = BuildersKt__Builders_commonKt.launch$default(scope, null, null, new BroadcastEventBus$postEvent$2(this, event, null), 3, null);
        return launch$default;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object postEvents(java.util.Collection<? extends T> r6, kotlin.coroutines.Continuation<? super kotlin.Unit> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof io.livekit.android.events.BroadcastEventBus$postEvents$1
            if (r0 == 0) goto L14
            r0 = r7
            io.livekit.android.events.BroadcastEventBus$postEvents$1 r0 = (io.livekit.android.events.BroadcastEventBus$postEvents$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r7 = r0.label
            int r7 = r7 - r2
            r0.label = r7
            goto L19
        L14:
            io.livekit.android.events.BroadcastEventBus$postEvents$1 r0 = new io.livekit.android.events.BroadcastEventBus$postEvents$1
            r0.<init>(r5, r7)
        L19:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L32
            java.lang.Object r6 = r0.L$1
            java.util.Iterator r6 = (java.util.Iterator) r6
            java.lang.Object r2 = r0.L$0
            io.livekit.android.events.BroadcastEventBus r2 = (io.livekit.android.events.BroadcastEventBus) r2
            kotlin.ResultKt.throwOnFailure(r7)
            goto L44
        L32:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3a:
            kotlin.ResultKt.throwOnFailure(r7)
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.Iterator r6 = r6.iterator()
            r2 = r5
        L44:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L5d
            java.lang.Object r7 = r6.next()
            kotlinx.coroutines.flow.MutableSharedFlow<T> r4 = r2.mutableEvents
            r0.L$0 = r2
            r0.L$1 = r6
            r0.label = r3
            java.lang.Object r7 = r4.emit(r7, r0)
            if (r7 != r1) goto L44
            return r1
        L5d:
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: io.livekit.android.events.BroadcastEventBus.postEvents(java.util.Collection, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final Job postEvents(Collection<? extends T> eventsToPost, CoroutineScope scope) {
        Job launch$default;
        Intrinsics.checkNotNullParameter(eventsToPost, "eventsToPost");
        Intrinsics.checkNotNullParameter(scope, "scope");
        launch$default = BuildersKt__Builders_commonKt.launch$default(scope, null, null, new BroadcastEventBus$postEvents$3(this, eventsToPost, null), 3, null);
        return launch$default;
    }

    public final EventListenable<T> readOnly() {
        return this;
    }
}
