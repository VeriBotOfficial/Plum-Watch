package com.wakeup.module.device.work.dataSync.gps;

import android.gov.nist.core.Separators;
import com.umeng.analytics.AnalyticsConfig;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DeviceSportRecord.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J7\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001c"}, d2 = {"Lcom/wakeup/module/device/work/dataSync/gps/LocusRecord;", "", AnalyticsConfig.RTD_START_TIME, "", "distance", "segmentCount", "list", "", "Lcom/wakeup/module/device/work/dataSync/gps/Location;", "<init>", "(IIILjava/util/List;)V", "getStartTime", "()I", "getDistance", "getSegmentCount", "getList", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "", "module-device_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class LocusRecord {
    private final int distance;
    private final List<Location> list;
    private final int segmentCount;
    private final int startTime;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LocusRecord copy$default(LocusRecord locusRecord, int i, int i2, int i3, List list, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = locusRecord.startTime;
        }
        if ((i4 & 2) != 0) {
            i2 = locusRecord.distance;
        }
        if ((i4 & 4) != 0) {
            i3 = locusRecord.segmentCount;
        }
        if ((i4 & 8) != 0) {
            list = locusRecord.list;
        }
        return locusRecord.copy(i, i2, i3, list);
    }

    /* renamed from: component1, reason: from getter */
    public final int getStartTime() {
        return this.startTime;
    }

    /* renamed from: component2, reason: from getter */
    public final int getDistance() {
        return this.distance;
    }

    /* renamed from: component3, reason: from getter */
    public final int getSegmentCount() {
        return this.segmentCount;
    }

    public final List<Location> component4() {
        return this.list;
    }

    public final LocusRecord copy(int startTime, int distance, int segmentCount, List<Location> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        return new LocusRecord(startTime, distance, segmentCount, list);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LocusRecord)) {
            return false;
        }
        LocusRecord locusRecord = (LocusRecord) other;
        return this.startTime == locusRecord.startTime && this.distance == locusRecord.distance && this.segmentCount == locusRecord.segmentCount && Intrinsics.areEqual(this.list, locusRecord.list);
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.startTime) * 31) + Integer.hashCode(this.distance)) * 31) + Integer.hashCode(this.segmentCount)) * 31) + this.list.hashCode();
    }

    public String toString() {
        return "LocusRecord(startTime=" + this.startTime + ", distance=" + this.distance + ", segmentCount=" + this.segmentCount + ", list=" + this.list + Separators.RPAREN;
    }

    public LocusRecord(int i, int i2, int i3, List<Location> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        this.startTime = i;
        this.distance = i2;
        this.segmentCount = i3;
        this.list = list;
    }

    public final int getStartTime() {
        return this.startTime;
    }

    public final int getDistance() {
        return this.distance;
    }

    public final int getSegmentCount() {
        return this.segmentCount;
    }

    public final List<Location> getList() {
        return this.list;
    }
}
