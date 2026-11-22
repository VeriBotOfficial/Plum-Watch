package com.wakeup.common.storage;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: HotSearchEntryDao.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.wakeup.common.storage.HotSearchEntryDao", f = "HotSearchEntryDao.kt", i = {}, l = {48}, m = "getHotSearchEntryText", n = {}, s = {})
/* loaded from: classes2.dex */
final class HotSearchEntryDao$getHotSearchEntryText$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ HotSearchEntryDao this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HotSearchEntryDao$getHotSearchEntryText$1(HotSearchEntryDao hotSearchEntryDao, Continuation<? super HotSearchEntryDao$getHotSearchEntryText$1> continuation) {
        super(continuation);
        this.this$0 = hotSearchEntryDao;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.getHotSearchEntryText(this);
    }
}
