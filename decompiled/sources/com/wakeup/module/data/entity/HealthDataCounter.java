package com.wakeup.module.data.entity;

import android.gov.nist.core.Separators;
import com.wakeup.common.Constants;
import com.wakeup.commponent.module.data.HealthData;
import com.wakeup.commponent.module.data.HealthItem;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HealthDataCounter.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0016\bÆ\u0002\u0018\u00002\u00020\u0001:\u0013\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0017"}, d2 = {"Lcom/wakeup/module/data/entity/HealthDataCounter;", "", "<init>", "()V", "BloodPressure", "Breathe", "BloodGlucose", "HeartBeat", "Immunity", "Met", "Weight", "BloodOxygen", "Sleep", "Step", "Stress", "Temperature", "HealthCommon", "HealthCommonFloat", "ActiveStrength", "ActiveTime", "ActiveHeat", "UnusuallyRecord", "SleepApnea", "module-data_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HealthDataCounter {
    public static final HealthDataCounter INSTANCE = new HealthDataCounter();

    private HealthDataCounter() {
    }

    /* compiled from: HealthDataCounter.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b&\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0005¢\u0006\u0004\b\f\u0010\rJ\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0005HÆ\u0003J\t\u0010$\u001a\u00020\u0005HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0005HÆ\u0003J\t\u0010'\u001a\u00020\u0005HÆ\u0003J\t\u0010(\u001a\u00020\u0005HÆ\u0003J\t\u0010)\u001a\u00020\u0005HÆ\u0003JY\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u0005HÆ\u0001J\u0013\u0010+\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010.\u001a\u00020\u0005HÖ\u0001J\t\u0010/\u001a\u000200HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0013\"\u0004\b\u0017\u0010\u0015R\u001a\u0010\u0007\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u000f\"\u0004\b\u0019\u0010\u0011R\u001a\u0010\b\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0013\"\u0004\b\u001b\u0010\u0015R\u001a\u0010\t\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0013\"\u0004\b\u001d\u0010\u0015R\u001a\u0010\n\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0013\"\u0004\b\u001f\u0010\u0015R\u001a\u0010\u000b\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0013\"\u0004\b!\u0010\u0015¨\u00061"}, d2 = {"Lcom/wakeup/module/data/entity/HealthDataCounter$BloodPressure;", "", "appTime", "", HealthData.STATISTICS_AVG_DBP, "", HealthData.STATISTICS_AVG_SBP, "dayNo", "recentlyDiastolic", "recentlySystolic", "unusually", HealthItem.TYPE_AVG_PULSE, "<init>", "(JIIJIIII)V", "getAppTime", "()J", "setAppTime", "(J)V", "getAverageDiastolic", "()I", "setAverageDiastolic", "(I)V", "getAverageSystolic", "setAverageSystolic", "getDayNo", "setDayNo", "getRecentlyDiastolic", "setRecentlyDiastolic", "getRecentlySystolic", "setRecentlySystolic", "getUnusually", "setUnusually", "getPulse", "setPulse", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "toString", "", "module-data_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class BloodPressure {
        private long appTime;
        private int averageDiastolic;
        private int averageSystolic;
        private long dayNo;
        private int pulse;
        private int recentlyDiastolic;
        private int recentlySystolic;
        private int unusually;

        public static /* synthetic */ BloodPressure copy$default(BloodPressure bloodPressure, long j, int i, int i2, long j2, int i3, int i4, int i5, int i6, int i7, Object obj) {
            if ((i7 & 1) != 0) {
                j = bloodPressure.appTime;
            }
            long j3 = j;
            if ((i7 & 2) != 0) {
                i = bloodPressure.averageDiastolic;
            }
            int i8 = i;
            if ((i7 & 4) != 0) {
                i2 = bloodPressure.averageSystolic;
            }
            return bloodPressure.copy(j3, i8, i2, (i7 & 8) != 0 ? bloodPressure.dayNo : j2, (i7 & 16) != 0 ? bloodPressure.recentlyDiastolic : i3, (i7 & 32) != 0 ? bloodPressure.recentlySystolic : i4, (i7 & 64) != 0 ? bloodPressure.unusually : i5, (i7 & 128) != 0 ? bloodPressure.pulse : i6);
        }

        /* renamed from: component1, reason: from getter */
        public final long getAppTime() {
            return this.appTime;
        }

        /* renamed from: component2, reason: from getter */
        public final int getAverageDiastolic() {
            return this.averageDiastolic;
        }

        /* renamed from: component3, reason: from getter */
        public final int getAverageSystolic() {
            return this.averageSystolic;
        }

        /* renamed from: component4, reason: from getter */
        public final long getDayNo() {
            return this.dayNo;
        }

        /* renamed from: component5, reason: from getter */
        public final int getRecentlyDiastolic() {
            return this.recentlyDiastolic;
        }

        /* renamed from: component6, reason: from getter */
        public final int getRecentlySystolic() {
            return this.recentlySystolic;
        }

        /* renamed from: component7, reason: from getter */
        public final int getUnusually() {
            return this.unusually;
        }

        /* renamed from: component8, reason: from getter */
        public final int getPulse() {
            return this.pulse;
        }

        public final BloodPressure copy(long appTime, int averageDiastolic, int averageSystolic, long dayNo, int recentlyDiastolic, int recentlySystolic, int unusually, int pulse) {
            return new BloodPressure(appTime, averageDiastolic, averageSystolic, dayNo, recentlyDiastolic, recentlySystolic, unusually, pulse);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BloodPressure)) {
                return false;
            }
            BloodPressure bloodPressure = (BloodPressure) other;
            return this.appTime == bloodPressure.appTime && this.averageDiastolic == bloodPressure.averageDiastolic && this.averageSystolic == bloodPressure.averageSystolic && this.dayNo == bloodPressure.dayNo && this.recentlyDiastolic == bloodPressure.recentlyDiastolic && this.recentlySystolic == bloodPressure.recentlySystolic && this.unusually == bloodPressure.unusually && this.pulse == bloodPressure.pulse;
        }

        public int hashCode() {
            return (((((((((((((Long.hashCode(this.appTime) * 31) + Integer.hashCode(this.averageDiastolic)) * 31) + Integer.hashCode(this.averageSystolic)) * 31) + Long.hashCode(this.dayNo)) * 31) + Integer.hashCode(this.recentlyDiastolic)) * 31) + Integer.hashCode(this.recentlySystolic)) * 31) + Integer.hashCode(this.unusually)) * 31) + Integer.hashCode(this.pulse);
        }

        public String toString() {
            return "BloodPressure(appTime=" + this.appTime + ", averageDiastolic=" + this.averageDiastolic + ", averageSystolic=" + this.averageSystolic + ", dayNo=" + this.dayNo + ", recentlyDiastolic=" + this.recentlyDiastolic + ", recentlySystolic=" + this.recentlySystolic + ", unusually=" + this.unusually + ", pulse=" + this.pulse + Separators.RPAREN;
        }

        public BloodPressure(long j, int i, int i2, long j2, int i3, int i4, int i5, int i6) {
            this.appTime = j;
            this.averageDiastolic = i;
            this.averageSystolic = i2;
            this.dayNo = j2;
            this.recentlyDiastolic = i3;
            this.recentlySystolic = i4;
            this.unusually = i5;
            this.pulse = i6;
        }

        public final long getAppTime() {
            return this.appTime;
        }

        public final void setAppTime(long j) {
            this.appTime = j;
        }

        public final int getAverageDiastolic() {
            return this.averageDiastolic;
        }

        public final void setAverageDiastolic(int i) {
            this.averageDiastolic = i;
        }

        public final int getAverageSystolic() {
            return this.averageSystolic;
        }

        public final void setAverageSystolic(int i) {
            this.averageSystolic = i;
        }

        public final long getDayNo() {
            return this.dayNo;
        }

        public final void setDayNo(long j) {
            this.dayNo = j;
        }

        public final int getRecentlyDiastolic() {
            return this.recentlyDiastolic;
        }

        public final void setRecentlyDiastolic(int i) {
            this.recentlyDiastolic = i;
        }

        public final int getRecentlySystolic() {
            return this.recentlySystolic;
        }

        public final void setRecentlySystolic(int i) {
            this.recentlySystolic = i;
        }

        public final int getUnusually() {
            return this.unusually;
        }

        public final void setUnusually(int i) {
            this.unusually = i;
        }

        public final int getPulse() {
            return this.pulse;
        }

        public final void setPulse(int i) {
            this.pulse = i;
        }
    }

    /* compiled from: HealthDataCounter.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\"\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0005HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0005HÆ\u0003J\t\u0010#\u001a\u00020\u0005HÆ\u0003J\t\u0010$\u001a\u00020\u0005HÆ\u0003J\t\u0010%\u001a\u00020\u0005HÆ\u0003JO\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u0005HÆ\u0001J\u0013\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010*\u001a\u00020\u0005HÖ\u0001J\t\u0010+\u001a\u00020,HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u000e\"\u0004\b\u0016\u0010\u0010R\u001a\u0010\u0007\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0012\"\u0004\b\u0018\u0010\u0014R\u001a\u0010\b\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0012\"\u0004\b\u001a\u0010\u0014R\u001a\u0010\t\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0012\"\u0004\b\u001c\u0010\u0014R\u001a\u0010\n\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0012\"\u0004\b\u001e\u0010\u0014¨\u0006-"}, d2 = {"Lcom/wakeup/module/data/entity/HealthDataCounter$Breathe;", "", "appTime", "", HealthData.STATISTICS_AVERAGE, "", "dayNo", "highest", "lowest", HealthData.STATISTICS_RECENTLY, "unusually", "<init>", "(JIJIIII)V", "getAppTime", "()J", "setAppTime", "(J)V", "getAverage", "()I", "setAverage", "(I)V", "getDayNo", "setDayNo", "getHighest", "setHighest", "getLowest", "setLowest", "getRecently", "setRecently", "getUnusually", "setUnusually", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "toString", "", "module-data_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Breathe {
        private long appTime;
        private int average;
        private long dayNo;
        private int highest;
        private int lowest;
        private int recently;
        private int unusually;

        public static /* synthetic */ Breathe copy$default(Breathe breathe, long j, int i, long j2, int i2, int i3, int i4, int i5, int i6, Object obj) {
            if ((i6 & 1) != 0) {
                j = breathe.appTime;
            }
            long j3 = j;
            if ((i6 & 2) != 0) {
                i = breathe.average;
            }
            int i7 = i;
            if ((i6 & 4) != 0) {
                j2 = breathe.dayNo;
            }
            return breathe.copy(j3, i7, j2, (i6 & 8) != 0 ? breathe.highest : i2, (i6 & 16) != 0 ? breathe.lowest : i3, (i6 & 32) != 0 ? breathe.recently : i4, (i6 & 64) != 0 ? breathe.unusually : i5);
        }

        /* renamed from: component1, reason: from getter */
        public final long getAppTime() {
            return this.appTime;
        }

        /* renamed from: component2, reason: from getter */
        public final int getAverage() {
            return this.average;
        }

        /* renamed from: component3, reason: from getter */
        public final long getDayNo() {
            return this.dayNo;
        }

        /* renamed from: component4, reason: from getter */
        public final int getHighest() {
            return this.highest;
        }

        /* renamed from: component5, reason: from getter */
        public final int getLowest() {
            return this.lowest;
        }

        /* renamed from: component6, reason: from getter */
        public final int getRecently() {
            return this.recently;
        }

        /* renamed from: component7, reason: from getter */
        public final int getUnusually() {
            return this.unusually;
        }

        public final Breathe copy(long appTime, int average, long dayNo, int highest, int lowest, int recently, int unusually) {
            return new Breathe(appTime, average, dayNo, highest, lowest, recently, unusually);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Breathe)) {
                return false;
            }
            Breathe breathe = (Breathe) other;
            return this.appTime == breathe.appTime && this.average == breathe.average && this.dayNo == breathe.dayNo && this.highest == breathe.highest && this.lowest == breathe.lowest && this.recently == breathe.recently && this.unusually == breathe.unusually;
        }

        public int hashCode() {
            return (((((((((((Long.hashCode(this.appTime) * 31) + Integer.hashCode(this.average)) * 31) + Long.hashCode(this.dayNo)) * 31) + Integer.hashCode(this.highest)) * 31) + Integer.hashCode(this.lowest)) * 31) + Integer.hashCode(this.recently)) * 31) + Integer.hashCode(this.unusually);
        }

        public String toString() {
            return "Breathe(appTime=" + this.appTime + ", average=" + this.average + ", dayNo=" + this.dayNo + ", highest=" + this.highest + ", lowest=" + this.lowest + ", recently=" + this.recently + ", unusually=" + this.unusually + Separators.RPAREN;
        }

        public Breathe(long j, int i, long j2, int i2, int i3, int i4, int i5) {
            this.appTime = j;
            this.average = i;
            this.dayNo = j2;
            this.highest = i2;
            this.lowest = i3;
            this.recently = i4;
            this.unusually = i5;
        }

        public final long getAppTime() {
            return this.appTime;
        }

        public final void setAppTime(long j) {
            this.appTime = j;
        }

        public final int getAverage() {
            return this.average;
        }

        public final void setAverage(int i) {
            this.average = i;
        }

        public final long getDayNo() {
            return this.dayNo;
        }

        public final void setDayNo(long j) {
            this.dayNo = j;
        }

        public final int getHighest() {
            return this.highest;
        }

        public final void setHighest(int i) {
            this.highest = i;
        }

        public final int getLowest() {
            return this.lowest;
        }

        public final void setLowest(int i) {
            this.lowest = i;
        }

        public final int getRecently() {
            return this.recently;
        }

        public final void setRecently(int i) {
            this.recently = i;
        }

        public final int getUnusually() {
            return this.unusually;
        }

        public final void setUnusually(int i) {
            this.unusually = i;
        }
    }

    /* compiled from: HealthDataCounter.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b7\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001Bo\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u000b\u0012\u0006\u0010\u0010\u001a\u00020\u000b\u0012\u0006\u0010\u0011\u001a\u00020\u000b¢\u0006\u0004\b\u0012\u0010\u0013J\t\u00104\u001a\u00020\u0003HÆ\u0003J\t\u00105\u001a\u00020\u0005HÆ\u0003J\t\u00106\u001a\u00020\u0003HÆ\u0003J\t\u00107\u001a\u00020\u0005HÆ\u0003J\t\u00108\u001a\u00020\u0005HÆ\u0003J\t\u00109\u001a\u00020\u0005HÆ\u0003J\t\u0010:\u001a\u00020\u000bHÆ\u0003J\t\u0010;\u001a\u00020\u000bHÆ\u0003J\t\u0010<\u001a\u00020\u000bHÆ\u0003J\t\u0010=\u001a\u00020\u000bHÆ\u0003J\t\u0010>\u001a\u00020\u000bHÆ\u0003J\t\u0010?\u001a\u00020\u000bHÆ\u0003J\t\u0010@\u001a\u00020\u000bHÆ\u0003J\u008b\u0001\u0010A\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u000b2\b\b\u0002\u0010\u0010\u001a\u00020\u000b2\b\b\u0002\u0010\u0011\u001a\u00020\u000bHÆ\u0001J\u0013\u0010B\u001a\u00020C2\b\u0010D\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010E\u001a\u00020\u000bHÖ\u0001J\t\u0010F\u001a\u00020GHÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0015\"\u0004\b\u001d\u0010\u0017R\u001a\u0010\u0007\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0019\"\u0004\b\u001f\u0010\u001bR\u001a\u0010\b\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0019\"\u0004\b!\u0010\u001bR\u001a\u0010\t\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0019\"\u0004\b#\u0010\u001bR\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u001a\u0010\f\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010%\"\u0004\b)\u0010'R\u001a\u0010\r\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010%\"\u0004\b+\u0010'R\u001a\u0010\u000e\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010%\"\u0004\b-\u0010'R\u001a\u0010\u000f\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010%\"\u0004\b/\u0010'R\u001a\u0010\u0010\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u0010%\"\u0004\b1\u0010'R\u001a\u0010\u0011\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u0010%\"\u0004\b3\u0010'¨\u0006H"}, d2 = {"Lcom/wakeup/module/data/entity/HealthDataCounter$BloodGlucose;", "", "appTime", "", HealthData.STATISTICS_AVERAGE, "", "dayNo", "highest", "lowest", HealthData.STATISTICS_RECENTLY, "unusually", "", "lowestType", "highestType", "unusuallyAfter", "unusuallyBefore", "unusuallyLimosis", "unusuallyRandom", "<init>", "(JFJFFFIIIIIII)V", "getAppTime", "()J", "setAppTime", "(J)V", "getAverage", "()F", "setAverage", "(F)V", "getDayNo", "setDayNo", "getHighest", "setHighest", "getLowest", "setLowest", "getRecently", "setRecently", "getUnusually", "()I", "setUnusually", "(I)V", "getLowestType", "setLowestType", "getHighestType", "setHighestType", "getUnusuallyAfter", "setUnusuallyAfter", "getUnusuallyBefore", "setUnusuallyBefore", "getUnusuallyLimosis", "setUnusuallyLimosis", "getUnusuallyRandom", "setUnusuallyRandom", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "copy", "equals", "", "other", "hashCode", "toString", "", "module-data_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class BloodGlucose {
        private long appTime;
        private float average;
        private long dayNo;
        private float highest;
        private int highestType;
        private float lowest;
        private int lowestType;
        private float recently;
        private int unusually;
        private int unusuallyAfter;
        private int unusuallyBefore;
        private int unusuallyLimosis;
        private int unusuallyRandom;

        /* renamed from: component1, reason: from getter */
        public final long getAppTime() {
            return this.appTime;
        }

        /* renamed from: component10, reason: from getter */
        public final int getUnusuallyAfter() {
            return this.unusuallyAfter;
        }

        /* renamed from: component11, reason: from getter */
        public final int getUnusuallyBefore() {
            return this.unusuallyBefore;
        }

        /* renamed from: component12, reason: from getter */
        public final int getUnusuallyLimosis() {
            return this.unusuallyLimosis;
        }

        /* renamed from: component13, reason: from getter */
        public final int getUnusuallyRandom() {
            return this.unusuallyRandom;
        }

        /* renamed from: component2, reason: from getter */
        public final float getAverage() {
            return this.average;
        }

        /* renamed from: component3, reason: from getter */
        public final long getDayNo() {
            return this.dayNo;
        }

        /* renamed from: component4, reason: from getter */
        public final float getHighest() {
            return this.highest;
        }

        /* renamed from: component5, reason: from getter */
        public final float getLowest() {
            return this.lowest;
        }

        /* renamed from: component6, reason: from getter */
        public final float getRecently() {
            return this.recently;
        }

        /* renamed from: component7, reason: from getter */
        public final int getUnusually() {
            return this.unusually;
        }

        /* renamed from: component8, reason: from getter */
        public final int getLowestType() {
            return this.lowestType;
        }

        /* renamed from: component9, reason: from getter */
        public final int getHighestType() {
            return this.highestType;
        }

        public final BloodGlucose copy(long appTime, float average, long dayNo, float highest, float lowest, float recently, int unusually, int lowestType, int highestType, int unusuallyAfter, int unusuallyBefore, int unusuallyLimosis, int unusuallyRandom) {
            return new BloodGlucose(appTime, average, dayNo, highest, lowest, recently, unusually, lowestType, highestType, unusuallyAfter, unusuallyBefore, unusuallyLimosis, unusuallyRandom);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BloodGlucose)) {
                return false;
            }
            BloodGlucose bloodGlucose = (BloodGlucose) other;
            return this.appTime == bloodGlucose.appTime && Float.compare(this.average, bloodGlucose.average) == 0 && this.dayNo == bloodGlucose.dayNo && Float.compare(this.highest, bloodGlucose.highest) == 0 && Float.compare(this.lowest, bloodGlucose.lowest) == 0 && Float.compare(this.recently, bloodGlucose.recently) == 0 && this.unusually == bloodGlucose.unusually && this.lowestType == bloodGlucose.lowestType && this.highestType == bloodGlucose.highestType && this.unusuallyAfter == bloodGlucose.unusuallyAfter && this.unusuallyBefore == bloodGlucose.unusuallyBefore && this.unusuallyLimosis == bloodGlucose.unusuallyLimosis && this.unusuallyRandom == bloodGlucose.unusuallyRandom;
        }

        public int hashCode() {
            return (((((((((((((((((((((((Long.hashCode(this.appTime) * 31) + Float.hashCode(this.average)) * 31) + Long.hashCode(this.dayNo)) * 31) + Float.hashCode(this.highest)) * 31) + Float.hashCode(this.lowest)) * 31) + Float.hashCode(this.recently)) * 31) + Integer.hashCode(this.unusually)) * 31) + Integer.hashCode(this.lowestType)) * 31) + Integer.hashCode(this.highestType)) * 31) + Integer.hashCode(this.unusuallyAfter)) * 31) + Integer.hashCode(this.unusuallyBefore)) * 31) + Integer.hashCode(this.unusuallyLimosis)) * 31) + Integer.hashCode(this.unusuallyRandom);
        }

        public String toString() {
            return "BloodGlucose(appTime=" + this.appTime + ", average=" + this.average + ", dayNo=" + this.dayNo + ", highest=" + this.highest + ", lowest=" + this.lowest + ", recently=" + this.recently + ", unusually=" + this.unusually + ", lowestType=" + this.lowestType + ", highestType=" + this.highestType + ", unusuallyAfter=" + this.unusuallyAfter + ", unusuallyBefore=" + this.unusuallyBefore + ", unusuallyLimosis=" + this.unusuallyLimosis + ", unusuallyRandom=" + this.unusuallyRandom + Separators.RPAREN;
        }

        public BloodGlucose(long j, float f, long j2, float f2, float f3, float f4, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
            this.appTime = j;
            this.average = f;
            this.dayNo = j2;
            this.highest = f2;
            this.lowest = f3;
            this.recently = f4;
            this.unusually = i;
            this.lowestType = i2;
            this.highestType = i3;
            this.unusuallyAfter = i4;
            this.unusuallyBefore = i5;
            this.unusuallyLimosis = i6;
            this.unusuallyRandom = i7;
        }

        public final long getAppTime() {
            return this.appTime;
        }

        public final void setAppTime(long j) {
            this.appTime = j;
        }

        public final float getAverage() {
            return this.average;
        }

        public final void setAverage(float f) {
            this.average = f;
        }

        public final long getDayNo() {
            return this.dayNo;
        }

        public final void setDayNo(long j) {
            this.dayNo = j;
        }

        public final float getHighest() {
            return this.highest;
        }

        public final void setHighest(float f) {
            this.highest = f;
        }

        public final float getLowest() {
            return this.lowest;
        }

        public final void setLowest(float f) {
            this.lowest = f;
        }

        public final float getRecently() {
            return this.recently;
        }

        public final void setRecently(float f) {
            this.recently = f;
        }

        public final int getUnusually() {
            return this.unusually;
        }

        public final void setUnusually(int i) {
            this.unusually = i;
        }

        public final int getLowestType() {
            return this.lowestType;
        }

        public final void setLowestType(int i) {
            this.lowestType = i;
        }

        public final int getHighestType() {
            return this.highestType;
        }

        public final void setHighestType(int i) {
            this.highestType = i;
        }

        public final int getUnusuallyAfter() {
            return this.unusuallyAfter;
        }

        public final void setUnusuallyAfter(int i) {
            this.unusuallyAfter = i;
        }

        public final int getUnusuallyBefore() {
            return this.unusuallyBefore;
        }

        public final void setUnusuallyBefore(int i) {
            this.unusuallyBefore = i;
        }

        public final int getUnusuallyLimosis() {
            return this.unusuallyLimosis;
        }

        public final void setUnusuallyLimosis(int i) {
            this.unusuallyLimosis = i;
        }

        public final int getUnusuallyRandom() {
            return this.unusuallyRandom;
        }

        public final void setUnusuallyRandom(int i) {
            this.unusuallyRandom = i;
        }
    }

    /* compiled from: HealthDataCounter.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\"\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0005HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0005HÆ\u0003J\t\u0010#\u001a\u00020\u0005HÆ\u0003J\t\u0010$\u001a\u00020\u0005HÆ\u0003J\t\u0010%\u001a\u00020\u0005HÆ\u0003JO\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u0005HÆ\u0001J\u0013\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010*\u001a\u00020\u0005HÖ\u0001J\t\u0010+\u001a\u00020,HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u000e\"\u0004\b\u0016\u0010\u0010R\u001a\u0010\u0007\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0012\"\u0004\b\u0018\u0010\u0014R\u001a\u0010\b\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0012\"\u0004\b\u001a\u0010\u0014R\u001a\u0010\t\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0012\"\u0004\b\u001c\u0010\u0014R\u001a\u0010\n\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0012\"\u0004\b\u001e\u0010\u0014¨\u0006-"}, d2 = {"Lcom/wakeup/module/data/entity/HealthDataCounter$HeartBeat;", "", "appTime", "", HealthData.STATISTICS_AVERAGE, "", "dayNo", "highest", "lowest", HealthData.STATISTICS_RECENTLY, "unusually", "<init>", "(JIJIIII)V", "getAppTime", "()J", "setAppTime", "(J)V", "getAverage", "()I", "setAverage", "(I)V", "getDayNo", "setDayNo", "getHighest", "setHighest", "getLowest", "setLowest", "getRecently", "setRecently", "getUnusually", "setUnusually", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "toString", "", "module-data_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class HeartBeat {
        private long appTime;
        private int average;
        private long dayNo;
        private int highest;
        private int lowest;
        private int recently;
        private int unusually;

        public static /* synthetic */ HeartBeat copy$default(HeartBeat heartBeat, long j, int i, long j2, int i2, int i3, int i4, int i5, int i6, Object obj) {
            if ((i6 & 1) != 0) {
                j = heartBeat.appTime;
            }
            long j3 = j;
            if ((i6 & 2) != 0) {
                i = heartBeat.average;
            }
            int i7 = i;
            if ((i6 & 4) != 0) {
                j2 = heartBeat.dayNo;
            }
            return heartBeat.copy(j3, i7, j2, (i6 & 8) != 0 ? heartBeat.highest : i2, (i6 & 16) != 0 ? heartBeat.lowest : i3, (i6 & 32) != 0 ? heartBeat.recently : i4, (i6 & 64) != 0 ? heartBeat.unusually : i5);
        }

        /* renamed from: component1, reason: from getter */
        public final long getAppTime() {
            return this.appTime;
        }

        /* renamed from: component2, reason: from getter */
        public final int getAverage() {
            return this.average;
        }

        /* renamed from: component3, reason: from getter */
        public final long getDayNo() {
            return this.dayNo;
        }

        /* renamed from: component4, reason: from getter */
        public final int getHighest() {
            return this.highest;
        }

        /* renamed from: component5, reason: from getter */
        public final int getLowest() {
            return this.lowest;
        }

        /* renamed from: component6, reason: from getter */
        public final int getRecently() {
            return this.recently;
        }

        /* renamed from: component7, reason: from getter */
        public final int getUnusually() {
            return this.unusually;
        }

        public final HeartBeat copy(long appTime, int average, long dayNo, int highest, int lowest, int recently, int unusually) {
            return new HeartBeat(appTime, average, dayNo, highest, lowest, recently, unusually);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof HeartBeat)) {
                return false;
            }
            HeartBeat heartBeat = (HeartBeat) other;
            return this.appTime == heartBeat.appTime && this.average == heartBeat.average && this.dayNo == heartBeat.dayNo && this.highest == heartBeat.highest && this.lowest == heartBeat.lowest && this.recently == heartBeat.recently && this.unusually == heartBeat.unusually;
        }

        public int hashCode() {
            return (((((((((((Long.hashCode(this.appTime) * 31) + Integer.hashCode(this.average)) * 31) + Long.hashCode(this.dayNo)) * 31) + Integer.hashCode(this.highest)) * 31) + Integer.hashCode(this.lowest)) * 31) + Integer.hashCode(this.recently)) * 31) + Integer.hashCode(this.unusually);
        }

        public String toString() {
            return "HeartBeat(appTime=" + this.appTime + ", average=" + this.average + ", dayNo=" + this.dayNo + ", highest=" + this.highest + ", lowest=" + this.lowest + ", recently=" + this.recently + ", unusually=" + this.unusually + Separators.RPAREN;
        }

        public HeartBeat(long j, int i, long j2, int i2, int i3, int i4, int i5) {
            this.appTime = j;
            this.average = i;
            this.dayNo = j2;
            this.highest = i2;
            this.lowest = i3;
            this.recently = i4;
            this.unusually = i5;
        }

        public final long getAppTime() {
            return this.appTime;
        }

        public final void setAppTime(long j) {
            this.appTime = j;
        }

        public final int getAverage() {
            return this.average;
        }

        public final void setAverage(int i) {
            this.average = i;
        }

        public final long getDayNo() {
            return this.dayNo;
        }

        public final void setDayNo(long j) {
            this.dayNo = j;
        }

        public final int getHighest() {
            return this.highest;
        }

        public final void setHighest(int i) {
            this.highest = i;
        }

        public final int getLowest() {
            return this.lowest;
        }

        public final void setLowest(int i) {
            this.lowest = i;
        }

        public final int getRecently() {
            return this.recently;
        }

        public final void setRecently(int i) {
            this.recently = i;
        }

        public final int getUnusually() {
            return this.unusually;
        }

        public final void setUnusually(int i) {
            this.unusually = i;
        }
    }

    /* compiled from: HealthDataCounter.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\"\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0005HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0005HÆ\u0003J\t\u0010#\u001a\u00020\u0005HÆ\u0003J\t\u0010$\u001a\u00020\u0005HÆ\u0003J\t\u0010%\u001a\u00020\u0005HÆ\u0003JO\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u0005HÆ\u0001J\u0013\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010*\u001a\u00020\u0005HÖ\u0001J\t\u0010+\u001a\u00020,HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u000e\"\u0004\b\u0016\u0010\u0010R\u001a\u0010\u0007\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0012\"\u0004\b\u0018\u0010\u0014R\u001a\u0010\b\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0012\"\u0004\b\u001a\u0010\u0014R\u001a\u0010\t\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0012\"\u0004\b\u001c\u0010\u0014R\u001a\u0010\n\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0012\"\u0004\b\u001e\u0010\u0014¨\u0006-"}, d2 = {"Lcom/wakeup/module/data/entity/HealthDataCounter$Immunity;", "", "appTime", "", HealthData.STATISTICS_AVERAGE, "", "dayNo", "highest", "lowest", HealthData.STATISTICS_RECENTLY, "unusually", "<init>", "(JIJIIII)V", "getAppTime", "()J", "setAppTime", "(J)V", "getAverage", "()I", "setAverage", "(I)V", "getDayNo", "setDayNo", "getHighest", "setHighest", "getLowest", "setLowest", "getRecently", "setRecently", "getUnusually", "setUnusually", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "toString", "", "module-data_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Immunity {
        private long appTime;
        private int average;
        private long dayNo;
        private int highest;
        private int lowest;
        private int recently;
        private int unusually;

        public static /* synthetic */ Immunity copy$default(Immunity immunity, long j, int i, long j2, int i2, int i3, int i4, int i5, int i6, Object obj) {
            if ((i6 & 1) != 0) {
                j = immunity.appTime;
            }
            long j3 = j;
            if ((i6 & 2) != 0) {
                i = immunity.average;
            }
            int i7 = i;
            if ((i6 & 4) != 0) {
                j2 = immunity.dayNo;
            }
            return immunity.copy(j3, i7, j2, (i6 & 8) != 0 ? immunity.highest : i2, (i6 & 16) != 0 ? immunity.lowest : i3, (i6 & 32) != 0 ? immunity.recently : i4, (i6 & 64) != 0 ? immunity.unusually : i5);
        }

        /* renamed from: component1, reason: from getter */
        public final long getAppTime() {
            return this.appTime;
        }

        /* renamed from: component2, reason: from getter */
        public final int getAverage() {
            return this.average;
        }

        /* renamed from: component3, reason: from getter */
        public final long getDayNo() {
            return this.dayNo;
        }

        /* renamed from: component4, reason: from getter */
        public final int getHighest() {
            return this.highest;
        }

        /* renamed from: component5, reason: from getter */
        public final int getLowest() {
            return this.lowest;
        }

        /* renamed from: component6, reason: from getter */
        public final int getRecently() {
            return this.recently;
        }

        /* renamed from: component7, reason: from getter */
        public final int getUnusually() {
            return this.unusually;
        }

        public final Immunity copy(long appTime, int average, long dayNo, int highest, int lowest, int recently, int unusually) {
            return new Immunity(appTime, average, dayNo, highest, lowest, recently, unusually);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Immunity)) {
                return false;
            }
            Immunity immunity = (Immunity) other;
            return this.appTime == immunity.appTime && this.average == immunity.average && this.dayNo == immunity.dayNo && this.highest == immunity.highest && this.lowest == immunity.lowest && this.recently == immunity.recently && this.unusually == immunity.unusually;
        }

        public int hashCode() {
            return (((((((((((Long.hashCode(this.appTime) * 31) + Integer.hashCode(this.average)) * 31) + Long.hashCode(this.dayNo)) * 31) + Integer.hashCode(this.highest)) * 31) + Integer.hashCode(this.lowest)) * 31) + Integer.hashCode(this.recently)) * 31) + Integer.hashCode(this.unusually);
        }

        public String toString() {
            return "Immunity(appTime=" + this.appTime + ", average=" + this.average + ", dayNo=" + this.dayNo + ", highest=" + this.highest + ", lowest=" + this.lowest + ", recently=" + this.recently + ", unusually=" + this.unusually + Separators.RPAREN;
        }

        public Immunity(long j, int i, long j2, int i2, int i3, int i4, int i5) {
            this.appTime = j;
            this.average = i;
            this.dayNo = j2;
            this.highest = i2;
            this.lowest = i3;
            this.recently = i4;
            this.unusually = i5;
        }

        public final long getAppTime() {
            return this.appTime;
        }

        public final void setAppTime(long j) {
            this.appTime = j;
        }

        public final int getAverage() {
            return this.average;
        }

        public final void setAverage(int i) {
            this.average = i;
        }

        public final long getDayNo() {
            return this.dayNo;
        }

        public final void setDayNo(long j) {
            this.dayNo = j;
        }

        public final int getHighest() {
            return this.highest;
        }

        public final void setHighest(int i) {
            this.highest = i;
        }

        public final int getLowest() {
            return this.lowest;
        }

        public final void setLowest(int i) {
            this.lowest = i;
        }

        public final int getRecently() {
            return this.recently;
        }

        public final void setRecently(int i) {
            this.recently = i;
        }

        public final int getUnusually() {
            return this.unusually;
        }

        public final void setUnusually(int i) {
            this.unusually = i;
        }
    }

    /* compiled from: HealthDataCounter.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0006HÆ\u0003J1\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u0006HÖ\u0001J\t\u0010\u001f\u001a\u00020 HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000b\"\u0004\b\u000f\u0010\rR\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0007\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0011\"\u0004\b\u0015\u0010\u0013¨\u0006!"}, d2 = {"Lcom/wakeup/module/data/entity/HealthDataCounter$Met;", "", "appTime", "", "dayNo", "met", "", "unusually", "<init>", "(JJII)V", "getAppTime", "()J", "setAppTime", "(J)V", "getDayNo", "setDayNo", "getMet", "()I", "setMet", "(I)V", "getUnusually", "setUnusually", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "", "module-data_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Met {
        private long appTime;
        private long dayNo;
        private int met;
        private int unusually;

        public static /* synthetic */ Met copy$default(Met met, long j, long j2, int i, int i2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                j = met.appTime;
            }
            long j3 = j;
            if ((i3 & 2) != 0) {
                j2 = met.dayNo;
            }
            long j4 = j2;
            if ((i3 & 4) != 0) {
                i = met.met;
            }
            int i4 = i;
            if ((i3 & 8) != 0) {
                i2 = met.unusually;
            }
            return met.copy(j3, j4, i4, i2);
        }

        /* renamed from: component1, reason: from getter */
        public final long getAppTime() {
            return this.appTime;
        }

        /* renamed from: component2, reason: from getter */
        public final long getDayNo() {
            return this.dayNo;
        }

        /* renamed from: component3, reason: from getter */
        public final int getMet() {
            return this.met;
        }

        /* renamed from: component4, reason: from getter */
        public final int getUnusually() {
            return this.unusually;
        }

        public final Met copy(long appTime, long dayNo, int met, int unusually) {
            return new Met(appTime, dayNo, met, unusually);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Met)) {
                return false;
            }
            Met met = (Met) other;
            return this.appTime == met.appTime && this.dayNo == met.dayNo && this.met == met.met && this.unusually == met.unusually;
        }

        public int hashCode() {
            return (((((Long.hashCode(this.appTime) * 31) + Long.hashCode(this.dayNo)) * 31) + Integer.hashCode(this.met)) * 31) + Integer.hashCode(this.unusually);
        }

        public String toString() {
            return "Met(appTime=" + this.appTime + ", dayNo=" + this.dayNo + ", met=" + this.met + ", unusually=" + this.unusually + Separators.RPAREN;
        }

        public Met(long j, long j2, int i, int i2) {
            this.appTime = j;
            this.dayNo = j2;
            this.met = i;
            this.unusually = i2;
        }

        public final long getAppTime() {
            return this.appTime;
        }

        public final void setAppTime(long j) {
            this.appTime = j;
        }

        public final long getDayNo() {
            return this.dayNo;
        }

        public final void setDayNo(long j) {
            this.dayNo = j;
        }

        public final int getMet() {
            return this.met;
        }

        public final void setMet(int i) {
            this.met = i;
        }

        public final int getUnusually() {
            return this.unusually;
        }

        public final void setUnusually(int i) {
            this.unusually = i;
        }
    }

    /* compiled from: HealthDataCounter.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001c\u001a\u00020\bHÆ\u0003J1\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\u0006HÖ\u0001J\t\u0010\"\u001a\u00020#HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\f\"\u0004\b\u0010\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006$"}, d2 = {"Lcom/wakeup/module/data/entity/HealthDataCounter$Weight;", "", "appTime", "", "dayNo", "userId", "", "weight", "", "<init>", "(JJID)V", "getAppTime", "()J", "setAppTime", "(J)V", "getDayNo", "setDayNo", "getUserId", "()I", "setUserId", "(I)V", "getWeight", "()D", "setWeight", "(D)V", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "", "module-data_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Weight {
        private long appTime;
        private long dayNo;
        private int userId;
        private double weight;

        public static /* synthetic */ Weight copy$default(Weight weight, long j, long j2, int i, double d, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                j = weight.appTime;
            }
            long j3 = j;
            if ((i2 & 2) != 0) {
                j2 = weight.dayNo;
            }
            long j4 = j2;
            if ((i2 & 4) != 0) {
                i = weight.userId;
            }
            int i3 = i;
            if ((i2 & 8) != 0) {
                d = weight.weight;
            }
            return weight.copy(j3, j4, i3, d);
        }

        /* renamed from: component1, reason: from getter */
        public final long getAppTime() {
            return this.appTime;
        }

        /* renamed from: component2, reason: from getter */
        public final long getDayNo() {
            return this.dayNo;
        }

        /* renamed from: component3, reason: from getter */
        public final int getUserId() {
            return this.userId;
        }

        /* renamed from: component4, reason: from getter */
        public final double getWeight() {
            return this.weight;
        }

        public final Weight copy(long appTime, long dayNo, int userId, double weight) {
            return new Weight(appTime, dayNo, userId, weight);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Weight)) {
                return false;
            }
            Weight weight = (Weight) other;
            return this.appTime == weight.appTime && this.dayNo == weight.dayNo && this.userId == weight.userId && Double.compare(this.weight, weight.weight) == 0;
        }

        public int hashCode() {
            return (((((Long.hashCode(this.appTime) * 31) + Long.hashCode(this.dayNo)) * 31) + Integer.hashCode(this.userId)) * 31) + Double.hashCode(this.weight);
        }

        public String toString() {
            return "Weight(appTime=" + this.appTime + ", dayNo=" + this.dayNo + ", userId=" + this.userId + ", weight=" + this.weight + Separators.RPAREN;
        }

        public Weight(long j, long j2, int i, double d) {
            this.appTime = j;
            this.dayNo = j2;
            this.userId = i;
            this.weight = d;
        }

        public final long getAppTime() {
            return this.appTime;
        }

        public final void setAppTime(long j) {
            this.appTime = j;
        }

        public final long getDayNo() {
            return this.dayNo;
        }

        public final void setDayNo(long j) {
            this.dayNo = j;
        }

        public final int getUserId() {
            return this.userId;
        }

        public final void setUserId(int i) {
            this.userId = i;
        }

        public final double getWeight() {
            return this.weight;
        }

        public final void setWeight(double d) {
            this.weight = d;
        }
    }

    /* compiled from: HealthDataCounter.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\"\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0005HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0005HÆ\u0003J\t\u0010#\u001a\u00020\u0005HÆ\u0003J\t\u0010$\u001a\u00020\u0005HÆ\u0003J\t\u0010%\u001a\u00020\u0005HÆ\u0003JO\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u0005HÆ\u0001J\u0013\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010*\u001a\u00020\u0005HÖ\u0001J\t\u0010+\u001a\u00020,HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u000e\"\u0004\b\u0016\u0010\u0010R\u001a\u0010\u0007\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0012\"\u0004\b\u0018\u0010\u0014R\u001a\u0010\b\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0012\"\u0004\b\u001a\u0010\u0014R\u001a\u0010\t\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0012\"\u0004\b\u001c\u0010\u0014R\u001a\u0010\n\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0012\"\u0004\b\u001e\u0010\u0014¨\u0006-"}, d2 = {"Lcom/wakeup/module/data/entity/HealthDataCounter$BloodOxygen;", "", "appTime", "", HealthData.STATISTICS_AVERAGE, "", "dayNo", "highest", "lowest", HealthData.STATISTICS_RECENTLY, "unusually", "<init>", "(JIJIIII)V", "getAppTime", "()J", "setAppTime", "(J)V", "getAverage", "()I", "setAverage", "(I)V", "getDayNo", "setDayNo", "getHighest", "setHighest", "getLowest", "setLowest", "getRecently", "setRecently", "getUnusually", "setUnusually", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "toString", "", "module-data_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class BloodOxygen {
        private long appTime;
        private int average;
        private long dayNo;
        private int highest;
        private int lowest;
        private int recently;
        private int unusually;

        public static /* synthetic */ BloodOxygen copy$default(BloodOxygen bloodOxygen, long j, int i, long j2, int i2, int i3, int i4, int i5, int i6, Object obj) {
            if ((i6 & 1) != 0) {
                j = bloodOxygen.appTime;
            }
            long j3 = j;
            if ((i6 & 2) != 0) {
                i = bloodOxygen.average;
            }
            int i7 = i;
            if ((i6 & 4) != 0) {
                j2 = bloodOxygen.dayNo;
            }
            return bloodOxygen.copy(j3, i7, j2, (i6 & 8) != 0 ? bloodOxygen.highest : i2, (i6 & 16) != 0 ? bloodOxygen.lowest : i3, (i6 & 32) != 0 ? bloodOxygen.recently : i4, (i6 & 64) != 0 ? bloodOxygen.unusually : i5);
        }

        /* renamed from: component1, reason: from getter */
        public final long getAppTime() {
            return this.appTime;
        }

        /* renamed from: component2, reason: from getter */
        public final int getAverage() {
            return this.average;
        }

        /* renamed from: component3, reason: from getter */
        public final long getDayNo() {
            return this.dayNo;
        }

        /* renamed from: component4, reason: from getter */
        public final int getHighest() {
            return this.highest;
        }

        /* renamed from: component5, reason: from getter */
        public final int getLowest() {
            return this.lowest;
        }

        /* renamed from: component6, reason: from getter */
        public final int getRecently() {
            return this.recently;
        }

        /* renamed from: component7, reason: from getter */
        public final int getUnusually() {
            return this.unusually;
        }

        public final BloodOxygen copy(long appTime, int average, long dayNo, int highest, int lowest, int recently, int unusually) {
            return new BloodOxygen(appTime, average, dayNo, highest, lowest, recently, unusually);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BloodOxygen)) {
                return false;
            }
            BloodOxygen bloodOxygen = (BloodOxygen) other;
            return this.appTime == bloodOxygen.appTime && this.average == bloodOxygen.average && this.dayNo == bloodOxygen.dayNo && this.highest == bloodOxygen.highest && this.lowest == bloodOxygen.lowest && this.recently == bloodOxygen.recently && this.unusually == bloodOxygen.unusually;
        }

        public int hashCode() {
            return (((((((((((Long.hashCode(this.appTime) * 31) + Integer.hashCode(this.average)) * 31) + Long.hashCode(this.dayNo)) * 31) + Integer.hashCode(this.highest)) * 31) + Integer.hashCode(this.lowest)) * 31) + Integer.hashCode(this.recently)) * 31) + Integer.hashCode(this.unusually);
        }

        public String toString() {
            return "BloodOxygen(appTime=" + this.appTime + ", average=" + this.average + ", dayNo=" + this.dayNo + ", highest=" + this.highest + ", lowest=" + this.lowest + ", recently=" + this.recently + ", unusually=" + this.unusually + Separators.RPAREN;
        }

        public BloodOxygen(long j, int i, long j2, int i2, int i3, int i4, int i5) {
            this.appTime = j;
            this.average = i;
            this.dayNo = j2;
            this.highest = i2;
            this.lowest = i3;
            this.recently = i4;
            this.unusually = i5;
        }

        public final long getAppTime() {
            return this.appTime;
        }

        public final void setAppTime(long j) {
            this.appTime = j;
        }

        public final int getAverage() {
            return this.average;
        }

        public final void setAverage(int i) {
            this.average = i;
        }

        public final long getDayNo() {
            return this.dayNo;
        }

        public final void setDayNo(long j) {
            this.dayNo = j;
        }

        public final int getHighest() {
            return this.highest;
        }

        public final void setHighest(int i) {
            this.highest = i;
        }

        public final int getLowest() {
            return this.lowest;
        }

        public final void setLowest(int i) {
            this.lowest = i;
        }

        public final int getRecently() {
            return this.recently;
        }

        public final void setRecently(int i) {
            this.recently = i;
        }

        public final int getUnusually() {
            return this.unusually;
        }

        public final void setUnusually(int i) {
            this.unusually = i;
        }
    }

    /* compiled from: HealthDataCounter.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u001e\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003J\t\u0010 \u001a\u00020\u0005HÆ\u0003J\t\u0010!\u001a\u00020\u0005HÆ\u0003JE\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u0005HÆ\u0001J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020\u0005HÖ\u0001J\t\u0010'\u001a\u00020(HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\r\"\u0004\b\u0015\u0010\u000fR\u001a\u0010\u0007\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0011\"\u0004\b\u0017\u0010\u0013R\u001a\u0010\b\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0011\"\u0004\b\u0019\u0010\u0013R\u001a\u0010\t\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0011\"\u0004\b\u001b\u0010\u0013¨\u0006)"}, d2 = {"Lcom/wakeup/module/data/entity/HealthDataCounter$Sleep;", "", "appTime", "", "awakeDuration", "", "dayNo", "deepDuration", "shallowDuration", HealthData.STATISTICS_SUM_DURATION, "<init>", "(JIJIII)V", "getAppTime", "()J", "setAppTime", "(J)V", "getAwakeDuration", "()I", "setAwakeDuration", "(I)V", "getDayNo", "setDayNo", "getDeepDuration", "setDeepDuration", "getShallowDuration", "setShallowDuration", "getSumDuration", "setSumDuration", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "", "module-data_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Sleep {
        private long appTime;
        private int awakeDuration;
        private long dayNo;
        private int deepDuration;
        private int shallowDuration;
        private int sumDuration;

        public static /* synthetic */ Sleep copy$default(Sleep sleep, long j, int i, long j2, int i2, int i3, int i4, int i5, Object obj) {
            if ((i5 & 1) != 0) {
                j = sleep.appTime;
            }
            long j3 = j;
            if ((i5 & 2) != 0) {
                i = sleep.awakeDuration;
            }
            int i6 = i;
            if ((i5 & 4) != 0) {
                j2 = sleep.dayNo;
            }
            long j4 = j2;
            if ((i5 & 8) != 0) {
                i2 = sleep.deepDuration;
            }
            return sleep.copy(j3, i6, j4, i2, (i5 & 16) != 0 ? sleep.shallowDuration : i3, (i5 & 32) != 0 ? sleep.sumDuration : i4);
        }

        /* renamed from: component1, reason: from getter */
        public final long getAppTime() {
            return this.appTime;
        }

        /* renamed from: component2, reason: from getter */
        public final int getAwakeDuration() {
            return this.awakeDuration;
        }

        /* renamed from: component3, reason: from getter */
        public final long getDayNo() {
            return this.dayNo;
        }

        /* renamed from: component4, reason: from getter */
        public final int getDeepDuration() {
            return this.deepDuration;
        }

        /* renamed from: component5, reason: from getter */
        public final int getShallowDuration() {
            return this.shallowDuration;
        }

        /* renamed from: component6, reason: from getter */
        public final int getSumDuration() {
            return this.sumDuration;
        }

        public final Sleep copy(long appTime, int awakeDuration, long dayNo, int deepDuration, int shallowDuration, int sumDuration) {
            return new Sleep(appTime, awakeDuration, dayNo, deepDuration, shallowDuration, sumDuration);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Sleep)) {
                return false;
            }
            Sleep sleep = (Sleep) other;
            return this.appTime == sleep.appTime && this.awakeDuration == sleep.awakeDuration && this.dayNo == sleep.dayNo && this.deepDuration == sleep.deepDuration && this.shallowDuration == sleep.shallowDuration && this.sumDuration == sleep.sumDuration;
        }

        public int hashCode() {
            return (((((((((Long.hashCode(this.appTime) * 31) + Integer.hashCode(this.awakeDuration)) * 31) + Long.hashCode(this.dayNo)) * 31) + Integer.hashCode(this.deepDuration)) * 31) + Integer.hashCode(this.shallowDuration)) * 31) + Integer.hashCode(this.sumDuration);
        }

        public String toString() {
            return "Sleep(appTime=" + this.appTime + ", awakeDuration=" + this.awakeDuration + ", dayNo=" + this.dayNo + ", deepDuration=" + this.deepDuration + ", shallowDuration=" + this.shallowDuration + ", sumDuration=" + this.sumDuration + Separators.RPAREN;
        }

        public Sleep(long j, int i, long j2, int i2, int i3, int i4) {
            this.appTime = j;
            this.awakeDuration = i;
            this.dayNo = j2;
            this.deepDuration = i2;
            this.shallowDuration = i3;
            this.sumDuration = i4;
        }

        public final long getAppTime() {
            return this.appTime;
        }

        public final void setAppTime(long j) {
            this.appTime = j;
        }

        public final int getAwakeDuration() {
            return this.awakeDuration;
        }

        public final void setAwakeDuration(int i) {
            this.awakeDuration = i;
        }

        public final long getDayNo() {
            return this.dayNo;
        }

        public final void setDayNo(long j) {
            this.dayNo = j;
        }

        public final int getDeepDuration() {
            return this.deepDuration;
        }

        public final void setDeepDuration(int i) {
            this.deepDuration = i;
        }

        public final int getShallowDuration() {
            return this.shallowDuration;
        }

        public final void setShallowDuration(int i) {
            this.shallowDuration = i;
        }

        public final int getSumDuration() {
            return this.sumDuration;
        }

        public final void setSumDuration(int i) {
            this.sumDuration = i;
        }
    }

    /* compiled from: HealthDataCounter.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0002\b \n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\f\u0010\rJ\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0006HÆ\u0003J\t\u0010#\u001a\u00020\bHÆ\u0003J\t\u0010$\u001a\u00020\bHÆ\u0003J\t\u0010%\u001a\u00020\bHÆ\u0003J\t\u0010&\u001a\u00020\bHÆ\u0003JO\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\bHÆ\u0001J\u0013\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010+\u001a\u00020\bHÖ\u0001J\t\u0010,\u001a\u00020-HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\t\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0018\"\u0004\b\u001a\u0010\u001bR\u001a\u0010\n\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0018\"\u0004\b\u001d\u0010\u001bR\u001a\u0010\u000b\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0018\"\u0004\b\u001f\u0010\u001b¨\u0006."}, d2 = {"Lcom/wakeup/module/data/entity/HealthDataCounter$Step;", "", "appTime", "", "dayNo", "distance", "", Constants.BundleKey.KCAL, "", "stepCount", "goalPercent", "exerciseCount", "<init>", "(JJDIIII)V", "getAppTime", "()J", "setAppTime", "(J)V", "getDayNo", "getDistance", "()D", "setDistance", "(D)V", "getKcal", "()I", "getStepCount", "setStepCount", "(I)V", "getGoalPercent", "setGoalPercent", "getExerciseCount", "setExerciseCount", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "toString", "", "module-data_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Step {
        private long appTime;
        private final long dayNo;
        private double distance;
        private int exerciseCount;
        private int goalPercent;
        private final int kcal;
        private int stepCount;

        public static /* synthetic */ Step copy$default(Step step, long j, long j2, double d, int i, int i2, int i3, int i4, int i5, Object obj) {
            if ((i5 & 1) != 0) {
                j = step.appTime;
            }
            long j3 = j;
            if ((i5 & 2) != 0) {
                j2 = step.dayNo;
            }
            return step.copy(j3, j2, (i5 & 4) != 0 ? step.distance : d, (i5 & 8) != 0 ? step.kcal : i, (i5 & 16) != 0 ? step.stepCount : i2, (i5 & 32) != 0 ? step.goalPercent : i3, (i5 & 64) != 0 ? step.exerciseCount : i4);
        }

        /* renamed from: component1, reason: from getter */
        public final long getAppTime() {
            return this.appTime;
        }

        /* renamed from: component2, reason: from getter */
        public final long getDayNo() {
            return this.dayNo;
        }

        /* renamed from: component3, reason: from getter */
        public final double getDistance() {
            return this.distance;
        }

        /* renamed from: component4, reason: from getter */
        public final int getKcal() {
            return this.kcal;
        }

        /* renamed from: component5, reason: from getter */
        public final int getStepCount() {
            return this.stepCount;
        }

        /* renamed from: component6, reason: from getter */
        public final int getGoalPercent() {
            return this.goalPercent;
        }

        /* renamed from: component7, reason: from getter */
        public final int getExerciseCount() {
            return this.exerciseCount;
        }

        public final Step copy(long appTime, long dayNo, double distance, int kcal, int stepCount, int goalPercent, int exerciseCount) {
            return new Step(appTime, dayNo, distance, kcal, stepCount, goalPercent, exerciseCount);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Step)) {
                return false;
            }
            Step step = (Step) other;
            return this.appTime == step.appTime && this.dayNo == step.dayNo && Double.compare(this.distance, step.distance) == 0 && this.kcal == step.kcal && this.stepCount == step.stepCount && this.goalPercent == step.goalPercent && this.exerciseCount == step.exerciseCount;
        }

        public int hashCode() {
            return (((((((((((Long.hashCode(this.appTime) * 31) + Long.hashCode(this.dayNo)) * 31) + Double.hashCode(this.distance)) * 31) + Integer.hashCode(this.kcal)) * 31) + Integer.hashCode(this.stepCount)) * 31) + Integer.hashCode(this.goalPercent)) * 31) + Integer.hashCode(this.exerciseCount);
        }

        public String toString() {
            return "Step(appTime=" + this.appTime + ", dayNo=" + this.dayNo + ", distance=" + this.distance + ", kcal=" + this.kcal + ", stepCount=" + this.stepCount + ", goalPercent=" + this.goalPercent + ", exerciseCount=" + this.exerciseCount + Separators.RPAREN;
        }

        public Step(long j, long j2, double d, int i, int i2, int i3, int i4) {
            this.appTime = j;
            this.dayNo = j2;
            this.distance = d;
            this.kcal = i;
            this.stepCount = i2;
            this.goalPercent = i3;
            this.exerciseCount = i4;
        }

        public final long getAppTime() {
            return this.appTime;
        }

        public final void setAppTime(long j) {
            this.appTime = j;
        }

        public final long getDayNo() {
            return this.dayNo;
        }

        public final double getDistance() {
            return this.distance;
        }

        public final void setDistance(double d) {
            this.distance = d;
        }

        public final int getKcal() {
            return this.kcal;
        }

        public final int getStepCount() {
            return this.stepCount;
        }

        public final void setStepCount(int i) {
            this.stepCount = i;
        }

        public final int getGoalPercent() {
            return this.goalPercent;
        }

        public final void setGoalPercent(int i) {
            this.goalPercent = i;
        }

        public final int getExerciseCount() {
            return this.exerciseCount;
        }

        public final void setExerciseCount(int i) {
            this.exerciseCount = i;
        }
    }

    /* compiled from: HealthDataCounter.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\"\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0005HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0005HÆ\u0003J\t\u0010#\u001a\u00020\u0005HÆ\u0003J\t\u0010$\u001a\u00020\u0005HÆ\u0003J\t\u0010%\u001a\u00020\u0005HÆ\u0003JO\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u0005HÆ\u0001J\u0013\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010*\u001a\u00020\u0005HÖ\u0001J\t\u0010+\u001a\u00020,HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u000e\"\u0004\b\u0016\u0010\u0010R\u001a\u0010\u0007\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0012\"\u0004\b\u0018\u0010\u0014R\u001a\u0010\b\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0012\"\u0004\b\u001a\u0010\u0014R\u001a\u0010\t\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0012\"\u0004\b\u001c\u0010\u0014R\u001a\u0010\n\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0012\"\u0004\b\u001e\u0010\u0014¨\u0006-"}, d2 = {"Lcom/wakeup/module/data/entity/HealthDataCounter$Stress;", "", "appTime", "", HealthData.STATISTICS_AVERAGE, "", "dayNo", "highest", "lowest", HealthData.STATISTICS_RECENTLY, "unusually", "<init>", "(JIJIIII)V", "getAppTime", "()J", "setAppTime", "(J)V", "getAverage", "()I", "setAverage", "(I)V", "getDayNo", "setDayNo", "getHighest", "setHighest", "getLowest", "setLowest", "getRecently", "setRecently", "getUnusually", "setUnusually", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "toString", "", "module-data_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Stress {
        private long appTime;
        private int average;
        private long dayNo;
        private int highest;
        private int lowest;
        private int recently;
        private int unusually;

        public static /* synthetic */ Stress copy$default(Stress stress, long j, int i, long j2, int i2, int i3, int i4, int i5, int i6, Object obj) {
            if ((i6 & 1) != 0) {
                j = stress.appTime;
            }
            long j3 = j;
            if ((i6 & 2) != 0) {
                i = stress.average;
            }
            int i7 = i;
            if ((i6 & 4) != 0) {
                j2 = stress.dayNo;
            }
            return stress.copy(j3, i7, j2, (i6 & 8) != 0 ? stress.highest : i2, (i6 & 16) != 0 ? stress.lowest : i3, (i6 & 32) != 0 ? stress.recently : i4, (i6 & 64) != 0 ? stress.unusually : i5);
        }

        /* renamed from: component1, reason: from getter */
        public final long getAppTime() {
            return this.appTime;
        }

        /* renamed from: component2, reason: from getter */
        public final int getAverage() {
            return this.average;
        }

        /* renamed from: component3, reason: from getter */
        public final long getDayNo() {
            return this.dayNo;
        }

        /* renamed from: component4, reason: from getter */
        public final int getHighest() {
            return this.highest;
        }

        /* renamed from: component5, reason: from getter */
        public final int getLowest() {
            return this.lowest;
        }

        /* renamed from: component6, reason: from getter */
        public final int getRecently() {
            return this.recently;
        }

        /* renamed from: component7, reason: from getter */
        public final int getUnusually() {
            return this.unusually;
        }

        public final Stress copy(long appTime, int average, long dayNo, int highest, int lowest, int recently, int unusually) {
            return new Stress(appTime, average, dayNo, highest, lowest, recently, unusually);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Stress)) {
                return false;
            }
            Stress stress = (Stress) other;
            return this.appTime == stress.appTime && this.average == stress.average && this.dayNo == stress.dayNo && this.highest == stress.highest && this.lowest == stress.lowest && this.recently == stress.recently && this.unusually == stress.unusually;
        }

        public int hashCode() {
            return (((((((((((Long.hashCode(this.appTime) * 31) + Integer.hashCode(this.average)) * 31) + Long.hashCode(this.dayNo)) * 31) + Integer.hashCode(this.highest)) * 31) + Integer.hashCode(this.lowest)) * 31) + Integer.hashCode(this.recently)) * 31) + Integer.hashCode(this.unusually);
        }

        public String toString() {
            return "Stress(appTime=" + this.appTime + ", average=" + this.average + ", dayNo=" + this.dayNo + ", highest=" + this.highest + ", lowest=" + this.lowest + ", recently=" + this.recently + ", unusually=" + this.unusually + Separators.RPAREN;
        }

        public Stress(long j, int i, long j2, int i2, int i3, int i4, int i5) {
            this.appTime = j;
            this.average = i;
            this.dayNo = j2;
            this.highest = i2;
            this.lowest = i3;
            this.recently = i4;
            this.unusually = i5;
        }

        public final long getAppTime() {
            return this.appTime;
        }

        public final void setAppTime(long j) {
            this.appTime = j;
        }

        public final int getAverage() {
            return this.average;
        }

        public final void setAverage(int i) {
            this.average = i;
        }

        public final long getDayNo() {
            return this.dayNo;
        }

        public final void setDayNo(long j) {
            this.dayNo = j;
        }

        public final int getHighest() {
            return this.highest;
        }

        public final void setHighest(int i) {
            this.highest = i;
        }

        public final int getLowest() {
            return this.lowest;
        }

        public final void setLowest(int i) {
            this.lowest = i;
        }

        public final int getRecently() {
            return this.recently;
        }

        public final void setRecently(int i) {
            this.recently = i;
        }

        public final int getUnusually() {
            return this.unusually;
        }

        public final void setUnusually(int i) {
            this.unusually = i;
        }
    }

    /* compiled from: HealthDataCounter.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u001f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0005HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0005HÆ\u0003J\t\u0010&\u001a\u00020\u0005HÆ\u0003J\t\u0010'\u001a\u00020\u0005HÆ\u0003J\t\u0010(\u001a\u00020\u000bHÆ\u0003JO\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010-\u001a\u00020\u000bHÖ\u0001J\t\u0010.\u001a\u00020/HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u000f\"\u0004\b\u0017\u0010\u0011R\u001a\u0010\u0007\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0013\"\u0004\b\u0019\u0010\u0015R\u001a\u0010\b\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0013\"\u0004\b\u001b\u0010\u0015R\u001a\u0010\t\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0013\"\u0004\b\u001d\u0010\u0015R\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!¨\u00060"}, d2 = {"Lcom/wakeup/module/data/entity/HealthDataCounter$Temperature;", "", "appTime", "", HealthData.STATISTICS_AVERAGE, "", "dayNo", "highest", "lowest", HealthData.STATISTICS_RECENTLY, "unusually", "", "<init>", "(JFJFFFI)V", "getAppTime", "()J", "setAppTime", "(J)V", "getAverage", "()F", "setAverage", "(F)V", "getDayNo", "setDayNo", "getHighest", "setHighest", "getLowest", "setLowest", "getRecently", "setRecently", "getUnusually", "()I", "setUnusually", "(I)V", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "toString", "", "module-data_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Temperature {
        private long appTime;
        private float average;
        private long dayNo;
        private float highest;
        private float lowest;
        private float recently;
        private int unusually;

        public static /* synthetic */ Temperature copy$default(Temperature temperature, long j, float f, long j2, float f2, float f3, float f4, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                j = temperature.appTime;
            }
            long j3 = j;
            if ((i2 & 2) != 0) {
                f = temperature.average;
            }
            float f5 = f;
            if ((i2 & 4) != 0) {
                j2 = temperature.dayNo;
            }
            return temperature.copy(j3, f5, j2, (i2 & 8) != 0 ? temperature.highest : f2, (i2 & 16) != 0 ? temperature.lowest : f3, (i2 & 32) != 0 ? temperature.recently : f4, (i2 & 64) != 0 ? temperature.unusually : i);
        }

        /* renamed from: component1, reason: from getter */
        public final long getAppTime() {
            return this.appTime;
        }

        /* renamed from: component2, reason: from getter */
        public final float getAverage() {
            return this.average;
        }

        /* renamed from: component3, reason: from getter */
        public final long getDayNo() {
            return this.dayNo;
        }

        /* renamed from: component4, reason: from getter */
        public final float getHighest() {
            return this.highest;
        }

        /* renamed from: component5, reason: from getter */
        public final float getLowest() {
            return this.lowest;
        }

        /* renamed from: component6, reason: from getter */
        public final float getRecently() {
            return this.recently;
        }

        /* renamed from: component7, reason: from getter */
        public final int getUnusually() {
            return this.unusually;
        }

        public final Temperature copy(long appTime, float average, long dayNo, float highest, float lowest, float recently, int unusually) {
            return new Temperature(appTime, average, dayNo, highest, lowest, recently, unusually);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Temperature)) {
                return false;
            }
            Temperature temperature = (Temperature) other;
            return this.appTime == temperature.appTime && Float.compare(this.average, temperature.average) == 0 && this.dayNo == temperature.dayNo && Float.compare(this.highest, temperature.highest) == 0 && Float.compare(this.lowest, temperature.lowest) == 0 && Float.compare(this.recently, temperature.recently) == 0 && this.unusually == temperature.unusually;
        }

        public int hashCode() {
            return (((((((((((Long.hashCode(this.appTime) * 31) + Float.hashCode(this.average)) * 31) + Long.hashCode(this.dayNo)) * 31) + Float.hashCode(this.highest)) * 31) + Float.hashCode(this.lowest)) * 31) + Float.hashCode(this.recently)) * 31) + Integer.hashCode(this.unusually);
        }

        public String toString() {
            return "Temperature(appTime=" + this.appTime + ", average=" + this.average + ", dayNo=" + this.dayNo + ", highest=" + this.highest + ", lowest=" + this.lowest + ", recently=" + this.recently + ", unusually=" + this.unusually + Separators.RPAREN;
        }

        public Temperature(long j, float f, long j2, float f2, float f3, float f4, int i) {
            this.appTime = j;
            this.average = f;
            this.dayNo = j2;
            this.highest = f2;
            this.lowest = f3;
            this.recently = f4;
            this.unusually = i;
        }

        public final long getAppTime() {
            return this.appTime;
        }

        public final void setAppTime(long j) {
            this.appTime = j;
        }

        public final float getAverage() {
            return this.average;
        }

        public final void setAverage(float f) {
            this.average = f;
        }

        public final long getDayNo() {
            return this.dayNo;
        }

        public final void setDayNo(long j) {
            this.dayNo = j;
        }

        public final float getHighest() {
            return this.highest;
        }

        public final void setHighest(float f) {
            this.highest = f;
        }

        public final float getLowest() {
            return this.lowest;
        }

        public final void setLowest(float f) {
            this.lowest = f;
        }

        public final float getRecently() {
            return this.recently;
        }

        public final void setRecently(float f) {
            this.recently = f;
        }

        public final int getUnusually() {
            return this.unusually;
        }

        public final void setUnusually(int i) {
            this.unusually = i;
        }
    }

    /* compiled from: HealthDataCounter.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b*\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u0005¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0005HÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0005HÆ\u0003J\t\u0010)\u001a\u00020\u0005HÆ\u0003J\t\u0010*\u001a\u00020\u0005HÆ\u0003J\t\u0010+\u001a\u00020\u0005HÆ\u0003J\t\u0010,\u001a\u00020\u0005HÆ\u0003J\t\u0010-\u001a\u00020\u0005HÆ\u0003Jc\u0010.\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u0005HÆ\u0001J\u0013\u0010/\u001a\u0002002\b\u00101\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00102\u001a\u00020\u0005HÖ\u0001J\t\u00103\u001a\u000204HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0010\"\u0004\b\u0018\u0010\u0012R\u001a\u0010\u0007\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0014\"\u0004\b\u001a\u0010\u0016R\u001a\u0010\b\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0014\"\u0004\b\u001c\u0010\u0016R\u001a\u0010\t\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0014\"\u0004\b\u001e\u0010\u0016R\u001a\u0010\n\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0014\"\u0004\b \u0010\u0016R\u001a\u0010\u000b\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0014\"\u0004\b\"\u0010\u0016R\u001a\u0010\f\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0014\"\u0004\b$\u0010\u0016¨\u00065"}, d2 = {"Lcom/wakeup/module/data/entity/HealthDataCounter$HealthCommon;", "", "appTime", "", HealthData.STATISTICS_AVERAGE, "", "dayNo", "highest", "lowest", HealthData.STATISTICS_RECENTLY, "unusually", "unusuallyHighest", "unusuallyLowest", "<init>", "(JIJIIIIII)V", "getAppTime", "()J", "setAppTime", "(J)V", "getAverage", "()I", "setAverage", "(I)V", "getDayNo", "setDayNo", "getHighest", "setHighest", "getLowest", "setLowest", "getRecently", "setRecently", "getUnusually", "setUnusually", "getUnusuallyHighest", "setUnusuallyHighest", "getUnusuallyLowest", "setUnusuallyLowest", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "", "module-data_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class HealthCommon {
        private long appTime;
        private int average;
        private long dayNo;
        private int highest;
        private int lowest;
        private int recently;
        private int unusually;
        private int unusuallyHighest;
        private int unusuallyLowest;

        public static /* synthetic */ HealthCommon copy$default(HealthCommon healthCommon, long j, int i, long j2, int i2, int i3, int i4, int i5, int i6, int i7, int i8, Object obj) {
            if ((i8 & 1) != 0) {
                j = healthCommon.appTime;
            }
            long j3 = j;
            if ((i8 & 2) != 0) {
                i = healthCommon.average;
            }
            return healthCommon.copy(j3, i, (i8 & 4) != 0 ? healthCommon.dayNo : j2, (i8 & 8) != 0 ? healthCommon.highest : i2, (i8 & 16) != 0 ? healthCommon.lowest : i3, (i8 & 32) != 0 ? healthCommon.recently : i4, (i8 & 64) != 0 ? healthCommon.unusually : i5, (i8 & 128) != 0 ? healthCommon.unusuallyHighest : i6, (i8 & 256) != 0 ? healthCommon.unusuallyLowest : i7);
        }

        /* renamed from: component1, reason: from getter */
        public final long getAppTime() {
            return this.appTime;
        }

        /* renamed from: component2, reason: from getter */
        public final int getAverage() {
            return this.average;
        }

        /* renamed from: component3, reason: from getter */
        public final long getDayNo() {
            return this.dayNo;
        }

        /* renamed from: component4, reason: from getter */
        public final int getHighest() {
            return this.highest;
        }

        /* renamed from: component5, reason: from getter */
        public final int getLowest() {
            return this.lowest;
        }

        /* renamed from: component6, reason: from getter */
        public final int getRecently() {
            return this.recently;
        }

        /* renamed from: component7, reason: from getter */
        public final int getUnusually() {
            return this.unusually;
        }

        /* renamed from: component8, reason: from getter */
        public final int getUnusuallyHighest() {
            return this.unusuallyHighest;
        }

        /* renamed from: component9, reason: from getter */
        public final int getUnusuallyLowest() {
            return this.unusuallyLowest;
        }

        public final HealthCommon copy(long appTime, int average, long dayNo, int highest, int lowest, int recently, int unusually, int unusuallyHighest, int unusuallyLowest) {
            return new HealthCommon(appTime, average, dayNo, highest, lowest, recently, unusually, unusuallyHighest, unusuallyLowest);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof HealthCommon)) {
                return false;
            }
            HealthCommon healthCommon = (HealthCommon) other;
            return this.appTime == healthCommon.appTime && this.average == healthCommon.average && this.dayNo == healthCommon.dayNo && this.highest == healthCommon.highest && this.lowest == healthCommon.lowest && this.recently == healthCommon.recently && this.unusually == healthCommon.unusually && this.unusuallyHighest == healthCommon.unusuallyHighest && this.unusuallyLowest == healthCommon.unusuallyLowest;
        }

        public int hashCode() {
            return (((((((((((((((Long.hashCode(this.appTime) * 31) + Integer.hashCode(this.average)) * 31) + Long.hashCode(this.dayNo)) * 31) + Integer.hashCode(this.highest)) * 31) + Integer.hashCode(this.lowest)) * 31) + Integer.hashCode(this.recently)) * 31) + Integer.hashCode(this.unusually)) * 31) + Integer.hashCode(this.unusuallyHighest)) * 31) + Integer.hashCode(this.unusuallyLowest);
        }

        public String toString() {
            return "HealthCommon(appTime=" + this.appTime + ", average=" + this.average + ", dayNo=" + this.dayNo + ", highest=" + this.highest + ", lowest=" + this.lowest + ", recently=" + this.recently + ", unusually=" + this.unusually + ", unusuallyHighest=" + this.unusuallyHighest + ", unusuallyLowest=" + this.unusuallyLowest + Separators.RPAREN;
        }

        public HealthCommon(long j, int i, long j2, int i2, int i3, int i4, int i5, int i6, int i7) {
            this.appTime = j;
            this.average = i;
            this.dayNo = j2;
            this.highest = i2;
            this.lowest = i3;
            this.recently = i4;
            this.unusually = i5;
            this.unusuallyHighest = i6;
            this.unusuallyLowest = i7;
        }

        public final long getAppTime() {
            return this.appTime;
        }

        public final void setAppTime(long j) {
            this.appTime = j;
        }

        public final int getAverage() {
            return this.average;
        }

        public final void setAverage(int i) {
            this.average = i;
        }

        public final long getDayNo() {
            return this.dayNo;
        }

        public final void setDayNo(long j) {
            this.dayNo = j;
        }

        public final int getHighest() {
            return this.highest;
        }

        public final void setHighest(int i) {
            this.highest = i;
        }

        public final int getLowest() {
            return this.lowest;
        }

        public final void setLowest(int i) {
            this.lowest = i;
        }

        public final int getRecently() {
            return this.recently;
        }

        public final void setRecently(int i) {
            this.recently = i;
        }

        public final int getUnusually() {
            return this.unusually;
        }

        public final void setUnusually(int i) {
            this.unusually = i;
        }

        public final int getUnusuallyHighest() {
            return this.unusuallyHighest;
        }

        public final void setUnusuallyHighest(int i) {
            this.unusuallyHighest = i;
        }

        public final int getUnusuallyLowest() {
            return this.unusuallyLowest;
        }

        public final void setUnusuallyLowest(int i) {
            this.unusuallyLowest = i;
        }
    }

    /* compiled from: HealthDataCounter.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u001f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0005HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0005HÆ\u0003J\t\u0010&\u001a\u00020\u0005HÆ\u0003J\t\u0010'\u001a\u00020\u0005HÆ\u0003J\t\u0010(\u001a\u00020\u000bHÆ\u0003JO\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010-\u001a\u00020\u000bHÖ\u0001J\t\u0010.\u001a\u00020/HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u000f\"\u0004\b\u0017\u0010\u0011R\u001a\u0010\u0007\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0013\"\u0004\b\u0019\u0010\u0015R\u001a\u0010\b\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0013\"\u0004\b\u001b\u0010\u0015R\u001a\u0010\t\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0013\"\u0004\b\u001d\u0010\u0015R\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!¨\u00060"}, d2 = {"Lcom/wakeup/module/data/entity/HealthDataCounter$HealthCommonFloat;", "", "appTime", "", HealthData.STATISTICS_AVERAGE, "", "dayNo", "highest", "lowest", HealthData.STATISTICS_RECENTLY, "unusually", "", "<init>", "(JFJFFFI)V", "getAppTime", "()J", "setAppTime", "(J)V", "getAverage", "()F", "setAverage", "(F)V", "getDayNo", "setDayNo", "getHighest", "setHighest", "getLowest", "setLowest", "getRecently", "setRecently", "getUnusually", "()I", "setUnusually", "(I)V", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "toString", "", "module-data_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class HealthCommonFloat {
        private long appTime;
        private float average;
        private long dayNo;
        private float highest;
        private float lowest;
        private float recently;
        private int unusually;

        public static /* synthetic */ HealthCommonFloat copy$default(HealthCommonFloat healthCommonFloat, long j, float f, long j2, float f2, float f3, float f4, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                j = healthCommonFloat.appTime;
            }
            long j3 = j;
            if ((i2 & 2) != 0) {
                f = healthCommonFloat.average;
            }
            float f5 = f;
            if ((i2 & 4) != 0) {
                j2 = healthCommonFloat.dayNo;
            }
            return healthCommonFloat.copy(j3, f5, j2, (i2 & 8) != 0 ? healthCommonFloat.highest : f2, (i2 & 16) != 0 ? healthCommonFloat.lowest : f3, (i2 & 32) != 0 ? healthCommonFloat.recently : f4, (i2 & 64) != 0 ? healthCommonFloat.unusually : i);
        }

        /* renamed from: component1, reason: from getter */
        public final long getAppTime() {
            return this.appTime;
        }

        /* renamed from: component2, reason: from getter */
        public final float getAverage() {
            return this.average;
        }

        /* renamed from: component3, reason: from getter */
        public final long getDayNo() {
            return this.dayNo;
        }

        /* renamed from: component4, reason: from getter */
        public final float getHighest() {
            return this.highest;
        }

        /* renamed from: component5, reason: from getter */
        public final float getLowest() {
            return this.lowest;
        }

        /* renamed from: component6, reason: from getter */
        public final float getRecently() {
            return this.recently;
        }

        /* renamed from: component7, reason: from getter */
        public final int getUnusually() {
            return this.unusually;
        }

        public final HealthCommonFloat copy(long appTime, float average, long dayNo, float highest, float lowest, float recently, int unusually) {
            return new HealthCommonFloat(appTime, average, dayNo, highest, lowest, recently, unusually);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof HealthCommonFloat)) {
                return false;
            }
            HealthCommonFloat healthCommonFloat = (HealthCommonFloat) other;
            return this.appTime == healthCommonFloat.appTime && Float.compare(this.average, healthCommonFloat.average) == 0 && this.dayNo == healthCommonFloat.dayNo && Float.compare(this.highest, healthCommonFloat.highest) == 0 && Float.compare(this.lowest, healthCommonFloat.lowest) == 0 && Float.compare(this.recently, healthCommonFloat.recently) == 0 && this.unusually == healthCommonFloat.unusually;
        }

        public int hashCode() {
            return (((((((((((Long.hashCode(this.appTime) * 31) + Float.hashCode(this.average)) * 31) + Long.hashCode(this.dayNo)) * 31) + Float.hashCode(this.highest)) * 31) + Float.hashCode(this.lowest)) * 31) + Float.hashCode(this.recently)) * 31) + Integer.hashCode(this.unusually);
        }

        public String toString() {
            return "HealthCommonFloat(appTime=" + this.appTime + ", average=" + this.average + ", dayNo=" + this.dayNo + ", highest=" + this.highest + ", lowest=" + this.lowest + ", recently=" + this.recently + ", unusually=" + this.unusually + Separators.RPAREN;
        }

        public HealthCommonFloat(long j, float f, long j2, float f2, float f3, float f4, int i) {
            this.appTime = j;
            this.average = f;
            this.dayNo = j2;
            this.highest = f2;
            this.lowest = f3;
            this.recently = f4;
            this.unusually = i;
        }

        public final long getAppTime() {
            return this.appTime;
        }

        public final void setAppTime(long j) {
            this.appTime = j;
        }

        public final float getAverage() {
            return this.average;
        }

        public final void setAverage(float f) {
            this.average = f;
        }

        public final long getDayNo() {
            return this.dayNo;
        }

        public final void setDayNo(long j) {
            this.dayNo = j;
        }

        public final float getHighest() {
            return this.highest;
        }

        public final void setHighest(float f) {
            this.highest = f;
        }

        public final float getLowest() {
            return this.lowest;
        }

        public final void setLowest(float f) {
            this.lowest = f;
        }

        public final float getRecently() {
            return this.recently;
        }

        public final void setRecently(float f) {
            this.recently = f;
        }

        public final int getUnusually() {
            return this.unusually;
        }

        public final void setUnusually(int i) {
            this.unusually = i;
        }
    }

    /* compiled from: HealthDataCounter.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b%\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\rJ\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0006HÆ\u0003J\t\u0010%\u001a\u00020\u0006HÆ\u0003J\t\u0010&\u001a\u00020\u0006HÆ\u0003J\t\u0010'\u001a\u00020\u0006HÆ\u0003J\t\u0010(\u001a\u00020\u0006HÆ\u0003J\t\u0010)\u001a\u00020\u0006HÆ\u0003JY\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\u0006HÆ\u0001J\u0013\u0010+\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010.\u001a\u00020\u0006HÖ\u0001J\t\u0010/\u001a\u000200HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000f\"\u0004\b\u0013\u0010\u0011R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0007\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0015\"\u0004\b\u0019\u0010\u0017R\u001a\u0010\b\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0015\"\u0004\b\u001b\u0010\u0017R\u001a\u0010\t\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0015\"\u0004\b\u001d\u0010\u0017R\u001a\u0010\n\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0015\"\u0004\b\u001f\u0010\u0017R\u001a\u0010\u000b\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0015\"\u0004\b!\u0010\u0017¨\u00061"}, d2 = {"Lcom/wakeup/module/data/entity/HealthDataCounter$ActiveStrength;", "", "appTime", "", "dayNo", "cyclePercent", "", "exercisePercent", "goalPercent", "intensityTimes", "runPercent", "walkPercent", "<init>", "(JJIIIIII)V", "getAppTime", "()J", "setAppTime", "(J)V", "getDayNo", "setDayNo", "getCyclePercent", "()I", "setCyclePercent", "(I)V", "getExercisePercent", "setExercisePercent", "getGoalPercent", "setGoalPercent", "getIntensityTimes", "setIntensityTimes", "getRunPercent", "setRunPercent", "getWalkPercent", "setWalkPercent", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "toString", "", "module-data_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ActiveStrength {
        private long appTime;
        private int cyclePercent;
        private long dayNo;
        private int exercisePercent;
        private int goalPercent;
        private int intensityTimes;
        private int runPercent;
        private int walkPercent;

        public static /* synthetic */ ActiveStrength copy$default(ActiveStrength activeStrength, long j, long j2, int i, int i2, int i3, int i4, int i5, int i6, int i7, Object obj) {
            if ((i7 & 1) != 0) {
                j = activeStrength.appTime;
            }
            long j3 = j;
            if ((i7 & 2) != 0) {
                j2 = activeStrength.dayNo;
            }
            return activeStrength.copy(j3, j2, (i7 & 4) != 0 ? activeStrength.cyclePercent : i, (i7 & 8) != 0 ? activeStrength.exercisePercent : i2, (i7 & 16) != 0 ? activeStrength.goalPercent : i3, (i7 & 32) != 0 ? activeStrength.intensityTimes : i4, (i7 & 64) != 0 ? activeStrength.runPercent : i5, (i7 & 128) != 0 ? activeStrength.walkPercent : i6);
        }

        /* renamed from: component1, reason: from getter */
        public final long getAppTime() {
            return this.appTime;
        }

        /* renamed from: component2, reason: from getter */
        public final long getDayNo() {
            return this.dayNo;
        }

        /* renamed from: component3, reason: from getter */
        public final int getCyclePercent() {
            return this.cyclePercent;
        }

        /* renamed from: component4, reason: from getter */
        public final int getExercisePercent() {
            return this.exercisePercent;
        }

        /* renamed from: component5, reason: from getter */
        public final int getGoalPercent() {
            return this.goalPercent;
        }

        /* renamed from: component6, reason: from getter */
        public final int getIntensityTimes() {
            return this.intensityTimes;
        }

        /* renamed from: component7, reason: from getter */
        public final int getRunPercent() {
            return this.runPercent;
        }

        /* renamed from: component8, reason: from getter */
        public final int getWalkPercent() {
            return this.walkPercent;
        }

        public final ActiveStrength copy(long appTime, long dayNo, int cyclePercent, int exercisePercent, int goalPercent, int intensityTimes, int runPercent, int walkPercent) {
            return new ActiveStrength(appTime, dayNo, cyclePercent, exercisePercent, goalPercent, intensityTimes, runPercent, walkPercent);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ActiveStrength)) {
                return false;
            }
            ActiveStrength activeStrength = (ActiveStrength) other;
            return this.appTime == activeStrength.appTime && this.dayNo == activeStrength.dayNo && this.cyclePercent == activeStrength.cyclePercent && this.exercisePercent == activeStrength.exercisePercent && this.goalPercent == activeStrength.goalPercent && this.intensityTimes == activeStrength.intensityTimes && this.runPercent == activeStrength.runPercent && this.walkPercent == activeStrength.walkPercent;
        }

        public int hashCode() {
            return (((((((((((((Long.hashCode(this.appTime) * 31) + Long.hashCode(this.dayNo)) * 31) + Integer.hashCode(this.cyclePercent)) * 31) + Integer.hashCode(this.exercisePercent)) * 31) + Integer.hashCode(this.goalPercent)) * 31) + Integer.hashCode(this.intensityTimes)) * 31) + Integer.hashCode(this.runPercent)) * 31) + Integer.hashCode(this.walkPercent);
        }

        public String toString() {
            return "ActiveStrength(appTime=" + this.appTime + ", dayNo=" + this.dayNo + ", cyclePercent=" + this.cyclePercent + ", exercisePercent=" + this.exercisePercent + ", goalPercent=" + this.goalPercent + ", intensityTimes=" + this.intensityTimes + ", runPercent=" + this.runPercent + ", walkPercent=" + this.walkPercent + Separators.RPAREN;
        }

        public ActiveStrength(long j, long j2, int i, int i2, int i3, int i4, int i5, int i6) {
            this.appTime = j;
            this.dayNo = j2;
            this.cyclePercent = i;
            this.exercisePercent = i2;
            this.goalPercent = i3;
            this.intensityTimes = i4;
            this.runPercent = i5;
            this.walkPercent = i6;
        }

        public final long getAppTime() {
            return this.appTime;
        }

        public final void setAppTime(long j) {
            this.appTime = j;
        }

        public final long getDayNo() {
            return this.dayNo;
        }

        public final void setDayNo(long j) {
            this.dayNo = j;
        }

        public final int getCyclePercent() {
            return this.cyclePercent;
        }

        public final void setCyclePercent(int i) {
            this.cyclePercent = i;
        }

        public final int getExercisePercent() {
            return this.exercisePercent;
        }

        public final void setExercisePercent(int i) {
            this.exercisePercent = i;
        }

        public final int getGoalPercent() {
            return this.goalPercent;
        }

        public final void setGoalPercent(int i) {
            this.goalPercent = i;
        }

        public final int getIntensityTimes() {
            return this.intensityTimes;
        }

        public final void setIntensityTimes(int i) {
            this.intensityTimes = i;
        }

        public final int getRunPercent() {
            return this.runPercent;
        }

        public final void setRunPercent(int i) {
            this.runPercent = i;
        }

        public final int getWalkPercent() {
            return this.walkPercent;
        }

        public final void setWalkPercent(int i) {
            this.walkPercent = i;
        }
    }

    /* compiled from: HealthDataCounter.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J1\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001f\u001a\u00020 HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000f\"\u0004\b\u0013\u0010\u0011R\u001a\u0010\u0007\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u000b\"\u0004\b\u0015\u0010\r¨\u0006!"}, d2 = {"Lcom/wakeup/module/data/entity/HealthDataCounter$ActiveTime;", "", "activeTimes", "", "appTime", "", "dayNo", "goalPercent", "<init>", "(IJJI)V", "getActiveTimes", "()I", "setActiveTimes", "(I)V", "getAppTime", "()J", "setAppTime", "(J)V", "getDayNo", "setDayNo", "getGoalPercent", "setGoalPercent", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "", "module-data_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ActiveTime {
        private int activeTimes;
        private long appTime;
        private long dayNo;
        private int goalPercent;

        public static /* synthetic */ ActiveTime copy$default(ActiveTime activeTime, int i, long j, long j2, int i2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = activeTime.activeTimes;
            }
            if ((i3 & 2) != 0) {
                j = activeTime.appTime;
            }
            if ((i3 & 4) != 0) {
                j2 = activeTime.dayNo;
            }
            if ((i3 & 8) != 0) {
                i2 = activeTime.goalPercent;
            }
            int i4 = i2;
            return activeTime.copy(i, j, j2, i4);
        }

        /* renamed from: component1, reason: from getter */
        public final int getActiveTimes() {
            return this.activeTimes;
        }

        /* renamed from: component2, reason: from getter */
        public final long getAppTime() {
            return this.appTime;
        }

        /* renamed from: component3, reason: from getter */
        public final long getDayNo() {
            return this.dayNo;
        }

        /* renamed from: component4, reason: from getter */
        public final int getGoalPercent() {
            return this.goalPercent;
        }

        public final ActiveTime copy(int activeTimes, long appTime, long dayNo, int goalPercent) {
            return new ActiveTime(activeTimes, appTime, dayNo, goalPercent);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ActiveTime)) {
                return false;
            }
            ActiveTime activeTime = (ActiveTime) other;
            return this.activeTimes == activeTime.activeTimes && this.appTime == activeTime.appTime && this.dayNo == activeTime.dayNo && this.goalPercent == activeTime.goalPercent;
        }

        public int hashCode() {
            return (((((Integer.hashCode(this.activeTimes) * 31) + Long.hashCode(this.appTime)) * 31) + Long.hashCode(this.dayNo)) * 31) + Integer.hashCode(this.goalPercent);
        }

        public String toString() {
            return "ActiveTime(activeTimes=" + this.activeTimes + ", appTime=" + this.appTime + ", dayNo=" + this.dayNo + ", goalPercent=" + this.goalPercent + Separators.RPAREN;
        }

        public ActiveTime(int i, long j, long j2, int i2) {
            this.activeTimes = i;
            this.appTime = j;
            this.dayNo = j2;
            this.goalPercent = i2;
        }

        public final int getActiveTimes() {
            return this.activeTimes;
        }

        public final void setActiveTimes(int i) {
            this.activeTimes = i;
        }

        public final long getAppTime() {
            return this.appTime;
        }

        public final void setAppTime(long j) {
            this.appTime = j;
        }

        public final long getDayNo() {
            return this.dayNo;
        }

        public final void setDayNo(long j) {
            this.dayNo = j;
        }

        public final int getGoalPercent() {
            return this.goalPercent;
        }

        public final void setGoalPercent(int i) {
            this.goalPercent = i;
        }
    }

    /* compiled from: HealthDataCounter.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b%\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\rJ\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0006HÆ\u0003J\t\u0010%\u001a\u00020\u0006HÆ\u0003J\t\u0010&\u001a\u00020\u0006HÆ\u0003J\t\u0010'\u001a\u00020\u0006HÆ\u0003J\t\u0010(\u001a\u00020\u0006HÆ\u0003J\t\u0010)\u001a\u00020\u0006HÆ\u0003JY\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\u0006HÆ\u0001J\u0013\u0010+\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010.\u001a\u00020\u0006HÖ\u0001J\t\u0010/\u001a\u000200HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000f\"\u0004\b\u0013\u0010\u0011R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0007\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0015\"\u0004\b\u0019\u0010\u0017R\u001a\u0010\b\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0015\"\u0004\b\u001b\u0010\u0017R\u001a\u0010\t\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0015\"\u0004\b\u001d\u0010\u0017R\u001a\u0010\n\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0015\"\u0004\b\u001f\u0010\u0017R\u001a\u0010\u000b\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0015\"\u0004\b!\u0010\u0017¨\u00061"}, d2 = {"Lcom/wakeup/module/data/entity/HealthDataCounter$ActiveHeat;", "", "appTime", "", "dayNo", "cyclePercent", "", "exercisePercent", "goalPercent", Constants.BundleKey.KCAL, "runPercent", "walkPercent", "<init>", "(JJIIIIII)V", "getAppTime", "()J", "setAppTime", "(J)V", "getDayNo", "setDayNo", "getCyclePercent", "()I", "setCyclePercent", "(I)V", "getExercisePercent", "setExercisePercent", "getGoalPercent", "setGoalPercent", "getKcal", "setKcal", "getRunPercent", "setRunPercent", "getWalkPercent", "setWalkPercent", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "toString", "", "module-data_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ActiveHeat {
        private long appTime;
        private int cyclePercent;
        private long dayNo;
        private int exercisePercent;
        private int goalPercent;
        private int kcal;
        private int runPercent;
        private int walkPercent;

        public static /* synthetic */ ActiveHeat copy$default(ActiveHeat activeHeat, long j, long j2, int i, int i2, int i3, int i4, int i5, int i6, int i7, Object obj) {
            if ((i7 & 1) != 0) {
                j = activeHeat.appTime;
            }
            long j3 = j;
            if ((i7 & 2) != 0) {
                j2 = activeHeat.dayNo;
            }
            return activeHeat.copy(j3, j2, (i7 & 4) != 0 ? activeHeat.cyclePercent : i, (i7 & 8) != 0 ? activeHeat.exercisePercent : i2, (i7 & 16) != 0 ? activeHeat.goalPercent : i3, (i7 & 32) != 0 ? activeHeat.kcal : i4, (i7 & 64) != 0 ? activeHeat.runPercent : i5, (i7 & 128) != 0 ? activeHeat.walkPercent : i6);
        }

        /* renamed from: component1, reason: from getter */
        public final long getAppTime() {
            return this.appTime;
        }

        /* renamed from: component2, reason: from getter */
        public final long getDayNo() {
            return this.dayNo;
        }

        /* renamed from: component3, reason: from getter */
        public final int getCyclePercent() {
            return this.cyclePercent;
        }

        /* renamed from: component4, reason: from getter */
        public final int getExercisePercent() {
            return this.exercisePercent;
        }

        /* renamed from: component5, reason: from getter */
        public final int getGoalPercent() {
            return this.goalPercent;
        }

        /* renamed from: component6, reason: from getter */
        public final int getKcal() {
            return this.kcal;
        }

        /* renamed from: component7, reason: from getter */
        public final int getRunPercent() {
            return this.runPercent;
        }

        /* renamed from: component8, reason: from getter */
        public final int getWalkPercent() {
            return this.walkPercent;
        }

        public final ActiveHeat copy(long appTime, long dayNo, int cyclePercent, int exercisePercent, int goalPercent, int kcal, int runPercent, int walkPercent) {
            return new ActiveHeat(appTime, dayNo, cyclePercent, exercisePercent, goalPercent, kcal, runPercent, walkPercent);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ActiveHeat)) {
                return false;
            }
            ActiveHeat activeHeat = (ActiveHeat) other;
            return this.appTime == activeHeat.appTime && this.dayNo == activeHeat.dayNo && this.cyclePercent == activeHeat.cyclePercent && this.exercisePercent == activeHeat.exercisePercent && this.goalPercent == activeHeat.goalPercent && this.kcal == activeHeat.kcal && this.runPercent == activeHeat.runPercent && this.walkPercent == activeHeat.walkPercent;
        }

        public int hashCode() {
            return (((((((((((((Long.hashCode(this.appTime) * 31) + Long.hashCode(this.dayNo)) * 31) + Integer.hashCode(this.cyclePercent)) * 31) + Integer.hashCode(this.exercisePercent)) * 31) + Integer.hashCode(this.goalPercent)) * 31) + Integer.hashCode(this.kcal)) * 31) + Integer.hashCode(this.runPercent)) * 31) + Integer.hashCode(this.walkPercent);
        }

        public String toString() {
            return "ActiveHeat(appTime=" + this.appTime + ", dayNo=" + this.dayNo + ", cyclePercent=" + this.cyclePercent + ", exercisePercent=" + this.exercisePercent + ", goalPercent=" + this.goalPercent + ", kcal=" + this.kcal + ", runPercent=" + this.runPercent + ", walkPercent=" + this.walkPercent + Separators.RPAREN;
        }

        public ActiveHeat(long j, long j2, int i, int i2, int i3, int i4, int i5, int i6) {
            this.appTime = j;
            this.dayNo = j2;
            this.cyclePercent = i;
            this.exercisePercent = i2;
            this.goalPercent = i3;
            this.kcal = i4;
            this.runPercent = i5;
            this.walkPercent = i6;
        }

        public final long getAppTime() {
            return this.appTime;
        }

        public final void setAppTime(long j) {
            this.appTime = j;
        }

        public final long getDayNo() {
            return this.dayNo;
        }

        public final void setDayNo(long j) {
            this.dayNo = j;
        }

        public final int getCyclePercent() {
            return this.cyclePercent;
        }

        public final void setCyclePercent(int i) {
            this.cyclePercent = i;
        }

        public final int getExercisePercent() {
            return this.exercisePercent;
        }

        public final void setExercisePercent(int i) {
            this.exercisePercent = i;
        }

        public final int getGoalPercent() {
            return this.goalPercent;
        }

        public final void setGoalPercent(int i) {
            this.goalPercent = i;
        }

        public final int getKcal() {
            return this.kcal;
        }

        public final void setKcal(int i) {
            this.kcal = i;
        }

        public final int getRunPercent() {
            return this.runPercent;
        }

        public final void setRunPercent(int i) {
            this.runPercent = i;
        }

        public final int getWalkPercent() {
            return this.walkPercent;
        }

        public final void setWalkPercent(int i) {
            this.walkPercent = i;
        }
    }

    /* compiled from: HealthDataCounter.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0006HÆ\u0003J\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0010J8\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0019J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001e\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001e\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0013\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u001f"}, d2 = {"Lcom/wakeup/module/data/entity/HealthDataCounter$UnusuallyRecord;", "", "healthType", "", "appTime", "unusually", "", "glucoseType", "<init>", "(IILjava/lang/String;Ljava/lang/Integer;)V", "getHealthType", "()I", "getAppTime", "getUnusually", "()Ljava/lang/String;", "getGlucoseType", "()Ljava/lang/Integer;", "setGlucoseType", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "component1", "component2", "component3", "component4", "copy", "(IILjava/lang/String;Ljava/lang/Integer;)Lcom/wakeup/module/data/entity/HealthDataCounter$UnusuallyRecord;", "equals", "", "other", "hashCode", "toString", "module-data_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class UnusuallyRecord {
        private final int appTime;
        private Integer glucoseType;
        private final int healthType;
        private final String unusually;

        public static /* synthetic */ UnusuallyRecord copy$default(UnusuallyRecord unusuallyRecord, int i, int i2, String str, Integer num, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = unusuallyRecord.healthType;
            }
            if ((i3 & 2) != 0) {
                i2 = unusuallyRecord.appTime;
            }
            if ((i3 & 4) != 0) {
                str = unusuallyRecord.unusually;
            }
            if ((i3 & 8) != 0) {
                num = unusuallyRecord.glucoseType;
            }
            return unusuallyRecord.copy(i, i2, str, num);
        }

        /* renamed from: component1, reason: from getter */
        public final int getHealthType() {
            return this.healthType;
        }

        /* renamed from: component2, reason: from getter */
        public final int getAppTime() {
            return this.appTime;
        }

        /* renamed from: component3, reason: from getter */
        public final String getUnusually() {
            return this.unusually;
        }

        /* renamed from: component4, reason: from getter */
        public final Integer getGlucoseType() {
            return this.glucoseType;
        }

        public final UnusuallyRecord copy(int healthType, int appTime, String unusually, Integer glucoseType) {
            Intrinsics.checkNotNullParameter(unusually, "unusually");
            return new UnusuallyRecord(healthType, appTime, unusually, glucoseType);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof UnusuallyRecord)) {
                return false;
            }
            UnusuallyRecord unusuallyRecord = (UnusuallyRecord) other;
            return this.healthType == unusuallyRecord.healthType && this.appTime == unusuallyRecord.appTime && Intrinsics.areEqual(this.unusually, unusuallyRecord.unusually) && Intrinsics.areEqual(this.glucoseType, unusuallyRecord.glucoseType);
        }

        public int hashCode() {
            int hashCode = ((((Integer.hashCode(this.healthType) * 31) + Integer.hashCode(this.appTime)) * 31) + this.unusually.hashCode()) * 31;
            Integer num = this.glucoseType;
            return hashCode + (num == null ? 0 : num.hashCode());
        }

        public String toString() {
            return "UnusuallyRecord(healthType=" + this.healthType + ", appTime=" + this.appTime + ", unusually=" + this.unusually + ", glucoseType=" + this.glucoseType + Separators.RPAREN;
        }

        public UnusuallyRecord(int i, int i2, String unusually, Integer num) {
            Intrinsics.checkNotNullParameter(unusually, "unusually");
            this.healthType = i;
            this.appTime = i2;
            this.unusually = unusually;
            this.glucoseType = num;
        }

        public final int getHealthType() {
            return this.healthType;
        }

        public final int getAppTime() {
            return this.appTime;
        }

        public final String getUnusually() {
            return this.unusually;
        }

        public /* synthetic */ UnusuallyRecord(int i, int i2, String str, Integer num, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this(i, i2, str, (i3 & 8) != 0 ? 0 : num);
        }

        public final Integer getGlucoseType() {
            return this.glucoseType;
        }

        public final void setGlucoseType(Integer num) {
            this.glucoseType = num;
        }
    }

    /* compiled from: HealthDataCounter.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0006HÆ\u0003J'\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0006HÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\n\"\u0004\b\u000e\u0010\fR\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u001d"}, d2 = {"Lcom/wakeup/module/data/entity/HealthDataCounter$SleepApnea;", "", "appTime", "", "dayNo", "unusually", "", "<init>", "(JJI)V", "getAppTime", "()J", "setAppTime", "(J)V", "getDayNo", "setDayNo", "getUnusually", "()I", "setUnusually", "(I)V", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "module-data_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SleepApnea {
        private long appTime;
        private long dayNo;
        private int unusually;

        public static /* synthetic */ SleepApnea copy$default(SleepApnea sleepApnea, long j, long j2, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                j = sleepApnea.appTime;
            }
            long j3 = j;
            if ((i2 & 2) != 0) {
                j2 = sleepApnea.dayNo;
            }
            long j4 = j2;
            if ((i2 & 4) != 0) {
                i = sleepApnea.unusually;
            }
            return sleepApnea.copy(j3, j4, i);
        }

        /* renamed from: component1, reason: from getter */
        public final long getAppTime() {
            return this.appTime;
        }

        /* renamed from: component2, reason: from getter */
        public final long getDayNo() {
            return this.dayNo;
        }

        /* renamed from: component3, reason: from getter */
        public final int getUnusually() {
            return this.unusually;
        }

        public final SleepApnea copy(long appTime, long dayNo, int unusually) {
            return new SleepApnea(appTime, dayNo, unusually);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SleepApnea)) {
                return false;
            }
            SleepApnea sleepApnea = (SleepApnea) other;
            return this.appTime == sleepApnea.appTime && this.dayNo == sleepApnea.dayNo && this.unusually == sleepApnea.unusually;
        }

        public int hashCode() {
            return (((Long.hashCode(this.appTime) * 31) + Long.hashCode(this.dayNo)) * 31) + Integer.hashCode(this.unusually);
        }

        public String toString() {
            return "SleepApnea(appTime=" + this.appTime + ", dayNo=" + this.dayNo + ", unusually=" + this.unusually + Separators.RPAREN;
        }

        public SleepApnea(long j, long j2, int i) {
            this.appTime = j;
            this.dayNo = j2;
            this.unusually = i;
        }

        public final long getAppTime() {
            return this.appTime;
        }

        public final void setAppTime(long j) {
            this.appTime = j;
        }

        public final long getDayNo() {
            return this.dayNo;
        }

        public final void setDayNo(long j) {
            this.dayNo = j;
        }

        public final int getUnusually() {
            return this.unusually;
        }

        public final void setUnusually(int i) {
            this.unusually = i;
        }
    }
}
