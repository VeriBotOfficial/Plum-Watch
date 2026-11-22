package com.wakeup.common.ftp;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: WkFtpClient.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.wakeup.common.ftp.WkFtpClient", f = "WkFtpClient.kt", i = {0}, l = {58}, m = "getFileList", n = {"this"}, s = {"L$0"})
/* loaded from: classes2.dex */
final class WkFtpClient$getFileList$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ WkFtpClient this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    WkFtpClient$getFileList$1(WkFtpClient wkFtpClient, Continuation<? super WkFtpClient$getFileList$1> continuation) {
        super(continuation);
        this.this$0 = wkFtpClient;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.getFileList(null, this);
    }
}
