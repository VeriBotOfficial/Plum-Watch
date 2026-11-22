package com.amap.api.services.route;

import android.os.Parcel;
import android.os.Parcelable;
import com.amap.api.services.core.LatLonPoint;

/* loaded from: classes11.dex */
public class RouteResult implements Parcelable {
    public static final Parcelable.Creator<RouteResult> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    private LatLonPoint f2175a;
    private LatLonPoint b;

    static class a implements Parcelable.Creator<RouteResult> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        public RouteResult createFromParcel(Parcel parcel) {
            return new RouteResult(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public RouteResult[] newArray(int i) {
            return new RouteResult[i];
        }
    }

    public RouteResult(Parcel parcel) {
        this.f2175a = (LatLonPoint) parcel.readParcelable(LatLonPoint.class.getClassLoader());
        this.b = (LatLonPoint) parcel.readParcelable(LatLonPoint.class.getClassLoader());
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public LatLonPoint getStartPos() {
        return this.f2175a;
    }

    public LatLonPoint getTargetPos() {
        return this.b;
    }

    public void setStartPos(LatLonPoint latLonPoint) {
        this.f2175a = latLonPoint;
    }

    public void setTargetPos(LatLonPoint latLonPoint) {
        this.b = latLonPoint;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f2175a, i);
        parcel.writeParcelable(this.b, i);
    }

    public RouteResult() {
    }
}
