package com.hispark.clouddiag.callback;

import com.heytap.mcssdk.constant.b;
import com.hispark.clouddiag.model.DeviceFileCommand;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* compiled from: DeviceFileCommandCallback.kt */
@Deprecated(message = "Cloud DEVICE_FILE commands are executed automatically by SDK 2.0.0")
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H¦@¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/hispark/clouddiag/callback/DeviceFileCommandCallback;", "", "onDeviceFileCommand", "", b.y, "Lcom/hispark/clouddiag/model/DeviceFileCommand;", "(Lcom/hispark/clouddiag/model/DeviceFileCommand;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "cloud-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface DeviceFileCommandCallback {
    Object onDeviceFileCommand(DeviceFileCommand deviceFileCommand, Continuation<? super Unit> continuation);
}
