package com.wakeup.feature.search;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: AiSearchLoader.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.wakeup.feature.search.HotInfoLoader", f = "AiSearchLoader.kt", i = {0}, l = {88, 94}, m = "loadMore", n = {"this"}, s = {"L$0"})
/* loaded from: classes3.dex */
final class HotInfoLoader$loadMore$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ HotInfoLoader this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HotInfoLoader$loadMore$1(HotInfoLoader hotInfoLoader, Continuation<? super HotInfoLoader$loadMore$1> continuation) {
        super(continuation);
        this.this$0 = hotInfoLoader;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.loadMore(this);
    }
}
