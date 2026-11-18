package com.baidu.mapapi.search.weather;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes15.dex */
public class WeatherSearchForecasts implements Parcelable {
    public static final Parcelable.Creator<WeatherSearchForecasts> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f8186a;
    private String b;
    private int c;
    private int d;
    private String e;
    private String f;
    private String g;
    private String h;
    private String i;
    private String j;
    private int k;

    static class a implements Parcelable.Creator<WeatherSearchForecasts> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public WeatherSearchForecasts createFromParcel(Parcel parcel) {
            return new WeatherSearchForecasts(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public WeatherSearchForecasts[] newArray(int r1) {
            return new WeatherSearchForecasts[r1];
        }
    }

    public WeatherSearchForecasts() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getAirQualityIndex() {
        return this.k;
    }

    public String getDate() {
        return this.f8186a;
    }

    public int getHighestTemp() {
        return this.d;
    }

    public int getLowestTemp() {
        return this.c;
    }

    public String getPhenomenonDay() {
        return this.i;
    }

    public String getPhenomenonNight() {
        return this.j;
    }

    public String getWeek() {
        return this.b;
    }

    public String getWindDirectionDay() {
        return this.g;
    }

    public String getWindDirectionNight() {
        return this.h;
    }

    public String getWindPowerDay() {
        return this.e;
    }

    public String getWindPowerNight() {
        return this.f;
    }

    public void setAirQualityIndex(int r1) {
        this.k = r1;
    }

    public void setDate(String str) {
        this.f8186a = str;
    }

    public void setHighestTemp(int r1) {
        this.d = r1;
    }

    public void setLowestTemp(int r1) {
        this.c = r1;
    }

    public void setPhenomenonDay(String str) {
        this.i = str;
    }

    public void setPhenomenonNight(String str) {
        this.j = str;
    }

    public void setWeek(String str) {
        this.b = str;
    }

    public void setWindDirectionDay(String str) {
        this.g = str;
    }

    public void setWindDirectionNight(String str) {
        this.h = str;
    }

    public void setWindPowerDay(String str) {
        this.e = str;
    }

    public void setWindPowerNight(String str) {
        this.f = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int r2) {
        parcel.writeString(this.f8186a);
        parcel.writeString(this.b);
        parcel.writeInt(this.c);
        parcel.writeInt(this.d);
        parcel.writeString(this.e);
        parcel.writeString(this.f);
        parcel.writeString(this.g);
        parcel.writeString(this.h);
        parcel.writeString(this.i);
        parcel.writeString(this.j);
    }

    protected WeatherSearchForecasts(Parcel parcel) {
        this.f8186a = parcel.readString();
        this.b = parcel.readString();
        this.c = parcel.readInt();
        this.d = parcel.readInt();
        this.e = parcel.readString();
        this.f = parcel.readString();
        this.g = parcel.readString();
        this.h = parcel.readString();
        this.i = parcel.readString();
        this.j = parcel.readString();
    }
}
