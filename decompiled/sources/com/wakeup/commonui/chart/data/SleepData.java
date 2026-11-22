package com.wakeup.commonui.chart.data;

import android.gov.nist.core.Separators;
import com.umeng.analytics.AnalyticsConfig;
import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SleepData.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J-\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001b"}, d2 = {"Lcom/wakeup/commonui/chart/data/SleepData;", "Ljava/io/Serializable;", AnalyticsConfig.RTD_START_TIME, "", "endTime", "dataList", "", "Lcom/wakeup/commonui/chart/data/SleepTypeData;", "<init>", "(JJLjava/util/List;)V", "getStartTime", "()J", "getEndTime", "getDataList", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "commonui_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class SleepData implements Serializable {
    private final List<SleepTypeData> dataList;
    private final long endTime;
    private final long startTime;

    public static /* synthetic */ SleepData copy$default(SleepData sleepData, long j, long j2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            j = sleepData.startTime;
        }
        long j3 = j;
        if ((i & 2) != 0) {
            j2 = sleepData.endTime;
        }
        long j4 = j2;
        if ((i & 4) != 0) {
            list = sleepData.dataList;
        }
        return sleepData.copy(j3, j4, list);
    }

    /* renamed from: component1, reason: from getter */
    public final long getStartTime() {
        return this.startTime;
    }

    /* renamed from: component2, reason: from getter */
    public final long getEndTime() {
        return this.endTime;
    }

    public final List<SleepTypeData> component3() {
        return this.dataList;
    }

    public final SleepData copy(long startTime, long endTime, List<SleepTypeData> dataList) {
        Intrinsics.checkNotNullParameter(dataList, "dataList");
        return new SleepData(startTime, endTime, dataList);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SleepData)) {
            return false;
        }
        SleepData sleepData = (SleepData) other;
        return this.startTime == sleepData.startTime && this.endTime == sleepData.endTime && Intrinsics.areEqual(this.dataList, sleepData.dataList);
    }

    public int hashCode() {
        return (((Long.hashCode(this.startTime) * 31) + Long.hashCode(this.endTime)) * 31) + this.dataList.hashCode();
    }

    public String toString() {
        return "SleepData(startTime=" + this.startTime + ", endTime=" + this.endTime + ", dataList=" + this.dataList + Separators.RPAREN;
    }

    public SleepData(long j, long j2, List<SleepTypeData> dataList) {
        Intrinsics.checkNotNullParameter(dataList, "dataList");
        this.startTime = j;
        this.endTime = j2;
        this.dataList = dataList;
    }

    public final long getStartTime() {
        return this.startTime;
    }

    public final long getEndTime() {
        return this.endTime;
    }

    public final List<SleepTypeData> getDataList() {
        return this.dataList;
    }
}
