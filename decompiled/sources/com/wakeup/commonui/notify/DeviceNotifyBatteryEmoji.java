package com.wakeup.commonui.notify;

import android.content.Context;
import com.wakeup.commonui.R;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* compiled from: DeviceNotifyBatteryEmoji.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J7\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00072\u0012\u0010\f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\r\"\u00020\u0001¢\u0006\u0002\u0010\u000eJ\u001e\u0010\u000f\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0007J\u0018\u0010\u0012\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u0007H\u0002R\u000e\u0010\u0013\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/wakeup/commonui/notify/DeviceNotifyBatteryEmoji;", "", "<init>", "()V", "tierEmoji", "", "battery", "", "withBatteryEmoji", "context", "Landroid/content/Context;", "textRes", "formatArgs", "", "(Landroid/content/Context;II[Ljava/lang/Object;)Ljava/lang/String;", "dualEarWithBatteryEmoji", "left", "right", "earBatterySegment", "BATTERY", "LOW_BATTERY", "commonui_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class DeviceNotifyBatteryEmoji {
    private static final String BATTERY = "🔋";
    public static final DeviceNotifyBatteryEmoji INSTANCE = new DeviceNotifyBatteryEmoji();
    private static final String LOW_BATTERY = "🪫";

    private DeviceNotifyBatteryEmoji() {
    }

    public final String tierEmoji(int battery) {
        return RangesKt.coerceAtLeast(battery, 0) <= 19 ? LOW_BATTERY : BATTERY;
    }

    public final String withBatteryEmoji(Context context, int battery, int textRes, Object... formatArgs) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(formatArgs, "formatArgs");
        return tierEmoji(RangesKt.coerceAtLeast(battery, 0)) + context.getString(textRes, Arrays.copyOf(formatArgs, formatArgs.length));
    }

    public final String dualEarWithBatteryEmoji(Context context, int left, int right) {
        Intrinsics.checkNotNullParameter(context, "context");
        int coerceAtLeast = RangesKt.coerceAtLeast(left, 0);
        int coerceAtLeast2 = RangesKt.coerceAtLeast(right, 0);
        String string = context.getString(R.string.notify_headset_battery_lr_v2, earBatterySegment(context, coerceAtLeast), earBatterySegment(context, coerceAtLeast2));
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return string;
    }

    private final String earBatterySegment(Context context, int battery) {
        return tierEmoji(battery) + context.getString(R.string.notify_device_battery_percent, Integer.valueOf(battery));
    }
}
