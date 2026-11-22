package com.amap.api.services.geocoder;

import android.os.Parcel;
import android.os.Parcelable;
import com.amap.api.services.core.LatLonPoint;

/* loaded from: classes11.dex */
public final class StreetNumber implements Parcelable {
    public static final Parcelable.Creator<StreetNumber> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    private String f2124a;
    private String b;
    private LatLonPoint c;
    private String d;
    private float e;

    static class a implements Parcelable.Creator<StreetNumber> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        public StreetNumber createFromParcel(Parcel parcel) {
            return new StreetNumber(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ StreetNumber[] newArray(int i) {
            return null;
        }
    }

    /* synthetic */ StreetNumber(Parcel parcel, a aVar) {
        this(parcel);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getDirection() {
        return this.d;
    }

    public float getDistance() {
        return this.e;
    }

    public LatLonPoint getLatLonPoint() {
        return this.c;
    }

    public String getNumber() {
        return this.b;
    }

    public String getStreet() {
        return this.f2124a;
    }

    public void setDirection(String str) {
        this.d = str;
    }

    public void setDistance(float f) {
        this.e = f;
    }

    public void setLatLonPoint(LatLonPoint latLonPoint) {
        this.c = latLonPoint;
    }

    public void setNumber(String str) {
        this.b = str;
    }

    public void setStreet(String str) {
        this.f2124a = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f2124a);
        parcel.writeString(this.b);
        parcel.writeValue(this.c);
        parcel.writeString(this.d);
        parcel.writeFloat(this.e);
    }

    public StreetNumber() {
    }

    private StreetNumber(Parcel parcel) {
        this.f2124a = parcel.readString();
        this.b = parcel.readString();
        this.c = (LatLonPoint) parcel.readValue(LatLonPoint.class.getClassLoader());
        this.d = parcel.readString();
        this.e = parcel.readFloat();
    }
}
