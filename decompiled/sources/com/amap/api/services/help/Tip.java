package com.amap.api.services.help;

import android.os.Parcel;
import android.os.Parcelable;
import com.amap.api.services.core.LatLonPoint;

/* loaded from: classes11.dex */
public class Tip implements Parcelable {
    public static final Parcelable.Creator<Tip> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    private String f2127a;
    private LatLonPoint b;
    private String c;
    private String d;
    private String e;
    private String f;
    private String g;
    private String h;

    static class a implements Parcelable.Creator<Tip> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        public Tip createFromParcel(Parcel parcel) {
            return new Tip(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ Tip[] newArray(int i) {
            return null;
        }
    }

    /* synthetic */ Tip(Parcel parcel, a aVar) {
        this(parcel);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getAdcode() {
        return this.e;
    }

    public String getAddress() {
        return this.f;
    }

    public String getDistrict() {
        return this.d;
    }

    public String getName() {
        return this.c;
    }

    public String getPoiID() {
        return this.f2127a;
    }

    public LatLonPoint getPoint() {
        return this.b;
    }

    public String getTypeCode() {
        return this.g;
    }

    public void setAdcode(String str) {
        this.e = str;
    }

    public void setAddress(String str) {
        this.f = str;
    }

    public void setDistrict(String str) {
        this.d = str;
    }

    public void setID(String str) {
        this.f2127a = str;
    }

    public void setName(String str) {
        this.c = str;
    }

    public void setPostion(LatLonPoint latLonPoint) {
        this.b = latLonPoint;
    }

    public void setTypeCode(String str) {
        this.g = str;
    }

    public String toString() {
        return "name:" + this.c + " district:" + this.d + " adcode:" + this.e;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.c);
        parcel.writeString(this.e);
        parcel.writeString(this.d);
        parcel.writeString(this.f2127a);
        parcel.writeValue(this.b);
        parcel.writeString(this.f);
        parcel.writeString(this.g);
        parcel.writeString(this.h);
    }

    public Tip() {
        this.h = "";
    }

    private Tip(Parcel parcel) {
        this.h = "";
        this.c = parcel.readString();
        this.e = parcel.readString();
        this.d = parcel.readString();
        this.f2127a = parcel.readString();
        this.b = (LatLonPoint) parcel.readValue(LatLonPoint.class.getClassLoader());
        this.f = parcel.readString();
        this.g = parcel.readString();
        this.h = parcel.readString();
    }
}
