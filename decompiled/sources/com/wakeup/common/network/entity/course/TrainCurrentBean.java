package com.wakeup.common.network.entity.course;

import android.gov.nist.core.Separators;
import com.wakeup.common.Constants;
import kotlin.Metadata;

/* compiled from: TrainCurrentBean.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\t\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0007HÆ\u0003J'\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006 "}, d2 = {"Lcom/wakeup/common/network/entity/course/TrainCurrentBean;", "", "totalDuration", "", "calorie", "", Constants.BundleKey.TIMESTAMP, "", "<init>", "(IDJ)V", "getTotalDuration", "()I", "setTotalDuration", "(I)V", "getCalorie", "()D", "setCalorie", "(D)V", "getTimeStamp", "()J", "setTimeStamp", "(J)V", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class TrainCurrentBean {
    private double calorie;
    private long timeStamp;
    private int totalDuration;

    public static /* synthetic */ TrainCurrentBean copy$default(TrainCurrentBean trainCurrentBean, int i, double d, long j, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = trainCurrentBean.totalDuration;
        }
        if ((i2 & 2) != 0) {
            d = trainCurrentBean.calorie;
        }
        if ((i2 & 4) != 0) {
            j = trainCurrentBean.timeStamp;
        }
        return trainCurrentBean.copy(i, d, j);
    }

    /* renamed from: component1, reason: from getter */
    public final int getTotalDuration() {
        return this.totalDuration;
    }

    /* renamed from: component2, reason: from getter */
    public final double getCalorie() {
        return this.calorie;
    }

    /* renamed from: component3, reason: from getter */
    public final long getTimeStamp() {
        return this.timeStamp;
    }

    public final TrainCurrentBean copy(int totalDuration, double calorie, long timeStamp) {
        return new TrainCurrentBean(totalDuration, calorie, timeStamp);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TrainCurrentBean)) {
            return false;
        }
        TrainCurrentBean trainCurrentBean = (TrainCurrentBean) other;
        return this.totalDuration == trainCurrentBean.totalDuration && Double.compare(this.calorie, trainCurrentBean.calorie) == 0 && this.timeStamp == trainCurrentBean.timeStamp;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.totalDuration) * 31) + Double.hashCode(this.calorie)) * 31) + Long.hashCode(this.timeStamp);
    }

    public String toString() {
        return "TrainCurrentBean(totalDuration=" + this.totalDuration + ", calorie=" + this.calorie + ", timeStamp=" + this.timeStamp + Separators.RPAREN;
    }

    public TrainCurrentBean(int i, double d, long j) {
        this.totalDuration = i;
        this.calorie = d;
        this.timeStamp = j;
    }

    public final int getTotalDuration() {
        return this.totalDuration;
    }

    public final void setTotalDuration(int i) {
        this.totalDuration = i;
    }

    public final double getCalorie() {
        return this.calorie;
    }

    public final void setCalorie(double d) {
        this.calorie = d;
    }

    public final long getTimeStamp() {
        return this.timeStamp;
    }

    public final void setTimeStamp(long j) {
        this.timeStamp = j;
    }
}
