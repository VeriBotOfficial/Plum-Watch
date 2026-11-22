package com.wakeup.module.religion.util;

import com.alibaba.fastjson.asm.Opcodes;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: PraySceneHelper.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.wakeup.module.religion.util.PraySceneHelper", f = "PraySceneHelper.kt", i = {0}, l = {Opcodes.INVOKEINTERFACE}, m = "appGetScene", n = {"pageNumber"}, s = {"I$0"})
/* loaded from: classes4.dex */
final class PraySceneHelper$appGetScene$1 extends ContinuationImpl {
    int I$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ PraySceneHelper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PraySceneHelper$appGetScene$1(PraySceneHelper praySceneHelper, Continuation<? super PraySceneHelper$appGetScene$1> continuation) {
        super(continuation);
        this.this$0 = praySceneHelper;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.appGetScene(0, 0, this);
    }
}
