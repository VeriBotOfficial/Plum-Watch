package com.wakeup.feature.wkvideo.search.repo;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: SearchRepo.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.wakeup.feature.wkvideo.search.repo.SearchRepo", f = "SearchRepo.kt", i = {0, 0, 1, 1, 1}, l = {28, 37}, m = "newSearchVideo", n = {"this", "body", "this", "body", "tPageIndex"}, s = {"L$0", "L$1", "L$0", "L$1", "I$0"})
/* loaded from: classes3.dex */
final class SearchRepo$newSearchVideo$1 extends ContinuationImpl {
    int I$0;
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SearchRepo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SearchRepo$newSearchVideo$1(SearchRepo searchRepo, Continuation<? super SearchRepo$newSearchVideo$1> continuation) {
        super(continuation);
        this.this$0 = searchRepo;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.newSearchVideo(null, this);
    }
}
