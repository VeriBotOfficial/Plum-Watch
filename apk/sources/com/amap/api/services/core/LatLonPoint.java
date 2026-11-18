package com.amap.api.services.core;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public class LatLonPoint implements Parcelable {
    public static final Parcelable.Creator<LatLonPoint> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private double f2102a;
    private double b;

    static class a implements Parcelable.Creator<LatLonPoint> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        public LatLonPoint createFromParcel(Parcel parcel) {
            return new LatLonPoint(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public LatLonPoint[] newArray(int r1) {
            return new LatLonPoint[r1];
        }
    }

    public LatLonPoint(double d, double d2) {
        this.f2102a = d;
        this.b = d2;
    }

    public LatLonPoint copy() {
        return new LatLonPoint(this.f2102a, this.b);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        LatLonPoint latLonPoint = (LatLonPoint) obj;
        return Double.doubleToLongBits(this.f2102a) == Double.doubleToLongBits(latLonPoint.f2102a) && Double.doubleToLongBits(this.b) == Double.doubleToLongBits(latLonPoint.b);
    }

    public double getLatitude() {
        return this.f2102a;
    }

    public double getLongitude() {
        return this.b;
    }

    public int hashCode() {
        long jDoubleToLongBits = Double.doubleToLongBits(this.f2102a);
        int r0 = ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32))) + 31;
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.b);
        return (r0 * 31) + ((int) ((jDoubleToLongBits2 >>> 32) ^ jDoubleToLongBits2));
    }

    public void setLatitude(double d) {
        this.f2102a = d;
    }

    public void setLongitude(double d) {
        this.b = d;
    }

    public String toString() {
        return "" + this.f2102a + "," + this.b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int r4) {
        parcel.writeDouble(this.f2102a);
        parcel.writeDouble(this.b);
    }

    protected LatLonPoint(Parcel parcel) {
        this.f2102a = parcel.readDouble();
        this.b = parcel.readDouble();
    }
}
