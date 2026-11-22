package com.hispark.clouddiag.callback;

import com.hispark.clouddiag.callback.DeviceSender;
import com.hispark.crashdump.BoardLinkType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DeviceSender.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/hispark/clouddiag/callback/BoardLinkTypeAwareDeviceSender;", "Lcom/hispark/clouddiag/callback/DeviceSender;", "getBoardLinkType", "Lcom/hispark/crashdump/BoardLinkType;", "deviceId", "", "cloud-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface BoardLinkTypeAwareDeviceSender extends DeviceSender {
    BoardLinkType getBoardLinkType(String deviceId);

    /* compiled from: DeviceSender.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static String getSenderName(BoardLinkTypeAwareDeviceSender boardLinkTypeAwareDeviceSender) {
            return DeviceSender.DefaultImpls.getSenderName(boardLinkTypeAwareDeviceSender);
        }

        public static boolean sendToDevice(BoardLinkTypeAwareDeviceSender boardLinkTypeAwareDeviceSender, String deviceId, String data) {
            Intrinsics.checkNotNullParameter(deviceId, "deviceId");
            Intrinsics.checkNotNullParameter(data, "data");
            return DeviceSender.DefaultImpls.sendToDevice(boardLinkTypeAwareDeviceSender, deviceId, data);
        }
    }
}
