package com.hispark.clouddiag.uploader;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: OfflineLogUploader.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.hispark.clouddiag.uploader.OfflineLogUploader", f = "OfflineLogUploader.kt", i = {0, 0, 0, 0, 0, 0}, l = {181}, m = "uploadMultipleOfflineLogFiles", n = {"this", "deviceInfo", "fileType", "results", "file", "logType"}, s = {"L$0", "L$1", "L$2", "L$3", "L$5", "I$0"})
/* loaded from: classes11.dex */
final class OfflineLogUploader$uploadMultipleOfflineLogFiles$1 extends ContinuationImpl {
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ OfflineLogUploader this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OfflineLogUploader$uploadMultipleOfflineLogFiles$1(OfflineLogUploader offlineLogUploader, Continuation<? super OfflineLogUploader$uploadMultipleOfflineLogFiles$1> continuation) {
        super(continuation);
        this.this$0 = offlineLogUploader;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.uploadMultipleOfflineLogFiles(null, null, null, 0, this);
    }
}
