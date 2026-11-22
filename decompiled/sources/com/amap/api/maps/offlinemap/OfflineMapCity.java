package com.amap.api.maps.offlinemap;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes11.dex */
public class OfflineMapCity extends City {
    public static final Parcelable.Creator<OfflineMapCity> CREATOR = new a();
    private String f;
    private long g;
    private int h;
    private String i;
    private int j;

    static class a implements Parcelable.Creator<OfflineMapCity> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        public OfflineMapCity createFromParcel(Parcel parcel) {
            return new OfflineMapCity(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public OfflineMapCity[] newArray(int i) {
            return new OfflineMapCity[i];
        }
    }

    public OfflineMapCity() {
        this.f = "";
        this.g = 0L;
        this.h = 6;
        this.i = "";
        this.j = 0;
    }

    @Override // com.amap.api.maps.offlinemap.City, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public long getSize() {
        return this.g;
    }

    public int getState() {
        return this.h;
    }

    public String getUrl() {
        return this.f;
    }

    public String getVersion() {
        return this.i;
    }

    public int getcompleteCode() {
        return this.j;
    }

    public void setCompleteCode(int i) {
        this.j = i;
    }

    public void setSize(long j) {
        this.g = j;
    }

    public void setState(int i) {
        this.h = i;
    }

    public void setUrl(String str) {
        this.f = str;
    }

    public void setVersion(String str) {
        this.i = str;
    }

    @Override // com.amap.api.maps.offlinemap.City, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.f);
        parcel.writeLong(this.g);
        parcel.writeInt(this.h);
        parcel.writeString(this.i);
        parcel.writeInt(this.j);
    }

    public OfflineMapCity(Parcel parcel) {
        super(parcel);
        this.f = "";
        this.g = 0L;
        this.h = 6;
        this.i = "";
        this.j = 0;
        this.f = parcel.readString();
        this.g = parcel.readLong();
        this.h = parcel.readInt();
        this.i = parcel.readString();
        this.j = parcel.readInt();
    }
}
