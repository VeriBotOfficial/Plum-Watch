package com.wakeup.howear.model.data.feedmenu.datasource;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: HomeFeedMenuRepository.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.wakeup.howear.model.data.feedmenu.datasource.HomeFeedMenuRepositoryImpl", f = "HomeFeedMenuRepository.kt", i = {}, l = {29}, m = "getMenuData", n = {}, s = {})
/* loaded from: classes3.dex */
final class HomeFeedMenuRepositoryImpl$getMenuData$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ HomeFeedMenuRepositoryImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HomeFeedMenuRepositoryImpl$getMenuData$1(HomeFeedMenuRepositoryImpl homeFeedMenuRepositoryImpl, Continuation<? super HomeFeedMenuRepositoryImpl$getMenuData$1> continuation) {
        super(continuation);
        this.this$0 = homeFeedMenuRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.getMenuData(null, this);
    }
}
