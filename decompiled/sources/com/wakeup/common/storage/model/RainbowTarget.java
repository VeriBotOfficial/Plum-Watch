package com.wakeup.common.storage.model;

import android.gov.nist.core.Separators;
import com.wakeup.common.Constants;
import com.wakeup.common.rn.RnConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: RainbowTarget.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J;\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001J\t\u0010 \u001a\u00020!HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000b\"\u0004\b\u000f\u0010\rR\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u000b\"\u0004\b\u0011\u0010\rR\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000b\"\u0004\b\u0013\u0010\rR\u001a\u0010\u0007\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u000b\"\u0004\b\u0015\u0010\r¨\u0006\""}, d2 = {"Lcom/wakeup/common/storage/model/RainbowTarget;", "", "step", "", "strength", "active", Constants.BundleKey.KCAL, RnConstants.KEY_SPORT_COUNT, "<init>", "(IIIII)V", "getStep", "()I", "setStep", "(I)V", "getStrength", "setStrength", "getActive", "setActive", "getKcal", "setKcal", "getSportCount", "setSportCount", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class RainbowTarget {
    private int active;
    private int kcal;
    private int sportCount;
    private int step;
    private int strength;

    public RainbowTarget() {
        this(0, 0, 0, 0, 0, 31, null);
    }

    public static /* synthetic */ RainbowTarget copy$default(RainbowTarget rainbowTarget, int i, int i2, int i3, int i4, int i5, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i = rainbowTarget.step;
        }
        if ((i6 & 2) != 0) {
            i2 = rainbowTarget.strength;
        }
        if ((i6 & 4) != 0) {
            i3 = rainbowTarget.active;
        }
        if ((i6 & 8) != 0) {
            i4 = rainbowTarget.kcal;
        }
        if ((i6 & 16) != 0) {
            i5 = rainbowTarget.sportCount;
        }
        int i7 = i5;
        int i8 = i3;
        return rainbowTarget.copy(i, i2, i8, i4, i7);
    }

    /* renamed from: component1, reason: from getter */
    public final int getStep() {
        return this.step;
    }

    /* renamed from: component2, reason: from getter */
    public final int getStrength() {
        return this.strength;
    }

    /* renamed from: component3, reason: from getter */
    public final int getActive() {
        return this.active;
    }

    /* renamed from: component4, reason: from getter */
    public final int getKcal() {
        return this.kcal;
    }

    /* renamed from: component5, reason: from getter */
    public final int getSportCount() {
        return this.sportCount;
    }

    public final RainbowTarget copy(int step, int strength, int active, int kcal, int sportCount) {
        return new RainbowTarget(step, strength, active, kcal, sportCount);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RainbowTarget)) {
            return false;
        }
        RainbowTarget rainbowTarget = (RainbowTarget) other;
        return this.step == rainbowTarget.step && this.strength == rainbowTarget.strength && this.active == rainbowTarget.active && this.kcal == rainbowTarget.kcal && this.sportCount == rainbowTarget.sportCount;
    }

    public int hashCode() {
        return (((((((Integer.hashCode(this.step) * 31) + Integer.hashCode(this.strength)) * 31) + Integer.hashCode(this.active)) * 31) + Integer.hashCode(this.kcal)) * 31) + Integer.hashCode(this.sportCount);
    }

    public String toString() {
        return "RainbowTarget(step=" + this.step + ", strength=" + this.strength + ", active=" + this.active + ", kcal=" + this.kcal + ", sportCount=" + this.sportCount + Separators.RPAREN;
    }

    public RainbowTarget(int i, int i2, int i3, int i4, int i5) {
        this.step = i;
        this.strength = i2;
        this.active = i3;
        this.kcal = i4;
        this.sportCount = i5;
    }

    public /* synthetic */ RainbowTarget(int i, int i2, int i3, int i4, int i5, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this((i6 & 1) != 0 ? 6000 : i, (i6 & 2) != 0 ? 30 : i2, (i6 & 4) != 0 ? 12 : i3, (i6 & 8) != 0 ? 500 : i4, (i6 & 16) != 0 ? 3 : i5);
    }

    public final int getStep() {
        return this.step;
    }

    public final void setStep(int i) {
        this.step = i;
    }

    public final int getStrength() {
        return this.strength;
    }

    public final void setStrength(int i) {
        this.strength = i;
    }

    public final int getActive() {
        return this.active;
    }

    public final void setActive(int i) {
        this.active = i;
    }

    public final int getKcal() {
        return this.kcal;
    }

    public final void setKcal(int i) {
        this.kcal = i;
    }

    public final int getSportCount() {
        return this.sportCount;
    }

    public final void setSportCount(int i) {
        this.sportCount = i;
    }
}
