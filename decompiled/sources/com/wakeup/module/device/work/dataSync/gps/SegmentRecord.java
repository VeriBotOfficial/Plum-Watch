package com.wakeup.module.device.work.dataSync.gps;

import android.gov.nist.core.Separators;
import com.umeng.analytics.AnalyticsConfig;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DeviceSportRecord.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lcom/wakeup/module/device/work/dataSync/gps/SegmentRecord;", "", AnalyticsConfig.RTD_START_TIME, "", "list", "", "Lcom/wakeup/module/device/work/dataSync/gps/Segment;", "<init>", "(ILjava/util/List;)V", "getStartTime", "()I", "getList", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "module-device_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class SegmentRecord {
    private final List<Segment> list;
    private final int startTime;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SegmentRecord copy$default(SegmentRecord segmentRecord, int i, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = segmentRecord.startTime;
        }
        if ((i2 & 2) != 0) {
            list = segmentRecord.list;
        }
        return segmentRecord.copy(i, list);
    }

    /* renamed from: component1, reason: from getter */
    public final int getStartTime() {
        return this.startTime;
    }

    public final List<Segment> component2() {
        return this.list;
    }

    public final SegmentRecord copy(int startTime, List<Segment> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        return new SegmentRecord(startTime, list);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SegmentRecord)) {
            return false;
        }
        SegmentRecord segmentRecord = (SegmentRecord) other;
        return this.startTime == segmentRecord.startTime && Intrinsics.areEqual(this.list, segmentRecord.list);
    }

    public int hashCode() {
        return (Integer.hashCode(this.startTime) * 31) + this.list.hashCode();
    }

    public String toString() {
        return "SegmentRecord(startTime=" + this.startTime + ", list=" + this.list + Separators.RPAREN;
    }

    public SegmentRecord(int i, List<Segment> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        this.startTime = i;
        this.list = list;
    }

    public final int getStartTime() {
        return this.startTime;
    }

    public final List<Segment> getList() {
        return this.list;
    }
}
