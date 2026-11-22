package com.wakeup.feature.wkvideo.search.repo;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: SearchRepo.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.wakeup.feature.wkvideo.search.repo.SearchRepo", f = "SearchRepo.kt", i = {0}, l = {56}, m = "loadMoreSearchVideo", n = {"this"}, s = {"L$0"})
/* loaded from: classes3.dex */
final class SearchRepo$loadMoreSearchVideo$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SearchRepo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SearchRepo$loadMoreSearchVideo$1(SearchRepo searchRepo, Continuation<? super SearchRepo$loadMoreSearchVideo$1> continuation) {
        super(continuation);
        this.this$0 = searchRepo;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.loadMoreSearchVideo(this);
    }
}
