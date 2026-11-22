package com.amap.api.services.route;

import android.os.Parcel;
import android.os.Parcelable;
import com.amap.api.services.route.RouteSearch;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes11.dex */
public class WalkRouteResult extends RouteResult implements Parcelable {
    public static final Parcelable.Creator<WalkRouteResult> CREATOR = new a();
    private List<WalkPath> c;
    private RouteSearch.WalkRouteQuery d;

    static class a implements Parcelable.Creator<WalkRouteResult> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        public WalkRouteResult createFromParcel(Parcel parcel) {
            return new WalkRouteResult(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public WalkRouteResult[] newArray(int i) {
            return new WalkRouteResult[i];
        }
    }

    public WalkRouteResult(Parcel parcel) {
        super(parcel);
        this.c = new ArrayList();
        this.c = parcel.createTypedArrayList(WalkPath.CREATOR);
        this.d = (RouteSearch.WalkRouteQuery) parcel.readParcelable(RouteSearch.WalkRouteQuery.class.getClassLoader());
    }

    @Override // com.amap.api.services.route.RouteResult, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public List<WalkPath> getPaths() {
        return this.c;
    }

    public RouteSearch.WalkRouteQuery getWalkQuery() {
        return this.d;
    }

    public void setPaths(List<WalkPath> list) {
        this.c = list;
    }

    public void setWalkQuery(RouteSearch.WalkRouteQuery walkRouteQuery) {
        this.d = walkRouteQuery;
    }

    @Override // com.amap.api.services.route.RouteResult, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeTypedList(this.c);
        parcel.writeParcelable(this.d, i);
    }

    public WalkRouteResult() {
        this.c = new ArrayList();
    }
}
