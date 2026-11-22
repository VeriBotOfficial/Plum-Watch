package com.amap.api.maps.model;

import android.os.BadParcelableException;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes11.dex */
public class VisibleRegionCreator implements Parcelable.Creator<VisibleRegion> {
    public static final int CONTENT_DESCRIPTION = 0;

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.os.Parcelable.Creator
    public VisibleRegion createFromParcel(Parcel parcel) {
        BadParcelableException badParcelableException;
        LatLng latLng;
        LatLng latLng2;
        LatLng latLng3;
        LatLng latLng4;
        LatLngBounds latLngBounds;
        LatLng latLng5;
        LatLng latLng6;
        LatLng latLng7;
        LatLng latLng8;
        int readInt = parcel.readInt();
        try {
            latLng = (LatLng) parcel.readParcelable(LatLng.class.getClassLoader());
            try {
                latLng2 = (LatLng) parcel.readParcelable(LatLng.class.getClassLoader());
            } catch (BadParcelableException e) {
                badParcelableException = e;
                latLng2 = null;
                latLng3 = latLng2;
                latLng4 = latLng3;
                badParcelableException.printStackTrace();
                LatLng latLng9 = latLng4;
                latLngBounds = null;
                latLng5 = latLng;
                latLng6 = latLng2;
                latLng7 = latLng3;
                latLng8 = latLng9;
                return new VisibleRegion(readInt, latLng5, latLng6, latLng7, latLng8, latLngBounds);
            }
            try {
                latLng3 = (LatLng) parcel.readParcelable(LatLng.class.getClassLoader());
                try {
                    latLng4 = (LatLng) parcel.readParcelable(LatLng.class.getClassLoader());
                } catch (BadParcelableException e2) {
                    badParcelableException = e2;
                    latLng4 = null;
                }
            } catch (BadParcelableException e3) {
                badParcelableException = e3;
                latLng3 = null;
                latLng4 = latLng3;
                badParcelableException.printStackTrace();
                LatLng latLng92 = latLng4;
                latLngBounds = null;
                latLng5 = latLng;
                latLng6 = latLng2;
                latLng7 = latLng3;
                latLng8 = latLng92;
                return new VisibleRegion(readInt, latLng5, latLng6, latLng7, latLng8, latLngBounds);
            }
        } catch (BadParcelableException e4) {
            badParcelableException = e4;
            latLng = null;
            latLng2 = null;
        }
        try {
            latLng5 = latLng;
            latLng6 = latLng2;
            latLng7 = latLng3;
            latLng8 = latLng4;
            latLngBounds = (LatLngBounds) parcel.readParcelable(LatLngBounds.class.getClassLoader());
        } catch (BadParcelableException e5) {
            badParcelableException = e5;
            badParcelableException.printStackTrace();
            LatLng latLng922 = latLng4;
            latLngBounds = null;
            latLng5 = latLng;
            latLng6 = latLng2;
            latLng7 = latLng3;
            latLng8 = latLng922;
            return new VisibleRegion(readInt, latLng5, latLng6, latLng7, latLng8, latLngBounds);
        }
        return new VisibleRegion(readInt, latLng5, latLng6, latLng7, latLng8, latLngBounds);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.os.Parcelable.Creator
    public VisibleRegion[] newArray(int i) {
        return new VisibleRegion[i];
    }
}
