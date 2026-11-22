package com.baidu.mapapi.search.weather;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes13.dex */
public class WeatherSearchForecastForHours implements Parcelable {
    public static final Parcelable.Creator<WeatherSearchForecastForHours> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
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
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public WeatherSearchForecastForHours createFromParcel(Parcel parcel) {
            return new WeatherSearchForecastForHours(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public WeatherSearchForecastForHours[] newArray(int i) {
            return new WeatherSearchForecastForHours[i];
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

    public void setClouds(int i) {
        this.f = i;
    }

    public void setDataTime(String str) {
        this.b = str;
    }

    public void setHourlyPrecipitation(int i) {
        this.h = i;
    }

    public void setPhenomenon(String str) {
        this.g = str;
    }

    public void setRelativeHumidity(int i) {
        this.f8185a = i;
    }

    public void setTemperature(int i) {
        this.e = i;
    }

    public void setWindDirection(String str) {
        this.c = str;
    }

    public void setWindPower(String str) {
        this.d = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
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
