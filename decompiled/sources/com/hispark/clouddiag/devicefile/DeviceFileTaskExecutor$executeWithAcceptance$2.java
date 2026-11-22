package com.hispark.clouddiag.devicefile;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* compiled from: DeviceFileTaskExecutor.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Lcom/hispark/clouddiag/devicefile/DeviceFileCommandAcceptance;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.hispark.clouddiag.devicefile.DeviceFileTaskExecutor$executeWithAcceptance$2", f = "DeviceFileTaskExecutor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes11.dex */
final class DeviceFileTaskExecutor$executeWithAcceptance$2 extends SuspendLambda implements Function2<DeviceFileCommandAcceptance, Continuation<? super Unit>, Object> {
    int label;

    DeviceFileTaskExecutor$executeWithAcceptance$2(Continuation<? super DeviceFileTaskExecutor$executeWithAcceptance$2> continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DeviceFileTaskExecutor$executeWithAcceptance$2(continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(DeviceFileCommandAcceptance deviceFileCommandAcceptance, Continuation<? super Unit> continuation) {
        return ((DeviceFileTaskExecutor$executeWithAcceptance$2) create(deviceFileCommandAcceptance, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return Unit.INSTANCE;
    }
}
