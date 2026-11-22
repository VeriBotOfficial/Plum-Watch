package com.hispark.clouddiag.callback;

import com.hispark.clouddiag.callback.DeviceSender;
import com.wakeup.module.record.Constants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DeviceSender.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J,\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tH&¨\u0006\f"}, d2 = {"Lcom/hispark/clouddiag/callback/TrackedDeviceSender;", "Lcom/hispark/clouddiag/callback/DeviceSender;", "sendToDeviceTracked", "Lcom/hispark/clouddiag/callback/DeviceWriteStartResult;", "deviceId", "", "data", "", Constants.ON_COMPLETE_KEY, "Lkotlin/Function1;", "Lcom/hispark/clouddiag/callback/DeviceWriteCompletion;", "", "cloud-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface TrackedDeviceSender extends DeviceSender {
    DeviceWriteStartResult sendToDeviceTracked(String deviceId, byte[] data, Function1<? super DeviceWriteCompletion, Unit> onComplete);

    /* compiled from: DeviceSender.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static String getSenderName(TrackedDeviceSender trackedDeviceSender) {
            return DeviceSender.DefaultImpls.getSenderName(trackedDeviceSender);
        }

        public static boolean sendToDevice(TrackedDeviceSender trackedDeviceSender, String deviceId, String data) {
            Intrinsics.checkNotNullParameter(deviceId, "deviceId");
            Intrinsics.checkNotNullParameter(data, "data");
            return DeviceSender.DefaultImpls.sendToDevice(trackedDeviceSender, deviceId, data);
        }
    }
}
