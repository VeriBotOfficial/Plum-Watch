package com.wakeup.commponent.module.ai;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: AiLanguageMgr.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.wakeup.commponent.module.ai.AiLanguageMgr", f = "AiLanguageMgr.kt", i = {0}, l = {18}, m = "getLanguageId", n = {"defLanguageId"}, s = {"I$0"})
/* loaded from: classes2.dex */
final class AiLanguageMgr$getLanguageId$1 extends ContinuationImpl {
    int I$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AiLanguageMgr this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AiLanguageMgr$getLanguageId$1(AiLanguageMgr aiLanguageMgr, Continuation<? super AiLanguageMgr$getLanguageId$1> continuation) {
        super(continuation);
        this.this$0 = aiLanguageMgr;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.getLanguageId(0, 0, this);
    }
}
