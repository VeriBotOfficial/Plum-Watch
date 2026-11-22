package com.hispark.clouddiag.manager;

import com.hispark.clouddiag.protocol.MuxFrameProtocol;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MuxDevicePayloadPolicy.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u0016\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0005J\u0016\u0010\r\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0005J \u0010\u000e\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0010H\u0002¨\u0006\u0011"}, d2 = {"Lcom/hispark/clouddiag/manager/MuxDevicePayloadPolicy;", "", "<init>", "()V", "isLogPort", "", "portId", "", "shouldRouteToBoardByte", "prepareAtDownlinkPayload", "", "payload", "deviceUsesMux", "prepareHsoDownlinkPayload", "prepareDownlinkPayload", "port", "Lcom/hispark/clouddiag/protocol/MuxFrameProtocol$Port;", "cloud-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class MuxDevicePayloadPolicy {
    public static final MuxDevicePayloadPolicy INSTANCE = new MuxDevicePayloadPolicy();

    private MuxDevicePayloadPolicy() {
    }

    public final boolean isLogPort(int portId) {
        return portId == MuxFrameProtocol.Port.HSO_LOG.getId() || portId == MuxFrameProtocol.Port.WEARABLE_LOG.getId();
    }

    public final boolean shouldRouteToBoardByte(int portId) {
        return portId == MuxFrameProtocol.Port.HSO_LOG.getId();
    }

    public final byte[] prepareAtDownlinkPayload(byte[] payload, boolean deviceUsesMux) {
        Intrinsics.checkNotNullParameter(payload, "payload");
        return prepareDownlinkPayload(payload, deviceUsesMux, MuxFrameProtocol.Port.AT);
    }

    public final byte[] prepareHsoDownlinkPayload(byte[] payload, boolean deviceUsesMux) {
        Intrinsics.checkNotNullParameter(payload, "payload");
        return prepareDownlinkPayload(payload, deviceUsesMux, MuxFrameProtocol.Port.HSO_LOG);
    }

    private final byte[] prepareDownlinkPayload(byte[] payload, boolean deviceUsesMux, MuxFrameProtocol.Port port) {
        return (!deviceUsesMux || MuxFrameProtocol.INSTANCE.isCompleteFrameSequence(payload)) ? payload : MuxFrameProtocol.encode$default(MuxFrameProtocol.INSTANCE, port, payload, 0, 0, 0, 28, (Object) null);
    }
}
