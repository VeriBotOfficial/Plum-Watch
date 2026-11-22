package com.wakeup.common.network.entity.friend;

import android.gov.nist.core.Separators;
import com.autonavi.aps.amapapi.config.Const;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LocationGps.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0018"}, d2 = {"Lcom/wakeup/common/network/entity/friend/LocationGps;", "", Const.JSON_KEY_ADDRESS, "", "collectionTimestamp", "", "location", "<init>", "(Ljava/lang/String;JLjava/lang/String;)V", "getAddress", "()Ljava/lang/String;", "getCollectionTimestamp", "()J", "getLocation", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class LocationGps {
    private final String address;
    private final long collectionTimestamp;
    private final String location;

    public static /* synthetic */ LocationGps copy$default(LocationGps locationGps, String str, long j, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = locationGps.address;
        }
        if ((i & 2) != 0) {
            j = locationGps.collectionTimestamp;
        }
        if ((i & 4) != 0) {
            str2 = locationGps.location;
        }
        return locationGps.copy(str, j, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getAddress() {
        return this.address;
    }

    /* renamed from: component2, reason: from getter */
    public final long getCollectionTimestamp() {
        return this.collectionTimestamp;
    }

    /* renamed from: component3, reason: from getter */
    public final String getLocation() {
        return this.location;
    }

    public final LocationGps copy(String address, long collectionTimestamp, String location) {
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(location, "location");
        return new LocationGps(address, collectionTimestamp, location);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LocationGps)) {
            return false;
        }
        LocationGps locationGps = (LocationGps) other;
        return Intrinsics.areEqual(this.address, locationGps.address) && this.collectionTimestamp == locationGps.collectionTimestamp && Intrinsics.areEqual(this.location, locationGps.location);
    }

    public int hashCode() {
        return (((this.address.hashCode() * 31) + Long.hashCode(this.collectionTimestamp)) * 31) + this.location.hashCode();
    }

    public String toString() {
        return "LocationGps(address=" + this.address + ", collectionTimestamp=" + this.collectionTimestamp + ", location=" + this.location + Separators.RPAREN;
    }

    public LocationGps(String address, long j, String location) {
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(location, "location");
        this.address = address;
        this.collectionTimestamp = j;
        this.location = location;
    }

    public final String getAddress() {
        return this.address;
    }

    public final long getCollectionTimestamp() {
        return this.collectionTimestamp;
    }

    public final String getLocation() {
        return this.location;
    }
}
