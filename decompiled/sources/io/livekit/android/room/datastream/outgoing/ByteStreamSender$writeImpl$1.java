package io.livekit.android.room.datastream.outgoing;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: ByteStreamSender.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "io.livekit.android.room.datastream.outgoing.ByteStreamSender", f = "ByteStreamSender.kt", i = {}, l = {41}, m = "writeImpl-gIAlu-s$livekit_android_sdk_release", n = {}, s = {})
/* loaded from: classes6.dex */
final class ByteStreamSender$writeImpl$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ByteStreamSender this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ByteStreamSender$writeImpl$1(ByteStreamSender byteStreamSender, Continuation<? super ByteStreamSender$writeImpl$1> continuation) {
        super(continuation);
        this.this$0 = byteStreamSender;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object m13871writeImplgIAlus$livekit_android_sdk_release = this.this$0.m13871writeImplgIAlus$livekit_android_sdk_release((byte[]) null, (Continuation<? super Result<Unit>>) this);
        return m13871writeImplgIAlus$livekit_android_sdk_release == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? m13871writeImplgIAlus$livekit_android_sdk_release : Result.m14056boximpl(m13871writeImplgIAlus$livekit_android_sdk_release);
    }
}
