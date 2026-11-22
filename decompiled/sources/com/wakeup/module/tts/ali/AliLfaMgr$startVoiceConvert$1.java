package com.wakeup.module.tts.ali;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: AliLfaMgr.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.wakeup.module.tts.ali.AliLfaMgr", f = "AliLfaMgr.kt", i = {0, 0, 1}, l = {34, 40}, m = "startVoiceConvert", n = {"audioFile", "language", "audioFile"}, s = {"L$0", "L$1", "L$0"})
/* loaded from: classes4.dex */
final class AliLfaMgr$startVoiceConvert$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;

    AliLfaMgr$startVoiceConvert$1(Continuation<? super AliLfaMgr$startVoiceConvert$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return AliLfaMgr.startVoiceConvert(null, null, this);
    }
}
