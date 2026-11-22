package com.wakeup.module.religion.util;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.apache.commons.net.nntp.NNTPReply;

/* compiled from: PraySceneHelper.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.wakeup.module.religion.util.PraySceneHelper", f = "PraySceneHelper.kt", i = {0}, l = {NNTPReply.ARTICLE_RETRIEVED_REQUEST_TEXT_SEPARATELY}, m = "getPrayTextByServer", n = {"this"}, s = {"L$0"})
/* loaded from: classes4.dex */
final class PraySceneHelper$getPrayTextByServer$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ PraySceneHelper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PraySceneHelper$getPrayTextByServer$1(PraySceneHelper praySceneHelper, Continuation<? super PraySceneHelper$getPrayTextByServer$1> continuation) {
        super(continuation);
        this.this$0 = praySceneHelper;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object prayTextByServer;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        prayTextByServer = this.this$0.getPrayTextByServer(0, this);
        return prayTextByServer;
    }
}
