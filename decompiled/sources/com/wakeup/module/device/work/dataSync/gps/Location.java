package com.wakeup.module.device.work.dataSync.gps;

import android.gov.nist.core.Separators;
import kotlin.Metadata;

/* compiled from: DeviceSportRecord.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0006HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000e¨\u0006\u001b"}, d2 = {"Lcom/wakeup/module/device/work/dataSync/gps/Location;", "", "time", "", "segmentIndex", "lon", "", "lat", "<init>", "(IIDD)V", "getTime", "()I", "getSegmentIndex", "getLon", "()D", "getLat", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "", "module-device_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class Location {
    private final double lat;
    private final double lon;
    private final int segmentIndex;
    private final int time;

    public static /* synthetic */ Location copy$default(Location location, int i, int i2, double d, double d2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = location.time;
        }
        if ((i3 & 2) != 0) {
            i2 = location.segmentIndex;
        }
        if ((i3 & 4) != 0) {
            d = location.lon;
        }
        if ((i3 & 8) != 0) {
            d2 = location.lat;
        }
        double d3 = d2;
        return location.copy(i, i2, d, d3);
    }

    /* renamed from: component1, reason: from getter */
    public final int getTime() {
        return this.time;
    }

    /* renamed from: component2, reason: from getter */
    public final int getSegmentIndex() {
        return this.segmentIndex;
    }

    /* renamed from: component3, reason: from getter */
    public final double getLon() {
        return this.lon;
    }

    /* renamed from: component4, reason: from getter */
    public final double getLat() {
        return this.lat;
    }

    public final Location copy(int time, int segmentIndex, double lon, double lat) {
        return new Location(time, segmentIndex, lon, lat);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Location)) {
            return false;
        }
        Location location = (Location) other;
        return this.time == location.time && this.segmentIndex == location.segmentIndex && Double.compare(this.lon, location.lon) == 0 && Double.compare(this.lat, location.lat) == 0;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.time) * 31) + Integer.hashCode(this.segmentIndex)) * 31) + Double.hashCode(this.lon)) * 31) + Double.hashCode(this.lat);
    }

    public String toString() {
        return "Location(time=" + this.time + ", segmentIndex=" + this.segmentIndex + ", lon=" + this.lon + ", lat=" + this.lat + Separators.RPAREN;
    }

    public Location(int i, int i2, double d, double d2) {
        this.time = i;
        this.segmentIndex = i2;
        this.lon = d;
        this.lat = d2;
    }

    public final int getTime() {
        return this.time;
    }

    public final int getSegmentIndex() {
        return this.segmentIndex;
    }

    public final double getLon() {
        return this.lon;
    }

    public final double getLat() {
        return this.lat;
    }
}
