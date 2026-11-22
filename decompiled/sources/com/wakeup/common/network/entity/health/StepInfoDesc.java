package com.wakeup.common.network.entity.health;

import android.gov.nist.core.Separators;
import com.wakeup.commponent.module.data.HealthData;
import kotlin.Metadata;

/* compiled from: StepInfoDesc.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\nHÆ\u0003JO\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\u0003HÖ\u0001J\t\u0010\"\u001a\u00020#HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006$"}, d2 = {"Lcom/wakeup/common/network/entity/health/StepInfoDesc;", "", HealthData.STATISTICS_STEP_TOTAL, "", HealthData.STATISTICS_DISTANCE_TOTAL, HealthData.STATISTICS_KCAL_TOTAL, "maxStep", "maxDistance", "maxKcal", "appTime", "", "<init>", "(IIIIIIJ)V", "getCountStep", "()I", "getCountDistance", "getCountKcal", "getMaxStep", "getMaxDistance", "getMaxKcal", "getAppTime", "()J", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "toString", "", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class StepInfoDesc {
    private final long appTime;
    private final int countDistance;
    private final int countKcal;
    private final int countStep;
    private final int maxDistance;
    private final int maxKcal;
    private final int maxStep;

    public static /* synthetic */ StepInfoDesc copy$default(StepInfoDesc stepInfoDesc, int i, int i2, int i3, int i4, int i5, int i6, long j, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            i = stepInfoDesc.countStep;
        }
        if ((i7 & 2) != 0) {
            i2 = stepInfoDesc.countDistance;
        }
        if ((i7 & 4) != 0) {
            i3 = stepInfoDesc.countKcal;
        }
        if ((i7 & 8) != 0) {
            i4 = stepInfoDesc.maxStep;
        }
        if ((i7 & 16) != 0) {
            i5 = stepInfoDesc.maxDistance;
        }
        if ((i7 & 32) != 0) {
            i6 = stepInfoDesc.maxKcal;
        }
        if ((i7 & 64) != 0) {
            j = stepInfoDesc.appTime;
        }
        long j2 = j;
        int i8 = i5;
        int i9 = i6;
        return stepInfoDesc.copy(i, i2, i3, i4, i8, i9, j2);
    }

    /* renamed from: component1, reason: from getter */
    public final int getCountStep() {
        return this.countStep;
    }

    /* renamed from: component2, reason: from getter */
    public final int getCountDistance() {
        return this.countDistance;
    }

    /* renamed from: component3, reason: from getter */
    public final int getCountKcal() {
        return this.countKcal;
    }

    /* renamed from: component4, reason: from getter */
    public final int getMaxStep() {
        return this.maxStep;
    }

    /* renamed from: component5, reason: from getter */
    public final int getMaxDistance() {
        return this.maxDistance;
    }

    /* renamed from: component6, reason: from getter */
    public final int getMaxKcal() {
        return this.maxKcal;
    }

    /* renamed from: component7, reason: from getter */
    public final long getAppTime() {
        return this.appTime;
    }

    public final StepInfoDesc copy(int countStep, int countDistance, int countKcal, int maxStep, int maxDistance, int maxKcal, long appTime) {
        return new StepInfoDesc(countStep, countDistance, countKcal, maxStep, maxDistance, maxKcal, appTime);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StepInfoDesc)) {
            return false;
        }
        StepInfoDesc stepInfoDesc = (StepInfoDesc) other;
        return this.countStep == stepInfoDesc.countStep && this.countDistance == stepInfoDesc.countDistance && this.countKcal == stepInfoDesc.countKcal && this.maxStep == stepInfoDesc.maxStep && this.maxDistance == stepInfoDesc.maxDistance && this.maxKcal == stepInfoDesc.maxKcal && this.appTime == stepInfoDesc.appTime;
    }

    public int hashCode() {
        return (((((((((((Integer.hashCode(this.countStep) * 31) + Integer.hashCode(this.countDistance)) * 31) + Integer.hashCode(this.countKcal)) * 31) + Integer.hashCode(this.maxStep)) * 31) + Integer.hashCode(this.maxDistance)) * 31) + Integer.hashCode(this.maxKcal)) * 31) + Long.hashCode(this.appTime);
    }

    public String toString() {
        return "StepInfoDesc(countStep=" + this.countStep + ", countDistance=" + this.countDistance + ", countKcal=" + this.countKcal + ", maxStep=" + this.maxStep + ", maxDistance=" + this.maxDistance + ", maxKcal=" + this.maxKcal + ", appTime=" + this.appTime + Separators.RPAREN;
    }

    public StepInfoDesc(int i, int i2, int i3, int i4, int i5, int i6, long j) {
        this.countStep = i;
        this.countDistance = i2;
        this.countKcal = i3;
        this.maxStep = i4;
        this.maxDistance = i5;
        this.maxKcal = i6;
        this.appTime = j;
    }

    public final int getCountStep() {
        return this.countStep;
    }

    public final int getCountDistance() {
        return this.countDistance;
    }

    public final int getCountKcal() {
        return this.countKcal;
    }

    public final int getMaxStep() {
        return this.maxStep;
    }

    public final int getMaxDistance() {
        return this.maxDistance;
    }

    public final int getMaxKcal() {
        return this.maxKcal;
    }

    public final long getAppTime() {
        return this.appTime;
    }
}
