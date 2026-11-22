package com.amap.api.services.routepoisearch;

import android.os.Parcel;
import android.os.Parcelable;
import com.amap.api.services.core.LatLonPoint;

/* loaded from: classes11.dex */
public class RoutePOIItem implements Parcelable {
    public static final Parcelable.Creator<RoutePOIItem> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    private String f2208a;
    private String b;
    private LatLonPoint c;
    private float d;
    private float e;
    private String f;

    static class a implements Parcelable.Creator<RoutePOIItem> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        public RoutePOIItem createFromParcel(Parcel parcel) {
            return new RoutePOIItem(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public RoutePOIItem[] newArray(int i) {
            return new RoutePOIItem[i];
        }
    }

    public RoutePOIItem() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getCPID() {
        return this.f;
    }

    public float getDistance() {
        return this.d;
    }

    public float getDuration() {
        return this.e;
    }

    public String getID() {
        return this.f2208a;
    }

    public LatLonPoint getPoint() {
        return this.c;
    }

    public String getTitle() {
        return this.b;
    }

    public void setCPID(String str) {
        this.f = str;
    }

    public void setDistance(float f) {
        this.d = f;
    }

    public void setDuration(float f) {
        this.e = f;
    }

    public void setID(String str) {
        this.f2208a = str;
    }

    public void setPoint(LatLonPoint latLonPoint) {
        this.c = latLonPoint;
    }

    public void setTitle(String str) {
        this.b = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f2208a);
        parcel.writeString(this.b);
        parcel.writeParcelable(this.c, i);
        parcel.writeFloat(this.d);
        parcel.writeFloat(this.e);
        parcel.writeString(this.f);
    }

    protected RoutePOIItem(Parcel parcel) {
        this.f2208a = parcel.readString();
        this.b = parcel.readString();
        this.c = (LatLonPoint) parcel.readParcelable(LatLonPoint.class.getClassLoader());
        this.d = parcel.readFloat();
        this.e = parcel.readFloat();
        this.f = parcel.readString();
    }
}
