package com.wakeup.feature.plans.model;

import android.gov.nist.core.Separators;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PlansCityTree.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\f¨\u0006\u0016"}, d2 = {"Lcom/wakeup/feature/plans/model/PlansCitySelection;", "", "submitName", "", "displayLabel", "isOverseas", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Z)V", "getSubmitName", "()Ljava/lang/String;", "getDisplayLabel", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "feature-plans_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class PlansCitySelection {
    private final String displayLabel;
    private final boolean isOverseas;
    private final String submitName;

    public static /* synthetic */ PlansCitySelection copy$default(PlansCitySelection plansCitySelection, String str, String str2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = plansCitySelection.submitName;
        }
        if ((i & 2) != 0) {
            str2 = plansCitySelection.displayLabel;
        }
        if ((i & 4) != 0) {
            z = plansCitySelection.isOverseas;
        }
        return plansCitySelection.copy(str, str2, z);
    }

    /* renamed from: component1, reason: from getter */
    public final String getSubmitName() {
        return this.submitName;
    }

    /* renamed from: component2, reason: from getter */
    public final String getDisplayLabel() {
        return this.displayLabel;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsOverseas() {
        return this.isOverseas;
    }

    public final PlansCitySelection copy(String submitName, String displayLabel, boolean isOverseas) {
        Intrinsics.checkNotNullParameter(submitName, "submitName");
        Intrinsics.checkNotNullParameter(displayLabel, "displayLabel");
        return new PlansCitySelection(submitName, displayLabel, isOverseas);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PlansCitySelection)) {
            return false;
        }
        PlansCitySelection plansCitySelection = (PlansCitySelection) other;
        return Intrinsics.areEqual(this.submitName, plansCitySelection.submitName) && Intrinsics.areEqual(this.displayLabel, plansCitySelection.displayLabel) && this.isOverseas == plansCitySelection.isOverseas;
    }

    public int hashCode() {
        return (((this.submitName.hashCode() * 31) + this.displayLabel.hashCode()) * 31) + Boolean.hashCode(this.isOverseas);
    }

    public String toString() {
        return "PlansCitySelection(submitName=" + this.submitName + ", displayLabel=" + this.displayLabel + ", isOverseas=" + this.isOverseas + Separators.RPAREN;
    }

    public PlansCitySelection(String submitName, String displayLabel, boolean z) {
        Intrinsics.checkNotNullParameter(submitName, "submitName");
        Intrinsics.checkNotNullParameter(displayLabel, "displayLabel");
        this.submitName = submitName;
        this.displayLabel = displayLabel;
        this.isOverseas = z;
    }

    public final String getSubmitName() {
        return this.submitName;
    }

    public final String getDisplayLabel() {
        return this.displayLabel;
    }

    public final boolean isOverseas() {
        return this.isOverseas;
    }
}
