package com.wakeup.common.network.entity.gift;

import android.gov.nist.core.Separators;
import kotlin.Metadata;

/* compiled from: GiftModels.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0006\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0019"}, d2 = {"Lcom/wakeup/common/network/entity/gift/CheckinRequest;", "", "point_id", "", "latitude", "", "longitude", "<init>", "(JDD)V", "getPoint_id", "()J", "getLatitude", "()D", "getLongitude", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class CheckinRequest {
    private final double latitude;
    private final double longitude;
    private final long point_id;

    public static /* synthetic */ CheckinRequest copy$default(CheckinRequest checkinRequest, long j, double d, double d2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = checkinRequest.point_id;
        }
        long j2 = j;
        if ((i & 2) != 0) {
            d = checkinRequest.latitude;
        }
        double d3 = d;
        if ((i & 4) != 0) {
            d2 = checkinRequest.longitude;
        }
        return checkinRequest.copy(j2, d3, d2);
    }

    /* renamed from: component1, reason: from getter */
    public final long getPoint_id() {
        return this.point_id;
    }

    /* renamed from: component2, reason: from getter */
    public final double getLatitude() {
        return this.latitude;
    }

    /* renamed from: component3, reason: from getter */
    public final double getLongitude() {
        return this.longitude;
    }

    public final CheckinRequest copy(long point_id, double latitude, double longitude) {
        return new CheckinRequest(point_id, latitude, longitude);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CheckinRequest)) {
            return false;
        }
        CheckinRequest checkinRequest = (CheckinRequest) other;
        return this.point_id == checkinRequest.point_id && Double.compare(this.latitude, checkinRequest.latitude) == 0 && Double.compare(this.longitude, checkinRequest.longitude) == 0;
    }

    public int hashCode() {
        return (((Long.hashCode(this.point_id) * 31) + Double.hashCode(this.latitude)) * 31) + Double.hashCode(this.longitude);
    }

    public String toString() {
        return "CheckinRequest(point_id=" + this.point_id + ", latitude=" + this.latitude + ", longitude=" + this.longitude + Separators.RPAREN;
    }

    public CheckinRequest(long j, double d, double d2) {
        this.point_id = j;
        this.latitude = d;
        this.longitude = d2;
    }

    public final long getPoint_id() {
        return this.point_id;
    }

    public final double getLatitude() {
        return this.latitude;
    }

    public final double getLongitude() {
        return this.longitude;
    }
}
