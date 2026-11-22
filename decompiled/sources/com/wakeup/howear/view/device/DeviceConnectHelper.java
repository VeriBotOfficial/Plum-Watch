package com.wakeup.howear.view.device;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DeviceConnectHelper.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0006J\u000e\u0010\n\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0006J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u0006J\u0006\u0010\r\u001a\u00020\bR\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/wakeup/howear/view/device/DeviceConnectHelper;", "", "<init>", "()V", "connectedMacList", "", "", "addConnectedMac", "", "mac", "removeConnectedMac", "isConnectedMac", "", "clearConnectedMac", "app_wpOverseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class DeviceConnectHelper {
    public static final DeviceConnectHelper INSTANCE = new DeviceConnectHelper();
    private static List<String> connectedMacList = new ArrayList();

    private DeviceConnectHelper() {
    }

    public final void addConnectedMac(String mac) {
        Intrinsics.checkNotNullParameter(mac, "mac");
        removeConnectedMac(mac);
        connectedMacList.add(mac);
    }

    public final void removeConnectedMac(String mac) {
        Intrinsics.checkNotNullParameter(mac, "mac");
        if (connectedMacList.contains(mac)) {
            connectedMacList.remove(mac);
        }
    }

    public final boolean isConnectedMac(String mac) {
        Intrinsics.checkNotNullParameter(mac, "mac");
        return connectedMacList.contains(mac);
    }

    public final void clearConnectedMac() {
        connectedMacList.clear();
    }
}
