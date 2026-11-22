package com.hispark.crashdump;

import com.hispark.crashdump.ProtocolBoardFileUploader;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;

/* compiled from: ProtocolBoardFileUploader.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.hispark.crashdump.ProtocolBoardFileUploader$UploadSession$upload$2$frameCollector$1", f = "ProtocolBoardFileUploader.kt", i = {}, l = {369}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes11.dex */
final class ProtocolBoardFileUploader$UploadSession$upload$2$frameCollector$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ ProtocolBoardFileUploader this$0;
    final /* synthetic */ ProtocolBoardFileUploader.UploadSession this$1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ProtocolBoardFileUploader$UploadSession$upload$2$frameCollector$1(ProtocolBoardFileUploader protocolBoardFileUploader, ProtocolBoardFileUploader.UploadSession uploadSession, Continuation<? super ProtocolBoardFileUploader$UploadSession$upload$2$frameCollector$1> continuation) {
        super(2, continuation);
        this.this$0 = protocolBoardFileUploader;
        this.this$1 = uploadSession;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ProtocolBoardFileUploader$UploadSession$upload$2$frameCollector$1(this.this$0, this.this$1, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ProtocolBoardFileUploader$UploadSession$upload$2$frameCollector$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* compiled from: ProtocolBoardFileUploader.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: com.hispark.crashdump.ProtocolBoardFileUploader$UploadSession$upload$2$frameCollector$1$1, reason: invalid class name */
    static final class AnonymousClass1<T> implements FlowCollector {
        final /* synthetic */ ProtocolBoardFileUploader.UploadSession this$0;

        AnonymousClass1(ProtocolBoardFileUploader.UploadSession uploadSession) {
            this.this$0 = uploadSession;
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
            return emit((byte[]) obj, (Continuation<? super Unit>) continuation);
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x0052  */
        /* JADX WARN: Removed duplicated region for block: B:73:0x003a  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(byte[] r9, kotlin.coroutines.Continuation<? super kotlin.Unit> r10) {
            /*
                Method dump skipped, instructions count: 258
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.hispark.crashdump.ProtocolBoardFileUploader$UploadSession$upload$2$frameCollector$1.AnonymousClass1.emit(byte[], kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String str;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            BoardByteTransport boardByteTransport = this.this$0.byteTransport;
            str = this.this$1.deviceId;
            this.label = 1;
            if (boardByteTransport.incoming(str).collect(new AnonymousClass1(this.this$1), this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
