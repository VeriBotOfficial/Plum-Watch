package com.wakeup.commponent.module.device;

import android.content.Context;
import com.blankj.utilcode.util.AppUtils;
import com.sifli.watchfacelibrary.SifliWatchfaceService;
import com.wakeup.common.log.LogUtils;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DeviceToolsWrapper.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\rR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/wakeup/commponent/module/device/DeviceToolsWrapper;", "", "<init>", "()V", "TAG", "", "startActionWatchfaceWrapper", "", "context", "Landroid/content/Context;", "path", "bluetoothAddress", "type", "", "commponent_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class DeviceToolsWrapper {
    public static final DeviceToolsWrapper INSTANCE = new DeviceToolsWrapper();
    private static final String TAG = "DeviceToolsWrapper";

    private DeviceToolsWrapper() {
    }

    public final void startActionWatchfaceWrapper(Context context, String path, String bluetoothAddress, int type) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(bluetoothAddress, "bluetoothAddress");
        LogUtils.e(TAG, "startActionWatchface  start " + AppUtils.isAppForeground() + " ");
        try {
            if (new File(path).exists()) {
                SifliWatchfaceService.startActionWatchface(context, path, bluetoothAddress, type);
            }
        } catch (Exception e) {
            LogUtils.e(TAG, "startActionWatchface  error " + e.getMessage());
        }
    }
}
