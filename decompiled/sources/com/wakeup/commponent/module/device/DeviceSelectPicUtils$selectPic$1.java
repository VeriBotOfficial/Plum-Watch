package com.wakeup.commponent.module.device;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: DeviceSelectPicUtils.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.wakeup.commponent.module.device.DeviceSelectPicUtils", f = "DeviceSelectPicUtils.kt", i = {0, 0}, l = {29}, m = "selectPic", n = {"fileName", "isRound"}, s = {"L$0", "I$0"})
/* loaded from: classes2.dex */
final class DeviceSelectPicUtils$selectPic$1 extends ContinuationImpl {
    int I$0;
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ DeviceSelectPicUtils this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DeviceSelectPicUtils$selectPic$1(DeviceSelectPicUtils deviceSelectPicUtils, Continuation<? super DeviceSelectPicUtils$selectPic$1> continuation) {
        super(continuation);
        this.this$0 = deviceSelectPicUtils;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.selectPic(null, null, 0, null, this);
    }
}
