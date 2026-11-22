package com.wakeup.common.network.entity.map;

import android.gov.nist.core.Separators;
import com.autonavi.aps.amapapi.config.Const;
import com.wakeup.common.burypoint.BuryPointPageId;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: BaiMapSearchBean.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u00002\u00020\u0001:\u0001\u0017B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0016\u001a\u00020\u0005H\u0016R\u0014\u0010\u0004\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0007R\u0014\u0010\u000e\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0007R\u0014\u0010\u0010\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0007R\u0014\u0010\u0012\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0007R\u0014\u0010\u0014\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0007¨\u0006\u0018"}, d2 = {"Lcom/wakeup/common/network/entity/map/BaiMapSearchBean;", "", "<init>", "()V", "name", "", "getName", "()Ljava/lang/String;", "location", "Lcom/wakeup/common/network/entity/map/BaiMapSearchBean$MapLocation;", "getLocation", "()Lcom/wakeup/common/network/entity/map/BaiMapSearchBean$MapLocation;", Const.JSON_KEY_ADDRESS, "getAddress", "telephone", "getTelephone", "uid", "getUid", "street_id", "getStreet_id", BuryPointPageId.PAGE_ID_PLAN_DETAIL, "getDetail", "toString", "MapLocation", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class BaiMapSearchBean {
    private final MapLocation location;
    private final String name = "";
    private final String address = "";
    private final String telephone = "";
    private final String uid = "";
    private final String street_id = "";
    private final String detail = "";

    public final String getName() {
        return this.name;
    }

    public final MapLocation getLocation() {
        return this.location;
    }

    public final String getAddress() {
        return this.address;
    }

    public final String getTelephone() {
        return this.telephone;
    }

    public final String getUid() {
        return this.uid;
    }

    public final String getStreet_id() {
        return this.street_id;
    }

    public final String getDetail() {
        return this.detail;
    }

    /* compiled from: BaiMapSearchBean.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/wakeup/common/network/entity/map/BaiMapSearchBean$MapLocation;", "", "lat", "", "lng", "<init>", "(DD)V", "getLat", "()D", "getLng", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class MapLocation {
        private final double lat;
        private final double lng;

        public MapLocation() {
            this(0.0d, 0.0d, 3, null);
        }

        public static /* synthetic */ MapLocation copy$default(MapLocation mapLocation, double d, double d2, int i, Object obj) {
            if ((i & 1) != 0) {
                d = mapLocation.lat;
            }
            if ((i & 2) != 0) {
                d2 = mapLocation.lng;
            }
            return mapLocation.copy(d, d2);
        }

        /* renamed from: component1, reason: from getter */
        public final double getLat() {
            return this.lat;
        }

        /* renamed from: component2, reason: from getter */
        public final double getLng() {
            return this.lng;
        }

        public final MapLocation copy(double lat, double lng) {
            return new MapLocation(lat, lng);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MapLocation)) {
                return false;
            }
            MapLocation mapLocation = (MapLocation) other;
            return Double.compare(this.lat, mapLocation.lat) == 0 && Double.compare(this.lng, mapLocation.lng) == 0;
        }

        public int hashCode() {
            return (Double.hashCode(this.lat) * 31) + Double.hashCode(this.lng);
        }

        public String toString() {
            return "MapLocation(lat=" + this.lat + ", lng=" + this.lng + Separators.RPAREN;
        }

        public MapLocation(double d, double d2) {
            this.lat = d;
            this.lng = d2;
        }

        public /* synthetic */ MapLocation(double d, double d2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? 0.0d : d, (i & 2) != 0 ? 0.0d : d2);
        }

        public final double getLat() {
            return this.lat;
        }

        public final double getLng() {
            return this.lng;
        }
    }

    public String toString() {
        return "BaiMapSearchBean(name='" + this.name + "', location=" + this.location + ", address='" + this.address + "', telephone='" + this.telephone + "', uid='" + this.uid + "', street_id='" + this.street_id + "', detail='" + this.detail + "')";
    }
}
