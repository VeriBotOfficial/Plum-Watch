package com.amap.api.services.route;

import android.os.Parcel;
import android.os.Parcelable;
import com.amap.api.services.core.LatLonPoint;
import com.amap.api.services.route.RouteSearch;
import java.util.List;

/* loaded from: classes11.dex */
public class TruckRouteRestult implements Parcelable {
    public static final Parcelable.Creator<TruckRouteRestult> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    private RouteSearch.TruckRouteQuery f2205a;
    private List<TruckPath> b;
    private LatLonPoint c;
    private LatLonPoint d;

    static class a implements Parcelable.Creator<TruckRouteRestult> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        public TruckRouteRestult createFromParcel(Parcel parcel) {
            return new TruckRouteRestult(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public TruckRouteRestult[] newArray(int i) {
            return new TruckRouteRestult[i];
        }
    }

    public TruckRouteRestult() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public List<TruckPath> getPaths() {
        return this.b;
    }

    public LatLonPoint getStartPos() {
        return this.c;
    }

    public LatLonPoint getTargetPos() {
        return this.d;
    }

    public RouteSearch.TruckRouteQuery getTruckQuery() {
        return this.f2205a;
    }

    public void setPaths(List<TruckPath> list) {
        this.b = list;
    }

    public void setStartPos(LatLonPoint latLonPoint) {
        this.c = latLonPoint;
    }

    public void setTargetPos(LatLonPoint latLonPoint) {
        this.d = latLonPoint;
    }

    public void setTruckQuery(RouteSearch.TruckRouteQuery truckRouteQuery) {
        this.f2205a = truckRouteQuery;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedList(this.b);
        parcel.writeParcelable(this.c, i);
        parcel.writeParcelable(this.d, i);
    }

    protected TruckRouteRestult(Parcel parcel) {
        this.b = parcel.createTypedArrayList(TruckPath.CREATOR);
        this.c = (LatLonPoint) parcel.readParcelable(LatLonPoint.class.getClassLoader());
        this.d = (LatLonPoint) parcel.readParcelable(LatLonPoint.class.getClassLoader());
    }
}
