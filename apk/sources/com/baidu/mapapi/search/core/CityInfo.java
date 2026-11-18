package com.baidu.mapapi.search.core;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes15.dex */
public class CityInfo implements Parcelable {
    public static final Parcelable.Creator<CityInfo> CREATOR = new a();
    public String city;
    public int num;

    static class a implements Parcelable.Creator<CityInfo> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public CityInfo[] newArray(int r1) {
            return new CityInfo[r1];
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public CityInfo createFromParcel(Parcel parcel) {
            return new CityInfo(parcel);
        }
    }

    public CityInfo() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int r2) {
        parcel.writeString(this.city);
        parcel.writeInt(this.num);
    }

    protected CityInfo(Parcel parcel) {
        this.city = parcel.readString();
        this.num = parcel.readInt();
    }
}
