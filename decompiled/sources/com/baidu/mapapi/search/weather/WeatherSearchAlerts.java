package com.baidu.mapapi.search.weather;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes13.dex */
public class WeatherSearchAlerts implements Parcelable {
    public static final Parcelable.Creator<WeatherSearchAlerts> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    private String f8184a;
    private String b;
    private String c;
    private String d;

    static class a implements Parcelable.Creator<WeatherSearchAlerts> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public WeatherSearchAlerts createFromParcel(Parcel parcel) {
            return new WeatherSearchAlerts(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public WeatherSearchAlerts[] newArray(int i) {
            return new WeatherSearchAlerts[i];
        }
    }

    public WeatherSearchAlerts() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getDesc() {
        return this.d;
    }

    public String getLevel() {
        return this.b;
    }

    public String getTitle() {
        return this.c;
    }

    public String getType() {
        return this.f8184a;
    }

    public void setDesc(String str) {
        this.d = str;
    }

    public void setLevel(String str) {
        this.b = str;
    }

    public void setTitle(String str) {
        this.c = str;
    }

    public void setType(String str) {
        this.f8184a = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f8184a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
    }

    protected WeatherSearchAlerts(Parcel parcel) {
        this.f8184a = parcel.readString();
        this.b = parcel.readString();
        this.c = parcel.readString();
        this.d = parcel.readString();
    }
}
