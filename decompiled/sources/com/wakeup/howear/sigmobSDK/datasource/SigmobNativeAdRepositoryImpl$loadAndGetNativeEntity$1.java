package com.wakeup.howear.sigmobSDK.datasource;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: SigmobNativeAdRepositoryImpl.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.wakeup.howear.sigmobSDK.datasource.SigmobNativeAdRepositoryImpl", f = "SigmobNativeAdRepositoryImpl.kt", i = {}, l = {28}, m = "loadAndGetNativeEntity-0E7RQCE", n = {}, s = {})
/* loaded from: classes3.dex */
final class SigmobNativeAdRepositoryImpl$loadAndGetNativeEntity$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SigmobNativeAdRepositoryImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SigmobNativeAdRepositoryImpl$loadAndGetNativeEntity$1(SigmobNativeAdRepositoryImpl sigmobNativeAdRepositoryImpl, Continuation<? super SigmobNativeAdRepositoryImpl$loadAndGetNativeEntity$1> continuation) {
        super(continuation);
        this.this$0 = sigmobNativeAdRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object mo8518loadAndGetNativeEntity0E7RQCE = this.this$0.mo8518loadAndGetNativeEntity0E7RQCE(false, null, this);
        return mo8518loadAndGetNativeEntity0E7RQCE == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? mo8518loadAndGetNativeEntity0E7RQCE : Result.m14056boximpl(mo8518loadAndGetNativeEntity0E7RQCE);
    }
}
