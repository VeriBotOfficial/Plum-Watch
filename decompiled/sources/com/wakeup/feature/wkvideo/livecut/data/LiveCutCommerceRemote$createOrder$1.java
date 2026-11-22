package com.wakeup.feature.wkvideo.livecut.data;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: LiveCutCommerceRemote.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.wakeup.feature.wkvideo.livecut.data.LiveCutCommerceRemote", f = "LiveCutCommerceRemote.kt", i = {0}, l = {48}, m = "createOrder", n = {"cartItems"}, s = {"L$0"})
/* loaded from: classes3.dex */
final class LiveCutCommerceRemote$createOrder$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ LiveCutCommerceRemote this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LiveCutCommerceRemote$createOrder$1(LiveCutCommerceRemote liveCutCommerceRemote, Continuation<? super LiveCutCommerceRemote$createOrder$1> continuation) {
        super(continuation);
        this.this$0 = liveCutCommerceRemote;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.createOrder(null, this);
    }
}
