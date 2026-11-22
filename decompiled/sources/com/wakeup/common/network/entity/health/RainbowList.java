package com.wakeup.common.network.entity.health;

import android.gov.nist.core.Separators;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: RainbowList.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J;\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001c"}, d2 = {"Lcom/wakeup/common/network/entity/health/RainbowList;", "", "x", "", "stepGoalPercent", "intensityGoalPercent", "activeGoalPercent", "activeKcalPercent", "<init>", "(IIIII)V", "getX", "()I", "getStepGoalPercent", "getIntensityGoalPercent", "getActiveGoalPercent", "getActiveKcalPercent", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class RainbowList {
    private final int activeGoalPercent;
    private final int activeKcalPercent;
    private final int intensityGoalPercent;
    private final int stepGoalPercent;
    private final int x;

    public RainbowList() {
        this(0, 0, 0, 0, 0, 31, null);
    }

    public static /* synthetic */ RainbowList copy$default(RainbowList rainbowList, int i, int i2, int i3, int i4, int i5, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i = rainbowList.x;
        }
        if ((i6 & 2) != 0) {
            i2 = rainbowList.stepGoalPercent;
        }
        if ((i6 & 4) != 0) {
            i3 = rainbowList.intensityGoalPercent;
        }
        if ((i6 & 8) != 0) {
            i4 = rainbowList.activeGoalPercent;
        }
        if ((i6 & 16) != 0) {
            i5 = rainbowList.activeKcalPercent;
        }
        int i7 = i5;
        int i8 = i3;
        return rainbowList.copy(i, i2, i8, i4, i7);
    }

    /* renamed from: component1, reason: from getter */
    public final int getX() {
        return this.x;
    }

    /* renamed from: component2, reason: from getter */
    public final int getStepGoalPercent() {
        return this.stepGoalPercent;
    }

    /* renamed from: component3, reason: from getter */
    public final int getIntensityGoalPercent() {
        return this.intensityGoalPercent;
    }

    /* renamed from: component4, reason: from getter */
    public final int getActiveGoalPercent() {
        return this.activeGoalPercent;
    }

    /* renamed from: component5, reason: from getter */
    public final int getActiveKcalPercent() {
        return this.activeKcalPercent;
    }

    public final RainbowList copy(int x, int stepGoalPercent, int intensityGoalPercent, int activeGoalPercent, int activeKcalPercent) {
        return new RainbowList(x, stepGoalPercent, intensityGoalPercent, activeGoalPercent, activeKcalPercent);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RainbowList)) {
            return false;
        }
        RainbowList rainbowList = (RainbowList) other;
        return this.x == rainbowList.x && this.stepGoalPercent == rainbowList.stepGoalPercent && this.intensityGoalPercent == rainbowList.intensityGoalPercent && this.activeGoalPercent == rainbowList.activeGoalPercent && this.activeKcalPercent == rainbowList.activeKcalPercent;
    }

    public int hashCode() {
        return (((((((Integer.hashCode(this.x) * 31) + Integer.hashCode(this.stepGoalPercent)) * 31) + Integer.hashCode(this.intensityGoalPercent)) * 31) + Integer.hashCode(this.activeGoalPercent)) * 31) + Integer.hashCode(this.activeKcalPercent);
    }

    public String toString() {
        return "RainbowList(x=" + this.x + ", stepGoalPercent=" + this.stepGoalPercent + ", intensityGoalPercent=" + this.intensityGoalPercent + ", activeGoalPercent=" + this.activeGoalPercent + ", activeKcalPercent=" + this.activeKcalPercent + Separators.RPAREN;
    }

    public RainbowList(int i, int i2, int i3, int i4, int i5) {
        this.x = i;
        this.stepGoalPercent = i2;
        this.intensityGoalPercent = i3;
        this.activeGoalPercent = i4;
        this.activeKcalPercent = i5;
    }

    public /* synthetic */ RainbowList(int i, int i2, int i3, int i4, int i5, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this((i6 & 1) != 0 ? 0 : i, (i6 & 2) != 0 ? 0 : i2, (i6 & 4) != 0 ? 0 : i3, (i6 & 8) != 0 ? 0 : i4, (i6 & 16) != 0 ? 0 : i5);
    }

    public final int getX() {
        return this.x;
    }

    public final int getStepGoalPercent() {
        return this.stepGoalPercent;
    }

    public final int getIntensityGoalPercent() {
        return this.intensityGoalPercent;
    }

    public final int getActiveGoalPercent() {
        return this.activeGoalPercent;
    }

    public final int getActiveKcalPercent() {
        return this.activeKcalPercent;
    }
}
