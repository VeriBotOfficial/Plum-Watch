package io.livekit.android.room.datastream.outgoing;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.wakeup.module.device.work.BleFailStage;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BaseStreamSender.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0002\u0010\u0005J\u001a\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0086@¢\u0006\u0002\u0010\u000fJ$\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\f0\u00112\u0006\u0010\u0012\u001a\u00028\u0000H\u0087@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0013\u0010\u0014J$\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\f0\u00112\u0006\u0010\u0012\u001a\u00028\u0000H¡@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0016\u0010\u0014R\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\b\u0010\n\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\u0017"}, d2 = {"Lio/livekit/android/room/datastream/outgoing/BaseStreamSender;", "T", "", FirebaseAnalytics.Param.DESTINATION, "Lio/livekit/android/room/datastream/outgoing/StreamDestination;", "(Lio/livekit/android/room/datastream/outgoing/StreamDestination;)V", "getDestination$livekit_android_sdk_release", "()Lio/livekit/android/room/datastream/outgoing/StreamDestination;", "isOpen", "", "()Z", "close", "", "reason", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", BleFailStage.WRITE, "Lkotlin/Result;", "data", "write-gIAlu-s", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "writeImpl", "writeImpl-gIAlu-s$livekit_android_sdk_release", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class BaseStreamSender<T> {
    private final StreamDestination<T> destination;

    /* renamed from: writeImpl-gIAlu-s$livekit_android_sdk_release, reason: not valid java name */
    public abstract Object mo13870writeImplgIAlus$livekit_android_sdk_release(T t, Continuation<? super Result<Unit>> continuation);

    public BaseStreamSender(StreamDestination<T> destination) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        this.destination = destination;
    }

    public final StreamDestination<T> getDestination$livekit_android_sdk_release() {
        return this.destination;
    }

    public final boolean isOpen() {
        return this.destination.isOpen();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: write-gIAlu-s, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m13869writegIAlus(T r5, kotlin.coroutines.Continuation<? super kotlin.Result<kotlin.Unit>> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof io.livekit.android.room.datastream.outgoing.BaseStreamSender$write$1
            if (r0 == 0) goto L14
            r0 = r6
            io.livekit.android.room.datastream.outgoing.BaseStreamSender$write$1 r0 = (io.livekit.android.room.datastream.outgoing.BaseStreamSender$write$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r6 = r0.label
            int r6 = r6 - r2
            r0.label = r6
            goto L19
        L14:
            io.livekit.android.room.datastream.outgoing.BaseStreamSender$write$1 r0 = new io.livekit.android.room.datastream.outgoing.BaseStreamSender$write$1
            r0.<init>(r4, r6)
        L19:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L38
            if (r2 != r3) goto L30
            kotlin.ResultKt.throwOnFailure(r6)
            kotlin.Result r6 = (kotlin.Result) r6
            java.lang.Object r5 = r6.getValue()
            return r5
        L30:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L38:
            kotlin.ResultKt.throwOnFailure(r6)
            io.livekit.android.room.datastream.outgoing.StreamDestination<T> r6 = r4.destination
            boolean r6 = r6.isOpen()
            if (r6 != 0) goto L56
            kotlin.Result$Companion r5 = kotlin.Result.INSTANCE
            io.livekit.android.room.datastream.StreamException$TerminatedException r5 = new io.livekit.android.room.datastream.StreamException$TerminatedException
            r6 = 0
            r5.<init>(r6, r3, r6)
            java.lang.Throwable r5 = (java.lang.Throwable) r5
            java.lang.Object r5 = kotlin.ResultKt.createFailure(r5)
            java.lang.Object r5 = kotlin.Result.m14057constructorimpl(r5)
            return r5
        L56:
            r0.label = r3
            java.lang.Object r5 = r4.mo13870writeImplgIAlus$livekit_android_sdk_release(r5, r0)
            if (r5 != r1) goto L5f
            return r1
        L5f:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: io.livekit.android.room.datastream.outgoing.BaseStreamSender.m13869writegIAlus(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static /* synthetic */ Object close$default(BaseStreamSender baseStreamSender, String str, Continuation continuation, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: close");
        }
        if ((i & 1) != 0) {
            str = null;
        }
        return baseStreamSender.close(str, continuation);
    }

    public final Object close(String str, Continuation<? super Unit> continuation) {
        Object close = this.destination.close(str, continuation);
        return close == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? close : Unit.INSTANCE;
    }
}
