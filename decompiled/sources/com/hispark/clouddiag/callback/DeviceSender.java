package com.hispark.clouddiag.callback;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* compiled from: DeviceSender.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\t\u001a\u00020\u0005H\u0016J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¨\u0006\n"}, d2 = {"Lcom/hispark/clouddiag/callback/DeviceSender;", "", "sendToDevice", "", "deviceId", "", "data", "", "isDeviceConnected", "getSenderName", "cloud-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface DeviceSender {
    String getSenderName();

    boolean isDeviceConnected(String deviceId);

    boolean sendToDevice(String deviceId, String data);

    boolean sendToDevice(String deviceId, byte[] data);

    /* compiled from: DeviceSender.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static String getSenderName(DeviceSender deviceSender) {
            return "DeviceSender";
        }

        public static boolean sendToDevice(DeviceSender deviceSender, String deviceId, String data) {
            Intrinsics.checkNotNullParameter(deviceId, "deviceId");
            Intrinsics.checkNotNullParameter(data, "data");
            byte[] bytes = data.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
            return deviceSender.sendToDevice(deviceId, bytes);
        }
    }
}
