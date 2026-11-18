package com.amap.api.services.poisearch;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public class IndoorData implements Parcelable {
    public static final Parcelable.Creator<IndoorData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f2135a;
    private int b;
    private String c;

    static class a implements Parcelable.Creator<IndoorData> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        public IndoorData createFromParcel(Parcel parcel) {
            return new IndoorData(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public IndoorData[] newArray(int r1) {
            return new IndoorData[r1];
        }
    }

    public IndoorData(String str, int r2, String str2) {
        this.f2135a = str;
        this.b = r2;
        this.c = str2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getFloor() {
        return this.b;
    }

    public String getFloorName() {
        return this.c;
    }

    public String getPoiId() {
        return this.f2135a;
    }

    public void setFloor(int r1) {
        this.b = r1;
    }

    public void setFloorName(String str) {
        this.c = str;
    }

    public void setPoiId(String str) {
        this.f2135a = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int r2) {
        parcel.writeString(this.f2135a);
        parcel.writeInt(this.b);
        parcel.writeString(this.c);
    }

    protected IndoorData(Parcel parcel) {
        this.f2135a = parcel.readString();
        this.b = parcel.readInt();
        this.c = parcel.readString();
    }
}
