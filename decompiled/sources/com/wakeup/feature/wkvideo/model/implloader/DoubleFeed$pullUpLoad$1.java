package com.wakeup.feature.wkvideo.model.implloader;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: DoubleFeed.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.wakeup.feature.wkvideo.model.implloader.DoubleFeed", f = "DoubleFeed.kt", i = {0, 0}, l = {21, 50}, m = "pullUpLoad", n = {"this", "doubleFeedStartTime"}, s = {"L$0", "J$0"})
/* loaded from: classes3.dex */
final class DoubleFeed$pullUpLoad$1 extends ContinuationImpl {
    long J$0;
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ DoubleFeed this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DoubleFeed$pullUpLoad$1(DoubleFeed doubleFeed, Continuation<? super DoubleFeed$pullUpLoad$1> continuation) {
        super(continuation);
        this.this$0 = doubleFeed;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.pullUpLoad(this);
    }
}
