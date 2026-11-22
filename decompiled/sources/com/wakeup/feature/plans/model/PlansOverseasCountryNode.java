package com.wakeup.feature.plans.model;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PlansCityTree.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J-\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, d2 = {"Lcom/wakeup/feature/plans/model/PlansOverseasCountryNode;", "", "country", "", "sortKey", "cities", "", "Lcom/wakeup/feature/plans/model/PlansOverseasCityNode;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getCountry", "()Ljava/lang/String;", "getSortKey", "getCities", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-plans_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class PlansOverseasCountryNode {
    private final List<PlansOverseasCityNode> cities;
    private final String country;
    private final String sortKey;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PlansOverseasCountryNode copy$default(PlansOverseasCountryNode plansOverseasCountryNode, String str, String str2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = plansOverseasCountryNode.country;
        }
        if ((i & 2) != 0) {
            str2 = plansOverseasCountryNode.sortKey;
        }
        if ((i & 4) != 0) {
            list = plansOverseasCountryNode.cities;
        }
        return plansOverseasCountryNode.copy(str, str2, list);
    }

    /* renamed from: component1, reason: from getter */
    public final String getCountry() {
        return this.country;
    }

    /* renamed from: component2, reason: from getter */
    public final String getSortKey() {
        return this.sortKey;
    }

    public final List<PlansOverseasCityNode> component3() {
        return this.cities;
    }

    public final PlansOverseasCountryNode copy(String country, String sortKey, List<PlansOverseasCityNode> cities) {
        Intrinsics.checkNotNullParameter(country, "country");
        Intrinsics.checkNotNullParameter(sortKey, "sortKey");
        Intrinsics.checkNotNullParameter(cities, "cities");
        return new PlansOverseasCountryNode(country, sortKey, cities);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PlansOverseasCountryNode)) {
            return false;
        }
        PlansOverseasCountryNode plansOverseasCountryNode = (PlansOverseasCountryNode) other;
        return Intrinsics.areEqual(this.country, plansOverseasCountryNode.country) && Intrinsics.areEqual(this.sortKey, plansOverseasCountryNode.sortKey) && Intrinsics.areEqual(this.cities, plansOverseasCountryNode.cities);
    }

    public int hashCode() {
        return (((this.country.hashCode() * 31) + this.sortKey.hashCode()) * 31) + this.cities.hashCode();
    }

    public String toString() {
        return "PlansOverseasCountryNode(country=" + this.country + ", sortKey=" + this.sortKey + ", cities=" + this.cities + Separators.RPAREN;
    }

    public PlansOverseasCountryNode(String country, String sortKey, List<PlansOverseasCityNode> cities) {
        Intrinsics.checkNotNullParameter(country, "country");
        Intrinsics.checkNotNullParameter(sortKey, "sortKey");
        Intrinsics.checkNotNullParameter(cities, "cities");
        this.country = country;
        this.sortKey = sortKey;
        this.cities = cities;
    }

    public final String getCountry() {
        return this.country;
    }

    public /* synthetic */ PlansOverseasCountryNode(String str, String str2, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? CollectionsKt.emptyList() : list);
    }

    public final String getSortKey() {
        return this.sortKey;
    }

    public final List<PlansOverseasCityNode> getCities() {
        return this.cities;
    }
}
