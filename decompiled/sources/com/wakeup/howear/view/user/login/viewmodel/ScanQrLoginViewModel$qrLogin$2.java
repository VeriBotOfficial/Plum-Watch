package com.wakeup.howear.view.user.login.viewmodel;

import com.wakeup.common.temp.ResponseThrowable;
import com.wakeup.common.utils.ToastUtils;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: ScanQrLoginViewModel.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "it", "Lcom/wakeup/common/temp/ResponseThrowable;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.wakeup.howear.view.user.login.viewmodel.ScanQrLoginViewModel$qrLogin$2", f = "ScanQrLoginViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
final class ScanQrLoginViewModel$qrLogin$2 extends SuspendLambda implements Function3<CoroutineScope, ResponseThrowable, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;

    ScanQrLoginViewModel$qrLogin$2(Continuation<? super ScanQrLoginViewModel$qrLogin$2> continuation) {
        super(3, continuation);
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(CoroutineScope coroutineScope, ResponseThrowable responseThrowable, Continuation<? super Unit> continuation) {
        ScanQrLoginViewModel$qrLogin$2 scanQrLoginViewModel$qrLogin$2 = new ScanQrLoginViewModel$qrLogin$2(continuation);
        scanQrLoginViewModel$qrLogin$2.L$0 = responseThrowable;
        return scanQrLoginViewModel$qrLogin$2.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        ToastUtils.showToast(((ResponseThrowable) this.L$0).getErrMsg());
        return Unit.INSTANCE;
    }
}
