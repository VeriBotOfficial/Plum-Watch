package com.hispark.clouddiag.callback;

import com.hispark.clouddiag.callback.DeviceSender;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DeviceSender.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/hispark/clouddiag/callback/NegotiatedMtuAwareDeviceSender;", "Lcom/hispark/clouddiag/callback/DeviceSender;", "negotiatedMtu", "", "deviceId", "", "(Ljava/lang/String;)Ljava/lang/Integer;", "cloud-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface NegotiatedMtuAwareDeviceSender extends DeviceSender {
    Integer negotiatedMtu(String deviceId);

    /* compiled from: DeviceSender.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static String getSenderName(NegotiatedMtuAwareDeviceSender negotiatedMtuAwareDeviceSender) {
            return DeviceSender.DefaultImpls.getSenderName(negotiatedMtuAwareDeviceSender);
        }

        public static boolean sendToDevice(NegotiatedMtuAwareDeviceSender negotiatedMtuAwareDeviceSender, String deviceId, String data) {
            Intrinsics.checkNotNullParameter(deviceId, "deviceId");
            Intrinsics.checkNotNullParameter(data, "data");
            return DeviceSender.DefaultImpls.sendToDevice(negotiatedMtuAwareDeviceSender, deviceId, data);
        }
    }
}
