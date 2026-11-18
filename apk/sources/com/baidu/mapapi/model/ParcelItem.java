package com.baidu.mapapi.model;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes15.dex */
public class ParcelItem implements Parcelable {
    public static final Parcelable.Creator<ParcelItem> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Bundle f8048a;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public Bundle getBundle() {
        return this.f8048a;
    }

    public void setBundle(Bundle bundle) {
        this.f8048a = bundle;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int r2) {
        parcel.writeBundle(this.f8048a);
    }

    static class a implements Parcelable.Creator<ParcelItem> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ParcelItem createFromParcel(Parcel parcel) {
            ParcelItem parcelItem = new ParcelItem();
            parcelItem.setBundle(parcel.readBundle());
            return parcelItem;
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ParcelItem[] newArray(int r1) {
            return new ParcelItem[r1];
        }
    }
}
