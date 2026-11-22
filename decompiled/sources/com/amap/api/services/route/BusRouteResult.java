package com.amap.api.services.route;

import android.os.Parcel;
import android.os.Parcelable;
import com.amap.api.services.route.RouteSearch;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes11.dex */
public class BusRouteResult extends RouteResult implements Parcelable {
    public static final Parcelable.Creator<BusRouteResult> CREATOR = new a();
    private float c;
    private List<BusPath> d;
    private RouteSearch.BusRouteQuery e;

    static class a implements Parcelable.Creator<BusRouteResult> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        public BusRouteResult createFromParcel(Parcel parcel) {
            return new BusRouteResult(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public BusRouteResult[] newArray(int i) {
            return new BusRouteResult[i];
        }
    }

    public BusRouteResult(Parcel parcel) {
        super(parcel);
        this.d = new ArrayList();
        this.c = parcel.readFloat();
        this.d = parcel.createTypedArrayList(BusPath.CREATOR);
        this.e = (RouteSearch.BusRouteQuery) parcel.readParcelable(RouteSearch.BusRouteQuery.class.getClassLoader());
    }

    @Override // com.amap.api.services.route.RouteResult, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public RouteSearch.BusRouteQuery getBusQuery() {
        return this.e;
    }

    public List<BusPath> getPaths() {
        return this.d;
    }

    public float getTaxiCost() {
        return this.c;
    }

    public void setBusQuery(RouteSearch.BusRouteQuery busRouteQuery) {
        this.e = busRouteQuery;
    }

    public void setPaths(List<BusPath> list) {
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
    }

    public BusRouteResult() {
        this.d = new ArrayList();
    }
}
