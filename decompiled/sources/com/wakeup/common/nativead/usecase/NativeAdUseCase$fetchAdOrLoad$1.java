package com.wakeup.common.nativead.usecase;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: NativeAdUseCase.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.wakeup.common.nativead.usecase.NativeAdUseCase", f = "NativeAdUseCase.kt", i = {}, l = {20}, m = "fetchAdOrLoad-0E7RQCE", n = {}, s = {})
/* loaded from: classes2.dex */
final class NativeAdUseCase$fetchAdOrLoad$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ NativeAdUseCase this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NativeAdUseCase$fetchAdOrLoad$1(NativeAdUseCase nativeAdUseCase, Continuation<? super NativeAdUseCase$fetchAdOrLoad$1> continuation) {
        super(continuation);
        this.this$0 = nativeAdUseCase;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object m8519fetchAdOrLoad0E7RQCE = this.this$0.m8519fetchAdOrLoad0E7RQCE(false, null, this);
        return m8519fetchAdOrLoad0E7RQCE == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? m8519fetchAdOrLoad0E7RQCE : Result.m14056boximpl(m8519fetchAdOrLoad0E7RQCE);
    }
}
