package com.wakeup.commponent.module.ai;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: GlassesLanageMgr.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.wakeup.commponent.module.ai.GlassesLanguageMgr", f = "GlassesLanageMgr.kt", i = {}, l = {17}, m = "getLanguageId", n = {}, s = {})
/* loaded from: classes2.dex */
final class GlassesLanguageMgr$getLanguageId$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ GlassesLanguageMgr this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GlassesLanguageMgr$getLanguageId$1(GlassesLanguageMgr glassesLanguageMgr, Continuation<? super GlassesLanguageMgr$getLanguageId$1> continuation) {
        super(continuation);
        this.this$0 = glassesLanguageMgr;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.getLanguageId(this);
    }
}
