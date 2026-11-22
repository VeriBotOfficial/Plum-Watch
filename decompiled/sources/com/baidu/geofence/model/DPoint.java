package com.baidu.geofence.model;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes13.dex */
public class DPoint implements Parcelable {
    public static final Parcelable.Creator<DPoint> CREATOR = new Parcelable.Creator<DPoint>() { // from class: com.baidu.geofence.model.DPoint.1
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public DPoint createFromParcel(Parcel parcel) {
            return new DPoint(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public DPoint[] newArray(int i) {
            return new DPoint[i];
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private double f7484a;
    private double b;

    public DPoint(double d, double d2) {
        this.f7484a = d;
        this.b = d2;
    }

    private DPoint(Parcel parcel) {
        this.f7484a = parcel.readDouble();
        this.b = parcel.readDouble();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public double getLatitude() {
        return this.f7484a;
    }

    public double getLongitude() {
        return this.b;
    }

    public void setLatitude(double d) {
        this.f7484a = d;
    }

    public void setLongitude(double d) {
        this.b = d;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeDouble(this.f7484a);
        parcel.writeDouble(this.b);
    }
}
