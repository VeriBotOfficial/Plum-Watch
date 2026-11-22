package com.amap.api.services.route;

import android.os.Parcel;
import android.os.Parcelable;
import com.amap.api.services.route.RouteSearchV2;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes11.dex */
public class DriveRouteResultV2 extends RouteResult implements Parcelable {
    public static final Parcelable.Creator<DriveRouteResultV2> CREATOR = new a();
    private float c;
    private List<DrivePathV2> d;
    private RouteSearchV2.DriveRouteQuery e;

    static class a implements Parcelable.Creator<DriveRouteResultV2> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        public DriveRouteResultV2 createFromParcel(Parcel parcel) {
            return new DriveRouteResultV2(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public DriveRouteResultV2[] newArray(int i) {
            return new DriveRouteResultV2[i];
        }
    }

    public DriveRouteResultV2(Parcel parcel) {
        super(parcel);
        this.d = new ArrayList();
        this.c = parcel.readFloat();
        this.d = parcel.createTypedArrayList(DrivePathV2.CREATOR);
        this.e = (RouteSearchV2.DriveRouteQuery) parcel.readParcelable(RouteSearchV2.DriveRouteQuery.class.getClassLoader());
    }

    @Override // com.amap.api.services.route.RouteResult, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public RouteSearchV2.DriveRouteQuery getDriveQuery() {
        return this.e;
    }

    public List<DrivePathV2> getPaths() {
        return this.d;
    }

    public float getTaxiCost() {
        return this.c;
    }

    public void setDriveQuery(RouteSearchV2.DriveRouteQuery driveRouteQuery) {
        this.e = driveRouteQuery;
    }

    public void setPaths(List<DrivePathV2> list) {
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

    public DriveRouteResultV2() {
        this.d = new ArrayList();
    }
}
