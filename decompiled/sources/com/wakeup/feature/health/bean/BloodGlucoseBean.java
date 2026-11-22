package com.wakeup.feature.health.bean;

import android.gov.nist.core.Separators;
import kotlin.Metadata;

/* compiled from: BloodGlucoseBean.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/wakeup/feature/health/bean/BloodGlucoseBean;", "", "value", "", "timeType", "", "<init>", "(DI)V", "getValue", "()D", "getTimeType", "()I", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "feature-health_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class BloodGlucoseBean {
    public static final int $stable = 0;
    private final int timeType;
    private final double value;

    public static /* synthetic */ BloodGlucoseBean copy$default(BloodGlucoseBean bloodGlucoseBean, double d, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            d = bloodGlucoseBean.value;
        }
        if ((i2 & 2) != 0) {
            i = bloodGlucoseBean.timeType;
        }
        return bloodGlucoseBean.copy(d, i);
    }

    /* renamed from: component1, reason: from getter */
    public final double getValue() {
        return this.value;
    }

    /* renamed from: component2, reason: from getter */
    public final int getTimeType() {
        return this.timeType;
    }

    public final BloodGlucoseBean copy(double value, int timeType) {
        return new BloodGlucoseBean(value, timeType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BloodGlucoseBean)) {
            return false;
        }
        BloodGlucoseBean bloodGlucoseBean = (BloodGlucoseBean) other;
        return Double.compare(this.value, bloodGlucoseBean.value) == 0 && this.timeType == bloodGlucoseBean.timeType;
    }

    public int hashCode() {
        return (Double.hashCode(this.value) * 31) + Integer.hashCode(this.timeType);
    }

    public String toString() {
        return "BloodGlucoseBean(value=" + this.value + ", timeType=" + this.timeType + Separators.RPAREN;
    }

    public BloodGlucoseBean(double d, int i) {
        this.value = d;
        this.timeType = i;
    }

    public final double getValue() {
        return this.value;
    }

    public final int getTimeType() {
        return this.timeType;
    }
}
