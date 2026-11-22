package com.amap.api.services.route;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes11.dex */
public class SearchCity implements Parcelable {
    public static final Parcelable.Creator<SearchCity> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    private String f2198a;
    private String b;
    private String c;

    static class a implements Parcelable.Creator<SearchCity> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        public SearchCity createFromParcel(Parcel parcel) {
            return new SearchCity(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ SearchCity[] newArray(int i) {
            return null;
        }
    }

    public SearchCity(Parcel parcel) {
        this.f2198a = parcel.readString();
        this.b = parcel.readString();
        this.c = parcel.readString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getSearchCityAdCode() {
        return this.c;
    }

    public String getSearchCityName() {
        return this.f2198a;
    }

    public String getSearchCitycode() {
        return this.b;
    }

    public void setSearchCityName(String str) {
        this.f2198a = str;
    }

    public void setSearchCitycode(String str) {
        this.b = str;
    }

    public void setSearchCityhAdCode(String str) {
        this.c = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f2198a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
    }

    public SearchCity() {
    }
}
