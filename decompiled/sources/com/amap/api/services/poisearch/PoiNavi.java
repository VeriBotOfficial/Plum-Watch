package com.amap.api.services.poisearch;

import android.os.Parcel;
import android.os.Parcelable;
import com.amap.api.services.core.LatLonPoint;

/* loaded from: classes11.dex */
public class PoiNavi implements Parcelable {
    public static final Parcelable.Creator<PoiNavi> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    private String f2139a;
    private LatLonPoint b;
    private LatLonPoint c;
    private String d;

    static class a implements Parcelable.Creator<PoiNavi> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        public PoiNavi createFromParcel(Parcel parcel) {
            return new PoiNavi(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ PoiNavi[] newArray(int i) {
            return null;
        }
    }

    public PoiNavi() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public LatLonPoint getEnter() {
        return this.b;
    }

    public LatLonPoint getExit() {
        return this.c;
    }

    public String getGridCode() {
        return this.d;
    }

    public String getNaviPoiID() {
        return this.f2139a;
    }

    public void setEnter(LatLonPoint latLonPoint) {
        this.b = latLonPoint;
    }

    public void setExit(LatLonPoint latLonPoint) {
        this.c = latLonPoint;
    }

    public void setGridCode(String str) {
        this.d = str;
    }

    public void setNaviPoiID(String str) {
        this.f2139a = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f2139a);
        parcel.writeValue(this.b);
        parcel.writeValue(this.c);
        parcel.writeString(this.d);
    }

    public PoiNavi(String str, LatLonPoint latLonPoint, LatLonPoint latLonPoint2, String str2) {
        this.f2139a = str;
        this.b = latLonPoint;
        this.c = latLonPoint2;
        this.d = str2;
    }

    public PoiNavi(Parcel parcel) {
        this.f2139a = parcel.readString();
        this.b = (LatLonPoint) parcel.readValue(LatLonPoint.class.getClassLoader());
        this.c = (LatLonPoint) parcel.readValue(LatLonPoint.class.getClassLoader());
        this.d = parcel.readString();
    }
}
