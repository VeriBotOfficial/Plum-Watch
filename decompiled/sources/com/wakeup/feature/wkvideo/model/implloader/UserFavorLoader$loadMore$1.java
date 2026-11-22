package com.wakeup.feature.wkvideo.model.implloader;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: UserFavorLoader.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.wakeup.feature.wkvideo.model.implloader.UserFavorLoader", f = "UserFavorLoader.kt", i = {0}, l = {42, 50}, m = "loadMore", n = {"this"}, s = {"L$0"})
/* loaded from: classes3.dex */
final class UserFavorLoader$loadMore$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ UserFavorLoader this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UserFavorLoader$loadMore$1(UserFavorLoader userFavorLoader, Continuation<? super UserFavorLoader$loadMore$1> continuation) {
        super(continuation);
        this.this$0 = userFavorLoader;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.loadMore(this);
    }
}
