package io.livekit.android.room.datastream.incoming;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: BaseStreamReceiver.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\u0010\u0006J\u001d\u0010\u000b\u001a\u00020\f2\u000e\u0010\r\u001a\n\u0018\u00010\u000ej\u0004\u0018\u0001`\u000fH\u0000¢\u0006\u0002\b\u0010J\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012H\u0086@¢\u0006\u0002\u0010\u0013J\u000e\u0010\u0014\u001a\u00028\u0000H\u0086@¢\u0006\u0002\u0010\u0013R\u0018\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\bX¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lio/livekit/android/room/datastream/incoming/BaseStreamReceiver;", "T", "", "source", "Lkotlinx/coroutines/channels/Channel;", "", "(Lkotlinx/coroutines/channels/Channel;)V", "flow", "Lkotlinx/coroutines/flow/Flow;", "getFlow", "()Lkotlinx/coroutines/flow/Flow;", "close", "", "error", "Ljava/lang/Exception;", "Lkotlin/Exception;", "close$livekit_android_sdk_release", "readAll", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "readNext", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class BaseStreamReceiver<T> {
    private final Channel<byte[]> source;

    public abstract Flow<T> getFlow();

    public BaseStreamReceiver(Channel<byte[]> source) {
        Intrinsics.checkNotNullParameter(source, "source");
        this.source = source;
    }

    public final void close$livekit_android_sdk_release(Exception error) {
        this.source.close(error);
    }

    public final Object readNext(Continuation<? super T> continuation) {
        return FlowKt.first(getFlow(), continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object readAll(kotlin.coroutines.Continuation<? super java.util.List<? extends T>> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof io.livekit.android.room.datastream.incoming.BaseStreamReceiver$readAll$1
            if (r0 == 0) goto L14
            r0 = r6
            io.livekit.android.room.datastream.incoming.BaseStreamReceiver$readAll$1 r0 = (io.livekit.android.room.datastream.incoming.BaseStreamReceiver$readAll$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r6 = r0.label
            int r6 = r6 - r2
            r0.label = r6
            goto L19
        L14:
            io.livekit.android.room.datastream.incoming.BaseStreamReceiver$readAll$1 r0 = new io.livekit.android.room.datastream.incoming.BaseStreamReceiver$readAll$1
            r0.<init>(r5, r6)
        L19:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            java.lang.Object r0 = r0.L$0
            kotlin.jvm.internal.Ref$ObjectRef r0 = (kotlin.jvm.internal.Ref.ObjectRef) r0
            kotlin.ResultKt.throwOnFailure(r6)
            goto L6d
        L2e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L36:
            kotlin.ResultKt.throwOnFailure(r6)
            kotlinx.coroutines.flow.Flow r6 = r5.getFlow()
            io.livekit.android.room.datastream.incoming.BaseStreamReceiver$readAll$2 r2 = new io.livekit.android.room.datastream.incoming.BaseStreamReceiver$readAll$2
            r4 = 0
            r2.<init>(r4)
            kotlin.jvm.functions.Function3 r2 = (kotlin.jvm.functions.Function3) r2
            kotlinx.coroutines.flow.FlowKt.m15585catch(r6, r2)
            kotlinx.coroutines.flow.Flow r6 = r5.getFlow()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.List r2 = (java.util.List) r2
            kotlin.jvm.internal.Ref$ObjectRef r4 = new kotlin.jvm.internal.Ref$ObjectRef
            r4.<init>()
            r4.element = r2
            io.livekit.android.room.datastream.incoming.BaseStreamReceiver$readAll$$inlined$fold$1 r2 = new io.livekit.android.room.datastream.incoming.BaseStreamReceiver$readAll$$inlined$fold$1
            r2.<init>()
            kotlinx.coroutines.flow.FlowCollector r2 = (kotlinx.coroutines.flow.FlowCollector) r2
            r0.L$0 = r4
            r0.label = r3
            java.lang.Object r6 = r6.collect(r2, r0)
            if (r6 != r1) goto L6c
            return r1
        L6c:
            r0 = r4
        L6d:
            T r6 = r0.element
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: io.livekit.android.room.datastream.incoming.BaseStreamReceiver.readAll(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
