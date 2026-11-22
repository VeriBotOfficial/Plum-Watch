package com.wakeup.feature.health.bloodGlucose.diabetes;

import android.gov.nist.core.Separators;
import com.wakeup.commponent.module.data.HealthData;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DiabetesFormData.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003JE\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006 "}, d2 = {"Lcom/wakeup/feature/health/bloodGlucose/diabetes/DiabetesFormPrefill;", "Ljava/io/Serializable;", "periodLabel", "", "selectedGlucose", "selectedTimeType", "rangeMin", "rangeMax", HealthData.STATISTICS_AVERAGE, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getPeriodLabel", "()Ljava/lang/String;", "getSelectedGlucose", "getSelectedTimeType", "getRangeMin", "getRangeMax", "getAverage", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-health_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class DiabetesFormPrefill implements Serializable {
    public static final int $stable = 0;
    private final String average;
    private final String periodLabel;
    private final String rangeMax;
    private final String rangeMin;
    private final String selectedGlucose;
    private final String selectedTimeType;

    public DiabetesFormPrefill() {
        this(null, null, null, null, null, null, 63, null);
    }

    public static /* synthetic */ DiabetesFormPrefill copy$default(DiabetesFormPrefill diabetesFormPrefill, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = diabetesFormPrefill.periodLabel;
        }
        if ((i & 2) != 0) {
            str2 = diabetesFormPrefill.selectedGlucose;
        }
        if ((i & 4) != 0) {
            str3 = diabetesFormPrefill.selectedTimeType;
        }
        if ((i & 8) != 0) {
            str4 = diabetesFormPrefill.rangeMin;
        }
        if ((i & 16) != 0) {
            str5 = diabetesFormPrefill.rangeMax;
        }
        if ((i & 32) != 0) {
            str6 = diabetesFormPrefill.average;
        }
        String str7 = str5;
        String str8 = str6;
        return diabetesFormPrefill.copy(str, str2, str3, str4, str7, str8);
    }

    /* renamed from: component1, reason: from getter */
    public final String getPeriodLabel() {
        return this.periodLabel;
    }

    /* renamed from: component2, reason: from getter */
    public final String getSelectedGlucose() {
        return this.selectedGlucose;
    }

    /* renamed from: component3, reason: from getter */
    public final String getSelectedTimeType() {
        return this.selectedTimeType;
    }

    /* renamed from: component4, reason: from getter */
    public final String getRangeMin() {
        return this.rangeMin;
    }

    /* renamed from: component5, reason: from getter */
    public final String getRangeMax() {
        return this.rangeMax;
    }

    /* renamed from: component6, reason: from getter */
    public final String getAverage() {
        return this.average;
    }

    public final DiabetesFormPrefill copy(String periodLabel, String selectedGlucose, String selectedTimeType, String rangeMin, String rangeMax, String average) {
        Intrinsics.checkNotNullParameter(periodLabel, "periodLabel");
        Intrinsics.checkNotNullParameter(selectedGlucose, "selectedGlucose");
        Intrinsics.checkNotNullParameter(selectedTimeType, "selectedTimeType");
        Intrinsics.checkNotNullParameter(rangeMin, "rangeMin");
        Intrinsics.checkNotNullParameter(rangeMax, "rangeMax");
        Intrinsics.checkNotNullParameter(average, "average");
        return new DiabetesFormPrefill(periodLabel, selectedGlucose, selectedTimeType, rangeMin, rangeMax, average);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DiabetesFormPrefill)) {
            return false;
        }
        DiabetesFormPrefill diabetesFormPrefill = (DiabetesFormPrefill) other;
        return Intrinsics.areEqual(this.periodLabel, diabetesFormPrefill.periodLabel) && Intrinsics.areEqual(this.selectedGlucose, diabetesFormPrefill.selectedGlucose) && Intrinsics.areEqual(this.selectedTimeType, diabetesFormPrefill.selectedTimeType) && Intrinsics.areEqual(this.rangeMin, diabetesFormPrefill.rangeMin) && Intrinsics.areEqual(this.rangeMax, diabetesFormPrefill.rangeMax) && Intrinsics.areEqual(this.average, diabetesFormPrefill.average);
    }

    public int hashCode() {
        return (((((((((this.periodLabel.hashCode() * 31) + this.selectedGlucose.hashCode()) * 31) + this.selectedTimeType.hashCode()) * 31) + this.rangeMin.hashCode()) * 31) + this.rangeMax.hashCode()) * 31) + this.average.hashCode();
    }

    public String toString() {
        return "DiabetesFormPrefill(periodLabel=" + this.periodLabel + ", selectedGlucose=" + this.selectedGlucose + ", selectedTimeType=" + this.selectedTimeType + ", rangeMin=" + this.rangeMin + ", rangeMax=" + this.rangeMax + ", average=" + this.average + Separators.RPAREN;
    }

    public DiabetesFormPrefill(String periodLabel, String selectedGlucose, String selectedTimeType, String rangeMin, String rangeMax, String average) {
        Intrinsics.checkNotNullParameter(periodLabel, "periodLabel");
        Intrinsics.checkNotNullParameter(selectedGlucose, "selectedGlucose");
        Intrinsics.checkNotNullParameter(selectedTimeType, "selectedTimeType");
        Intrinsics.checkNotNullParameter(rangeMin, "rangeMin");
        Intrinsics.checkNotNullParameter(rangeMax, "rangeMax");
        Intrinsics.checkNotNullParameter(average, "average");
        this.periodLabel = periodLabel;
        this.selectedGlucose = selectedGlucose;
        this.selectedTimeType = selectedTimeType;
        this.rangeMin = rangeMin;
        this.rangeMax = rangeMax;
        this.average = average;
    }

    public /* synthetic */ DiabetesFormPrefill(String str, String str2, String str3, String str4, String str5, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6);
    }

    public final String getPeriodLabel() {
        return this.periodLabel;
    }

    public final String getSelectedGlucose() {
        return this.selectedGlucose;
    }

    public final String getSelectedTimeType() {
        return this.selectedTimeType;
    }

    public final String getRangeMin() {
        return this.rangeMin;
    }

    public final String getRangeMax() {
        return this.rangeMax;
    }

    public final String getAverage() {
        return this.average;
    }
}
