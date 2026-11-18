package com.baidu.mapapi.search.weather;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes15.dex */
public class WeatherLifeIndexes implements Parcelable {
    public static final Parcelable.Creator<WeatherLifeIndexes> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f8181a;
    private String b;
    private String c;

    static class a implements Parcelable.Creator<WeatherLifeIndexes> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public WeatherLifeIndexes createFromParcel(Parcel parcel) {
            return new WeatherLifeIndexes(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public WeatherLifeIndexes[] newArray(int r1) {
            return new WeatherLifeIndexes[r1];
        }
    }

    public WeatherLifeIndexes() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getBrief() {
        return this.b;
    }

    public String getDetail() {
        return this.c;
    }

    public String getName() {
        return this.f8181a;
    }

    public void setBrief(String str) {
        this.b = str;
    }

    public void setDetail(String str) {
        this.c = str;
    }

    public void setName(String str) {
        this.f8181a = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int r2) {
        parcel.writeString(getName());
        parcel.writeString(getBrief());
        parcel.writeString(getDetail());
    }

    protected WeatherLifeIndexes(Parcel parcel) {
        setName(parcel.readString());
        setBrief(parcel.readString());
        setDetail(parcel.readString());
    }
}
