package com.amap.api.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;

/* loaded from: classes11.dex */
public final class GroundOverlayOptions extends BaseOptions implements Parcelable, Cloneable {
    private static final String CLASSNAME = "GroundOverlayOptions";
    public static final GroundOverlayOptionsCreator CREATOR = new GroundOverlayOptionsCreator();
    public static final float NO_DIMENSION = -1.0f;
    private final double NF_PI;
    private final double R;
    private float anchorU;
    private float anchorV;
    private float bearing;
    private BitmapDescriptor bitmapDescriptor;
    private float height;
    private boolean isVisible;
    private LatLng latLng;
    private LatLngBounds latlngBounds;
    private final int mVersionCode;
    private LatLng northeast;
    private LatLng southwest;
    private float transparency;
    private float width;
    private float zIndex;

    GroundOverlayOptions(int i, LatLng latLng, float f, float f2, LatLngBounds latLngBounds, float f3, float f4, boolean z, float f5, float f6, float f7) {
        this.zIndex = 0.0f;
        this.isVisible = true;
        this.transparency = 0.0f;
        this.anchorU = 0.5f;
        this.anchorV = 0.5f;
        this.NF_PI = 0.01745329251994329d;
        this.R = 6371000.79d;
        this.mVersionCode = i;
        this.bitmapDescriptor = BitmapDescriptorFactory.fromBitmap(null);
        this.latLng = latLng;
        this.width = f;
        this.height = f2;
        this.latlngBounds = latLngBounds;
        this.bearing = f3;
        this.zIndex = f4;
        this.isVisible = z;
        this.transparency = f5;
        this.anchorU = f6;
        this.anchorV = f7;
        this.southwest = latLngBounds.southwest;
        this.northeast = latLngBounds.northeast;
        this.type = CLASSNAME;
    }

    private void a() {
        LatLng latLng = this.latLng;
        if (latLng == null) {
            return;
        }
        double cos = this.width / ((Math.cos(latLng.latitude * 0.01745329251994329d) * 6371000.79d) * 0.01745329251994329d);
        double d = this.height / 111194.94043265979d;
        try {
            LatLng latLng2 = this.latLng;
            LatLng latLng3 = new LatLng(latLng2.latitude - ((1.0f - this.anchorV) * d), latLng2.longitude - (this.anchorU * cos));
            LatLng latLng4 = this.latLng;
            LatLngBounds latLngBounds = new LatLngBounds(latLng3, new LatLng(latLng4.latitude + (this.anchorV * d), latLng4.longitude + ((1.0f - this.anchorU) * cos)));
            this.latlngBounds = latLngBounds;
            this.southwest = latLngBounds.southwest;
            this.northeast = latLngBounds.northeast;
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    private void b() {
        if (this.southwest == null || this.northeast == null) {
            return;
        }
        LatLng latLng = this.southwest;
        double d = latLng.latitude;
        double d2 = 1.0f - this.anchorV;
        LatLng latLng2 = this.northeast;
        double d3 = d + (d2 * (latLng2.latitude - d));
        double d4 = latLng.longitude;
        LatLng latLng3 = new LatLng(d3, d4 + (this.anchorU * (latLng2.longitude - d4)));
        this.latLng = latLng3;
        double cos = Math.cos(latLng3.latitude * 0.01745329251994329d) * 6371000.79d;
        LatLng latLng4 = this.northeast;
        double d5 = latLng4.longitude;
        LatLng latLng5 = this.southwest;
        this.width = (float) (cos * (d5 - latLng5.longitude) * 0.01745329251994329d);
        this.height = (float) ((latLng4.latitude - latLng5.latitude) * 6371000.79d * 0.01745329251994329d);
    }

    public GroundOverlayOptions anchor(float f, float f2) {
        this.anchorU = f;
        this.anchorV = f2;
        if (this.latlngBounds != null) {
            b();
            return this;
        }
        if (this.latLng != null) {
            a();
        }
        return this;
    }

    public GroundOverlayOptions bearing(float f) {
        this.bearing = f;
        return this;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public float getAnchorU() {
        return this.anchorU;
    }

    public float getAnchorV() {
        return this.anchorV;
    }

    public float getBearing() {
        return this.bearing;
    }

    public LatLngBounds getBounds() {
        return this.latlngBounds;
    }

    public float getHeight() {
        return this.height;
    }

    public BitmapDescriptor getImage() {
        return this.bitmapDescriptor;
    }

    public LatLng getLocation() {
        return this.latLng;
    }

    public float getTransparency() {
        return this.transparency;
    }

    public float getWidth() {
        return this.width;
    }

    public float getZIndex() {
        return this.zIndex;
    }

    public GroundOverlayOptions image(BitmapDescriptor bitmapDescriptor) {
        this.bitmapDescriptor = bitmapDescriptor;
        return this;
    }

    public boolean isVisible() {
        return this.isVisible;
    }

    public GroundOverlayOptions position(LatLng latLng, float f) {
        if (this.latlngBounds != null) {
            Log.w(CLASSNAME, "Position has already been set using positionFromBounds");
        }
        if (latLng == null) {
            Log.w(CLASSNAME, "Location must be specified");
        }
        if (f <= 0.0f) {
            Log.w(CLASSNAME, "Width must be non-negative");
        }
        this.latLng = latLng;
        this.width = f;
        this.height = f;
        a();
        return this;
    }

    public GroundOverlayOptions positionFromBounds(LatLngBounds latLngBounds) {
        this.latlngBounds = latLngBounds;
        this.southwest = latLngBounds.southwest;
        this.northeast = latLngBounds.northeast;
        b();
        return this;
    }

    public GroundOverlayOptions transparency(float f) {
        if (f < 0.0f) {
            Log.w(CLASSNAME, "Transparency must be in the range [0..1]");
            f = 0.0f;
        }
        this.transparency = f;
        return this;
    }

    public GroundOverlayOptions visible(boolean z) {
        this.isVisible = z;
        return this;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.mVersionCode);
        parcel.writeParcelable(this.bitmapDescriptor, i);
        parcel.writeParcelable(this.latLng, i);
        parcel.writeFloat(this.width);
        parcel.writeFloat(this.height);
        parcel.writeParcelable(this.latlngBounds, i);
        parcel.writeFloat(this.bearing);
        parcel.writeFloat(this.zIndex);
        parcel.writeByte(this.isVisible ? (byte) 1 : (byte) 0);
        parcel.writeFloat(this.transparency);
        parcel.writeFloat(this.anchorU);
        parcel.writeFloat(this.anchorV);
    }

    public GroundOverlayOptions zIndex(float f) {
        this.zIndex = f;
        return this;
    }

    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public GroundOverlayOptions m6876clone() {
        try {
            super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        GroundOverlayOptions groundOverlayOptions = new GroundOverlayOptions();
        groundOverlayOptions.bitmapDescriptor = this.bitmapDescriptor;
        groundOverlayOptions.latLng = this.latLng;
        groundOverlayOptions.width = this.width;
        groundOverlayOptions.height = this.height;
        groundOverlayOptions.latlngBounds = this.latlngBounds;
        groundOverlayOptions.bearing = this.bearing;
        groundOverlayOptions.zIndex = this.zIndex;
        groundOverlayOptions.isVisible = this.isVisible;
        groundOverlayOptions.transparency = this.transparency;
        groundOverlayOptions.anchorU = this.anchorU;
        groundOverlayOptions.anchorV = this.anchorV;
        groundOverlayOptions.southwest = this.southwest;
        groundOverlayOptions.northeast = this.northeast;
        return groundOverlayOptions;
    }

    public GroundOverlayOptions position(LatLng latLng, float f, float f2) {
        if (this.latlngBounds != null) {
            Log.w(CLASSNAME, "Position has already been set using positionFromBounds");
        }
        if (latLng == null) {
            Log.w(CLASSNAME, "Location must be specified");
        }
        if (f <= 0.0f || f2 <= 0.0f) {
            Log.w(CLASSNAME, "Width and Height must be non-negative");
        }
        this.latLng = latLng;
        this.width = f;
        this.height = f2;
        a();
        return this;
    }

    public GroundOverlayOptions() {
        this.zIndex = 0.0f;
        this.isVisible = true;
        this.transparency = 0.0f;
        this.anchorU = 0.5f;
        this.anchorV = 0.5f;
        this.NF_PI = 0.01745329251994329d;
        this.R = 6371000.79d;
        this.mVersionCode = 1;
        this.type = CLASSNAME;
    }
}
