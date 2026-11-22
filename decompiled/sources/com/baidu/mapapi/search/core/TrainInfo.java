package com.baidu.mapapi.search.core;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes13.dex */
public class TrainInfo extends TransitBaseInfo {
    public static final Parcelable.Creator<TrainInfo> CREATOR = new a();
    private double f;
    private String g;

    static class a implements Parcelable.Creator<TrainInfo> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public TrainInfo createFromParcel(Parcel parcel) {
            return new TrainInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public TrainInfo[] newArray(int i) {
            return new TrainInfo[i];
        }
    }

    public TrainInfo() {
    }

    @Override // com.baidu.mapapi.search.core.TransitBaseInfo, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getBooking() {
        return this.g;
    }

    public double getPrice() {
        return this.f;
    }

    public void setBooking(String str) {
        this.g = str;
    }

    public void setPrice(double d) {
        this.f = d;
    }

    @Override // com.baidu.mapapi.search.core.TransitBaseInfo, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeDouble(this.f);
        parcel.writeString(this.g);
    }

    protected TrainInfo(Parcel parcel) {
        super(parcel);
        this.f = parcel.readDouble();
        this.g = parcel.readString();
    }
}
