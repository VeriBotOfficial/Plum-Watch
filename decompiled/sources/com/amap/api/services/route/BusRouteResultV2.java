package com.amap.api.services.route;

import android.os.Parcel;
import android.os.Parcelable;
import com.amap.api.services.route.RouteSearchV2;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes11.dex */
public class BusRouteResultV2 extends RouteResult implements Parcelable {
    public static final Parcelable.Creator<BusRouteResultV2> CREATOR = new a();
    private float c;
    private List<BusPathV2> d;
    private RouteSearchV2.BusRouteQuery e;
    private float f;

    static class a implements Parcelable.Creator<BusRouteResultV2> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        public BusRouteResultV2 createFromParcel(Parcel parcel) {
            return new BusRouteResultV2(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public BusRouteResultV2[] newArray(int i) {
            return new BusRouteResultV2[i];
        }
    }

    public BusRouteResultV2(Parcel parcel) {
        super(parcel);
        this.d = new ArrayList();
        this.c = parcel.readFloat();
        this.d = parcel.createTypedArrayList(BusPathV2.CREATOR);
        this.e = (RouteSearchV2.BusRouteQuery) parcel.readParcelable(RouteSearchV2.BusRouteQuery.class.getClassLoader());
        this.f = parcel.readFloat();
    }

    @Override // com.amap.api.services.route.RouteResult, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public RouteSearchV2.BusRouteQuery getBusQuery() {
        return this.e;
    }

    public float getDistance() {
        return this.f;
    }

    public List<BusPathV2> getPaths() {
        return this.d;
    }

    public float getTaxiCost() {
        return this.c;
    }

    public void setBusQuery(RouteSearchV2.BusRouteQuery busRouteQuery) {
        this.e = busRouteQuery;
    }

    public void setDistance(float f) {
        this.f = f;
    }

    public void setPaths(List<BusPathV2> list) {
        this.d = list;
    }

    public void setTaxiCost(float f) {
        this.c = f;
    }

    @Override // com.amap.api.services.route.RouteResult, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeFloat(this.c);
        parcel.writeTypedList(this.d);
        parcel.writeParcelable(this.e, i);
        parcel.writeFloat(this.f);
    }

    public BusRouteResultV2() {
        this.d = new ArrayList();
    }
}
