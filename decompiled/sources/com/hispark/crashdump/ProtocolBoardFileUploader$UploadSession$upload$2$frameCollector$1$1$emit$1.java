package com.hispark.crashdump;

import com.hispark.crashdump.ProtocolBoardFileUploader$UploadSession$upload$2$frameCollector$1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: ProtocolBoardFileUploader.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.hispark.crashdump.ProtocolBoardFileUploader$UploadSession$upload$2$frameCollector$1$1", f = "ProtocolBoardFileUploader.kt", i = {}, l = {374}, m = "emit", n = {}, s = {})
/* loaded from: classes11.dex */
final class ProtocolBoardFileUploader$UploadSession$upload$2$frameCollector$1$1$emit$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ProtocolBoardFileUploader$UploadSession$upload$2$frameCollector$1.AnonymousClass1<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    ProtocolBoardFileUploader$UploadSession$upload$2$frameCollector$1$1$emit$1(ProtocolBoardFileUploader$UploadSession$upload$2$frameCollector$1.AnonymousClass1<? super T> anonymousClass1, Continuation<? super ProtocolBoardFileUploader$UploadSession$upload$2$frameCollector$1$1$emit$1> continuation) {
        super(continuation);
        this.this$0 = anonymousClass1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit((byte[]) null, (Continuation<? super Unit>) this);
    }
}
