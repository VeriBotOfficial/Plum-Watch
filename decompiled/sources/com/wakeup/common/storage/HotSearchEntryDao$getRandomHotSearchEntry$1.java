package com.wakeup.common.storage;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: HotSearchEntryDao.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.wakeup.common.storage.HotSearchEntryDao", f = "HotSearchEntryDao.kt", i = {0, 0}, l = {75}, m = "getRandomHotSearchEntry", n = {"this", "position"}, s = {"L$0", "I$0"})
/* loaded from: classes2.dex */
final class HotSearchEntryDao$getRandomHotSearchEntry$1 extends ContinuationImpl {
    int I$0;
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ HotSearchEntryDao this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HotSearchEntryDao$getRandomHotSearchEntry$1(HotSearchEntryDao hotSearchEntryDao, Continuation<? super HotSearchEntryDao$getRandomHotSearchEntry$1> continuation) {
        super(continuation);
        this.this$0 = hotSearchEntryDao;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.getRandomHotSearchEntry(0, this);
    }
}
