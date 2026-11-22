package com.amap.api.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.amap.api.col.p0003sl.ja;
import com.amap.api.col.p0003sl.n1;
import com.amap.api.col.p0003sl.q4;
import com.amap.api.col.p0003sl.t4;
import com.amap.api.map3d.R;
import com.autonavi.aps.amapapi.config.Const;

/* loaded from: classes11.dex */
public final class CameraPosition implements Parcelable {
    private static final String CLASSNAME = "CameraPosition";
    public static final CameraPositionCreator CREATOR = new CameraPositionCreator();
    public final float bearing;
    public final boolean isAbroad;
    public final LatLng target;
    public final float tilt;
    public final float zoom;

    public static final class Builder {
        private float bearing;
        private LatLng target;
        private float tilt;
        private float zoom;

        public Builder() {
        }

        public Builder bearing(float f) {
            this.bearing = f;
            return this;
        }

        public CameraPosition build() {
            try {
                if (this.target != null) {
                    return new CameraPosition(this.target, this.zoom, this.tilt, this.bearing);
                }
                Log.w(CameraPosition.CLASSNAME, "target is null");
                return null;
            } catch (Throwable th) {
                ja.a(th, CameraPosition.CLASSNAME, "build");
                return null;
            }
        }

        public Builder target(LatLng latLng) {
            this.target = latLng;
            return this;
        }

        public Builder tilt(float f) {
            this.tilt = f;
            return this;
        }

        public Builder zoom(float f) {
            this.zoom = f;
            return this;
        }

        public Builder(CameraPosition cameraPosition) {
            target(cameraPosition.target).bearing(cameraPosition.bearing).tilt(cameraPosition.tilt).zoom(cameraPosition.zoom);
        }
    }

    public CameraPosition(LatLng latLng, float f, float f2, float f3) {
        if (latLng == null) {
            Log.w(CLASSNAME, n1.a(R.string.O105492_281));
        }
        this.target = latLng;
        this.zoom = f;
        this.tilt = f2;
        this.bearing = (((double) f3) <= 0.0d ? (f3 % 360.0f) + 360.0f : f3) % 360.0f;
        if (latLng != null) {
            this.isAbroad = !q4.b(latLng.latitude, latLng.longitude);
        } else {
            this.isAbroad = false;
        }
    }

    public static Builder builder() {
        return new Builder();
    }

    public static final CameraPosition fromLatLngZoom(LatLng latLng, float f) {
        return new CameraPosition(latLng, f, 0.0f, 0.0f);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CameraPosition)) {
            return false;
        }
        CameraPosition cameraPosition = (CameraPosition) obj;
        return this.target.equals(cameraPosition.target) && Float.floatToIntBits(this.zoom) == Float.floatToIntBits(cameraPosition.zoom) && Float.floatToIntBits(this.tilt) == Float.floatToIntBits(cameraPosition.tilt) && Float.floatToIntBits(this.bearing) == Float.floatToIntBits(cameraPosition.bearing);
    }

    public int hashCode() {
        return super.hashCode();
    }

    public String toString() {
        return t4.a(t4.a("target", this.target), t4.a("zoom", Float.valueOf(this.zoom)), t4.a("tilt", Float.valueOf(this.tilt)), t4.a(Const.JSON_KEY_BEARING, Float.valueOf(this.bearing)));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.bearing);
        parcel.writeFloat((float) this.target.latitude);
        parcel.writeFloat((float) this.target.longitude);
        parcel.writeFloat(this.tilt);
        parcel.writeFloat(this.zoom);
    }

    public static Builder builder(CameraPosition cameraPosition) {
        return new Builder(cameraPosition);
    }
}
