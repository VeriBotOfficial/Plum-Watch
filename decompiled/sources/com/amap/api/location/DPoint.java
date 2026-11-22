package com.amap.api.location;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes11.dex */
public class DPoint implements Parcelable {
    public static final Parcelable.Creator<DPoint> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    private double f2021a;
    private double b;

    static class a implements Parcelable.Creator<DPoint> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        public DPoint createFromParcel(Parcel parcel) {
            return new DPoint(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public DPoint[] newArray(int i) {
            return new DPoint[i];
        }
    }

    public DPoint() {
        this.f2021a = 0.0d;
        this.b = 0.0d;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof DPoint)) {
            return false;
        }
        DPoint dPoint = (DPoint) obj;
        return this.b == dPoint.b && this.f2021a == dPoint.f2021a;
    }

    public double getLatitude() {
        return this.b;
    }

    public double getLongitude() {
        return this.f2021a;
    }

    public int hashCode() {
        return Double.valueOf((this.b + this.f2021a) * 1000000.0d).intValue();
    }

    public void setLatitude(double d) {
        if (d > 90.0d) {
            d = 90.0d;
        }
        if (d < -90.0d) {
            d = -90.0d;
        }
        this.b = d;
    }

    public void setLongitude(double d) {
        if (d > 180.0d) {
            d = 180.0d;
        }
        if (d < -180.0d) {
            d = -180.0d;
        }
        this.f2021a = d;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeDouble(this.f2021a);
        parcel.writeDouble(this.b);
    }

    public DPoint(double d, double d2) {
        this.f2021a = 0.0d;
        this.b = 0.0d;
        d2 = d2 > 180.0d ? 180.0d : d2;
        d2 = d2 < -180.0d ? -180.0d : d2;
        d = d > 90.0d ? 90.0d : d;
        d = d < -90.0d ? -90.0d : d;
        this.f2021a = d2;
        this.b = d;
    }

    protected DPoint(Parcel parcel) {
        this.f2021a = 0.0d;
        this.b = 0.0d;
        this.f2021a = parcel.readDouble();
        this.b = parcel.readDouble();
    }
}
