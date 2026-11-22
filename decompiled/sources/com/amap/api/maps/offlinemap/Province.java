package com.amap.api.maps.offlinemap;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes11.dex */
public class Province implements Parcelable {
    public static final Parcelable.Creator<Province> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    private String f2075a;
    private String b;
    private String c;
    private String d;

    static class a implements Parcelable.Creator<Province> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        public Province createFromParcel(Parcel parcel) {
            return new Province(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public Province[] newArray(int i) {
            return new Province[i];
        }
    }

    public Province() {
        this.f2075a = "";
        this.d = "";
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getJianpin() {
        return this.b;
    }

    public String getPinyin() {
        return this.c;
    }

    public String getProvinceCode() {
        return this.d;
    }

    public String getProvinceName() {
        return this.f2075a;
    }

    public void setJianpin(String str) {
        this.b = str;
    }

    public void setPinyin(String str) {
        this.c = str;
    }

    public void setProvinceCode(String str) {
        this.d = str;
    }

    public void setProvinceName(String str) {
        this.f2075a = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f2075a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
    }

    public Province(Parcel parcel) {
        this.f2075a = "";
        this.d = "";
        this.f2075a = parcel.readString();
        this.b = parcel.readString();
        this.c = parcel.readString();
        this.d = parcel.readString();
    }
}
