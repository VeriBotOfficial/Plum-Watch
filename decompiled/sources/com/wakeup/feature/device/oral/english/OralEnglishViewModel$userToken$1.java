package com.wakeup.feature.device.oral.english;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: OralEnglishViewModel.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.wakeup.feature.device.oral.english.OralEnglishViewModel", f = "OralEnglishViewModel.kt", i = {0}, l = {45}, m = "userToken", n = {"this"}, s = {"L$0"})
/* loaded from: classes3.dex */
final class OralEnglishViewModel$userToken$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ OralEnglishViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OralEnglishViewModel$userToken$1(OralEnglishViewModel oralEnglishViewModel, Continuation<? super OralEnglishViewModel$userToken$1> continuation) {
        super(continuation);
        this.this$0 = oralEnglishViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object userToken;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        userToken = this.this$0.userToken(null, this);
        return userToken;
    }
}
