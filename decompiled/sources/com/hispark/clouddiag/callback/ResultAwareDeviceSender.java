package com.hispark.clouddiag.callback;

import com.hispark.clouddiag.callback.DeviceSender;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DeviceSender.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H¦@¢\u0006\u0002\u0010\b¨\u0006\t"}, d2 = {"Lcom/hispark/clouddiag/callback/ResultAwareDeviceSender;", "Lcom/hispark/clouddiag/callback/DeviceSender;", "sendToDeviceResult", "Lcom/hispark/clouddiag/callback/DeviceSendResult;", "deviceId", "", "data", "", "(Ljava/lang/String;[BLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "cloud-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface ResultAwareDeviceSender extends DeviceSender {
    Object sendToDeviceResult(String str, byte[] bArr, Continuation<? super DeviceSendResult> continuation);

    /* compiled from: DeviceSender.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static String getSenderName(ResultAwareDeviceSender resultAwareDeviceSender) {
            return DeviceSender.DefaultImpls.getSenderName(resultAwareDeviceSender);
        }

        public static boolean sendToDevice(ResultAwareDeviceSender resultAwareDeviceSender, String deviceId, String data) {
            Intrinsics.checkNotNullParameter(deviceId, "deviceId");
            Intrinsics.checkNotNullParameter(data, "data");
            return DeviceSender.DefaultImpls.sendToDevice(resultAwareDeviceSender, deviceId, data);
        }
    }
}
