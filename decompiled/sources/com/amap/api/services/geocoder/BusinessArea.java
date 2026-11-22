package com.amap.api.services.geocoder;

import android.os.Parcel;
import android.os.Parcelable;
import com.amap.api.services.core.LatLonPoint;

/* loaded from: classes11.dex */
public class BusinessArea implements Parcelable {
    public static final Parcelable.Creator<BusinessArea> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    private LatLonPoint f2114a;
    private String b;

    static class a implements Parcelable.Creator<BusinessArea> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        public BusinessArea createFromParcel(Parcel parcel) {
            return new BusinessArea(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public BusinessArea[] newArray(int i) {
            return new BusinessArea[i];
        }
    }

    public BusinessArea() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public LatLonPoint getCenterPoint() {
        return this.f2114a;
    }

    public String getName() {
        return this.b;
    }

    public void setCenterPoint(LatLonPoint latLonPoint) {
        this.f2114a = latLonPoint;
    }

    public void setName(String str) {
        this.b = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f2114a, i);
        parcel.writeString(this.b);
    }

    public BusinessArea(Parcel parcel) {
        this.f2114a = (LatLonPoint) parcel.readParcelable(LatLonPoint.class.getClassLoader());
        this.b = parcel.readString();
    }
}
