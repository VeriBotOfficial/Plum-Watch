package io.livekit.android.room.datastream.outgoing;

import android.gov.nist.javax.sip.header.ParameterNames;
import com.google.firebase.analytics.FirebaseAnalytics;
import io.livekit.android.room.datastream.TextStreamInfo;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TextStreamSender.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006¢\u0006\u0002\u0010\u0007J$\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\r\u001a\u00020\u0002H\u0090@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\u0010"}, d2 = {"Lio/livekit/android/room/datastream/outgoing/TextStreamSender;", "Lio/livekit/android/room/datastream/outgoing/BaseStreamSender;", "", ParameterNames.INFO, "Lio/livekit/android/room/datastream/TextStreamInfo;", FirebaseAnalytics.Param.DESTINATION, "Lio/livekit/android/room/datastream/outgoing/StreamDestination;", "(Lio/livekit/android/room/datastream/TextStreamInfo;Lio/livekit/android/room/datastream/outgoing/StreamDestination;)V", "getInfo", "()Lio/livekit/android/room/datastream/TextStreamInfo;", "writeImpl", "Lkotlin/Result;", "", "data", "writeImpl-gIAlu-s$livekit_android_sdk_release", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TextStreamSender extends BaseStreamSender<String> {
    private final TextStreamInfo info;

    @Override // io.livekit.android.room.datastream.outgoing.BaseStreamSender
    /* renamed from: writeImpl-gIAlu-s$livekit_android_sdk_release */
    public /* bridge */ /* synthetic */ Object mo13870writeImplgIAlus$livekit_android_sdk_release(String str, Continuation continuation) {
        return m13884writeImplgIAlus$livekit_android_sdk_release(str, (Continuation<? super Result<Unit>>) continuation);
    }

    public final TextStreamInfo getInfo() {
        return this.info;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextStreamSender(TextStreamInfo info, StreamDestination<String> destination) {
        super(destination);
        Intrinsics.checkNotNullParameter(info, "info");
        Intrinsics.checkNotNullParameter(destination, "destination");
        this.info = info;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: writeImpl-gIAlu-s$livekit_android_sdk_release, reason: avoid collision after fix types in other method and not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object m13884writeImplgIAlus$livekit_android_sdk_release(java.lang.String r5, kotlin.coroutines.Continuation<? super kotlin.Result<kotlin.Unit>> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof io.livekit.android.room.datastream.outgoing.TextStreamSender$writeImpl$1
            if (r0 == 0) goto L14
            r0 = r6
            io.livekit.android.room.datastream.outgoing.TextStreamSender$writeImpl$1 r0 = (io.livekit.android.room.datastream.outgoing.TextStreamSender$writeImpl$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r6 = r0.label
            int r6 = r6 - r2
            r0.label = r6
            goto L19
        L14:
            io.livekit.android.room.datastream.outgoing.TextStreamSender$writeImpl$1 r0 = new io.livekit.android.room.datastream.outgoing.TextStreamSender$writeImpl$1
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
            io.livekit.android.room.datastream.outgoing.StreamDestination r6 = r4.getDestination$livekit_android_sdk_release()
            kotlin.jvm.functions.Function2 r2 = io.livekit.android.room.datastream.outgoing.TextStreamSenderKt.access$getStringChunker$p()
            r0.label = r3
            java.lang.Object r5 = r6.mo13883write0E7RQCE(r5, r2, r0)
            if (r5 != r1) goto L4c
            return r1
        L4c:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: io.livekit.android.room.datastream.outgoing.TextStreamSender.m13884writeImplgIAlus$livekit_android_sdk_release(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
