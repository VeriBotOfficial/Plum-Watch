package com.wakeup.feature.wkvideo.search.repo;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: RemoteSearchDataSource.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.wakeup.feature.wkvideo.search.repo.RemoteSearchDataSource", f = "RemoteSearchDataSource.kt", i = {}, l = {16}, m = "searchVideo", n = {}, s = {})
/* loaded from: classes3.dex */
final class RemoteSearchDataSource$searchVideo$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ RemoteSearchDataSource this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RemoteSearchDataSource$searchVideo$1(RemoteSearchDataSource remoteSearchDataSource, Continuation<? super RemoteSearchDataSource$searchVideo$1> continuation) {
        super(continuation);
        this.this$0 = remoteSearchDataSource;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.searchVideo(null, this);
    }
}
