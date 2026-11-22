package com.hispark.clouddiag.callback;

import com.hispark.clouddiag.manager.CloudCommandEnvelope;
import com.hispark.crashdump.BoardLinkType;
import com.wakeup.module.record.Constants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DeviceSender.kt */
@Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a0\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bH\u0000\u001a\u0014\u0010\u000b\u001a\u00020\f*\u00020\u00022\u0006\u0010\r\u001a\u00020\u0004H\u0000\u001a\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u000f*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0000¨\u0006\u0010"}, d2 = {"sendToDeviceTrackedCompat", "Lcom/hispark/clouddiag/callback/DeviceWriteStartResult;", "Lcom/hispark/clouddiag/callback/DeviceSender;", "deviceId", "", "data", "", Constants.ON_COMPLETE_KEY, "Lkotlin/Function1;", "Lcom/hispark/clouddiag/callback/DeviceWriteCompletion;", "", "supportsCloudServiceCompat", "", "serviceId", "getBoardLinkTypeCompat", "Lcom/hispark/crashdump/BoardLinkType;", "cloud-sdk_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class DeviceSenderKt {
    public static final DeviceWriteStartResult sendToDeviceTrackedCompat(DeviceSender deviceSender, String deviceId, byte[] data, Function1<? super DeviceWriteCompletion, Unit> onComplete) {
        Intrinsics.checkNotNullParameter(deviceSender, "<this>");
        Intrinsics.checkNotNullParameter(deviceId, "deviceId");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(onComplete, "onComplete");
        TrackedDeviceSender trackedDeviceSender = deviceSender instanceof TrackedDeviceSender ? (TrackedDeviceSender) deviceSender : null;
        if (trackedDeviceSender != null) {
            return trackedDeviceSender.sendToDeviceTracked(deviceId, data, onComplete);
        }
        if (deviceSender.sendToDevice(deviceId, data)) {
            onComplete.invoke(new DeviceWriteCompletion(true, null, 2, null));
            return DeviceWriteStartResult.INSTANCE.accepted();
        }
        return DeviceWriteStartResult.INSTANCE.failed("DeviceSender returned false");
    }

    public static final boolean supportsCloudServiceCompat(DeviceSender deviceSender, String serviceId) {
        Intrinsics.checkNotNullParameter(deviceSender, "<this>");
        Intrinsics.checkNotNullParameter(serviceId, "serviceId");
        CloudServiceAwareDeviceSender cloudServiceAwareDeviceSender = deviceSender instanceof CloudServiceAwareDeviceSender ? (CloudServiceAwareDeviceSender) deviceSender : null;
        return cloudServiceAwareDeviceSender != null ? cloudServiceAwareDeviceSender.supportsCloudService(serviceId) : !Intrinsics.areEqual(serviceId, CloudCommandEnvelope.SERVICE_EXECUTE);
    }

    public static final BoardLinkType getBoardLinkTypeCompat(DeviceSender deviceSender, String deviceId) {
        Intrinsics.checkNotNullParameter(deviceSender, "<this>");
        Intrinsics.checkNotNullParameter(deviceId, "deviceId");
        BoardLinkTypeAwareDeviceSender boardLinkTypeAwareDeviceSender = deviceSender instanceof BoardLinkTypeAwareDeviceSender ? (BoardLinkTypeAwareDeviceSender) deviceSender : null;
        if (boardLinkTypeAwareDeviceSender != null) {
            return boardLinkTypeAwareDeviceSender.getBoardLinkType(deviceId);
        }
        return null;
    }
}
