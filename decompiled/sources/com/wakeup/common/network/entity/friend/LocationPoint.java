package com.wakeup.common.network.entity.friend;

import android.gov.nist.core.Separators;
import com.autonavi.aps.amapapi.config.Const;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LocationPoint.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u0006\u0010\u0019\u001a\u00020\u001aJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001e\u001a\u00020\bHÆ\u0003J1\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010 \u001a\u00020\u001a2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\t\u0010$\u001a\u00020\u0006HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\f\"\u0004\b\u0010\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006%"}, d2 = {"Lcom/wakeup/common/network/entity/friend/LocationPoint;", "", "lonData", "", "latData", Const.JSON_KEY_ADDRESS, "", "time", "", "<init>", "(DDLjava/lang/String;J)V", "getLonData", "()D", "setLonData", "(D)V", "getLatData", "setLatData", "getAddress", "()Ljava/lang/String;", "setAddress", "(Ljava/lang/String;)V", "getTime", "()J", "setTime", "(J)V", "isEmpty", "", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class LocationPoint {
    private String address;
    private double latData;
    private double lonData;
    private long time;

    public static /* synthetic */ LocationPoint copy$default(LocationPoint locationPoint, double d, double d2, String str, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            d = locationPoint.lonData;
        }
        double d3 = d;
        if ((i & 2) != 0) {
            d2 = locationPoint.latData;
        }
        double d4 = d2;
        if ((i & 4) != 0) {
            str = locationPoint.address;
        }
        String str2 = str;
        if ((i & 8) != 0) {
            j = locationPoint.time;
        }
        return locationPoint.copy(d3, d4, str2, j);
    }

    /* renamed from: component1, reason: from getter */
    public final double getLonData() {
        return this.lonData;
    }

    /* renamed from: component2, reason: from getter */
    public final double getLatData() {
        return this.latData;
    }

    /* renamed from: component3, reason: from getter */
    public final String getAddress() {
        return this.address;
    }

    /* renamed from: component4, reason: from getter */
    public final long getTime() {
        return this.time;
    }

    public final LocationPoint copy(double lonData, double latData, String address, long time) {
        Intrinsics.checkNotNullParameter(address, "address");
        return new LocationPoint(lonData, latData, address, time);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LocationPoint)) {
            return false;
        }
        LocationPoint locationPoint = (LocationPoint) other;
        return Double.compare(this.lonData, locationPoint.lonData) == 0 && Double.compare(this.latData, locationPoint.latData) == 0 && Intrinsics.areEqual(this.address, locationPoint.address) && this.time == locationPoint.time;
    }

    public int hashCode() {
        return (((((Double.hashCode(this.lonData) * 31) + Double.hashCode(this.latData)) * 31) + this.address.hashCode()) * 31) + Long.hashCode(this.time);
    }

    public String toString() {
        return "LocationPoint(lonData=" + this.lonData + ", latData=" + this.latData + ", address=" + this.address + ", time=" + this.time + Separators.RPAREN;
    }

    public LocationPoint(double d, double d2, String address, long j) {
        Intrinsics.checkNotNullParameter(address, "address");
        this.lonData = d;
        this.latData = d2;
        this.address = address;
        this.time = j;
    }

    public final double getLonData() {
        return this.lonData;
    }

    public final void setLonData(double d) {
        this.lonData = d;
    }

    public final double getLatData() {
        return this.latData;
    }

    public final void setLatData(double d) {
        this.latData = d;
    }

    public final String getAddress() {
        return this.address;
    }

    public final void setAddress(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.address = str;
    }

    public final long getTime() {
        return this.time;
    }

    public final void setTime(long j) {
        this.time = j;
    }

    public final boolean isEmpty() {
        return this.lonData == 0.0d || this.latData == 0.0d;
    }
}
