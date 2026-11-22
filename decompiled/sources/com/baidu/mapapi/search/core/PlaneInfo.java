package com.baidu.mapapi.search.core;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes13.dex */
public class PlaneInfo extends TransitBaseInfo {
    public static final Parcelable.Creator<PlaneInfo> CREATOR = new a();
    private double f;
    private String g;
    private double h;
    private String i;

    static class a implements Parcelable.Creator<PlaneInfo> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public PlaneInfo createFromParcel(Parcel parcel) {
            return new PlaneInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public PlaneInfo[] newArray(int i) {
            return new PlaneInfo[i];
        }
    }

    public PlaneInfo() {
    }

    @Override // com.baidu.mapapi.search.core.TransitBaseInfo, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getAirlines() {
        return this.g;
    }

    public String getBooking() {
        return this.i;
    }

    public double getDiscount() {
        return this.f;
    }

    public double getPrice() {
        return this.h;
    }

    public void setAirlines(String str) {
        this.g = str;
    }

    public void setBooking(String str) {
        this.i = str;
    }

    public void setDiscount(double d) {
        this.f = d;
    }

    public void setPrice(double d) {
        this.h = d;
    }

    @Override // com.baidu.mapapi.search.core.TransitBaseInfo, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeDouble(this.f);
        parcel.writeString(this.g);
        parcel.writeDouble(this.h);
        parcel.writeString(this.i);
    }

    protected PlaneInfo(Parcel parcel) {
        super(parcel);
        this.f = parcel.readDouble();
        this.g = parcel.readString();
        this.h = parcel.readDouble();
        this.i = parcel.readString();
    }
}
