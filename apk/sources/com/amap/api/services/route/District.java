package com.amap.api.services.route;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public class District implements Parcelable {
    public static final Parcelable.Creator<District> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f2160a;
    private String b;

    static class a implements Parcelable.Creator<District> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        public District createFromParcel(Parcel parcel) {
            return new District(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ District[] newArray(int r1) {
            return null;
        }
    }

    public District(Parcel parcel) {
        this.f2160a = parcel.readString();
        this.b = parcel.readString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getDistrictAdcode() {
        return this.b;
    }

    public String getDistrictName() {
        return this.f2160a;
    }

    public void setDistrictAdcode(String str) {
        this.b = str;
    }

    public void setDistrictName(String str) {
        this.f2160a = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int r2) {
        parcel.writeString(this.f2160a);
        parcel.writeString(this.b);
    }

    public District() {
    }
}
