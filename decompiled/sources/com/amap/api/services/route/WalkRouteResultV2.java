package com.amap.api.services.route;

import android.os.Parcel;
import android.os.Parcelable;
import com.amap.api.services.route.RouteSearchV2;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes11.dex */
public class WalkRouteResultV2 extends RouteResult implements Parcelable {
    public static final Parcelable.Creator<WalkRouteResultV2> CREATOR = new a();
    private List<WalkPath> c;
    private RouteSearchV2.WalkRouteQuery d;

    static class a implements Parcelable.Creator<WalkRouteResultV2> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        public WalkRouteResultV2 createFromParcel(Parcel parcel) {
            return new WalkRouteResultV2(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public WalkRouteResultV2[] newArray(int i) {
            return new WalkRouteResultV2[i];
        }
    }

    public WalkRouteResultV2(Parcel parcel) {
        super(parcel);
        this.c = new ArrayList();
        this.c = parcel.createTypedArrayList(WalkPath.CREATOR);
        this.d = (RouteSearchV2.WalkRouteQuery) parcel.readParcelable(RouteSearchV2.WalkRouteQuery.class.getClassLoader());
    }

    @Override // com.amap.api.services.route.RouteResult, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public List<WalkPath> getPaths() {
        return this.c;
    }

    public RouteSearchV2.WalkRouteQuery getWalkQuery() {
        return this.d;
    }

    public void setPaths(List<WalkPath> list) {
        this.c = list;
    }

    public void setWalkQuery(RouteSearchV2.WalkRouteQuery walkRouteQuery) {
        this.d = walkRouteQuery;
    }

    @Override // com.amap.api.services.route.RouteResult, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeTypedList(this.c);
        parcel.writeParcelable(this.d, i);
    }

    public WalkRouteResultV2() {
        this.c = new ArrayList();
    }
}
