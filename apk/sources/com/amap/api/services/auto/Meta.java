package com.amap.api.services.auto;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public class Meta implements Parcelable {
    public static final Parcelable.Creator<Meta> CREATOR = new a();
    public String listBizType;

    static class a implements Parcelable.Creator<Meta> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        public Meta createFromParcel(Parcel parcel) {
            return new Meta(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public Meta[] newArray(int r1) {
            return new Meta[r1];
        }
    }

    public Meta() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int r2) {
        parcel.writeString(this.listBizType);
    }

    protected Meta(Parcel parcel) {
        this.listBizType = parcel.readString();
    }
}
