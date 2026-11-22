package io.livekit.android.token;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: CustomTokenSource.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "io.livekit.android.token.CustomTokenSource", f = "CustomTokenSource.kt", i = {}, l = {22}, m = "fetch-gIAlu-s", n = {}, s = {})
/* loaded from: classes6.dex */
final class CustomTokenSource$fetch$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ CustomTokenSource this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CustomTokenSource$fetch$1(CustomTokenSource customTokenSource, Continuation<? super CustomTokenSource$fetch$1> continuation) {
        super(continuation);
        this.this$0 = customTokenSource;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object mo13957fetchgIAlus = this.this$0.mo13957fetchgIAlus(null, this);
        return mo13957fetchgIAlus == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? mo13957fetchgIAlus : Result.m14056boximpl(mo13957fetchgIAlus);
    }
}
