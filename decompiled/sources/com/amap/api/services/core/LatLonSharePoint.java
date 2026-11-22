package com.amap.api.services.core;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes11.dex */
public class LatLonSharePoint extends LatLonPoint implements Parcelable {
    public static final Parcelable.Creator<LatLonSharePoint> CREATOR = new a();
    private String c;

    static class a implements Parcelable.Creator<LatLonSharePoint> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        public LatLonSharePoint createFromParcel(Parcel parcel) {
            return new LatLonSharePoint(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public LatLonSharePoint[] newArray(int i) {
            return new LatLonSharePoint[i];
        }
    }

    public LatLonSharePoint(double d, double d2, String str) {
        super(d, d2);
        this.c = str;
    }

    @Override // com.amap.api.services.core.LatLonPoint, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.amap.api.services.core.LatLonPoint
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!super.equals(obj) || getClass() != obj.getClass()) {
            return false;
        }
        LatLonSharePoint latLonSharePoint = (LatLonSharePoint) obj;
        String str = this.c;
        if (str == null) {
            if (latLonSharePoint.c != null) {
                return false;
            }
        } else if (!str.equals(latLonSharePoint.c)) {
            return false;
        }
        return true;
    }

    public String getSharePointName() {
        return this.c;
    }

    @Override // com.amap.api.services.core.LatLonPoint
    public int hashCode() {
        int hashCode = super.hashCode() * 31;
        String str = this.c;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public void setSharePointName(String str) {
        this.c = str;
    }

    @Override // com.amap.api.services.core.LatLonPoint
    public String toString() {
        return super.toString() + "," + this.c;
    }

    @Override // com.amap.api.services.core.LatLonPoint, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.c);
    }

    protected LatLonSharePoint(Parcel parcel) {
        super(parcel);
        this.c = parcel.readString();
    }
}
