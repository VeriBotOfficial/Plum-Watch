package com.wakeup.module.device.work.dataSync.gps;

import android.gov.nist.core.Separators;
import com.umeng.analytics.AnalyticsConfig;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DeviceSportRecord.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003JA\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001f"}, d2 = {"Lcom/wakeup/module/device/work/dataSync/gps/PaceRecord;", "", AnalyticsConfig.RTD_START_TIME, "", "maxPace", "minPace", "avgPace", "list", "", "Lcom/wakeup/module/device/work/dataSync/gps/Pace;", "<init>", "(IIIILjava/util/List;)V", "getStartTime", "()I", "getMaxPace", "getMinPace", "getAvgPace", "getList", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "", "module-device_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class PaceRecord {
    private final int avgPace;
    private final List<Pace> list;
    private final int maxPace;
    private final int minPace;
    private final int startTime;

    public static /* synthetic */ PaceRecord copy$default(PaceRecord paceRecord, int i, int i2, int i3, int i4, List list, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = paceRecord.startTime;
        }
        if ((i5 & 2) != 0) {
            i2 = paceRecord.maxPace;
        }
        if ((i5 & 4) != 0) {
            i3 = paceRecord.minPace;
        }
        if ((i5 & 8) != 0) {
            i4 = paceRecord.avgPace;
        }
        if ((i5 & 16) != 0) {
            list = paceRecord.list;
        }
        List list2 = list;
        int i6 = i3;
        return paceRecord.copy(i, i2, i6, i4, list2);
    }

    /* renamed from: component1, reason: from getter */
    public final int getStartTime() {
        return this.startTime;
    }

    /* renamed from: component2, reason: from getter */
    public final int getMaxPace() {
        return this.maxPace;
    }

    /* renamed from: component3, reason: from getter */
    public final int getMinPace() {
        return this.minPace;
    }

    /* renamed from: component4, reason: from getter */
    public final int getAvgPace() {
        return this.avgPace;
    }

    public final List<Pace> component5() {
        return this.list;
    }

    public final PaceRecord copy(int startTime, int maxPace, int minPace, int avgPace, List<Pace> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        return new PaceRecord(startTime, maxPace, minPace, avgPace, list);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PaceRecord)) {
            return false;
        }
        PaceRecord paceRecord = (PaceRecord) other;
        return this.startTime == paceRecord.startTime && this.maxPace == paceRecord.maxPace && this.minPace == paceRecord.minPace && this.avgPace == paceRecord.avgPace && Intrinsics.areEqual(this.list, paceRecord.list);
    }

    public int hashCode() {
        return (((((((Integer.hashCode(this.startTime) * 31) + Integer.hashCode(this.maxPace)) * 31) + Integer.hashCode(this.minPace)) * 31) + Integer.hashCode(this.avgPace)) * 31) + this.list.hashCode();
    }

    public String toString() {
        return "PaceRecord(startTime=" + this.startTime + ", maxPace=" + this.maxPace + ", minPace=" + this.minPace + ", avgPace=" + this.avgPace + ", list=" + this.list + Separators.RPAREN;
    }

    public PaceRecord(int i, int i2, int i3, int i4, List<Pace> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        this.startTime = i;
        this.maxPace = i2;
        this.minPace = i3;
        this.avgPace = i4;
        this.list = list;
    }

    public final int getStartTime() {
        return this.startTime;
    }

    public final int getMaxPace() {
        return this.maxPace;
    }

    public final int getMinPace() {
        return this.minPace;
    }

    public final int getAvgPace() {
        return this.avgPace;
    }

    public final List<Pace> getList() {
        return this.list;
    }
}
