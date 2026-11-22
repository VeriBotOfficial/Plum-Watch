package com.amap.api.services.route;

import android.os.Parcel;
import android.os.Parcelable;
import com.amap.api.services.core.LatLonPoint;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes11.dex */
public class TaxiItemV2 implements Parcelable {
    public static final Parcelable.Creator<TaxiItemV2> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    private LatLonPoint f2201a;
    private LatLonPoint b;
    private float c;
    private float d;
    private String e;
    private String f;
    private float g;
    private List<LatLonPoint> h;

    static class a implements Parcelable.Creator<TaxiItemV2> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        public TaxiItemV2 createFromParcel(Parcel parcel) {
            return new TaxiItemV2(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public TaxiItemV2[] newArray(int i) {
            return new TaxiItemV2[i];
        }
    }

    public TaxiItemV2() {
        this.h = new ArrayList();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public LatLonPoint getDestination() {
        return this.b;
    }

    public float getDistance() {
        return this.c;
    }

    public float getDuration() {
        return this.d;
    }

    public LatLonPoint getOrigin() {
        return this.f2201a;
    }

    public List<LatLonPoint> getPolyline() {
        return this.h;
    }

    public float getPrice() {
        return this.g;
    }

    public String getmSname() {
        return this.e;
    }

    public String getmTname() {
        return this.f;
    }

    public void setDestination(LatLonPoint latLonPoint) {
        this.b = latLonPoint;
    }

    public void setDistance(float f) {
        this.c = f;
    }

    public void setDuration(float f) {
        this.d = f;
    }

    public void setOrigin(LatLonPoint latLonPoint) {
        this.f2201a = latLonPoint;
    }

    public void setPolyline(List<LatLonPoint> list) {
        this.h = list;
    }

    public void setPrice(float f) {
        this.g = f;
    }

    public void setSname(String str) {
        this.e = str;
    }

    public void setTname(String str) {
        this.f = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f2201a, i);
        parcel.writeParcelable(this.b, i);
        parcel.writeFloat(this.c);
        parcel.writeFloat(this.d);
        parcel.writeString(this.e);
        parcel.writeString(this.f);
        parcel.writeFloat(this.g);
        parcel.writeTypedList(this.h);
    }

    protected TaxiItemV2(Parcel parcel) {
        this.h = new ArrayList();
        this.f2201a = (LatLonPoint) parcel.readParcelable(LatLonPoint.class.getClassLoader());
        this.b = (LatLonPoint) parcel.readParcelable(LatLonPoint.class.getClassLoader());
        this.c = parcel.readFloat();
        this.d = parcel.readFloat();
        this.e = parcel.readString();
        this.f = parcel.readString();
        this.g = parcel.readFloat();
        this.h = parcel.createTypedArrayList(LatLonPoint.CREATOR);
    }
}
