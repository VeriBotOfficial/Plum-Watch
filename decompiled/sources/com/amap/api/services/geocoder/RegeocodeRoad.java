package com.amap.api.services.geocoder;

import android.os.Parcel;
import android.os.Parcelable;
import com.amap.api.services.core.LatLonPoint;

/* loaded from: classes11.dex */
public final class RegeocodeRoad implements Parcelable {
    public static final Parcelable.Creator<RegeocodeRoad> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    private String f2123a;
    private String b;
    private float c;
    private String d;
    private LatLonPoint e;

    static class a implements Parcelable.Creator<RegeocodeRoad> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        public RegeocodeRoad createFromParcel(Parcel parcel) {
            return new RegeocodeRoad(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ RegeocodeRoad[] newArray(int i) {
            return null;
        }
    }

    /* synthetic */ RegeocodeRoad(Parcel parcel, a aVar) {
        this(parcel);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getDirection() {
        return this.d;
    }

    public float getDistance() {
        return this.c;
    }

    public String getId() {
        return this.f2123a;
    }

    public LatLonPoint getLatLngPoint() {
        return this.e;
    }

    public String getName() {
        return this.b;
    }

    public void setDirection(String str) {
        this.d = str;
    }

    public void setDistance(float f) {
        this.c = f;
    }

    public void setId(String str) {
        this.f2123a = str;
    }

    public void setLatLngPoint(LatLonPoint latLonPoint) {
        this.e = latLonPoint;
    }

    public void setName(String str) {
        this.b = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f2123a);
        parcel.writeString(this.b);
        parcel.writeFloat(this.c);
        parcel.writeString(this.d);
        parcel.writeValue(this.e);
    }

    public RegeocodeRoad() {
    }

    private RegeocodeRoad(Parcel parcel) {
        this.f2123a = parcel.readString();
        this.b = parcel.readString();
        this.c = parcel.readFloat();
        this.d = parcel.readString();
        this.e = (LatLonPoint) parcel.readValue(LatLonPoint.class.getClassLoader());
    }
}
