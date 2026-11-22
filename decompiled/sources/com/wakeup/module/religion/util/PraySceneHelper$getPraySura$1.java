package com.wakeup.module.religion.util;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: PraySceneHelper.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.wakeup.module.religion.util.PraySceneHelper", f = "PraySceneHelper.kt", i = {}, l = {205}, m = "getPraySura", n = {}, s = {})
/* loaded from: classes4.dex */
final class PraySceneHelper$getPraySura$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ PraySceneHelper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PraySceneHelper$getPraySura$1(PraySceneHelper praySceneHelper, Continuation<? super PraySceneHelper$getPraySura$1> continuation) {
        super(continuation);
        this.this$0 = praySceneHelper;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.getPraySura(0, this);
    }
}
