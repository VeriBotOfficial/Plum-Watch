package com.wakeup.module.religion.util;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: KoranHelper.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.wakeup.module.religion.util.KoranHelper", f = "KoranHelper.kt", i = {0}, l = {30}, m = "appGetKoran", n = {"pageNumber"}, s = {"I$0"})
/* loaded from: classes4.dex */
final class KoranHelper$appGetKoran$1 extends ContinuationImpl {
    int I$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ KoranHelper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    KoranHelper$appGetKoran$1(KoranHelper koranHelper, Continuation<? super KoranHelper$appGetKoran$1> continuation) {
        super(continuation);
        this.this$0 = koranHelper;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.appGetKoran(0, 0, this);
    }
}
