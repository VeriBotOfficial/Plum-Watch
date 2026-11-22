package com.unity3d.services.core.domain.task;

import com.unity3d.services.core.domain.task.BaseParams;
import com.unity3d.services.core.domain.task.BaseTask;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: BaseTask.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "com.unity3d.services.core.domain.task.BaseTask$DefaultImpls", f = "BaseTask.kt", i = {}, l = {11}, m = "invoke-gIAlu-s", n = {}, s = {})
/* loaded from: classes2.dex */
final class BaseTask$invoke$1<P extends BaseParams, R> extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;

    BaseTask$invoke$1(Continuation<? super BaseTask$invoke$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object m8442invokegIAlus = BaseTask.DefaultImpls.m8442invokegIAlus(null, null, this);
        return m8442invokegIAlus == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? m8442invokegIAlus : Result.m14056boximpl(m8442invokegIAlus);
    }
}
