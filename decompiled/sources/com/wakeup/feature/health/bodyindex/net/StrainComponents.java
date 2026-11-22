package com.wakeup.feature.health.bodyindex.net;

import android.gov.nist.core.Separators;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HealthIndexModels.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ>\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0014J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\f\u0010\nR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\r\u0010\nR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\u000e\u0010\n¨\u0006\u001c"}, d2 = {"Lcom/wakeup/feature/health/bodyindex/net/StrainComponents;", "", "sHr", "", "sMvpa", "sCal", "sSteps", "<init>", "(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;)V", "getSHr", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getSMvpa", "getSCal", "getSSteps", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;)Lcom/wakeup/feature/health/bodyindex/net/StrainComponents;", "equals", "", "other", "hashCode", "", "toString", "", "feature-health_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class StrainComponents {
    public static final int $stable = 0;
    private final Double sCal;
    private final Double sHr;
    private final Double sMvpa;
    private final Double sSteps;

    public StrainComponents() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ StrainComponents copy$default(StrainComponents strainComponents, Double d, Double d2, Double d3, Double d4, int i, Object obj) {
        if ((i & 1) != 0) {
            d = strainComponents.sHr;
        }
        if ((i & 2) != 0) {
            d2 = strainComponents.sMvpa;
        }
        if ((i & 4) != 0) {
            d3 = strainComponents.sCal;
        }
        if ((i & 8) != 0) {
            d4 = strainComponents.sSteps;
        }
        return strainComponents.copy(d, d2, d3, d4);
    }

    /* renamed from: component1, reason: from getter */
    public final Double getSHr() {
        return this.sHr;
    }

    /* renamed from: component2, reason: from getter */
    public final Double getSMvpa() {
        return this.sMvpa;
    }

    /* renamed from: component3, reason: from getter */
    public final Double getSCal() {
        return this.sCal;
    }

    /* renamed from: component4, reason: from getter */
    public final Double getSSteps() {
        return this.sSteps;
    }

    public final StrainComponents copy(Double sHr, Double sMvpa, Double sCal, Double sSteps) {
        return new StrainComponents(sHr, sMvpa, sCal, sSteps);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StrainComponents)) {
            return false;
        }
        StrainComponents strainComponents = (StrainComponents) other;
        return Intrinsics.areEqual((Object) this.sHr, (Object) strainComponents.sHr) && Intrinsics.areEqual((Object) this.sMvpa, (Object) strainComponents.sMvpa) && Intrinsics.areEqual((Object) this.sCal, (Object) strainComponents.sCal) && Intrinsics.areEqual((Object) this.sSteps, (Object) strainComponents.sSteps);
    }

    public int hashCode() {
        Double d = this.sHr;
        int hashCode = (d == null ? 0 : d.hashCode()) * 31;
        Double d2 = this.sMvpa;
        int hashCode2 = (hashCode + (d2 == null ? 0 : d2.hashCode())) * 31;
        Double d3 = this.sCal;
        int hashCode3 = (hashCode2 + (d3 == null ? 0 : d3.hashCode())) * 31;
        Double d4 = this.sSteps;
        return hashCode3 + (d4 != null ? d4.hashCode() : 0);
    }

    public String toString() {
        return "StrainComponents(sHr=" + this.sHr + ", sMvpa=" + this.sMvpa + ", sCal=" + this.sCal + ", sSteps=" + this.sSteps + Separators.RPAREN;
    }

    public StrainComponents(Double d, Double d2, Double d3, Double d4) {
        this.sHr = d;
        this.sMvpa = d2;
        this.sCal = d3;
        this.sSteps = d4;
    }

    public /* synthetic */ StrainComponents(Double d, Double d2, Double d3, Double d4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : d, (i & 2) != 0 ? null : d2, (i & 4) != 0 ? null : d3, (i & 8) != 0 ? null : d4);
    }

    public final Double getSHr() {
        return this.sHr;
    }

    public final Double getSMvpa() {
        return this.sMvpa;
    }

    public final Double getSCal() {
        return this.sCal;
    }

    public final Double getSSteps() {
        return this.sSteps;
    }
}
