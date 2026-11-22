package com.amap.api.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import com.amap.api.maps.model.BaseOptions;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes11.dex */
public final class MarkerOptions extends BaseOptions implements Parcelable, Cloneable {
    public static final MarkerOptionsCreator CREATOR = new MarkerOptionsCreator();

    /* renamed from: a, reason: collision with root package name */
    String f2052a;
    private LatLng gpsLatLng;
    private boolean isBelowMaskLayer;
    private LatLng latLng;
    private float rotate;
    private int screenX;
    private int screenY;
    private String snippet;
    private String title;
    private float anchorU = 0.5f;
    private float anchorV = 1.0f;
    private float zIndex = 0.0f;
    private boolean isDraggable = false;
    private boolean isVisible = true;
    private float altitude = 0.0f;
    private boolean isOpenCollisionDetection = false;
    private boolean perspective = false;
    private int offsetX = 0;
    private int offsetY = 0;
    private List<BitmapDescriptor> bitmapDescriptors = new ArrayList();
    private int period = 20;
    private boolean isGps = false;
    private boolean isFlat = false;
    private boolean isRotatingMode = false;
    private float angleOffset = 0.0f;
    private boolean isViewMode = false;
    private View iconView = null;
    private float alpha = 1.0f;
    private boolean autoOverturn = false;
    private boolean infoWindowEnabled = true;
    private int dispLevel = 5;
    private MarkerUpdateFlags updateFlags = new MarkerUpdateFlags();

    public static class MarkerUpdateFlags extends BaseOptions.BaseUpdateFlags {
        public boolean latlngUpdate = false;
        public boolean gpsLatLngUpdate = false;
        public boolean bitmapDescriptorsUpdate = false;
        public boolean anchorUpdate = false;

        @Override // com.amap.api.maps.model.BaseOptions.BaseUpdateFlags
        public void reset() {
            super.reset();
            this.latlngUpdate = false;
            this.gpsLatLngUpdate = false;
            this.bitmapDescriptorsUpdate = false;
            this.anchorUpdate = false;
        }
    }

    public MarkerOptions() {
        this.type = "MarkerOptions";
    }

    private void a() {
        LatLng latLng;
        try {
            if (!this.isGps || (latLng = this.latLng) == null) {
                return;
            }
            double[] a2 = com.autonavi.util.a.a(latLng.longitude, latLng.latitude);
            this.gpsLatLng = new LatLng(a2[1], a2[0]);
            this.updateFlags.gpsLatLngUpdate = true;
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public MarkerOptions alpha(float f) {
        this.alpha = f;
        return this;
    }

    public MarkerOptions altitude(float f) {
        this.altitude = f;
        return this;
    }

    public MarkerOptions anchor(float f, float f2) {
        this.anchorU = f;
        this.anchorV = f2;
        this.updateFlags.anchorUpdate = true;
        return this;
    }

    protected MarkerOptions angleOffset(float f) {
        this.angleOffset = f;
        return this;
    }

    public MarkerOptions autoOverturnInfoWindow(boolean z) {
        this.autoOverturn = z;
        return this;
    }

    public MarkerOptions belowMaskLayer(boolean z) {
        this.isBelowMaskLayer = z;
        return this;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public MarkerOptions displayLevel(int i) {
        this.dispLevel = i;
        return this;
    }

    public MarkerOptions draggable(boolean z) {
        this.isDraggable = z;
        return this;
    }

    public float getAlpha() {
        return this.alpha;
    }

    public float getAltitude() {
        return this.altitude;
    }

    public float getAnchorU() {
        return this.anchorU;
    }

    public float getAnchorV() {
        return this.anchorV;
    }

    public float getAngleOffset() {
        return this.angleOffset;
    }

    public int getDisplayLevel() {
        return this.dispLevel;
    }

    public BitmapDescriptor getIcon() {
        List<BitmapDescriptor> list = this.bitmapDescriptors;
        if (list == null || list.size() == 0) {
            return null;
        }
        return this.bitmapDescriptors.get(0);
    }

    public View getIconView() {
        return this.iconView;
    }

    public ArrayList<BitmapDescriptor> getIcons() {
        return (ArrayList) this.bitmapDescriptors;
    }

    public int getInfoWindowOffsetX() {
        return this.offsetX;
    }

    public int getInfoWindowOffsetY() {
        return this.offsetY;
    }

    public int getPeriod() {
        return this.period;
    }

    public LatLng getPosition() {
        return this.latLng;
    }

    public float getRotateAngle() {
        return this.rotate;
    }

    protected int getScreenX() {
        return this.screenX;
    }

    protected int getScreenY() {
        return this.screenY;
    }

    public String getSnippet() {
        return this.snippet;
    }

    public String getTitle() {
        return this.title;
    }

    public float getZIndex() {
        return this.zIndex;
    }

    public MarkerOptions icon(BitmapDescriptor bitmapDescriptor) {
        try {
            if (this.bitmapDescriptors == null) {
                try {
                    this.bitmapDescriptors = new ArrayList();
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
            this.bitmapDescriptors.clear();
            this.bitmapDescriptors.add(bitmapDescriptor);
            this.isRotatingMode = false;
            this.updateFlags.bitmapDescriptorsUpdate = true;
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
        return this;
    }

    public MarkerOptions icons(ArrayList<BitmapDescriptor> arrayList) {
        if (arrayList != null && arrayList.size() > 0) {
            this.bitmapDescriptors = arrayList;
            this.isRotatingMode = false;
            this.updateFlags.bitmapDescriptorsUpdate = true;
        }
        return this;
    }

    public MarkerOptions infoWindowEnable(boolean z) {
        this.infoWindowEnabled = z;
        return this;
    }

    public boolean isBelowMaskLayer() {
        return this.isBelowMaskLayer;
    }

    public boolean isDraggable() {
        return this.isDraggable;
    }

    public boolean isFlat() {
        return this.isFlat;
    }

    public boolean isGps() {
        return this.isGps;
    }

    public boolean isInfoWindowAutoOverturn() {
        return this.autoOverturn;
    }

    public boolean isInfoWindowEnable() {
        return this.infoWindowEnabled;
    }

    public MarkerOptions isOpenCollisionDetection(boolean z) {
        this.isOpenCollisionDetection = z;
        return this;
    }

    public boolean isPerspective() {
        return this.perspective;
    }

    public boolean isRotatingMode() {
        return this.isRotatingMode;
    }

    protected boolean isViewMode() {
        return this.isViewMode;
    }

    public boolean isVisible() {
        return this.isVisible;
    }

    public MarkerOptions period(int i) {
        if (i <= 1) {
            this.period = 1;
            return this;
        }
        this.period = i;
        return this;
    }

    public MarkerOptions perspective(boolean z) {
        this.perspective = z;
        return this;
    }

    public MarkerOptions position(LatLng latLng) {
        this.latLng = latLng;
        this.isViewMode = false;
        a();
        this.updateFlags.latlngUpdate = true;
        return this;
    }

    @Override // com.amap.api.maps.model.BaseOptions
    public void resetUpdateFlags() {
        this.updateFlags.reset();
    }

    public MarkerOptions rotateAngle(float f) {
        this.rotate = f;
        return this;
    }

    public MarkerOptions rotatingIcons(ArrayList<BitmapDescriptor> arrayList, float f) {
        if (arrayList != null && arrayList.size() > 0) {
            this.bitmapDescriptors = arrayList;
            if (f != 0.0f) {
                this.angleOffset = f;
            } else {
                this.angleOffset = 360.0f / arrayList.size();
            }
            this.isRotatingMode = true;
            this.updateFlags.bitmapDescriptorsUpdate = true;
        }
        return this;
    }

    public MarkerOptions setFlat(boolean z) {
        this.isFlat = z;
        return this;
    }

    public MarkerOptions setGps(boolean z) {
        this.isGps = z;
        a();
        return this;
    }

    public MarkerOptions setInfoWindowOffset(int i, int i2) {
        this.offsetX = i;
        this.offsetY = i2;
        return this;
    }

    protected MarkerOptions setRotatingMode(boolean z) {
        this.isRotatingMode = z;
        return this;
    }

    protected void setScreenPosition(int i, int i2) {
        this.screenX = i;
        this.screenY = i2;
        this.isViewMode = true;
    }

    public MarkerOptions snippet(String str) {
        this.snippet = str;
        return this;
    }

    public MarkerOptions title(String str) {
        this.title = str;
        return this;
    }

    public MarkerOptions visible(boolean z) {
        this.isVisible = z;
        return this;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.latLng, i);
        parcel.writeString(this.title);
        parcel.writeString(this.snippet);
        parcel.writeFloat(this.anchorU);
        parcel.writeFloat(this.anchorV);
        parcel.writeInt(this.offsetX);
        parcel.writeInt(this.offsetY);
        parcel.writeBooleanArray(new boolean[]{this.isVisible, this.isDraggable, this.isGps, this.isFlat, this.autoOverturn, this.infoWindowEnabled, this.isBelowMaskLayer, this.isRotatingMode, this.isOpenCollisionDetection});
        parcel.writeString(this.f2052a);
        parcel.writeInt(this.period);
        parcel.writeList(this.bitmapDescriptors);
        parcel.writeFloat(this.zIndex);
        parcel.writeFloat(this.alpha);
        parcel.writeInt(this.dispLevel);
        parcel.writeFloat(this.rotate);
        parcel.writeFloat(this.angleOffset);
        parcel.writeInt(this.screenX);
        parcel.writeInt(this.screenY);
        parcel.writeFloat(this.altitude);
        List<BitmapDescriptor> list = this.bitmapDescriptors;
        if (list == null || list.size() == 0) {
            return;
        }
        parcel.writeParcelable(this.bitmapDescriptors.get(0), i);
    }

    public MarkerOptions zIndex(float f) {
        if (this.zIndex != f) {
            this.updateFlags.zIndexUpdate = true;
        }
        this.zIndex = f;
        return this;
    }

    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public MarkerOptions m6878clone() {
        try {
            super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        MarkerOptions markerOptions = new MarkerOptions();
        markerOptions.latLng = this.latLng;
        markerOptions.gpsLatLng = this.gpsLatLng;
        markerOptions.title = this.title;
        markerOptions.snippet = this.snippet;
        markerOptions.anchorU = this.anchorU;
        markerOptions.anchorV = this.anchorV;
        markerOptions.zIndex = this.zIndex;
        markerOptions.isDraggable = this.isDraggable;
        markerOptions.isVisible = this.isVisible;
        markerOptions.f2052a = this.f2052a;
        markerOptions.perspective = this.perspective;
        markerOptions.offsetX = this.offsetX;
        markerOptions.offsetY = this.offsetY;
        markerOptions.bitmapDescriptors = this.bitmapDescriptors;
        markerOptions.period = this.period;
        markerOptions.isGps = this.isGps;
        markerOptions.isFlat = this.isFlat;
        markerOptions.isRotatingMode = this.isRotatingMode;
        markerOptions.angleOffset = this.angleOffset;
        markerOptions.screenX = this.screenX;
        markerOptions.screenY = this.screenY;
        markerOptions.isViewMode = this.isViewMode;
        markerOptions.alpha = this.alpha;
        markerOptions.autoOverturn = this.autoOverturn;
        markerOptions.infoWindowEnabled = this.infoWindowEnabled;
        markerOptions.dispLevel = this.dispLevel;
        markerOptions.rotate = this.rotate;
        markerOptions.isBelowMaskLayer = this.isBelowMaskLayer;
        markerOptions.updateFlags = this.updateFlags;
        markerOptions.altitude = this.altitude;
        markerOptions.isOpenCollisionDetection = this.isOpenCollisionDetection;
        markerOptions.iconView = this.iconView;
        return markerOptions;
    }

    @Override // com.amap.api.maps.model.BaseOptions
    public MarkerUpdateFlags getUpdateFlags() {
        return this.updateFlags;
    }

    public MarkerOptions icon(View view) {
        try {
            this.iconView = view;
            return this;
        } catch (Exception e) {
            e.printStackTrace();
            return this;
        }
    }
}
