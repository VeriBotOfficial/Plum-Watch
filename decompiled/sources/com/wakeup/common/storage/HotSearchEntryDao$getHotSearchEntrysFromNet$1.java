package com.wakeup.common.storage;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: HotSearchEntryDao.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.wakeup.common.storage.HotSearchEntryDao", f = "HotSearchEntryDao.kt", i = {0}, l = {98}, m = "getHotSearchEntrysFromNet", n = {"this"}, s = {"L$0"})
/* loaded from: classes2.dex */
final class HotSearchEntryDao$getHotSearchEntrysFromNet$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ HotSearchEntryDao this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HotSearchEntryDao$getHotSearchEntrysFromNet$1(HotSearchEntryDao hotSearchEntryDao, Continuation<? super HotSearchEntryDao$getHotSearchEntrysFromNet$1> continuation) {
        super(continuation);
        this.this$0 = hotSearchEntryDao;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object hotSearchEntrysFromNet;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        hotSearchEntrysFromNet = this.this$0.getHotSearchEntrysFromNet(this);
        return hotSearchEntrysFromNet;
    }
}
