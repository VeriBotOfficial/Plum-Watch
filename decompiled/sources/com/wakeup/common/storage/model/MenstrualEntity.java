package com.wakeup.common.storage.model;

import android.gov.nist.core.Separators;
import com.anythink.core.d.l;
import com.umeng.analytics.AnalyticsConfig;
import java.io.Serializable;
import kotlin.Metadata;

/* compiled from: MenstrualEntity.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J1\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÖ\u0001J\t\u0010 \u001a\u00020!HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000f\"\u0004\b\u0013\u0010\u0011R\u001a\u0010\u0007\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u000b\"\u0004\b\u0015\u0010\r¨\u0006\""}, d2 = {"Lcom/wakeup/common/storage/model/MenstrualEntity;", "Ljava/io/Serializable;", AnalyticsConfig.RTD_START_TIME, "", "severalDay", "", "cycle", l.a.ac, "<init>", "(JIIJ)V", "getStartTime", "()J", "setStartTime", "(J)V", "getSeveralDay", "()I", "setSeveralDay", "(I)V", "getCycle", "setCycle", "getUpdateTime", "setUpdateTime", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "toString", "", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class MenstrualEntity implements Serializable {
    private int cycle;
    private int severalDay;
    private long startTime;
    private long updateTime;

    public static /* synthetic */ MenstrualEntity copy$default(MenstrualEntity menstrualEntity, long j, int i, int i2, long j2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            j = menstrualEntity.startTime;
        }
        long j3 = j;
        if ((i3 & 2) != 0) {
            i = menstrualEntity.severalDay;
        }
        int i4 = i;
        if ((i3 & 4) != 0) {
            i2 = menstrualEntity.cycle;
        }
        int i5 = i2;
        if ((i3 & 8) != 0) {
            j2 = menstrualEntity.updateTime;
        }
        return menstrualEntity.copy(j3, i4, i5, j2);
    }

    /* renamed from: component1, reason: from getter */
    public final long getStartTime() {
        return this.startTime;
    }

    /* renamed from: component2, reason: from getter */
    public final int getSeveralDay() {
        return this.severalDay;
    }

    /* renamed from: component3, reason: from getter */
    public final int getCycle() {
        return this.cycle;
    }

    /* renamed from: component4, reason: from getter */
    public final long getUpdateTime() {
        return this.updateTime;
    }

    public final MenstrualEntity copy(long startTime, int severalDay, int cycle, long updateTime) {
        return new MenstrualEntity(startTime, severalDay, cycle, updateTime);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MenstrualEntity)) {
            return false;
        }
        MenstrualEntity menstrualEntity = (MenstrualEntity) other;
        return this.startTime == menstrualEntity.startTime && this.severalDay == menstrualEntity.severalDay && this.cycle == menstrualEntity.cycle && this.updateTime == menstrualEntity.updateTime;
    }

    public int hashCode() {
        return (((((Long.hashCode(this.startTime) * 31) + Integer.hashCode(this.severalDay)) * 31) + Integer.hashCode(this.cycle)) * 31) + Long.hashCode(this.updateTime);
    }

    public String toString() {
        return "MenstrualEntity(startTime=" + this.startTime + ", severalDay=" + this.severalDay + ", cycle=" + this.cycle + ", updateTime=" + this.updateTime + Separators.RPAREN;
    }

    public MenstrualEntity(long j, int i, int i2, long j2) {
        this.startTime = j;
        this.severalDay = i;
        this.cycle = i2;
        this.updateTime = j2;
    }

    public final long getStartTime() {
        return this.startTime;
    }

    public final void setStartTime(long j) {
        this.startTime = j;
    }

    public final int getSeveralDay() {
        return this.severalDay;
    }

    public final void setSeveralDay(int i) {
        this.severalDay = i;
    }

    public final int getCycle() {
        return this.cycle;
    }

    public final void setCycle(int i) {
        this.cycle = i;
    }

    public final long getUpdateTime() {
        return this.updateTime;
    }

    public final void setUpdateTime(long j) {
        this.updateTime = j;
    }
}
