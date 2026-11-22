package com.wakeup.module.tts.ali;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: BaseAliMgr.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.wakeup.module.tts.ali.BaseAliMgr", f = "BaseAliMgr.kt", i = {}, l = {43}, m = "getToken", n = {}, s = {})
/* loaded from: classes4.dex */
final class BaseAliMgr$getToken$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;

    BaseAliMgr$getToken$1(Continuation<? super BaseAliMgr$getToken$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return BaseAliMgr.getToken(this);
    }
}
