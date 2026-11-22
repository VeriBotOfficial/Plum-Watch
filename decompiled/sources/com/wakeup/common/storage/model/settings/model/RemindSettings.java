package com.wakeup.common.storage.model.settings.model;

import android.gov.nist.core.Separators;
import com.autonavi.aps.amapapi.config.Const;
import com.umeng.analytics.AnalyticsConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: RemindSettings.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0019\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010 \u001a\u00020\u00032\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020\nHÖ\u0001J\t\u0010#\u001a\u00020$HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000eR\u001a\u0010\u0012\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\f\"\u0004\b\u0014\u0010\u000eR\u001a\u0010\u0015\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\f\"\u0004\b\u0017\u0010\u000eR\u001a\u0010\u0018\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\f\"\u0004\b\u001a\u0010\u000eR\u001a\u0010\u001b\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\f\"\u0004\b\u001d\u0010\u000e¨\u0006%"}, d2 = {"Lcom/wakeup/common/storage/model/settings/model/RemindSettings;", "", "switch", "", "<init>", "(Z)V", "getSwitch", "()Z", "setSwitch", AnalyticsConfig.RTD_START_TIME, "", "getStartTime", "()I", "setStartTime", "(I)V", "endTime", "getEndTime", "setEndTime", "intervalTime", "getIntervalTime", "setIntervalTime", "remindTime", "getRemindTime", "setRemindTime", "repeatDay", "getRepeatDay", "setRepeatDay", Const.SP_KEY_CALL_LOC_COUNT, "getCount", "setCount", "component1", "copy", "equals", "other", "hashCode", "toString", "", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class RemindSettings {
    private int count;
    private int endTime;
    private int intervalTime;
    private int remindTime;
    private int repeatDay;
    private int startTime;
    private boolean switch;

    public RemindSettings() {
        this(false, 1, null);
    }

    public static /* synthetic */ RemindSettings copy$default(RemindSettings remindSettings, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = remindSettings.switch;
        }
        return remindSettings.copy(z);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getSwitch() {
        return this.switch;
    }

    public final RemindSettings copy(boolean r2) {
        return new RemindSettings(r2);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof RemindSettings) && this.switch == ((RemindSettings) other).switch;
    }

    public int hashCode() {
        return Boolean.hashCode(this.switch);
    }

    public String toString() {
        return "RemindSettings(switch=" + this.switch + Separators.RPAREN;
    }

    public RemindSettings(boolean z) {
        this.switch = z;
        this.intervalTime = 45;
        this.repeatDay = 128;
        this.count = 100;
    }

    public /* synthetic */ RemindSettings(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z);
    }

    public final boolean getSwitch() {
        return this.switch;
    }

    public final void setSwitch(boolean z) {
        this.switch = z;
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

    public final int getIntervalTime() {
        return this.intervalTime;
    }

    public final void setIntervalTime(int i) {
        this.intervalTime = i;
    }

    public final int getRemindTime() {
        return this.remindTime;
    }

    public final void setRemindTime(int i) {
        this.remindTime = i;
    }

    public final int getRepeatDay() {
        return this.repeatDay;
    }

    public final void setRepeatDay(int i) {
        this.repeatDay = i;
    }

    public final int getCount() {
        return this.count;
    }

    public final void setCount(int i) {
        this.count = i;
    }
}
