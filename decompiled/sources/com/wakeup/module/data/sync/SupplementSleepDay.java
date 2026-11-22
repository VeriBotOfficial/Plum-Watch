package com.wakeup.module.data.sync;

import android.gov.nist.core.Separators;
import com.wakeup.commponent.module.data.HealthData;
import kotlin.Metadata;

/* compiled from: HealthUpLoadManager.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003JO\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\u0005HÖ\u0001J\t\u0010\"\u001a\u00020#HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010¨\u0006$"}, d2 = {"Lcom/wakeup/module/data/sync/SupplementSleepDay;", "", "appTime", "", "awakeDuration", "", "dayNo", "deepDuration", "shallowDuration", HealthData.STATISTICS_SUM_DURATION, "supplement", "<init>", "(JIJIIII)V", "getAppTime", "()J", "getAwakeDuration", "()I", "getDayNo", "getDeepDuration", "getShallowDuration", "getSumDuration", "getSupplement", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "toString", "", "module-data_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final /* data */ class SupplementSleepDay {
    private final long appTime;
    private final int awakeDuration;
    private final long dayNo;
    private final int deepDuration;
    private final int shallowDuration;
    private final int sumDuration;
    private final int supplement;

    public static /* synthetic */ SupplementSleepDay copy$default(SupplementSleepDay supplementSleepDay, long j, int i, long j2, int i2, int i3, int i4, int i5, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            j = supplementSleepDay.appTime;
        }
        long j3 = j;
        if ((i6 & 2) != 0) {
            i = supplementSleepDay.awakeDuration;
        }
        int i7 = i;
        if ((i6 & 4) != 0) {
            j2 = supplementSleepDay.dayNo;
        }
        return supplementSleepDay.copy(j3, i7, j2, (i6 & 8) != 0 ? supplementSleepDay.deepDuration : i2, (i6 & 16) != 0 ? supplementSleepDay.shallowDuration : i3, (i6 & 32) != 0 ? supplementSleepDay.sumDuration : i4, (i6 & 64) != 0 ? supplementSleepDay.supplement : i5);
    }

    /* renamed from: component1, reason: from getter */
    public final long getAppTime() {
        return this.appTime;
    }

    /* renamed from: component2, reason: from getter */
    public final int getAwakeDuration() {
        return this.awakeDuration;
    }

    /* renamed from: component3, reason: from getter */
    public final long getDayNo() {
        return this.dayNo;
    }

    /* renamed from: component4, reason: from getter */
    public final int getDeepDuration() {
        return this.deepDuration;
    }

    /* renamed from: component5, reason: from getter */
    public final int getShallowDuration() {
        return this.shallowDuration;
    }

    /* renamed from: component6, reason: from getter */
    public final int getSumDuration() {
        return this.sumDuration;
    }

    /* renamed from: component7, reason: from getter */
    public final int getSupplement() {
        return this.supplement;
    }

    public final SupplementSleepDay copy(long appTime, int awakeDuration, long dayNo, int deepDuration, int shallowDuration, int sumDuration, int supplement) {
        return new SupplementSleepDay(appTime, awakeDuration, dayNo, deepDuration, shallowDuration, sumDuration, supplement);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SupplementSleepDay)) {
            return false;
        }
        SupplementSleepDay supplementSleepDay = (SupplementSleepDay) other;
        return this.appTime == supplementSleepDay.appTime && this.awakeDuration == supplementSleepDay.awakeDuration && this.dayNo == supplementSleepDay.dayNo && this.deepDuration == supplementSleepDay.deepDuration && this.shallowDuration == supplementSleepDay.shallowDuration && this.sumDuration == supplementSleepDay.sumDuration && this.supplement == supplementSleepDay.supplement;
    }

    public int hashCode() {
        return (((((((((((Long.hashCode(this.appTime) * 31) + Integer.hashCode(this.awakeDuration)) * 31) + Long.hashCode(this.dayNo)) * 31) + Integer.hashCode(this.deepDuration)) * 31) + Integer.hashCode(this.shallowDuration)) * 31) + Integer.hashCode(this.sumDuration)) * 31) + Integer.hashCode(this.supplement);
    }

    public String toString() {
        return "SupplementSleepDay(appTime=" + this.appTime + ", awakeDuration=" + this.awakeDuration + ", dayNo=" + this.dayNo + ", deepDuration=" + this.deepDuration + ", shallowDuration=" + this.shallowDuration + ", sumDuration=" + this.sumDuration + ", supplement=" + this.supplement + Separators.RPAREN;
    }

    public SupplementSleepDay(long j, int i, long j2, int i2, int i3, int i4, int i5) {
        this.appTime = j;
        this.awakeDuration = i;
        this.dayNo = j2;
        this.deepDuration = i2;
        this.shallowDuration = i3;
        this.sumDuration = i4;
        this.supplement = i5;
    }

    public final long getAppTime() {
        return this.appTime;
    }

    public final int getAwakeDuration() {
        return this.awakeDuration;
    }

    public final long getDayNo() {
        return this.dayNo;
    }

    public final int getDeepDuration() {
        return this.deepDuration;
    }

    public final int getShallowDuration() {
        return this.shallowDuration;
    }

    public final int getSumDuration() {
        return this.sumDuration;
    }

    public final int getSupplement() {
        return this.supplement;
    }
}
