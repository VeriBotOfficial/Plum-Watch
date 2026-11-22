package com.amap.api.services.route;

import android.os.Parcel;
import android.os.Parcelable;
import com.amap.api.services.route.RouteSearch;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes11.dex */
public class RideRouteResult extends RouteResult implements Parcelable {
    public static final Parcelable.Creator<RideRouteResult> CREATOR = new a();
    private List<RidePath> c;
    private RouteSearch.RideRouteQuery d;

    static class a implements Parcelable.Creator<RideRouteResult> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        public RideRouteResult createFromParcel(Parcel parcel) {
            return new RideRouteResult(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public RideRouteResult[] newArray(int i) {
            return new RideRouteResult[i];
        }
    }

    public RideRouteResult(Parcel parcel) {
        super(parcel);
        this.c = new ArrayList();
        this.c = parcel.createTypedArrayList(RidePath.CREATOR);
        this.d = (RouteSearch.RideRouteQuery) parcel.readParcelable(RouteSearch.RideRouteQuery.class.getClassLoader());
    }

    @Override // com.amap.api.services.route.RouteResult, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public List<RidePath> getPaths() {
        return this.c;
    }

    public RouteSearch.RideRouteQuery getRideQuery() {
        return this.d;
    }

    public void setPaths(List<RidePath> list) {
        this.c = list;
    }

    public void setRideQuery(RouteSearch.RideRouteQuery rideRouteQuery) {
        this.d = rideRouteQuery;
    }

    @Override // com.amap.api.services.route.RouteResult, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeTypedList(this.c);
        parcel.writeParcelable(this.d, i);
    }

    public RideRouteResult() {
        this.c = new ArrayList();
    }
}
