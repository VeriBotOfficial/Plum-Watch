package com.wakeup.feature.plans.model;

import android.gov.nist.core.Separators;
import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridge;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PlansCityTree.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u0005HÆ\u0003J3\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000e¨\u0006\u001a"}, d2 = {"Lcom/wakeup/feature/plans/model/PlansCityTree;", "", "version", "", "domestic", "", "Lcom/wakeup/feature/plans/model/PlansProvinceNode;", "overseas", "Lcom/wakeup/feature/plans/model/PlansOverseasCountryNode;", "<init>", "(ILjava/util/List;Ljava/util/List;)V", MobileAdsBridge.versionMethodName, "()I", "getDomestic", "()Ljava/util/List;", "getOverseas", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "feature-plans_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class PlansCityTree {
    private final List<PlansProvinceNode> domestic;
    private final List<PlansOverseasCountryNode> overseas;
    private final int version;

    public PlansCityTree() {
        this(0, null, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PlansCityTree copy$default(PlansCityTree plansCityTree, int i, List list, List list2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = plansCityTree.version;
        }
        if ((i2 & 2) != 0) {
            list = plansCityTree.domestic;
        }
        if ((i2 & 4) != 0) {
            list2 = plansCityTree.overseas;
        }
        return plansCityTree.copy(i, list, list2);
    }

    /* renamed from: component1, reason: from getter */
    public final int getVersion() {
        return this.version;
    }

    public final List<PlansProvinceNode> component2() {
        return this.domestic;
    }

    public final List<PlansOverseasCountryNode> component3() {
        return this.overseas;
    }

    public final PlansCityTree copy(int version, List<PlansProvinceNode> domestic, List<PlansOverseasCountryNode> overseas) {
        Intrinsics.checkNotNullParameter(domestic, "domestic");
        Intrinsics.checkNotNullParameter(overseas, "overseas");
        return new PlansCityTree(version, domestic, overseas);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PlansCityTree)) {
            return false;
        }
        PlansCityTree plansCityTree = (PlansCityTree) other;
        return this.version == plansCityTree.version && Intrinsics.areEqual(this.domestic, plansCityTree.domestic) && Intrinsics.areEqual(this.overseas, plansCityTree.overseas);
    }

    public int hashCode() {
        return (((Integer.hashCode(this.version) * 31) + this.domestic.hashCode()) * 31) + this.overseas.hashCode();
    }

    public String toString() {
        return "PlansCityTree(version=" + this.version + ", domestic=" + this.domestic + ", overseas=" + this.overseas + Separators.RPAREN;
    }

    public PlansCityTree(int i, List<PlansProvinceNode> domestic, List<PlansOverseasCountryNode> overseas) {
        Intrinsics.checkNotNullParameter(domestic, "domestic");
        Intrinsics.checkNotNullParameter(overseas, "overseas");
        this.version = i;
        this.domestic = domestic;
        this.overseas = overseas;
    }

    public final int getVersion() {
        return this.version;
    }

    public /* synthetic */ PlansCityTree(int i, List list, List list2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 2 : i, (i2 & 2) != 0 ? CollectionsKt.emptyList() : list, (i2 & 4) != 0 ? CollectionsKt.emptyList() : list2);
    }

    public final List<PlansProvinceNode> getDomestic() {
        return this.domestic;
    }

    public final List<PlansOverseasCountryNode> getOverseas() {
        return this.overseas;
    }
}
