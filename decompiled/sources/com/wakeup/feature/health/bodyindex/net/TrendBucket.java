package com.wakeup.feature.health.bodyindex.net;

import android.gov.nist.core.Separators;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HealthIndexModels.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001Bc\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0013J\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0013J\u0010\u0010\u001f\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0013J\u0010\u0010 \u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0013J\u0010\u0010!\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0013J\u000b\u0010\"\u001a\u0004\u0018\u00010\fHÆ\u0003Jj\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0002\u0010$J\u0013\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010(\u001a\u00020\u0003HÖ\u0001J\t\u0010)\u001a\u00020*HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0015\u0010\u0013R\u0015\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0016\u0010\u0013R\u0015\u0010\t\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0017\u0010\u0013R\u0015\u0010\n\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0018\u0010\u0013R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u0006+"}, d2 = {"Lcom/wakeup/feature/health/bodyindex/net/TrendBucket;", "", "beginDay", "", "endDay", FirebaseAnalytics.Param.SCORE, "", "sleepPerformancePct", "sleepContinuityPct", "minHeartRate", "minSpo2", "components", "Lcom/wakeup/feature/health/bodyindex/net/StrainComponents;", "<init>", "(IILjava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Lcom/wakeup/feature/health/bodyindex/net/StrainComponents;)V", "getBeginDay", "()I", "getEndDay", "getScore", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getSleepPerformancePct", "getSleepContinuityPct", "getMinHeartRate", "getMinSpo2", "getComponents", "()Lcom/wakeup/feature/health/bodyindex/net/StrainComponents;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(IILjava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Lcom/wakeup/feature/health/bodyindex/net/StrainComponents;)Lcom/wakeup/feature/health/bodyindex/net/TrendBucket;", "equals", "", "other", "hashCode", "toString", "", "feature-health_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class TrendBucket {
    public static final int $stable = 0;
    private final int beginDay;
    private final StrainComponents components;
    private final int endDay;
    private final Double minHeartRate;
    private final Double minSpo2;
    private final Double score;
    private final Double sleepContinuityPct;
    private final Double sleepPerformancePct;

    public TrendBucket() {
        this(0, 0, null, null, null, null, null, null, 255, null);
    }

    public static /* synthetic */ TrendBucket copy$default(TrendBucket trendBucket, int i, int i2, Double d, Double d2, Double d3, Double d4, Double d5, StrainComponents strainComponents, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = trendBucket.beginDay;
        }
        if ((i3 & 2) != 0) {
            i2 = trendBucket.endDay;
        }
        if ((i3 & 4) != 0) {
            d = trendBucket.score;
        }
        if ((i3 & 8) != 0) {
            d2 = trendBucket.sleepPerformancePct;
        }
        if ((i3 & 16) != 0) {
            d3 = trendBucket.sleepContinuityPct;
        }
        if ((i3 & 32) != 0) {
            d4 = trendBucket.minHeartRate;
        }
        if ((i3 & 64) != 0) {
            d5 = trendBucket.minSpo2;
        }
        if ((i3 & 128) != 0) {
            strainComponents = trendBucket.components;
        }
        Double d6 = d5;
        StrainComponents strainComponents2 = strainComponents;
        Double d7 = d3;
        Double d8 = d4;
        return trendBucket.copy(i, i2, d, d2, d7, d8, d6, strainComponents2);
    }

    /* renamed from: component1, reason: from getter */
    public final int getBeginDay() {
        return this.beginDay;
    }

    /* renamed from: component2, reason: from getter */
    public final int getEndDay() {
        return this.endDay;
    }

    /* renamed from: component3, reason: from getter */
    public final Double getScore() {
        return this.score;
    }

    /* renamed from: component4, reason: from getter */
    public final Double getSleepPerformancePct() {
        return this.sleepPerformancePct;
    }

    /* renamed from: component5, reason: from getter */
    public final Double getSleepContinuityPct() {
        return this.sleepContinuityPct;
    }

    /* renamed from: component6, reason: from getter */
    public final Double getMinHeartRate() {
        return this.minHeartRate;
    }

    /* renamed from: component7, reason: from getter */
    public final Double getMinSpo2() {
        return this.minSpo2;
    }

    /* renamed from: component8, reason: from getter */
    public final StrainComponents getComponents() {
        return this.components;
    }

    public final TrendBucket copy(int beginDay, int endDay, Double score, Double sleepPerformancePct, Double sleepContinuityPct, Double minHeartRate, Double minSpo2, StrainComponents components) {
        return new TrendBucket(beginDay, endDay, score, sleepPerformancePct, sleepContinuityPct, minHeartRate, minSpo2, components);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TrendBucket)) {
            return false;
        }
        TrendBucket trendBucket = (TrendBucket) other;
        return this.beginDay == trendBucket.beginDay && this.endDay == trendBucket.endDay && Intrinsics.areEqual((Object) this.score, (Object) trendBucket.score) && Intrinsics.areEqual((Object) this.sleepPerformancePct, (Object) trendBucket.sleepPerformancePct) && Intrinsics.areEqual((Object) this.sleepContinuityPct, (Object) trendBucket.sleepContinuityPct) && Intrinsics.areEqual((Object) this.minHeartRate, (Object) trendBucket.minHeartRate) && Intrinsics.areEqual((Object) this.minSpo2, (Object) trendBucket.minSpo2) && Intrinsics.areEqual(this.components, trendBucket.components);
    }

    public int hashCode() {
        int hashCode = ((Integer.hashCode(this.beginDay) * 31) + Integer.hashCode(this.endDay)) * 31;
        Double d = this.score;
        int hashCode2 = (hashCode + (d == null ? 0 : d.hashCode())) * 31;
        Double d2 = this.sleepPerformancePct;
        int hashCode3 = (hashCode2 + (d2 == null ? 0 : d2.hashCode())) * 31;
        Double d3 = this.sleepContinuityPct;
        int hashCode4 = (hashCode3 + (d3 == null ? 0 : d3.hashCode())) * 31;
        Double d4 = this.minHeartRate;
        int hashCode5 = (hashCode4 + (d4 == null ? 0 : d4.hashCode())) * 31;
        Double d5 = this.minSpo2;
        int hashCode6 = (hashCode5 + (d5 == null ? 0 : d5.hashCode())) * 31;
        StrainComponents strainComponents = this.components;
        return hashCode6 + (strainComponents != null ? strainComponents.hashCode() : 0);
    }

    public String toString() {
        return "TrendBucket(beginDay=" + this.beginDay + ", endDay=" + this.endDay + ", score=" + this.score + ", sleepPerformancePct=" + this.sleepPerformancePct + ", sleepContinuityPct=" + this.sleepContinuityPct + ", minHeartRate=" + this.minHeartRate + ", minSpo2=" + this.minSpo2 + ", components=" + this.components + Separators.RPAREN;
    }

    public TrendBucket(int i, int i2, Double d, Double d2, Double d3, Double d4, Double d5, StrainComponents strainComponents) {
        this.beginDay = i;
        this.endDay = i2;
        this.score = d;
        this.sleepPerformancePct = d2;
        this.sleepContinuityPct = d3;
        this.minHeartRate = d4;
        this.minSpo2 = d5;
        this.components = strainComponents;
    }

    public /* synthetic */ TrendBucket(int i, int i2, Double d, Double d2, Double d3, Double d4, Double d5, StrainComponents strainComponents, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2, (i3 & 4) != 0 ? null : d, (i3 & 8) != 0 ? null : d2, (i3 & 16) != 0 ? null : d3, (i3 & 32) != 0 ? null : d4, (i3 & 64) != 0 ? null : d5, (i3 & 128) != 0 ? null : strainComponents);
    }

    public final int getBeginDay() {
        return this.beginDay;
    }

    public final int getEndDay() {
        return this.endDay;
    }

    public final Double getScore() {
        return this.score;
    }

    public final Double getSleepPerformancePct() {
        return this.sleepPerformancePct;
    }

    public final Double getSleepContinuityPct() {
        return this.sleepContinuityPct;
    }

    public final Double getMinHeartRate() {
        return this.minHeartRate;
    }

    public final Double getMinSpo2() {
        return this.minSpo2;
    }

    public final StrainComponents getComponents() {
        return this.components;
    }
}
