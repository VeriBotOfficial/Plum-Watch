package com.wakeup.feature.weilife.utils;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: ThirdJumpUtils.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.wakeup.feature.weilife.utils.ThirdJumpUtils", f = "ThirdJumpUtils.kt", i = {}, l = {145}, m = "getScore", n = {}, s = {})
/* loaded from: classes3.dex */
final class ThirdJumpUtils$getScore$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ThirdJumpUtils this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ThirdJumpUtils$getScore$1(ThirdJumpUtils thirdJumpUtils, Continuation<? super ThirdJumpUtils$getScore$1> continuation) {
        super(continuation);
        this.this$0 = thirdJumpUtils;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object score;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        score = this.this$0.getScore(this);
        return score;
    }
}
