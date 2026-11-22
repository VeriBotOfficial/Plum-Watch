package com.wakeup.common.utils;

import android.content.Context;
import android.os.Build;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.os.VibratorManager;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: VibrationHelper.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\u000e\u0010\f\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\r"}, d2 = {"Lcom/wakeup/common/utils/VibrationHelper;", "", "<init>", "()V", "vibrate", "", "context", "Landroid/content/Context;", "durationMs", "", "getVibrator", "Landroid/os/Vibrator;", "stopVibration", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class VibrationHelper {
    public static final VibrationHelper INSTANCE = new VibrationHelper();

    private VibrationHelper() {
    }

    public final void vibrate(Context context, long durationMs) {
        Intrinsics.checkNotNullParameter(context, "context");
        Vibrator vibrator = getVibrator(context);
        if (vibrator.hasVibrator()) {
            try {
                vibrator.vibrate(VibrationEffect.createOneShot(durationMs, -1));
            } catch (Exception unused) {
            }
        }
    }

    private final Vibrator getVibrator(Context context) {
        if (Build.VERSION.SDK_INT >= 31) {
            Object systemService = context.getSystemService("vibrator_manager");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.os.VibratorManager");
            Vibrator defaultVibrator = ((VibratorManager) systemService).getDefaultVibrator();
            Intrinsics.checkNotNullExpressionValue(defaultVibrator, "getDefaultVibrator(...)");
            return defaultVibrator;
        }
        Object systemService2 = context.getSystemService("vibrator");
        Intrinsics.checkNotNull(systemService2, "null cannot be cast to non-null type android.os.Vibrator");
        return (Vibrator) systemService2;
    }

    public final void stopVibration(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        getVibrator(context).cancel();
    }
}
