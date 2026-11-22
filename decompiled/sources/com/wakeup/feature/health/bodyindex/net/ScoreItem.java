package com.wakeup.feature.health.bodyindex.net;

import android.gov.nist.core.Separators;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HealthIndexModels.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B}\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010#\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0017J\u0010\u0010$\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0017J\u0010\u0010%\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0017J\u0010\u0010&\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0017J\u0010\u0010'\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0017J\u0010\u0010(\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0017J\u0010\u0010)\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0017J\u000b\u0010*\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u0084\u0001\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÆ\u0001¢\u0006\u0002\u0010,J\u0013\u0010-\u001a\u00020.2\b\u0010/\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00100\u001a\u00020\u0003HÖ\u0001J\t\u00101\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u0016\u0010\u0017R\u0015\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u0019\u0010\u0017R\u0015\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u001a\u0010\u0017R\u0015\u0010\n\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u001b\u0010\u0017R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u001c\u0010\u0017R\u0015\u0010\f\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u001d\u0010\u0017R\u0015\u0010\r\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u001e\u0010\u0017R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 ¨\u00062"}, d2 = {"Lcom/wakeup/feature/health/bodyindex/net/ScoreItem;", "", "dayNo", "", "indexType", "", FirebaseAnalytics.Param.SCORE, "", "sleepPerformancePct", "sleepContinuityPct", "minHeartRate", "minSpo2", "sleepBaselineMin", "sleepDurationMin", "components", "Lcom/wakeup/feature/health/bodyindex/net/StrainComponents;", "<init>", "(ILjava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Lcom/wakeup/feature/health/bodyindex/net/StrainComponents;)V", "getDayNo", "()I", "getIndexType", "()Ljava/lang/String;", "getScore", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getSleepPerformancePct", "getSleepContinuityPct", "getMinHeartRate", "getMinSpo2", "getSleepBaselineMin", "getSleepDurationMin", "getComponents", "()Lcom/wakeup/feature/health/bodyindex/net/StrainComponents;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "(ILjava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Lcom/wakeup/feature/health/bodyindex/net/StrainComponents;)Lcom/wakeup/feature/health/bodyindex/net/ScoreItem;", "equals", "", "other", "hashCode", "toString", "feature-health_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ScoreItem {
    public static final int $stable = 0;
    private final StrainComponents components;
    private final int dayNo;
    private final String indexType;
    private final Double minHeartRate;
    private final Double minSpo2;
    private final Double score;
    private final Double sleepBaselineMin;
    private final Double sleepContinuityPct;
    private final Double sleepDurationMin;
    private final Double sleepPerformancePct;

    public ScoreItem() {
        this(0, null, null, null, null, null, null, null, null, null, 1023, null);
    }

    public static /* synthetic */ ScoreItem copy$default(ScoreItem scoreItem, int i, String str, Double d, Double d2, Double d3, Double d4, Double d5, Double d6, Double d7, StrainComponents strainComponents, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = scoreItem.dayNo;
        }
        if ((i2 & 2) != 0) {
            str = scoreItem.indexType;
        }
        if ((i2 & 4) != 0) {
            d = scoreItem.score;
        }
        if ((i2 & 8) != 0) {
            d2 = scoreItem.sleepPerformancePct;
        }
        if ((i2 & 16) != 0) {
            d3 = scoreItem.sleepContinuityPct;
        }
        if ((i2 & 32) != 0) {
            d4 = scoreItem.minHeartRate;
        }
        if ((i2 & 64) != 0) {
            d5 = scoreItem.minSpo2;
        }
        if ((i2 & 128) != 0) {
            d6 = scoreItem.sleepBaselineMin;
        }
        if ((i2 & 256) != 0) {
            d7 = scoreItem.sleepDurationMin;
        }
        if ((i2 & 512) != 0) {
            strainComponents = scoreItem.components;
        }
        Double d8 = d7;
        StrainComponents strainComponents2 = strainComponents;
        Double d9 = d5;
        Double d10 = d6;
        Double d11 = d3;
        Double d12 = d4;
        return scoreItem.copy(i, str, d, d2, d11, d12, d9, d10, d8, strainComponents2);
    }

    /* renamed from: component1, reason: from getter */
    public final int getDayNo() {
        return this.dayNo;
    }

    /* renamed from: component10, reason: from getter */
    public final StrainComponents getComponents() {
        return this.components;
    }

    /* renamed from: component2, reason: from getter */
    public final String getIndexType() {
        return this.indexType;
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
    public final Double getSleepBaselineMin() {
        return this.sleepBaselineMin;
    }

    /* renamed from: component9, reason: from getter */
    public final Double getSleepDurationMin() {
        return this.sleepDurationMin;
    }

    public final ScoreItem copy(int dayNo, String indexType, Double score, Double sleepPerformancePct, Double sleepContinuityPct, Double minHeartRate, Double minSpo2, Double sleepBaselineMin, Double sleepDurationMin, StrainComponents components) {
        return new ScoreItem(dayNo, indexType, score, sleepPerformancePct, sleepContinuityPct, minHeartRate, minSpo2, sleepBaselineMin, sleepDurationMin, components);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ScoreItem)) {
            return false;
        }
        ScoreItem scoreItem = (ScoreItem) other;
        return this.dayNo == scoreItem.dayNo && Intrinsics.areEqual(this.indexType, scoreItem.indexType) && Intrinsics.areEqual((Object) this.score, (Object) scoreItem.score) && Intrinsics.areEqual((Object) this.sleepPerformancePct, (Object) scoreItem.sleepPerformancePct) && Intrinsics.areEqual((Object) this.sleepContinuityPct, (Object) scoreItem.sleepContinuityPct) && Intrinsics.areEqual((Object) this.minHeartRate, (Object) scoreItem.minHeartRate) && Intrinsics.areEqual((Object) this.minSpo2, (Object) scoreItem.minSpo2) && Intrinsics.areEqual((Object) this.sleepBaselineMin, (Object) scoreItem.sleepBaselineMin) && Intrinsics.areEqual((Object) this.sleepDurationMin, (Object) scoreItem.sleepDurationMin) && Intrinsics.areEqual(this.components, scoreItem.components);
    }

    public int hashCode() {
        int hashCode = Integer.hashCode(this.dayNo) * 31;
        String str = this.indexType;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Double d = this.score;
        int hashCode3 = (hashCode2 + (d == null ? 0 : d.hashCode())) * 31;
        Double d2 = this.sleepPerformancePct;
        int hashCode4 = (hashCode3 + (d2 == null ? 0 : d2.hashCode())) * 31;
        Double d3 = this.sleepContinuityPct;
        int hashCode5 = (hashCode4 + (d3 == null ? 0 : d3.hashCode())) * 31;
        Double d4 = this.minHeartRate;
        int hashCode6 = (hashCode5 + (d4 == null ? 0 : d4.hashCode())) * 31;
        Double d5 = this.minSpo2;
        int hashCode7 = (hashCode6 + (d5 == null ? 0 : d5.hashCode())) * 31;
        Double d6 = this.sleepBaselineMin;
        int hashCode8 = (hashCode7 + (d6 == null ? 0 : d6.hashCode())) * 31;
        Double d7 = this.sleepDurationMin;
        int hashCode9 = (hashCode8 + (d7 == null ? 0 : d7.hashCode())) * 31;
        StrainComponents strainComponents = this.components;
        return hashCode9 + (strainComponents != null ? strainComponents.hashCode() : 0);
    }

    public String toString() {
        return "ScoreItem(dayNo=" + this.dayNo + ", indexType=" + this.indexType + ", score=" + this.score + ", sleepPerformancePct=" + this.sleepPerformancePct + ", sleepContinuityPct=" + this.sleepContinuityPct + ", minHeartRate=" + this.minHeartRate + ", minSpo2=" + this.minSpo2 + ", sleepBaselineMin=" + this.sleepBaselineMin + ", sleepDurationMin=" + this.sleepDurationMin + ", components=" + this.components + Separators.RPAREN;
    }

    public ScoreItem(int i, String str, Double d, Double d2, Double d3, Double d4, Double d5, Double d6, Double d7, StrainComponents strainComponents) {
        this.dayNo = i;
        this.indexType = str;
        this.score = d;
        this.sleepPerformancePct = d2;
        this.sleepContinuityPct = d3;
        this.minHeartRate = d4;
        this.minSpo2 = d5;
        this.sleepBaselineMin = d6;
        this.sleepDurationMin = d7;
        this.components = strainComponents;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ ScoreItem(int r2, java.lang.String r3, java.lang.Double r4, java.lang.Double r5, java.lang.Double r6, java.lang.Double r7, java.lang.Double r8, java.lang.Double r9, java.lang.Double r10, com.wakeup.feature.health.bodyindex.net.StrainComponents r11, int r12, kotlin.jvm.internal.DefaultConstructorMarker r13) {
        /*
            r1 = this;
            r13 = r12 & 1
            if (r13 == 0) goto L5
            r2 = 0
        L5:
            r13 = r12 & 2
            r0 = 0
            if (r13 == 0) goto Lb
            r3 = r0
        Lb:
            r13 = r12 & 4
            if (r13 == 0) goto L10
            r4 = r0
        L10:
            r13 = r12 & 8
            if (r13 == 0) goto L15
            r5 = r0
        L15:
            r13 = r12 & 16
            if (r13 == 0) goto L1a
            r6 = r0
        L1a:
            r13 = r12 & 32
            if (r13 == 0) goto L1f
            r7 = r0
        L1f:
            r13 = r12 & 64
            if (r13 == 0) goto L24
            r8 = r0
        L24:
            r13 = r12 & 128(0x80, float:1.8E-43)
            if (r13 == 0) goto L29
            r9 = r0
        L29:
            r13 = r12 & 256(0x100, float:3.59E-43)
            if (r13 == 0) goto L2e
            r10 = r0
        L2e:
            r12 = r12 & 512(0x200, float:7.17E-43)
            if (r12 == 0) goto L3e
            r13 = r0
            r11 = r9
            r12 = r10
            r9 = r7
            r10 = r8
            r7 = r5
            r8 = r6
            r5 = r3
            r6 = r4
            r3 = r1
            r4 = r2
            goto L49
        L3e:
            r13 = r11
            r12 = r10
            r10 = r8
            r11 = r9
            r8 = r6
            r9 = r7
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
            r3 = r1
        L49:
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.wakeup.feature.health.bodyindex.net.ScoreItem.<init>(int, java.lang.String, java.lang.Double, java.lang.Double, java.lang.Double, java.lang.Double, java.lang.Double, java.lang.Double, java.lang.Double, com.wakeup.feature.health.bodyindex.net.StrainComponents, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public final int getDayNo() {
        return this.dayNo;
    }

    public final String getIndexType() {
        return this.indexType;
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

    public final Double getSleepBaselineMin() {
        return this.sleepBaselineMin;
    }

    public final Double getSleepDurationMin() {
        return this.sleepDurationMin;
    }

    public final StrainComponents getComponents() {
        return this.components;
    }
}
