package com.wakeup.common.storage;

import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;

/* compiled from: ConnectAnyDeviceDebug.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R*\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00058F@FX\u0087\u000e¢\u0006\u0012\u0012\u0004\b\b\u0010\u0003\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR$\u0010\r\u001a\u00020\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u000f\u0010\u0003\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/wakeup/common/storage/ConnectAnyDeviceDebug;", "", "<init>", "()V", "_enabled", "", "value", ViewProps.ENABLED, "getEnabled$annotations", "getEnabled", "()Z", "setEnabled", "(Z)V", "forceProductId", "", "getForceProductId$annotations", "getForceProductId", "()I", "setForceProductId", "(I)V", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ConnectAnyDeviceDebug {
    private static boolean _enabled;
    public static final ConnectAnyDeviceDebug INSTANCE = new ConnectAnyDeviceDebug();
    private static int forceProductId = 27;

    public static final boolean getEnabled() {
        return false;
    }

    @JvmStatic
    public static /* synthetic */ void getEnabled$annotations() {
    }

    @JvmStatic
    public static /* synthetic */ void getForceProductId$annotations() {
    }

    private ConnectAnyDeviceDebug() {
    }

    public static final void setEnabled(boolean z) {
        _enabled = z;
    }

    public static final int getForceProductId() {
        return forceProductId;
    }

    public static final void setForceProductId(int i) {
        forceProductId = i;
    }
}
