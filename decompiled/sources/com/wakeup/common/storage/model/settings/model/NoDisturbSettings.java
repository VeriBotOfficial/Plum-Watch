package com.wakeup.common.storage.model.settings.model;

import com.umeng.analytics.AnalyticsConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: NoDisturbSettings.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\f\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005R\u001a\u0010\t\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0007\"\u0004\b\u000b\u0010\u0005R\u001a\u0010\f\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0007\"\u0004\b\u000e\u0010\u0005¨\u0006\u000f"}, d2 = {"Lcom/wakeup/common/storage/model/settings/model/NoDisturbSettings;", "", "switch", "", "<init>", "(I)V", "getSwitch", "()I", "setSwitch", AnalyticsConfig.RTD_START_TIME, "getStartTime", "setStartTime", "endTime", "getEndTime", "setEndTime", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class NoDisturbSettings {
    private int endTime;
    private int startTime;
    private int switch;

    public NoDisturbSettings() {
        this(0, 1, null);
    }

    public NoDisturbSettings(int i) {
        this.switch = i;
    }

    public /* synthetic */ NoDisturbSettings(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i);
    }

    public final int getSwitch() {
        return this.switch;
    }

    public final void setSwitch(int i) {
        this.switch = i;
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
