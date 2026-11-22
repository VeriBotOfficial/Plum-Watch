package com.wakeup.common.network.entity.health;

import android.gov.nist.core.Separators;
import androidx.compose.ui.layout.LayoutKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RainbowInfo.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b9\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u009d\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0011¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010:\u001a\u00020\u0003HÆ\u0003J\t\u0010;\u001a\u00020\u0003HÆ\u0003J\t\u0010<\u001a\u00020\u0003HÆ\u0003J\t\u0010=\u001a\u00020\u0003HÆ\u0003J\t\u0010>\u001a\u00020\u0003HÆ\u0003J\t\u0010?\u001a\u00020\u0003HÆ\u0003J\t\u0010@\u001a\u00020\u0003HÆ\u0003J\t\u0010A\u001a\u00020\u0003HÆ\u0003J\t\u0010B\u001a\u00020\u0003HÆ\u0003J\t\u0010C\u001a\u00020\u0003HÆ\u0003J\t\u0010D\u001a\u00020\u000eHÆ\u0003J\t\u0010E\u001a\u00020\u0003HÆ\u0003J\t\u0010F\u001a\u00020\u0011HÆ\u0003J\t\u0010G\u001a\u00020\u0011HÆ\u0003J\t\u0010H\u001a\u00020\u0011HÆ\u0003J\u009f\u0001\u0010I\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u0011HÆ\u0001J\u0013\u0010J\u001a\u00020K2\b\u0010L\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010M\u001a\u00020\u0003HÖ\u0001J\t\u0010N\u001a\u00020OHÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0017\"\u0004\b\u001b\u0010\u0019R\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0017\"\u0004\b\u001d\u0010\u0019R\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0017\"\u0004\b\u001f\u0010\u0019R\u001a\u0010\u0007\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0017\"\u0004\b!\u0010\u0019R\u001a\u0010\b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0017\"\u0004\b#\u0010\u0019R\u001a\u0010\t\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0017\"\u0004\b%\u0010\u0019R\u001a\u0010\n\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0017\"\u0004\b'\u0010\u0019R\u001a\u0010\u000b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u0017\"\u0004\b)\u0010\u0019R\u001a\u0010\f\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u0017\"\u0004\b+\u0010\u0019R\u001a\u0010\r\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u001a\u0010\u000f\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u0010\u0017\"\u0004\b1\u0010\u0019R\u001a\u0010\u0010\u001a\u00020\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\u001a\u0010\u0012\u001a\u00020\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b6\u00103\"\u0004\b7\u00105R\u001a\u0010\u0013\u001a\u00020\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u00103\"\u0004\b9\u00105¨\u0006P"}, d2 = {"Lcom/wakeup/common/network/entity/health/RainbowInfo;", "", "activeKcalGoal", "", "activeKcal", "activeKcalGoalPercent", "intensityTime", "intensityGoalPercent", "intensityTimeGoal", "activeTime", "activeTimeGoalPercent", "activeTimeGoal", "stepCount", "distance", "", "exerciseCount", "listActiveKcal", "Lcom/wakeup/common/network/entity/health/RainbowDetailInfo;", "listActiveTime", "listIntensity", "<init>", "(IIIIIIIIIIFILcom/wakeup/common/network/entity/health/RainbowDetailInfo;Lcom/wakeup/common/network/entity/health/RainbowDetailInfo;Lcom/wakeup/common/network/entity/health/RainbowDetailInfo;)V", "getActiveKcalGoal", "()I", "setActiveKcalGoal", "(I)V", "getActiveKcal", "setActiveKcal", "getActiveKcalGoalPercent", "setActiveKcalGoalPercent", "getIntensityTime", "setIntensityTime", "getIntensityGoalPercent", "setIntensityGoalPercent", "getIntensityTimeGoal", "setIntensityTimeGoal", "getActiveTime", "setActiveTime", "getActiveTimeGoalPercent", "setActiveTimeGoalPercent", "getActiveTimeGoal", "setActiveTimeGoal", "getStepCount", "setStepCount", "getDistance", "()F", "setDistance", "(F)V", "getExerciseCount", "setExerciseCount", "getListActiveKcal", "()Lcom/wakeup/common/network/entity/health/RainbowDetailInfo;", "setListActiveKcal", "(Lcom/wakeup/common/network/entity/health/RainbowDetailInfo;)V", "getListActiveTime", "setListActiveTime", "getListIntensity", "setListIntensity", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "copy", "equals", "", "other", "hashCode", "toString", "", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class RainbowInfo {
    private int activeKcal;
    private int activeKcalGoal;
    private int activeKcalGoalPercent;
    private int activeTime;
    private int activeTimeGoal;
    private int activeTimeGoalPercent;
    private float distance;
    private int exerciseCount;
    private int intensityGoalPercent;
    private int intensityTime;
    private int intensityTimeGoal;
    private RainbowDetailInfo listActiveKcal;
    private RainbowDetailInfo listActiveTime;
    private RainbowDetailInfo listIntensity;
    private int stepCount;

    public RainbowInfo() {
        this(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.0f, 0, null, null, null, LayoutKt.LargeDimension, null);
    }

    /* renamed from: component1, reason: from getter */
    public final int getActiveKcalGoal() {
        return this.activeKcalGoal;
    }

    /* renamed from: component10, reason: from getter */
    public final int getStepCount() {
        return this.stepCount;
    }

    /* renamed from: component11, reason: from getter */
    public final float getDistance() {
        return this.distance;
    }

    /* renamed from: component12, reason: from getter */
    public final int getExerciseCount() {
        return this.exerciseCount;
    }

    /* renamed from: component13, reason: from getter */
    public final RainbowDetailInfo getListActiveKcal() {
        return this.listActiveKcal;
    }

    /* renamed from: component14, reason: from getter */
    public final RainbowDetailInfo getListActiveTime() {
        return this.listActiveTime;
    }

    /* renamed from: component15, reason: from getter */
    public final RainbowDetailInfo getListIntensity() {
        return this.listIntensity;
    }

    /* renamed from: component2, reason: from getter */
    public final int getActiveKcal() {
        return this.activeKcal;
    }

    /* renamed from: component3, reason: from getter */
    public final int getActiveKcalGoalPercent() {
        return this.activeKcalGoalPercent;
    }

    /* renamed from: component4, reason: from getter */
    public final int getIntensityTime() {
        return this.intensityTime;
    }

    /* renamed from: component5, reason: from getter */
    public final int getIntensityGoalPercent() {
        return this.intensityGoalPercent;
    }

    /* renamed from: component6, reason: from getter */
    public final int getIntensityTimeGoal() {
        return this.intensityTimeGoal;
    }

    /* renamed from: component7, reason: from getter */
    public final int getActiveTime() {
        return this.activeTime;
    }

    /* renamed from: component8, reason: from getter */
    public final int getActiveTimeGoalPercent() {
        return this.activeTimeGoalPercent;
    }

    /* renamed from: component9, reason: from getter */
    public final int getActiveTimeGoal() {
        return this.activeTimeGoal;
    }

    public final RainbowInfo copy(int activeKcalGoal, int activeKcal, int activeKcalGoalPercent, int intensityTime, int intensityGoalPercent, int intensityTimeGoal, int activeTime, int activeTimeGoalPercent, int activeTimeGoal, int stepCount, float distance, int exerciseCount, RainbowDetailInfo listActiveKcal, RainbowDetailInfo listActiveTime, RainbowDetailInfo listIntensity) {
        Intrinsics.checkNotNullParameter(listActiveKcal, "listActiveKcal");
        Intrinsics.checkNotNullParameter(listActiveTime, "listActiveTime");
        Intrinsics.checkNotNullParameter(listIntensity, "listIntensity");
        return new RainbowInfo(activeKcalGoal, activeKcal, activeKcalGoalPercent, intensityTime, intensityGoalPercent, intensityTimeGoal, activeTime, activeTimeGoalPercent, activeTimeGoal, stepCount, distance, exerciseCount, listActiveKcal, listActiveTime, listIntensity);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RainbowInfo)) {
            return false;
        }
        RainbowInfo rainbowInfo = (RainbowInfo) other;
        return this.activeKcalGoal == rainbowInfo.activeKcalGoal && this.activeKcal == rainbowInfo.activeKcal && this.activeKcalGoalPercent == rainbowInfo.activeKcalGoalPercent && this.intensityTime == rainbowInfo.intensityTime && this.intensityGoalPercent == rainbowInfo.intensityGoalPercent && this.intensityTimeGoal == rainbowInfo.intensityTimeGoal && this.activeTime == rainbowInfo.activeTime && this.activeTimeGoalPercent == rainbowInfo.activeTimeGoalPercent && this.activeTimeGoal == rainbowInfo.activeTimeGoal && this.stepCount == rainbowInfo.stepCount && Float.compare(this.distance, rainbowInfo.distance) == 0 && this.exerciseCount == rainbowInfo.exerciseCount && Intrinsics.areEqual(this.listActiveKcal, rainbowInfo.listActiveKcal) && Intrinsics.areEqual(this.listActiveTime, rainbowInfo.listActiveTime) && Intrinsics.areEqual(this.listIntensity, rainbowInfo.listIntensity);
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((Integer.hashCode(this.activeKcalGoal) * 31) + Integer.hashCode(this.activeKcal)) * 31) + Integer.hashCode(this.activeKcalGoalPercent)) * 31) + Integer.hashCode(this.intensityTime)) * 31) + Integer.hashCode(this.intensityGoalPercent)) * 31) + Integer.hashCode(this.intensityTimeGoal)) * 31) + Integer.hashCode(this.activeTime)) * 31) + Integer.hashCode(this.activeTimeGoalPercent)) * 31) + Integer.hashCode(this.activeTimeGoal)) * 31) + Integer.hashCode(this.stepCount)) * 31) + Float.hashCode(this.distance)) * 31) + Integer.hashCode(this.exerciseCount)) * 31) + this.listActiveKcal.hashCode()) * 31) + this.listActiveTime.hashCode()) * 31) + this.listIntensity.hashCode();
    }

    public String toString() {
        return "RainbowInfo(activeKcalGoal=" + this.activeKcalGoal + ", activeKcal=" + this.activeKcal + ", activeKcalGoalPercent=" + this.activeKcalGoalPercent + ", intensityTime=" + this.intensityTime + ", intensityGoalPercent=" + this.intensityGoalPercent + ", intensityTimeGoal=" + this.intensityTimeGoal + ", activeTime=" + this.activeTime + ", activeTimeGoalPercent=" + this.activeTimeGoalPercent + ", activeTimeGoal=" + this.activeTimeGoal + ", stepCount=" + this.stepCount + ", distance=" + this.distance + ", exerciseCount=" + this.exerciseCount + ", listActiveKcal=" + this.listActiveKcal + ", listActiveTime=" + this.listActiveTime + ", listIntensity=" + this.listIntensity + Separators.RPAREN;
    }

    public RainbowInfo(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, float f, int i11, RainbowDetailInfo listActiveKcal, RainbowDetailInfo listActiveTime, RainbowDetailInfo listIntensity) {
        Intrinsics.checkNotNullParameter(listActiveKcal, "listActiveKcal");
        Intrinsics.checkNotNullParameter(listActiveTime, "listActiveTime");
        Intrinsics.checkNotNullParameter(listIntensity, "listIntensity");
        this.activeKcalGoal = i;
        this.activeKcal = i2;
        this.activeKcalGoalPercent = i3;
        this.intensityTime = i4;
        this.intensityGoalPercent = i5;
        this.intensityTimeGoal = i6;
        this.activeTime = i7;
        this.activeTimeGoalPercent = i8;
        this.activeTimeGoal = i9;
        this.stepCount = i10;
        this.distance = f;
        this.exerciseCount = i11;
        this.listActiveKcal = listActiveKcal;
        this.listActiveTime = listActiveTime;
        this.listIntensity = listIntensity;
    }

    public final int getActiveKcalGoal() {
        return this.activeKcalGoal;
    }

    public final void setActiveKcalGoal(int i) {
        this.activeKcalGoal = i;
    }

    public final int getActiveKcal() {
        return this.activeKcal;
    }

    public final void setActiveKcal(int i) {
        this.activeKcal = i;
    }

    public final int getActiveKcalGoalPercent() {
        return this.activeKcalGoalPercent;
    }

    public final void setActiveKcalGoalPercent(int i) {
        this.activeKcalGoalPercent = i;
    }

    public final int getIntensityTime() {
        return this.intensityTime;
    }

    public final void setIntensityTime(int i) {
        this.intensityTime = i;
    }

    public final int getIntensityGoalPercent() {
        return this.intensityGoalPercent;
    }

    public final void setIntensityGoalPercent(int i) {
        this.intensityGoalPercent = i;
    }

    public final int getIntensityTimeGoal() {
        return this.intensityTimeGoal;
    }

    public final void setIntensityTimeGoal(int i) {
        this.intensityTimeGoal = i;
    }

    public final int getActiveTime() {
        return this.activeTime;
    }

    public final void setActiveTime(int i) {
        this.activeTime = i;
    }

    public final int getActiveTimeGoalPercent() {
        return this.activeTimeGoalPercent;
    }

    public final void setActiveTimeGoalPercent(int i) {
        this.activeTimeGoalPercent = i;
    }

    public final int getActiveTimeGoal() {
        return this.activeTimeGoal;
    }

    public final void setActiveTimeGoal(int i) {
        this.activeTimeGoal = i;
    }

    public final int getStepCount() {
        return this.stepCount;
    }

    public final void setStepCount(int i) {
        this.stepCount = i;
    }

    public final float getDistance() {
        return this.distance;
    }

    public final void setDistance(float f) {
        this.distance = f;
    }

    public final int getExerciseCount() {
        return this.exerciseCount;
    }

    public final void setExerciseCount(int i) {
        this.exerciseCount = i;
    }

    public /* synthetic */ RainbowInfo(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, float f, int i11, RainbowDetailInfo rainbowDetailInfo, RainbowDetailInfo rainbowDetailInfo2, RainbowDetailInfo rainbowDetailInfo3, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? 0 : i, (i12 & 2) != 0 ? 0 : i2, (i12 & 4) != 0 ? 0 : i3, (i12 & 8) != 0 ? 0 : i4, (i12 & 16) != 0 ? 0 : i5, (i12 & 32) != 0 ? 0 : i6, (i12 & 64) != 0 ? 0 : i7, (i12 & 128) != 0 ? 0 : i8, (i12 & 256) != 0 ? 0 : i9, (i12 & 512) != 0 ? 0 : i10, (i12 & 1024) != 0 ? 0.0f : f, (i12 & 2048) == 0 ? i11 : 0, (i12 & 4096) != 0 ? new RainbowDetailInfo() : rainbowDetailInfo, (i12 & 8192) != 0 ? new RainbowDetailInfo() : rainbowDetailInfo2, (i12 & 16384) != 0 ? new RainbowDetailInfo() : rainbowDetailInfo3);
    }

    public final RainbowDetailInfo getListActiveKcal() {
        return this.listActiveKcal;
    }

    public final void setListActiveKcal(RainbowDetailInfo rainbowDetailInfo) {
        Intrinsics.checkNotNullParameter(rainbowDetailInfo, "<set-?>");
        this.listActiveKcal = rainbowDetailInfo;
    }

    public final RainbowDetailInfo getListActiveTime() {
        return this.listActiveTime;
    }

    public final void setListActiveTime(RainbowDetailInfo rainbowDetailInfo) {
        Intrinsics.checkNotNullParameter(rainbowDetailInfo, "<set-?>");
        this.listActiveTime = rainbowDetailInfo;
    }

    public final RainbowDetailInfo getListIntensity() {
        return this.listIntensity;
    }

    public final void setListIntensity(RainbowDetailInfo rainbowDetailInfo) {
        Intrinsics.checkNotNullParameter(rainbowDetailInfo, "<set-?>");
        this.listIntensity = rainbowDetailInfo;
    }
}
