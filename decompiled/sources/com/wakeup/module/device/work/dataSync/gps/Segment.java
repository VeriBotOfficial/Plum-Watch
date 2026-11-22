package com.wakeup.module.device.work.dataSync.gps;

import android.gov.nist.core.Separators;
import kotlin.Metadata;

/* compiled from: DeviceSportRecord.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, d2 = {"Lcom/wakeup/module/device/work/dataSync/gps/Segment;", "", "time", "", "duration", "distance", "pace", "<init>", "(IIII)V", "getTime", "()I", "getDuration", "getDistance", "getPace", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "", "module-device_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class Segment {
    private final int distance;
    private final int duration;
    private final int pace;
    private final int time;

    public static /* synthetic */ Segment copy$default(Segment segment, int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = segment.time;
        }
        if ((i5 & 2) != 0) {
            i2 = segment.duration;
        }
        if ((i5 & 4) != 0) {
            i3 = segment.distance;
        }
        if ((i5 & 8) != 0) {
            i4 = segment.pace;
        }
        return segment.copy(i, i2, i3, i4);
    }

    /* renamed from: component1, reason: from getter */
    public final int getTime() {
        return this.time;
    }

    /* renamed from: component2, reason: from getter */
    public final int getDuration() {
        return this.duration;
    }

    /* renamed from: component3, reason: from getter */
    public final int getDistance() {
        return this.distance;
    }

    /* renamed from: component4, reason: from getter */
    public final int getPace() {
        return this.pace;
    }

    public final Segment copy(int time, int duration, int distance, int pace) {
        return new Segment(time, duration, distance, pace);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Segment)) {
            return false;
        }
        Segment segment = (Segment) other;
        return this.time == segment.time && this.duration == segment.duration && this.distance == segment.distance && this.pace == segment.pace;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.time) * 31) + Integer.hashCode(this.duration)) * 31) + Integer.hashCode(this.distance)) * 31) + Integer.hashCode(this.pace);
    }

    public String toString() {
        return "Segment(time=" + this.time + ", duration=" + this.duration + ", distance=" + this.distance + ", pace=" + this.pace + Separators.RPAREN;
    }

    public Segment(int i, int i2, int i3, int i4) {
        this.time = i;
        this.duration = i2;
        this.distance = i3;
        this.pace = i4;
    }

    public final int getTime() {
        return this.time;
    }

    public final int getDuration() {
        return this.duration;
    }

    public final int getDistance() {
        return this.distance;
    }

    public final int getPace() {
        return this.pace;
    }
}
