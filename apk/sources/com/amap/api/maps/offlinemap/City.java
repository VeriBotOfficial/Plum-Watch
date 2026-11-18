package com.amap.api.maps.offlinemap;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public class City implements Parcelable {
    public static final Parcelable.Creator<City> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f2064a;
    private String b;
    private String c;
    private String d;
    private String e;

    static class a implements Parcelable.Creator<City> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        public City createFromParcel(Parcel parcel) {
            return new City(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public City[] newArray(int r1) {
            return new City[r1];
        }
    }

    public City() {
        this.f2064a = "";
        this.b = "";
        this.c = "";
        this.d = "";
        this.e = "";
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getAdcode() {
        return this.e;
    }

    public String getCity() {
        return this.f2064a;
    }

    public String getCode() {
        return this.b;
    }

    public String getJianpin() {
        return this.c;
    }

    public String getPinyin() {
        return this.d;
    }

    public void setAdcode(String str) {
        this.e = str;
    }

    public void setCity(String str) {
        this.f2064a = str;
    }

    public void setCode(String str) {
        if (str == null || "[]".equals(str)) {
            return;
        }
        this.b = str;
    }

    public void setJianpin(String str) {
        this.c = str;
    }

    public void setPinyin(String str) {
        this.d = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int r2) {
        parcel.writeString(this.f2064a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
    }

    public City(Parcel parcel) {
        this.f2064a = "";
        this.b = "";
        this.c = "";
        this.d = "";
        this.e = "";
        this.f2064a = parcel.readString();
        this.b = parcel.readString();
        this.c = parcel.readString();
        this.d = parcel.readString();
        this.e = parcel.readString();
    }
}
