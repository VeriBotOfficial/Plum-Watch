package com.amap.api.services.weather;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes11.dex */
public class LocalWeatherForecast implements Parcelable {
    public static final Parcelable.Creator<LocalWeatherForecast> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    private String f2220a;
    private String b;
    private String c;
    private String d;
    private List<LocalDayWeatherForecast> e;

    static class a implements Parcelable.Creator<LocalWeatherForecast> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        public LocalWeatherForecast createFromParcel(Parcel parcel) {
            return new LocalWeatherForecast(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ LocalWeatherForecast[] newArray(int i) {
            return null;
        }
    }

    public LocalWeatherForecast() {
        this.e = new ArrayList();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getAdCode() {
        return this.c;
    }

    public String getCity() {
        return this.b;
    }

    public String getProvince() {
        return this.f2220a;
    }

    public String getReportTime() {
        return this.d;
    }

    public List<LocalDayWeatherForecast> getWeatherForecast() {
        return this.e;
    }

    public void setAdCode(String str) {
        this.c = str;
    }

    public void setCity(String str) {
        this.b = str;
    }

    public void setProvince(String str) {
        this.f2220a = str;
    }

    public void setReportTime(String str) {
        this.d = str;
    }

    public void setWeatherForecast(List<LocalDayWeatherForecast> list) {
        this.e = list;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f2220a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeList(this.e);
    }

    public LocalWeatherForecast(Parcel parcel) {
        this.e = new ArrayList();
        this.f2220a = parcel.readString();
        this.b = parcel.readString();
        this.c = parcel.readString();
        this.d = parcel.readString();
        this.e = parcel.readArrayList(LocalWeatherForecast.class.getClassLoader());
    }
}
