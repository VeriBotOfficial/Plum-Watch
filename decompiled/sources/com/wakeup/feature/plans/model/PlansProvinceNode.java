package com.wakeup.feature.plans.model;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PlansCityTree.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lcom/wakeup/feature/plans/model/PlansProvinceNode;", "", "name", "", "cities", "", "Lcom/wakeup/feature/plans/model/PlansCityNode;", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "getName", "()Ljava/lang/String;", "getCities", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-plans_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class PlansProvinceNode {
    private final List<PlansCityNode> cities;
    private final String name;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PlansProvinceNode copy$default(PlansProvinceNode plansProvinceNode, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = plansProvinceNode.name;
        }
        if ((i & 2) != 0) {
            list = plansProvinceNode.cities;
        }
        return plansProvinceNode.copy(str, list);
    }

    /* renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    public final List<PlansCityNode> component2() {
        return this.cities;
    }

    public final PlansProvinceNode copy(String name, List<PlansCityNode> cities) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(cities, "cities");
        return new PlansProvinceNode(name, cities);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PlansProvinceNode)) {
            return false;
        }
        PlansProvinceNode plansProvinceNode = (PlansProvinceNode) other;
        return Intrinsics.areEqual(this.name, plansProvinceNode.name) && Intrinsics.areEqual(this.cities, plansProvinceNode.cities);
    }

    public int hashCode() {
        return (this.name.hashCode() * 31) + this.cities.hashCode();
    }

    public String toString() {
        return "PlansProvinceNode(name=" + this.name + ", cities=" + this.cities + Separators.RPAREN;
    }

    public PlansProvinceNode(String name, List<PlansCityNode> cities) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(cities, "cities");
        this.name = name;
        this.cities = cities;
    }

    public final String getName() {
        return this.name;
    }

    public /* synthetic */ PlansProvinceNode(String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? CollectionsKt.emptyList() : list);
    }

    public final List<PlansCityNode> getCities() {
        return this.cities;
    }
}
