package com.amap.api.services.route;

import android.os.Parcel;
import android.os.Parcelable;
import com.amap.api.services.route.RouteSearch;
import com.amap.api.services.route.RouteSearchV2;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes11.dex */
public class RideRouteResultV2 extends RouteResult implements Parcelable {
    public static final Parcelable.Creator<RideRouteResultV2> CREATOR = new a();
    private List<RidePath> c;
    private RouteSearchV2.RideRouteQuery d;

    static class a implements Parcelable.Creator<RideRouteResultV2> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        public RideRouteResultV2 createFromParcel(Parcel parcel) {
            return new RideRouteResultV2(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public RideRouteResultV2[] newArray(int i) {
            return new RideRouteResultV2[i];
        }
    }

    public RideRouteResultV2(Parcel parcel) {
        super(parcel);
        this.c = new ArrayList();
        this.c = parcel.createTypedArrayList(RidePath.CREATOR);
        this.d = (RouteSearchV2.RideRouteQuery) parcel.readParcelable(RouteSearch.RideRouteQuery.class.getClassLoader());
    }

    @Override // com.amap.api.services.route.RouteResult, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public List<RidePath> getPaths() {
        return this.c;
    }

    public RouteSearchV2.RideRouteQuery getRideQuery() {
        return this.d;
    }

    public void setPaths(List<RidePath> list) {
        this.c = list;
    }

    public void setRideQuery(RouteSearchV2.RideRouteQuery rideRouteQuery) {
        this.d = rideRouteQuery;
    }

    @Override // com.amap.api.services.route.RouteResult, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeTypedList(this.c);
        parcel.writeParcelable(this.d, i);
    }

    public RideRouteResultV2() {
        this.c = new ArrayList();
    }
}
