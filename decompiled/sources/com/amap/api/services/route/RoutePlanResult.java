package com.amap.api.services.route;

import android.os.Parcel;
import android.os.Parcelable;
import com.amap.api.services.core.LatLonPoint;

/* loaded from: classes11.dex */
public class RoutePlanResult implements Parcelable {
    public static final Parcelable.Creator<RoutePlanResult> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    private LatLonPoint f2174a;
    private LatLonPoint b;

    static class a implements Parcelable.Creator<RoutePlanResult> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        public RoutePlanResult createFromParcel(Parcel parcel) {
            return new RoutePlanResult(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public RoutePlanResult[] newArray(int i) {
            return new RoutePlanResult[i];
        }
    }

    public RoutePlanResult(Parcel parcel) {
        this.f2174a = (LatLonPoint) parcel.readParcelable(LatLonPoint.class.getClassLoader());
        this.b = (LatLonPoint) parcel.readParcelable(LatLonPoint.class.getClassLoader());
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public LatLonPoint getStartPos() {
        return this.f2174a;
    }

    public LatLonPoint getTargetPos() {
        return this.b;
    }

    public void setStartPos(LatLonPoint latLonPoint) {
        this.f2174a = latLonPoint;
    }

    public void setTargetPos(LatLonPoint latLonPoint) {
        this.b = latLonPoint;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f2174a, i);
        parcel.writeParcelable(this.b, i);
    }

    public RoutePlanResult() {
    }
}
