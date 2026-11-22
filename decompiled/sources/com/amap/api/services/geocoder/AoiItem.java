package com.amap.api.services.geocoder;

import android.os.Parcel;
import android.os.Parcelable;
import com.amap.api.services.core.LatLonPoint;

/* loaded from: classes11.dex */
public class AoiItem implements Parcelable {
    public static final Parcelable.Creator<AoiItem> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    private String f2113a;
    private String b;
    private String c;
    private LatLonPoint d;
    private Float e;
    private float f;
    private String g;

    static class a implements Parcelable.Creator<AoiItem> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        public AoiItem createFromParcel(Parcel parcel) {
            return new AoiItem(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public AoiItem[] newArray(int i) {
            return new AoiItem[i];
        }
    }

    public AoiItem() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getAdCode() {
        return this.c;
    }

    public Float getAoiArea() {
        return this.e;
    }

    public LatLonPoint getAoiCenterPoint() {
        return this.d;
    }

    public String getAoiId() {
        return this.f2113a;
    }

    public String getAoiName() {
        return this.b;
    }

    public float getDistance() {
        return this.f;
    }

    public String getType() {
        return this.g;
    }

    public void setAdcode(String str) {
        this.c = str;
    }

    public void setArea(Float f) {
        this.e = f;
    }

    public void setDistance(float f) {
        this.f = f;
    }

    public void setId(String str) {
        this.f2113a = str;
    }

    public void setLocation(LatLonPoint latLonPoint) {
        this.d = latLonPoint;
    }

    public void setName(String str) {
        this.b = str;
    }

    public void setType(String str) {
        this.g = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f2113a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeParcelable(this.d, i);
        parcel.writeFloat(this.e.floatValue());
        parcel.writeFloat(this.f);
        parcel.writeString(this.g);
    }

    public AoiItem(Parcel parcel) {
        this.f2113a = parcel.readString();
        this.b = parcel.readString();
        this.c = parcel.readString();
        this.d = (LatLonPoint) parcel.readParcelable(LatLonPoint.class.getClassLoader());
        this.e = Float.valueOf(parcel.readFloat());
        this.f = parcel.readFloat();
        this.g = parcel.readString();
    }
}
