package com.amap.api.services.poisearch;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public class Business implements Parcelable {
    public static final Parcelable.Creator<Business> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f2134a;
    private String b;
    private String c;
    private String d;
    private String e;
    private String f;
    private String g;
    private String h;
    private String i;
    private String j;

    static class a implements Parcelable.Creator<Business> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        public Business createFromParcel(Parcel parcel) {
            return new Business(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public Business[] newArray(int r1) {
            return new Business[r1];
        }
    }

    public Business(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        this.f2134a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
        this.h = str8;
        this.i = str9;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getAlias() {
        return this.i;
    }

    public String getBusinessArea() {
        return this.f2134a;
    }

    public String getCPID() {
        return this.j;
    }

    public String getCost() {
        return this.g;
    }

    public String getOpentimeToday() {
        return this.b;
    }

    public String getOpentimeWeek() {
        return this.c;
    }

    public String getParkingType() {
        return this.h;
    }

    public String getTag() {
        return this.e;
    }

    public String getTel() {
        return this.d;
    }

    public String getmRating() {
        return this.f;
    }

    public void setCPID(String str) {
        this.j = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int r2) {
        parcel.writeString(this.f2134a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        parcel.writeString(this.f);
        parcel.writeString(this.g);
        parcel.writeString(this.h);
        parcel.writeString(this.i);
        parcel.writeString(this.j);
    }

    protected Business(Parcel parcel) {
        this.f2134a = parcel.readString();
        this.b = parcel.readString();
        this.c = parcel.readString();
        this.d = parcel.readString();
        this.e = parcel.readString();
        this.f = parcel.readString();
        this.g = parcel.readString();
        this.h = parcel.readString();
        this.i = parcel.readString();
        this.j = parcel.readString();
    }
}
