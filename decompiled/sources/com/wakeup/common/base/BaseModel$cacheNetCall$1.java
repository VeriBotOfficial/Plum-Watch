package com.wakeup.common.base;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: BaseModel.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.wakeup.common.base.BaseModel", f = "BaseModel.kt", i = {0, 0, 0, 1}, l = {20, 23, 26}, m = "cacheNetCall", n = {"remoto", "save", "isUseCache", "save"}, s = {"L$0", "L$1", "L$2", "L$0"})
/* loaded from: classes2.dex */
final class BaseModel$cacheNetCall$1<T> extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ BaseModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BaseModel$cacheNetCall$1(BaseModel baseModel, Continuation<? super BaseModel$cacheNetCall$1> continuation) {
        super(continuation);
        this.this$0 = baseModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.cacheNetCall(null, null, null, null, this);
    }
}
