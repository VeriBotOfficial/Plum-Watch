package com.wakeup.module.religion.util;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: KoranHelper.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.wakeup.module.religion.util.KoranHelper", f = "KoranHelper.kt", i = {0, 0}, l = {291}, m = "optionPrevious", n = {"this", "complete"}, s = {"L$0", "L$1"})
/* loaded from: classes4.dex */
final class KoranHelper$optionPrevious$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ KoranHelper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    KoranHelper$optionPrevious$1(KoranHelper koranHelper, Continuation<? super KoranHelper$optionPrevious$1> continuation) {
        super(continuation);
        this.this$0 = koranHelper;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object optionPrevious;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        optionPrevious = this.this$0.optionPrevious(0, 0, 0, null, null, this);
        return optionPrevious;
    }
}
