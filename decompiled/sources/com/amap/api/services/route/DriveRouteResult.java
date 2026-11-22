package com.amap.api.services.route;

import android.os.Parcel;
import android.os.Parcelable;
import com.amap.api.services.route.RouteSearch;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes11.dex */
public class DriveRouteResult extends RouteResult implements Parcelable {
    public static final Parcelable.Creator<DriveRouteResult> CREATOR = new a();
    private float c;
    private List<DrivePath> d;
    private RouteSearch.DriveRouteQuery e;

    static class a implements Parcelable.Creator<DriveRouteResult> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        public DriveRouteResult createFromParcel(Parcel parcel) {
            return new DriveRouteResult(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public DriveRouteResult[] newArray(int i) {
            return new DriveRouteResult[i];
        }
    }

    public DriveRouteResult(Parcel parcel) {
        super(parcel);
        this.d = new ArrayList();
        this.c = parcel.readFloat();
        this.d = parcel.createTypedArrayList(DrivePath.CREATOR);
        this.e = (RouteSearch.DriveRouteQuery) parcel.readParcelable(RouteSearch.DriveRouteQuery.class.getClassLoader());
    }

    @Override // com.amap.api.services.route.RouteResult, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public RouteSearch.DriveRouteQuery getDriveQuery() {
        return this.e;
    }

    public List<DrivePath> getPaths() {
        return this.d;
    }

    public float getTaxiCost() {
        return this.c;
    }

    public void setDriveQuery(RouteSearch.DriveRouteQuery driveRouteQuery) {
        this.e = driveRouteQuery;
    }

    public void setPaths(List<DrivePath> list) {
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

    public DriveRouteResult() {
        this.d = new ArrayList();
    }
}
