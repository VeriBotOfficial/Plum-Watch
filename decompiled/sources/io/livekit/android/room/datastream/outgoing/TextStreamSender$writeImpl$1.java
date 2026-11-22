package io.livekit.android.room.datastream.outgoing;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: TextStreamSender.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "io.livekit.android.room.datastream.outgoing.TextStreamSender", f = "TextStreamSender.kt", i = {}, l = {27}, m = "writeImpl-gIAlu-s$livekit_android_sdk_release", n = {}, s = {})
/* loaded from: classes6.dex */
final class TextStreamSender$writeImpl$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ TextStreamSender this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TextStreamSender$writeImpl$1(TextStreamSender textStreamSender, Continuation<? super TextStreamSender$writeImpl$1> continuation) {
        super(continuation);
        this.this$0 = textStreamSender;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object m13884writeImplgIAlus$livekit_android_sdk_release = this.this$0.m13884writeImplgIAlus$livekit_android_sdk_release((String) null, (Continuation<? super Result<Unit>>) this);
        return m13884writeImplgIAlus$livekit_android_sdk_release == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? m13884writeImplgIAlus$livekit_android_sdk_release : Result.m14056boximpl(m13884writeImplgIAlus$livekit_android_sdk_release);
    }
}
