package com.wakeup.feature.plans.model;

import android.gov.nist.core.Separators;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PlansCityMatch.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/wakeup/feature/plans/model/PlansCityMatch;", "", "region", "Lcom/wakeup/feature/plans/model/PlansRegionPickerItem;", "cityIndex", "", "<init>", "(Lcom/wakeup/feature/plans/model/PlansRegionPickerItem;I)V", "getRegion", "()Lcom/wakeup/feature/plans/model/PlansRegionPickerItem;", "getCityIndex", "()I", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "feature-plans_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class PlansCityMatch {
    private final int cityIndex;
    private final PlansRegionPickerItem region;

    public static /* synthetic */ PlansCityMatch copy$default(PlansCityMatch plansCityMatch, PlansRegionPickerItem plansRegionPickerItem, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            plansRegionPickerItem = plansCityMatch.region;
        }
        if ((i2 & 2) != 0) {
            i = plansCityMatch.cityIndex;
        }
        return plansCityMatch.copy(plansRegionPickerItem, i);
    }

    /* renamed from: component1, reason: from getter */
    public final PlansRegionPickerItem getRegion() {
        return this.region;
    }

    /* renamed from: component2, reason: from getter */
    public final int getCityIndex() {
        return this.cityIndex;
    }

    public final PlansCityMatch copy(PlansRegionPickerItem region, int cityIndex) {
        Intrinsics.checkNotNullParameter(region, "region");
        return new PlansCityMatch(region, cityIndex);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PlansCityMatch)) {
            return false;
        }
        PlansCityMatch plansCityMatch = (PlansCityMatch) other;
        return Intrinsics.areEqual(this.region, plansCityMatch.region) && this.cityIndex == plansCityMatch.cityIndex;
    }

    public int hashCode() {
        return (this.region.hashCode() * 31) + Integer.hashCode(this.cityIndex);
    }

    public String toString() {
        return "PlansCityMatch(region=" + this.region + ", cityIndex=" + this.cityIndex + Separators.RPAREN;
    }

    public PlansCityMatch(PlansRegionPickerItem region, int i) {
        Intrinsics.checkNotNullParameter(region, "region");
        this.region = region;
        this.cityIndex = i;
    }

    public final PlansRegionPickerItem getRegion() {
        return this.region;
    }

    public final int getCityIndex() {
        return this.cityIndex;
    }
}
