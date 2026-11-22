package com.amap.api.services.route;

import android.os.Parcel;
import android.os.Parcelable;
import com.amap.api.services.core.LatLonPoint;

/* loaded from: classes11.dex */
public class RouteBusWalkItem extends WalkPath implements Parcelable {
    public static final Parcelable.Creator<RouteBusWalkItem> CREATOR = new a();
    private LatLonPoint e;
    private LatLonPoint f;

    static class a implements Parcelable.Creator<RouteBusWalkItem> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        public RouteBusWalkItem createFromParcel(Parcel parcel) {
            return new RouteBusWalkItem(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ RouteBusWalkItem[] newArray(int i) {
            return null;
        }
    }

    public RouteBusWalkItem(Parcel parcel) {
        super(parcel);
        this.e = (LatLonPoint) parcel.readParcelable(LatLonPoint.class.getClassLoader());
        this.f = (LatLonPoint) parcel.readParcelable(LatLonPoint.class.getClassLoader());
    }

    @Override // com.amap.api.services.route.WalkPath, com.amap.api.services.route.Path, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public LatLonPoint getDestination() {
        return this.f;
    }

    public LatLonPoint getOrigin() {
        return this.e;
    }

    public void setDestination(LatLonPoint latLonPoint) {
        this.f = latLonPoint;
    }

    public void setOrigin(LatLonPoint latLonPoint) {
        this.e = latLonPoint;
    }

    @Override // com.amap.api.services.route.WalkPath, com.amap.api.services.route.Path, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.e, i);
        parcel.writeParcelable(this.f, i);
    }

    public RouteBusWalkItem() {
    }
}
