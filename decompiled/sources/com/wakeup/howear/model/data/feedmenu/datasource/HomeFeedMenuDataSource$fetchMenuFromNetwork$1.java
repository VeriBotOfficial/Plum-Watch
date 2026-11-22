package com.wakeup.howear.model.data.feedmenu.datasource;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: HomeFeedMenuDataSource.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.wakeup.howear.model.data.feedmenu.datasource.HomeFeedMenuDataSource", f = "HomeFeedMenuDataSource.kt", i = {}, l = {22}, m = "fetchMenuFromNetwork", n = {}, s = {})
/* loaded from: classes3.dex */
final class HomeFeedMenuDataSource$fetchMenuFromNetwork$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ HomeFeedMenuDataSource this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HomeFeedMenuDataSource$fetchMenuFromNetwork$1(HomeFeedMenuDataSource homeFeedMenuDataSource, Continuation<? super HomeFeedMenuDataSource$fetchMenuFromNetwork$1> continuation) {
        super(continuation);
        this.this$0 = homeFeedMenuDataSource;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.fetchMenuFromNetwork(null, this);
    }
}
