package com.baidu.mapapi.search.core;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes15.dex */
public class TaxiInfo implements Parcelable {
    public static final Parcelable.Creator<TaxiInfo> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f8078a;
    private String b;
    private int c;
    private int d;
    private float e;
    private float f;

    static class a implements Parcelable.Creator<TaxiInfo> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public TaxiInfo[] newArray(int r1) {
            return new TaxiInfo[r1];
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public TaxiInfo createFromParcel(Parcel parcel) {
            return new TaxiInfo(parcel);
        }
    }

    public TaxiInfo() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getDesc() {
        return this.b;
    }

    public int getDistance() {
        return this.c;
    }

    public int getDuration() {
        return this.d;
    }

    public float getPerKMPrice() {
        return this.e;
    }

    public float getStartPrice() {
        return this.f;
    }

    public float getTotalPrice() {
        return this.f8078a;
    }

    public void setDesc(String str) {
        this.b = str;
    }

    public void setDistance(int r1) {
        this.c = r1;
    }

    public void setDuration(int r1) {
        this.d = r1;
    }

    public void setPerKMPrice(float f) {
        this.e = f;
    }

    public void setStartPrice(float f) {
        this.f = f;
    }

    public void setTotalPrice(float f) {
        this.f8078a = f;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int r2) {
        parcel.writeFloat(this.f8078a);
        parcel.writeString(this.b);
        parcel.writeInt(this.c);
        parcel.writeInt(this.d);
        parcel.writeFloat(this.e);
        parcel.writeFloat(this.f);
    }

    TaxiInfo(Parcel parcel) {
        this.f8078a = parcel.readFloat();
        this.b = parcel.readString();
        this.c = parcel.readInt();
        this.d = parcel.readInt();
        this.e = parcel.readFloat();
        this.f = parcel.readFloat();
    }
}
