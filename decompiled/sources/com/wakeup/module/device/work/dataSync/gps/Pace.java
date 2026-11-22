package com.wakeup.module.device.work.dataSync.gps;

import android.gov.nist.core.Separators;
import kotlin.Metadata;

/* compiled from: DeviceSportRecord.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/wakeup/module/device/work/dataSync/gps/Pace;", "", "time", "", "distance", "pace", "<init>", "(III)V", "getTime", "()I", "getDistance", "getPace", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "module-device_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class Pace {
    private final int distance;
    private final int pace;
    private final int time;

    public static /* synthetic */ Pace copy$default(Pace pace, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = pace.time;
        }
        if ((i4 & 2) != 0) {
            i2 = pace.distance;
        }
        if ((i4 & 4) != 0) {
            i3 = pace.pace;
        }
        return pace.copy(i, i2, i3);
    }

    /* renamed from: component1, reason: from getter */
    public final int getTime() {
        return this.time;
    }

    /* renamed from: component2, reason: from getter */
    public final int getDistance() {
        return this.distance;
    }

    /* renamed from: component3, reason: from getter */
    public final int getPace() {
        return this.pace;
    }

    public final Pace copy(int time, int distance, int pace) {
        return new Pace(time, distance, pace);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Pace)) {
            return false;
        }
        Pace pace = (Pace) other;
        return this.time == pace.time && this.distance == pace.distance && this.pace == pace.pace;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.time) * 31) + Integer.hashCode(this.distance)) * 31) + Integer.hashCode(this.pace);
    }

    public String toString() {
        return "Pace(time=" + this.time + ", distance=" + this.distance + ", pace=" + this.pace + Separators.RPAREN;
    }

    public Pace(int i, int i2, int i3) {
        this.time = i;
        this.distance = i2;
        this.pace = i3;
    }

    public final int getTime() {
        return this.time;
    }

    public final int getDistance() {
        return this.distance;
    }

    public final int getPace() {
        return this.pace;
    }
}
