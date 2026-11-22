package io.livekit.android.token;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: CachingTokenSource.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "io.livekit.android.token.CachingFixedTokenSource", f = "CachingTokenSource.kt", i = {}, l = {80}, m = "fetch-IoAF18A", n = {}, s = {})
/* loaded from: classes6.dex */
final class CachingFixedTokenSource$fetch$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ CachingFixedTokenSource this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CachingFixedTokenSource$fetch$1(CachingFixedTokenSource cachingFixedTokenSource, Continuation<? super CachingFixedTokenSource$fetch$1> continuation) {
        super(continuation);
        this.this$0 = cachingFixedTokenSource;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object mo13958fetchIoAF18A = this.this$0.mo13958fetchIoAF18A(this);
        return mo13958fetchIoAF18A == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? mo13958fetchIoAF18A : Result.m14056boximpl(mo13958fetchIoAF18A);
    }
}
