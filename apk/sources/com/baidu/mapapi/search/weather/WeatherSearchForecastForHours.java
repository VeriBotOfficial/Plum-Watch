package com.baidu.mapapi.search.weather;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes15.dex */
public class WeatherSearchForecastForHours implements Parcelable {
    public static final Parcelable.Creator<WeatherSearchForecastForHours> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f8185a;
    private String b;
    private String c;
    private String d;
    private int e;
    private int f;
    private String g;
    private int h;

    static class a implements Parcelable.Creator<WeatherSearchForecastForHours> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public WeatherSearchForecastForHours createFromParcel(Parcel parcel) {
            return new WeatherSearchForecastForHours(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public WeatherSearchForecastForHours[] newArray(int r1) {
            return new WeatherSearchForecastForHours[r1];
        }
    }

    public WeatherSearchForecastForHours() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getClouds() {
        return this.f;
    }

    public String getDataTime() {
        return this.b;
    }

    public int getHourlyPrecipitation() {
        return this.h;
    }

    public String getPhenomenon() {
        return this.g;
    }

    public int getRelativeHumidity() {
        return this.f8185a;
    }

    public int getTemperature() {
        return this.e;
    }

    public String getWindDirection() {
        return this.c;
    }

    public String getWindPower() {
        return this.d;
    }

    public void setClouds(int r1) {
        this.f = r1;
    }

    public void setDataTime(String str) {
        this.b = str;
    }

    public void setHourlyPrecipitation(int r1) {
        this.h = r1;
    }

    public void setPhenomenon(String str) {
        this.g = str;
    }

    public void setRelativeHumidity(int r1) {
        this.f8185a = r1;
    }

    public void setTemperature(int r1) {
        this.e = r1;
    }

    public void setWindDirection(String str) {
        this.c = str;
    }

    public void setWindPower(String str) {
        this.d = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int r2) {
        parcel.writeInt(this.f8185a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeInt(this.e);
        parcel.writeInt(this.f);
        parcel.writeString(this.g);
        parcel.writeInt(this.h);
    }

    protected WeatherSearchForecastForHours(Parcel parcel) {
        this.f8185a = parcel.readInt();
        this.b = parcel.readString();
        this.c = parcel.readString();
        this.d = parcel.readString();
        this.e = parcel.readInt();
        this.f = parcel.readInt();
        this.g = parcel.readString();
        this.h = parcel.readInt();
    }
}
