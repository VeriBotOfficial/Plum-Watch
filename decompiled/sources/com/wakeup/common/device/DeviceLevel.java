package com.wakeup.common.device;

import android.app.ActivityManager;
import android.content.Context;
import com.autonavi.aps.amapapi.config.Const;
import com.wakeup.common.log.LogUtils;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DeviceLevel.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000eH\u0007J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u000eH\u0007J\b\u0010\u0011\u001a\u00020\u0007H\u0007J\b\u0010\u0012\u001a\u00020\u0005H\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/wakeup/common/device/DeviceLevel;", "", "<init>", "()V", "TAG", "", "LOW_TOTAL_GB", "", "HIGH_TOTAL_GB", "cached", "Lcom/wakeup/common/device/DeviceTier;", "totalGbCached", "get", "context", "Landroid/content/Context;", "isLow", "", "totalGb", "tierName", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class DeviceLevel {
    private static final double HIGH_TOTAL_GB = 6.0d;
    private static final double LOW_TOTAL_GB = 4.5d;
    private static final String TAG = "DeviceLevel";
    private static volatile DeviceTier cached;
    public static final DeviceLevel INSTANCE = new DeviceLevel();
    private static volatile double totalGbCached = -1.0d;

    private DeviceLevel() {
    }

    @JvmStatic
    public static final DeviceTier get(Context context) {
        DeviceTier deviceTier;
        Intrinsics.checkNotNullParameter(context, "context");
        DeviceTier deviceTier2 = cached;
        if (deviceTier2 != null) {
            return deviceTier2;
        }
        Context applicationContext = context.getApplicationContext();
        Object systemService = applicationContext.getSystemService(Const.STR_PROCESS_TAG);
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
        ActivityManager activityManager = (ActivityManager) systemService;
        activityManager.getMemoryInfo(new ActivityManager.MemoryInfo());
        double d = r1.totalMem / 1.073741824E9d;
        totalGbCached = d;
        if (activityManager.isLowRamDevice() || d <= 4.5d) {
            deviceTier = DeviceTier.LOW;
        } else if (d < HIGH_TOTAL_GB) {
            deviceTier = DeviceTier.MID;
        } else {
            deviceTier = DeviceTier.HIGH;
        }
        cached = deviceTier;
        String format = String.format("%.2f", Arrays.copyOf(new Object[]{Double.valueOf(d)}, 1));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        LogUtils.i(TAG, "tier=" + deviceTier + " totalGb=" + format + " lowRam=" + activityManager.isLowRamDevice() + " memClass=" + activityManager.getMemoryClass());
        Intrinsics.checkNotNull(applicationContext);
        DeviceSpecLog.logOnce(applicationContext);
        return deviceTier;
    }

    @JvmStatic
    public static final boolean isLow(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return get(context) == DeviceTier.LOW;
    }

    @JvmStatic
    public static final double totalGb() {
        return totalGbCached;
    }

    @JvmStatic
    public static final String tierName() {
        String name;
        DeviceTier deviceTier = cached;
        return (deviceTier == null || (name = deviceTier.name()) == null) ? "UNKNOWN" : name;
    }
}
