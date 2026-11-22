package com.amap.api.services.route;

import android.os.Parcel;
import android.os.Parcelable;
import com.amap.api.services.busline.BusLineItem;
import com.amap.api.services.busline.BusStationItem;
import com.amap.api.services.core.LatLonPoint;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes11.dex */
public class RouteBusLineItem extends BusLineItem implements Parcelable {
    public static final Parcelable.Creator<RouteBusLineItem> CREATOR = new a();
    private BusStationItem p;

    /* renamed from: q, reason: collision with root package name */
    private BusStationItem f2173q;
    private List<LatLonPoint> r;
    private int s;
    private List<BusStationItem> t;
    private float u;

    static class a implements Parcelable.Creator<RouteBusLineItem> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        public RouteBusLineItem createFromParcel(Parcel parcel) {
            return new RouteBusLineItem(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ RouteBusLineItem[] newArray(int i) {
            return null;
        }
    }

    public RouteBusLineItem(Parcel parcel) {
        super(parcel);
        this.r = new ArrayList();
        this.t = new ArrayList();
        this.p = (BusStationItem) parcel.readParcelable(BusStationItem.class.getClassLoader());
        this.f2173q = (BusStationItem) parcel.readParcelable(BusStationItem.class.getClassLoader());
        this.r = parcel.createTypedArrayList(LatLonPoint.CREATOR);
        this.s = parcel.readInt();
        this.t = parcel.createTypedArrayList(BusStationItem.CREATOR);
        this.u = parcel.readFloat();
    }

    @Override // com.amap.api.services.busline.BusLineItem, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.amap.api.services.busline.BusLineItem
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!super.equals(obj) || getClass() != obj.getClass()) {
            return false;
        }
        RouteBusLineItem routeBusLineItem = (RouteBusLineItem) obj;
        BusStationItem busStationItem = this.f2173q;
        if (busStationItem == null) {
            if (routeBusLineItem.f2173q != null) {
                return false;
            }
        } else if (!busStationItem.equals(routeBusLineItem.f2173q)) {
            return false;
        }
        BusStationItem busStationItem2 = this.p;
        if (busStationItem2 == null) {
            if (routeBusLineItem.p != null) {
                return false;
            }
        } else if (!busStationItem2.equals(routeBusLineItem.p)) {
            return false;
        }
        return true;
    }

    public BusStationItem getArrivalBusStation() {
        return this.f2173q;
    }

    public BusStationItem getDepartureBusStation() {
        return this.p;
    }

    public float getDuration() {
        return this.u;
    }

    public int getPassStationNum() {
        return this.s;
    }

    public List<BusStationItem> getPassStations() {
        return this.t;
    }

    public List<LatLonPoint> getPolyline() {
        return this.r;
    }

    @Override // com.amap.api.services.busline.BusLineItem
    public int hashCode() {
        int hashCode = super.hashCode() * 31;
        BusStationItem busStationItem = this.f2173q;
        int hashCode2 = (hashCode + (busStationItem == null ? 0 : busStationItem.hashCode())) * 31;
        BusStationItem busStationItem2 = this.p;
        return hashCode2 + (busStationItem2 != null ? busStationItem2.hashCode() : 0);
    }

    public void setArrivalBusStation(BusStationItem busStationItem) {
        this.f2173q = busStationItem;
    }

    public void setDepartureBusStation(BusStationItem busStationItem) {
        this.p = busStationItem;
    }

    public void setDuration(float f) {
        this.u = f;
    }

    public void setPassStationNum(int i) {
        this.s = i;
    }

    public void setPassStations(List<BusStationItem> list) {
        this.t = list;
    }

    public void setPolyline(List<LatLonPoint> list) {
        this.r = list;
    }

    @Override // com.amap.api.services.busline.BusLineItem, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.p, i);
        parcel.writeParcelable(this.f2173q, i);
        parcel.writeTypedList(this.r);
        parcel.writeInt(this.s);
        parcel.writeTypedList(this.t);
        parcel.writeFloat(this.u);
    }

    public RouteBusLineItem() {
        this.r = new ArrayList();
        this.t = new ArrayList();
    }
}
