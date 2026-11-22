package com.amap.api.services.route;

import android.os.Parcel;
import android.os.Parcelable;
import com.amap.api.services.core.LatLonPoint;

/* loaded from: classes11.dex */
public class TaxiItem implements Parcelable {
    public static final Parcelable.Creator<TaxiItem> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    private LatLonPoint f2200a;
    private LatLonPoint b;
    private float c;
    private float d;
    private String e;
    private String f;

    static class a implements Parcelable.Creator<TaxiItem> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        public TaxiItem createFromParcel(Parcel parcel) {
            return new TaxiItem(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public TaxiItem[] newArray(int i) {
            return new TaxiItem[i];
        }
    }

    public TaxiItem() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public LatLonPoint getDestination() {
        return this.b;
    }

    public float getDistance() {
        return this.c;
    }

    public float getDuration() {
        return this.d;
    }

    public LatLonPoint getOrigin() {
        return this.f2200a;
    }

    public String getmSname() {
        return this.e;
    }

    public String getmTname() {
        return this.f;
    }

    public void setDestination(LatLonPoint latLonPoint) {
        this.b = latLonPoint;
    }

    public void setDistance(float f) {
        this.c = f;
    }

    public void setDuration(float f) {
        this.d = f;
    }

    public void setOrigin(LatLonPoint latLonPoint) {
        this.f2200a = latLonPoint;
    }

    public void setSname(String str) {
        this.e = str;
    }

    public void setTname(String str) {
        this.f = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f2200a, i);
        parcel.writeParcelable(this.b, i);
        parcel.writeFloat(this.c);
        parcel.writeFloat(this.d);
        parcel.writeString(this.e);
        parcel.writeString(this.f);
    }

    protected TaxiItem(Parcel parcel) {
        this.f2200a = (LatLonPoint) parcel.readParcelable(LatLonPoint.class.getClassLoader());
        this.b = (LatLonPoint) parcel.readParcelable(LatLonPoint.class.getClassLoader());
        this.c = parcel.readFloat();
        this.d = parcel.readFloat();
        this.e = parcel.readString();
        this.f = parcel.readString();
    }
}
