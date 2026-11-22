package io.livekit.android.room.track;

import io.livekit.android.audio.AudioProcessorInterface;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;

/* compiled from: LocalAudioTrack.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "Lkotlin/Pair;", "Lio/livekit/android/audio/AudioProcessorInterface;", "", "processor", "bypass"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "io.livekit.android.room.track.LocalAudioTrack$features$4", f = "LocalAudioTrack.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
final class LocalAudioTrack$features$4 extends SuspendLambda implements Function3<AudioProcessorInterface, Boolean, Continuation<? super Pair<? extends AudioProcessorInterface, ? extends Boolean>>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ boolean Z$0;
    int label;

    LocalAudioTrack$features$4(Continuation<? super LocalAudioTrack$features$4> continuation) {
        super(3, continuation);
    }

    public final Object invoke(AudioProcessorInterface audioProcessorInterface, boolean z, Continuation<? super Pair<? extends AudioProcessorInterface, Boolean>> continuation) {
        LocalAudioTrack$features$4 localAudioTrack$features$4 = new LocalAudioTrack$features$4(continuation);
        localAudioTrack$features$4.L$0 = audioProcessorInterface;
        localAudioTrack$features$4.Z$0 = z;
        return localAudioTrack$features$4.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Object invoke(AudioProcessorInterface audioProcessorInterface, Boolean bool, Continuation<? super Pair<? extends AudioProcessorInterface, ? extends Boolean>> continuation) {
        return invoke(audioProcessorInterface, bool.booleanValue(), (Continuation<? super Pair<? extends AudioProcessorInterface, Boolean>>) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return TuplesKt.to((AudioProcessorInterface) this.L$0, Boxing.boxBoolean(this.Z$0));
    }
}
