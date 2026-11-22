package com.amap.api.services.road;

import android.os.Parcel;
import android.os.Parcelable;
import com.amap.api.services.core.LatLonPoint;

/* loaded from: classes11.dex */
public class Road implements Parcelable {
    public static final Parcelable.Creator<Road> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    private String f2151a;
    private String b;
    private String c;
    private float d;
    private String e;
    private LatLonPoint f;

    static class a implements Parcelable.Creator<Road> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        public Road createFromParcel(Parcel parcel) {
            return new Road(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ Road[] newArray(int i) {
            return null;
        }
    }

    public Road() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public LatLonPoint getCenterPoint() {
        return this.f;
    }

    public String getCityCode() {
        return this.c;
    }

    public String getId() {
        return this.f2151a;
    }

    public String getName() {
        return this.b;
    }

    public float getRoadWidth() {
        return this.d;
    }

    public String getType() {
        return this.e;
    }

    public void setCenterPoint(LatLonPoint latLonPoint) {
        this.f = latLonPoint;
    }

    public void setCityCode(String str) {
        this.c = str;
    }

    public void setId(String str) {
        this.f2151a = str;
    }

    public void setName(String str) {
        this.b = str;
    }

    public void setRoadWidth(float f) {
        this.d = f;
    }

    public void setType(String str) {
        this.e = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f2151a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeFloat(this.d);
        parcel.writeString(this.e);
        parcel.writeValue(this.f);
    }

    public Road(String str, String str2) {
        this.f2151a = str;
        this.b = str2;
    }

    protected Road(Parcel parcel) {
        this.f2151a = parcel.readString();
        this.b = parcel.readString();
        this.c = parcel.readString();
        this.d = parcel.readFloat();
        this.e = parcel.readString();
        this.f = (LatLonPoint) parcel.readValue(LatLonPoint.class.getClassLoader());
    }
}
