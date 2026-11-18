package com.baidu.mapapi.search.weather;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes15.dex */
public class WeatherSearchRealTime implements Parcelable {
    public static final Parcelable.Creator<WeatherSearchRealTime> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f8189a;
    private int b;
    private String c;
    private String d;
    private String e;
    private int f;
    private String g;
    private int h;
    private float i;
    private int j;
    private int k;
    private int l;
    private int m;
    private int n;
    private int o;
    private int p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private float f8190q;

    static class a implements Parcelable.Creator<WeatherSearchRealTime> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public WeatherSearchRealTime createFromParcel(Parcel parcel) {
            return new WeatherSearchRealTime(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public WeatherSearchRealTime[] newArray(int r1) {
            return new WeatherSearchRealTime[r1];
        }
    }

    public WeatherSearchRealTime() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getAirQualityIndex() {
        return this.o;
    }

    public float getCO() {
        return this.f8190q;
    }

    public int getClouds() {
        return this.h;
    }

    public float getHourlyPrecipitation() {
        return this.i;
    }

    public int getNO2() {
        return this.m;
    }

    public int getO3() {
        return this.k;
    }

    public int getPM10() {
        return this.p;
    }

    public int getPM2_5() {
        return this.l;
    }

    public String getPhenomenon() {
        return this.c;
    }

    public int getRelativeHumidity() {
        return this.f8189a;
    }

    public int getSO2() {
        return this.n;
    }

    public int getSensoryTemp() {
        return this.b;
    }

    public int getTemperature() {
        return this.f;
    }

    public String getUpdateTime() {
        return this.e;
    }

    public int getVisibility() {
        return this.j;
    }

    public String getWindDirection() {
        return this.d;
    }

    public String getWindPower() {
        return this.g;
    }

    public void setAirQualityIndex(int r1) {
        this.o = r1;
    }

    public void setCO(float f) {
        this.f8190q = f;
    }

    public void setClouds(int r1) {
        this.h = r1;
    }

    public void setHourlyPrecipitation(float f) {
        this.i = f;
    }

    public void setNO2(int r1) {
        this.m = r1;
    }

    public void setO3(int r1) {
        this.k = r1;
    }

    public void setPM10(int r1) {
        this.p = r1;
    }

    public void setPM2_5(int r1) {
        this.l = r1;
    }

    public void setPhenomenon(String str) {
        this.c = str;
    }

    public void setRelativeHumidity(int r1) {
        this.f8189a = r1;
    }

    public void setSO2(int r1) {
        this.n = r1;
    }

    public void setSensoryTemp(int r1) {
        this.b = r1;
    }

    public void setTemperature(int r1) {
        this.f = r1;
    }

    public void setUpdateTime(String str) {
        this.e = str;
    }

    public void setVisibility(int r1) {
        this.j = r1;
    }

    public void setWindDirection(String str) {
        this.d = str;
    }

    public void setWindPower(String str) {
        this.g = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int r2) {
        parcel.writeInt(this.f8189a);
        parcel.writeInt(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        parcel.writeInt(this.f);
        parcel.writeString(this.g);
    }

    protected WeatherSearchRealTime(Parcel parcel) {
        this.f8189a = parcel.readInt();
        this.b = parcel.readInt();
        this.c = parcel.readString();
        this.d = parcel.readString();
        this.e = parcel.readString();
        this.f = parcel.readInt();
        this.g = parcel.readString();
    }
}
