package com.wakeup.common.storage.model.settings.model;

import com.umeng.analytics.AnalyticsConfig;
import kotlin.Metadata;

/* compiled from: SleepSettings.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\u001a\u0010\r\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u0007\"\u0004\b\u000f\u0010\tR\u001a\u0010\u0010\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0007\"\u0004\b\u0012\u0010\tR\u001a\u0010\u0013\u001a\u00020\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\u00020\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0016\"\u0004\b\u001b\u0010\u0018¨\u0006\u001c"}, d2 = {"Lcom/wakeup/common/storage/model/settings/model/SleepSettings;", "", "<init>", "()V", "autoSwitch", "", "getAutoSwitch", "()Z", "setAutoSwitch", "(Z)V", "showTimeSwitch", "getShowTimeSwitch", "setShowTimeSwitch", "trackingSwitch", "getTrackingSwitch", "setTrackingSwitch", "chargeRemindSwitch", "getChargeRemindSwitch", "setChargeRemindSwitch", AnalyticsConfig.RTD_START_TIME, "", "getStartTime", "()I", "setStartTime", "(I)V", "endTime", "getEndTime", "setEndTime", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SleepSettings {
    private boolean autoSwitch;
    private boolean chargeRemindSwitch;
    private boolean showTimeSwitch;
    private boolean trackingSwitch;
    private int startTime = 1320;
    private int endTime = 480;

    public final boolean getAutoSwitch() {
        return this.autoSwitch;
    }

    public final void setAutoSwitch(boolean z) {
        this.autoSwitch = z;
    }

    public final boolean getShowTimeSwitch() {
        return this.showTimeSwitch;
    }

    public final void setShowTimeSwitch(boolean z) {
        this.showTimeSwitch = z;
    }

    public final boolean getTrackingSwitch() {
        return this.trackingSwitch;
    }

    public final void setTrackingSwitch(boolean z) {
        this.trackingSwitch = z;
    }

    public final boolean getChargeRemindSwitch() {
        return this.chargeRemindSwitch;
    }

    public final void setChargeRemindSwitch(boolean z) {
        this.chargeRemindSwitch = z;
    }

    public final int getStartTime() {
        return this.startTime;
    }

    public final void setStartTime(int i) {
        this.startTime = i;
    }

    public final int getEndTime() {
        return this.endTime;
    }

    public final void setEndTime(int i) {
        this.endTime = i;
    }
}
