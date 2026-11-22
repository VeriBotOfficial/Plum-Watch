package com.wakeup.feature.plans.model;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PlansCityTree.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006HÆ\u0003J-\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, d2 = {"Lcom/wakeup/feature/plans/model/PlansCityNode;", "", "name", "", "submitName", "districts", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getName", "()Ljava/lang/String;", "getSubmitName", "getDistricts", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-plans_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class PlansCityNode {
    private final List<String> districts;
    private final String name;
    private final String submitName;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PlansCityNode copy$default(PlansCityNode plansCityNode, String str, String str2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = plansCityNode.name;
        }
        if ((i & 2) != 0) {
            str2 = plansCityNode.submitName;
        }
        if ((i & 4) != 0) {
            list = plansCityNode.districts;
        }
        return plansCityNode.copy(str, str2, list);
    }

    /* renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component2, reason: from getter */
    public final String getSubmitName() {
        return this.submitName;
    }

    public final List<String> component3() {
        return this.districts;
    }

    public final PlansCityNode copy(String name, String submitName, List<String> districts) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(submitName, "submitName");
        Intrinsics.checkNotNullParameter(districts, "districts");
        return new PlansCityNode(name, submitName, districts);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PlansCityNode)) {
            return false;
        }
        PlansCityNode plansCityNode = (PlansCityNode) other;
        return Intrinsics.areEqual(this.name, plansCityNode.name) && Intrinsics.areEqual(this.submitName, plansCityNode.submitName) && Intrinsics.areEqual(this.districts, plansCityNode.districts);
    }

    public int hashCode() {
        return (((this.name.hashCode() * 31) + this.submitName.hashCode()) * 31) + this.districts.hashCode();
    }

    public String toString() {
        return "PlansCityNode(name=" + this.name + ", submitName=" + this.submitName + ", districts=" + this.districts + Separators.RPAREN;
    }

    public PlansCityNode(String name, String submitName, List<String> districts) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(submitName, "submitName");
        Intrinsics.checkNotNullParameter(districts, "districts");
        this.name = name;
        this.submitName = submitName;
        this.districts = districts;
    }

    public final String getName() {
        return this.name;
    }

    public final String getSubmitName() {
        return this.submitName;
    }

    public /* synthetic */ PlansCityNode(String str, String str2, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? CollectionsKt.emptyList() : list);
    }

    public final List<String> getDistricts() {
        return this.districts;
    }
}
