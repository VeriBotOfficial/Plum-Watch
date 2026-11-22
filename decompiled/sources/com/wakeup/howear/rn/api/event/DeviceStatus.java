package com.wakeup.howear.rn.api.event;

import com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.text.StringsKt;

/* compiled from: DeviceStatus.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000b\u001a\u00020\u0007J\u0010\u0010\f\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\r\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0006J\u0006\u0010\u000e\u001a\u00020\tR\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/wakeup/howear/rn/api/event/DeviceStatus;", "", "<init>", "()V", "btConnectedMap", "Ljava/util/concurrent/ConcurrentHashMap;", "", "", "setBtConnected", "", "deviceId", AndroidDynamicDeviceInfoDataSource.USB_EXTRA_CONNECTED, "getBtConnected", "removeBtConnected", "clearBtConnected", "feature-rn_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DeviceStatus {
    public static final DeviceStatus INSTANCE = new DeviceStatus();
    private static final ConcurrentHashMap<String, Boolean> btConnectedMap = new ConcurrentHashMap<>();

    private DeviceStatus() {
    }

    public final void setBtConnected(String deviceId, boolean connected) {
        String str = deviceId;
        if (str == null || StringsKt.isBlank(str)) {
            return;
        }
        btConnectedMap.put(deviceId, Boolean.valueOf(connected));
    }

    public final boolean getBtConnected(String deviceId) {
        Boolean bool;
        String str = deviceId;
        if (str == null || StringsKt.isBlank(str) || (bool = btConnectedMap.get(deviceId)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public final void removeBtConnected(String deviceId) {
        String str = deviceId;
        if (str == null || StringsKt.isBlank(str)) {
            return;
        }
        btConnectedMap.remove(deviceId);
    }

    public final void clearBtConnected() {
        btConnectedMap.clear();
    }
}
