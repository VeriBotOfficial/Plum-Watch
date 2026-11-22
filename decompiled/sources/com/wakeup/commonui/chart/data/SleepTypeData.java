package com.wakeup.commonui.chart.data;

import android.gov.nist.core.Separators;
import java.io.Serializable;
import kotlin.Metadata;

/* compiled from: SleepData.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u001a"}, d2 = {"Lcom/wakeup/commonui/chart/data/SleepTypeData;", "Ljava/io/Serializable;", "type", "", "duration", "sleepTime", "", "<init>", "(IIJ)V", "getType", "()I", "getDuration", "getSleepTime", "()J", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "toString", "", "Companion", "commonui_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class SleepTypeData implements Serializable {
    public static final int LENOVO_SLEEP_TYPE_AWAKE = 4;
    public static final int LENOVO_SLEEP_TYPE_DEEP = 2;
    public static final int LENOVO_SLEEP_TYPE_RAP = 17;
    public static final int LENOVO_SLEEP_TYPE_REM = 3;
    public static final int LENOVO_SLEEP_TYPE_SHALLOW = 1;
    public static final int SLEEP_TYPE_AWAKE = 3;
    public static final int SLEEP_TYPE_DEEP = 2;
    public static final int SLEEP_TYPE_SHALLOW = 1;
    private final int duration;
    private final long sleepTime;
    private final int type;

    public static /* synthetic */ SleepTypeData copy$default(SleepTypeData sleepTypeData, int i, int i2, long j, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = sleepTypeData.type;
        }
        if ((i3 & 2) != 0) {
            i2 = sleepTypeData.duration;
        }
        if ((i3 & 4) != 0) {
            j = sleepTypeData.sleepTime;
        }
        return sleepTypeData.copy(i, i2, j);
    }

    /* renamed from: component1, reason: from getter */
    public final int getType() {
        return this.type;
    }

    /* renamed from: component2, reason: from getter */
    public final int getDuration() {
        return this.duration;
    }

    /* renamed from: component3, reason: from getter */
    public final long getSleepTime() {
        return this.sleepTime;
    }

    public final SleepTypeData copy(int type, int duration, long sleepTime) {
        return new SleepTypeData(type, duration, sleepTime);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SleepTypeData)) {
            return false;
        }
        SleepTypeData sleepTypeData = (SleepTypeData) other;
        return this.type == sleepTypeData.type && this.duration == sleepTypeData.duration && this.sleepTime == sleepTypeData.sleepTime;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.type) * 31) + Integer.hashCode(this.duration)) * 31) + Long.hashCode(this.sleepTime);
    }

    public String toString() {
        return "SleepTypeData(type=" + this.type + ", duration=" + this.duration + ", sleepTime=" + this.sleepTime + Separators.RPAREN;
    }

    public SleepTypeData(int i, int i2, long j) {
        this.type = i;
        this.duration = i2;
        this.sleepTime = j;
    }

    public final int getType() {
        return this.type;
    }

    public final int getDuration() {
        return this.duration;
    }

    public final long getSleepTime() {
        return this.sleepTime;
    }
}
