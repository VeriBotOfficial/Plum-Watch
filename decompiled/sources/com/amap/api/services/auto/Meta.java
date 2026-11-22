package com.amap.api.services.auto;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes11.dex */
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
        public Meta[] newArray(int i) {
            return new Meta[i];
        }
    }

    public Meta() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.listBizType);
    }

    protected Meta(Parcel parcel) {
        this.listBizType = parcel.readString();
    }
}
