package com.wakeup.module.religion.util;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: KoranHelper.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.wakeup.module.religion.util.KoranHelper", f = "KoranHelper.kt", i = {0, 0, 0, 0, 0}, l = {100, 115, 123, 134}, m = "deviceGetKoran", n = {"this", "sura", "paragraphIndex", "position", "option"}, s = {"L$0", "I$0", "I$1", "I$2", "I$3"})
/* loaded from: classes4.dex */
final class KoranHelper$deviceGetKoran$1 extends ContinuationImpl {
    int I$0;
    int I$1;
    int I$2;
    int I$3;
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ KoranHelper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    KoranHelper$deviceGetKoran$1(KoranHelper koranHelper, Continuation<? super KoranHelper$deviceGetKoran$1> continuation) {
        super(continuation);
        this.this$0 = koranHelper;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.deviceGetKoran(0, 0, 0, 0, this);
    }
}
