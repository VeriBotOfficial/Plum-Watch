package com.wakeup.feature.plans.model;

import android.gov.nist.core.Separators;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PlansCityTree.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/wakeup/feature/plans/model/PlansOverseasCityNode;", "", "name", "", "submitName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "getSubmitName", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-plans_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class PlansOverseasCityNode {
    private final String name;
    private final String submitName;

    public static /* synthetic */ PlansOverseasCityNode copy$default(PlansOverseasCityNode plansOverseasCityNode, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = plansOverseasCityNode.name;
        }
        if ((i & 2) != 0) {
            str2 = plansOverseasCityNode.submitName;
        }
        return plansOverseasCityNode.copy(str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component2, reason: from getter */
    public final String getSubmitName() {
        return this.submitName;
    }

    public final PlansOverseasCityNode copy(String name, String submitName) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(submitName, "submitName");
        return new PlansOverseasCityNode(name, submitName);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PlansOverseasCityNode)) {
            return false;
        }
        PlansOverseasCityNode plansOverseasCityNode = (PlansOverseasCityNode) other;
        return Intrinsics.areEqual(this.name, plansOverseasCityNode.name) && Intrinsics.areEqual(this.submitName, plansOverseasCityNode.submitName);
    }

    public int hashCode() {
        return (this.name.hashCode() * 31) + this.submitName.hashCode();
    }

    public String toString() {
        return "PlansOverseasCityNode(name=" + this.name + ", submitName=" + this.submitName + Separators.RPAREN;
    }

    public PlansOverseasCityNode(String name, String submitName) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(submitName, "submitName");
        this.name = name;
        this.submitName = submitName;
    }

    public final String getName() {
        return this.name;
    }

    public final String getSubmitName() {
        return this.submitName;
    }
}
