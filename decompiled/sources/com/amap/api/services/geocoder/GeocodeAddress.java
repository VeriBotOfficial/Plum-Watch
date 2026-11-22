package com.amap.api.services.geocoder;

import android.os.Parcel;
import android.os.Parcelable;
import com.amap.api.services.core.LatLonPoint;

/* loaded from: classes11.dex */
public final class GeocodeAddress implements Parcelable {
    public static final Parcelable.Creator<GeocodeAddress> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    private String f2115a;
    private String b;
    private String c;
    private String d;
    private String e;
    private String f;
    private String g;
    private String h;
    private LatLonPoint i;
    private String j;
    private String k;
    private String l;

    static class a implements Parcelable.Creator<GeocodeAddress> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        public GeocodeAddress createFromParcel(Parcel parcel) {
            return new GeocodeAddress(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ GeocodeAddress[] newArray(int i) {
            return null;
        }
    }

    /* synthetic */ GeocodeAddress(Parcel parcel, a aVar) {
        this(parcel);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getAdcode() {
        return this.h;
    }

    public String getBuilding() {
        return this.g;
    }

    public String getCity() {
        return this.c;
    }

    public String getCountry() {
        return this.k;
    }

    public String getDistrict() {
        return this.d;
    }

    public String getFormatAddress() {
        return this.f2115a;
    }

    public LatLonPoint getLatLonPoint() {
        return this.i;
    }

    public String getLevel() {
        return this.j;
    }

    public String getNeighborhood() {
        return this.f;
    }

    public String getPostcode() {
        return this.l;
    }

    public String getProvince() {
        return this.b;
    }

    public String getTownship() {
        return this.e;
    }

    public void setAdcode(String str) {
        this.h = str;
    }

    public void setBuilding(String str) {
        this.g = str;
    }

    public void setCity(String str) {
        this.c = str;
    }

    public void setCountry(String str) {
        this.k = str;
    }

    public void setDistrict(String str) {
        this.d = str;
    }

    public void setFormatAddress(String str) {
        this.f2115a = str;
    }

    public void setLatLonPoint(LatLonPoint latLonPoint) {
        this.i = latLonPoint;
    }

    public void setLevel(String str) {
        this.j = str;
    }

    public void setNeighborhood(String str) {
        this.f = str;
    }

    public void setPostcode(String str) {
        this.l = str;
    }

    public void setProvince(String str) {
        this.b = str;
    }

    public void setTownship(String str) {
        this.e = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f2115a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        parcel.writeString(this.f);
        parcel.writeString(this.g);
        parcel.writeString(this.h);
        parcel.writeValue(this.i);
        parcel.writeString(this.j);
        parcel.writeString(this.k);
        parcel.writeString(this.l);
    }

    public GeocodeAddress() {
    }

    private GeocodeAddress(Parcel parcel) {
        this.f2115a = parcel.readString();
        this.b = parcel.readString();
        this.c = parcel.readString();
        this.d = parcel.readString();
        this.e = parcel.readString();
        this.f = parcel.readString();
        this.g = parcel.readString();
        this.h = parcel.readString();
        this.i = (LatLonPoint) parcel.readValue(LatLonPoint.class.getClassLoader());
        this.j = parcel.readString();
        this.k = parcel.readString();
        this.l = parcel.readString();
    }
}
