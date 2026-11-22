package io.livekit.android.token;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: CachingTokenSource.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "io.livekit.android.token.BaseCachingTokenSource", f = "CachingTokenSource.kt", i = {}, l = {66}, m = "cachedResponse", n = {}, s = {})
/* loaded from: classes6.dex */
final class BaseCachingTokenSource$cachedResponse$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ BaseCachingTokenSource this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BaseCachingTokenSource$cachedResponse$1(BaseCachingTokenSource baseCachingTokenSource, Continuation<? super BaseCachingTokenSource$cachedResponse$1> continuation) {
        super(continuation);
        this.this$0 = baseCachingTokenSource;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.cachedResponse(this);
    }
}
