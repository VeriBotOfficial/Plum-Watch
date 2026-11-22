package com.amap.api.maps.model;

import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.amap.api.col.p0003sl.t4;
import java.util.Arrays;

/* loaded from: classes11.dex */
public final class LatLngBounds implements Parcelable {
    private static final String CLASSNAME = "LatLngBounds";
    public static final LatLngBoundsCreator CREATOR = new LatLngBoundsCreator();
    private final int mVersionCode;
    public final LatLng northeast;
    public final LatLng southwest;

    public static final class Builder {
        private double mSouth = Double.POSITIVE_INFINITY;
        private double mNorth = Double.NEGATIVE_INFINITY;
        private double mWest = Double.NaN;
        private double mEast = Double.NaN;

        public LatLngBounds build() {
            if (Double.isNaN(this.mWest)) {
                Log.w(LatLngBounds.CLASSNAME, "no included points");
                return null;
            }
            double d = this.mWest;
            double d2 = this.mEast;
            if (d > d2) {
                this.mWest = d2;
                this.mEast = d;
            }
            double d3 = this.mSouth;
            double d4 = this.mNorth;
            if (d3 > d4) {
                this.mSouth = d4;
                this.mNorth = d3;
            }
            return new LatLngBounds(new LatLng(this.mSouth, this.mWest, false), new LatLng(this.mNorth, this.mEast, false));
        }

        public Builder include(LatLng latLng) {
            if (latLng == null) {
                return this;
            }
            this.mSouth = Math.min(this.mSouth, latLng.latitude);
            this.mNorth = Math.max(this.mNorth, latLng.latitude);
            double d = latLng.longitude;
            if (Double.isNaN(this.mWest)) {
                this.mWest = d;
                this.mEast = d;
                return this;
            }
            double d2 = this.mWest;
            double d3 = this.mEast;
            if (d2 > d3 ? !(d2 <= d || d <= d3) : !(d2 <= d && d <= d3)) {
                LatLngBoundsCreator latLngBoundsCreator = LatLngBounds.CREATOR;
                if (((d2 - d) + 360.0d) % 360.0d < ((d - d3) + 360.0d) % 360.0d) {
                    this.mWest = d;
                    return this;
                }
                this.mEast = d;
            }
            return this;
        }
    }

    LatLngBounds(int i, LatLng latLng, LatLng latLng2) {
        boolean z;
        try {
        } catch (Throwable th) {
            Log.e(CLASSNAME, "the structure parameters are illegal!");
            th.printStackTrace();
            z = false;
        }
        if (latLng == null) {
            throw new RuntimeRemoteException("null southwest");
        }
        if (latLng2 == null) {
            throw new RuntimeRemoteException("null northeast");
        }
        if (latLng2.latitude < latLng.latitude) {
            throw new RuntimeRemoteException("southern latitude exceeds northern latitude (" + latLng.latitude + " > " + latLng2.latitude + Separators.RPAREN);
        }
        z = true;
        this.mVersionCode = z ? i : 0;
        this.southwest = z ? latLng : null;
        this.northeast = z ? latLng2 : null;
    }

    public static Builder builder() {
        return new Builder();
    }

    int a() {
        return this.mVersionCode;
    }

    public boolean contains(LatLng latLng) {
        LatLng latLng2;
        if (latLng == null) {
            return false;
        }
        LatLng latLng3 = this.northeast;
        if (latLng3 == null || (latLng2 = this.southwest) == null) {
            Log.e(CLASSNAME, "current LatLngBounds is invalid, please check the structure parameters are legal");
            return false;
        }
        double d = latLng.latitude;
        return latLng2.latitude <= d && d <= latLng3.latitude && a(latLng.longitude);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LatLngBounds)) {
            return false;
        }
        LatLngBounds latLngBounds = (LatLngBounds) obj;
        return this.southwest.equals(latLngBounds.southwest) && this.northeast.equals(latLngBounds.northeast);
    }

    public int hashCode() {
        Object[] objArr = {this.southwest, this.northeast};
        int i = t4.b;
        return Arrays.hashCode(objArr);
    }

    public LatLngBounds including(LatLng latLng) {
        LatLng latLng2;
        double d;
        if (latLng == null) {
            return this;
        }
        if (this.northeast == null || (latLng2 = this.southwest) == null) {
            Log.e(CLASSNAME, "current LatLngBounds is invalid, please check the structure parameters are legal");
            return this;
        }
        double min = Math.min(latLng2.latitude, latLng.latitude);
        double max = Math.max(this.northeast.latitude, latLng.latitude);
        double d2 = this.northeast.longitude;
        double d3 = this.southwest.longitude;
        double d4 = latLng.longitude;
        try {
            if (!a(d4)) {
                if (((d3 - d4) + 360.0d) % 360.0d >= ((d4 - d2) + 360.0d) % 360.0d) {
                    d = d4;
                    return new LatLngBounds(new LatLng(min, d3, false), new LatLng(max, d, false));
                }
                d3 = d4;
            }
            return new LatLngBounds(new LatLng(min, d3, false), new LatLng(max, d, false));
        } catch (Throwable th) {
            th.printStackTrace();
            return this;
        }
        d = d2;
    }

    public boolean intersects(LatLngBounds latLngBounds) {
        if (latLngBounds == null) {
            return false;
        }
        if (this.northeast != null && this.southwest != null) {
            return a(latLngBounds) || latLngBounds.a(this);
        }
        Log.e(CLASSNAME, "current LatLngBounds is invalid, please check the structure parameters are legal");
        return false;
    }

    public String toString() {
        return t4.a(t4.a("southwest", this.southwest), t4.a("northeast", this.northeast));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(a());
        parcel.writeParcelable(this.southwest, i);
        parcel.writeParcelable(this.northeast, i);
    }

    private boolean a(LatLngBounds latLngBounds) {
        LatLng latLng;
        LatLng latLng2 = latLngBounds.northeast;
        if (latLng2 == null || (latLng = latLngBounds.southwest) == null) {
            return false;
        }
        double d = latLng2.longitude;
        double d2 = latLng.longitude;
        LatLng latLng3 = this.northeast;
        double d3 = latLng3.longitude;
        LatLng latLng4 = this.southwest;
        double d4 = latLng4.longitude;
        double d5 = ((d + d2) - d3) - d4;
        double d6 = ((d3 - d4) + d) - d2;
        double d7 = latLng2.latitude;
        double d8 = latLng.latitude;
        double d9 = latLng3.latitude;
        double d10 = latLng4.latitude;
        return Math.abs(d5) < d6 && Math.abs(((d7 + d8) - d9) - d10) < ((d9 - d10) + d7) - d8;
    }

    public boolean contains(LatLngBounds latLngBounds) {
        return latLngBounds != null && contains(latLngBounds.southwest) && contains(latLngBounds.northeast);
    }

    private boolean a(double d) {
        double d2 = this.southwest.longitude;
        double d3 = this.northeast.longitude;
        return d2 <= d3 ? d2 <= d && d <= d3 : d2 <= d || d <= d3;
    }

    public LatLngBounds(LatLng latLng, LatLng latLng2) {
        this(1, latLng, latLng2);
    }
}
