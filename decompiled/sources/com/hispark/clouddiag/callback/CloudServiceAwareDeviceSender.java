package com.hispark.clouddiag.callback;

import com.hispark.clouddiag.callback.DeviceSender;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DeviceSender.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/hispark/clouddiag/callback/CloudServiceAwareDeviceSender;", "Lcom/hispark/clouddiag/callback/DeviceSender;", "supportsCloudService", "", "serviceId", "", "cloud-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface CloudServiceAwareDeviceSender extends DeviceSender {
    boolean supportsCloudService(String serviceId);

    /* compiled from: DeviceSender.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static String getSenderName(CloudServiceAwareDeviceSender cloudServiceAwareDeviceSender) {
            return DeviceSender.DefaultImpls.getSenderName(cloudServiceAwareDeviceSender);
        }

        public static boolean sendToDevice(CloudServiceAwareDeviceSender cloudServiceAwareDeviceSender, String deviceId, String data) {
            Intrinsics.checkNotNullParameter(deviceId, "deviceId");
            Intrinsics.checkNotNullParameter(data, "data");
            return DeviceSender.DefaultImpls.sendToDevice(cloudServiceAwareDeviceSender, deviceId, data);
        }
    }
}
