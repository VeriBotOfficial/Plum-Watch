package com.amap.api.maps.model;

import android.graphics.Point;
import android.text.TextUtils;
import android.util.Log;
import com.amap.api.col.p0003sl.qc;
import com.amap.api.col.p0003sl.s4;
import com.amap.api.maps.interfaces.IGlOverlayLayer;
import com.amap.api.maps.interfaces.INativeOverlayLayer;
import com.amap.api.maps.model.animation.Animation;
import com.autonavi.amap.mapcore.DPoint;
import com.autonavi.amap.mapcore.IPoint;
import com.autonavi.amap.mapcore.VirtualEarthProjection;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* loaded from: classes11.dex */
public final class Marker extends BasePointOverlay {
    private IPoint geoPoint;
    private WeakReference<IGlOverlayLayer> glOverlayLayerRef;
    private boolean isClickable;
    private boolean isInfoWindowEnable;
    private boolean isRemoved;
    private boolean isUseAnimation;
    private Animation mCurAnimation;
    private Animation.AnimationListener mCurAnimationListener;
    private b mCurInnerAnimationListener;
    private WeakReference<INativeOverlayLayer> nativeOverlayLayerRef;
    private Object object;
    private MarkerOptions options;
    private LatLng viewModeLatLng;
    private DPoint viewModeLatLngDp;

    private class b implements Animation.AnimationListener {

        /* renamed from: a, reason: collision with root package name */
        private final qc f2049a;
        private final qc b;

        class a extends qc {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Animation.AnimationListener f2050a;

            a(b bVar, Marker marker, Animation.AnimationListener animationListener) {
                this.f2050a = animationListener;
            }

            @Override // com.amap.api.col.p0003sl.qc
            public void runTask() {
                try {
                    Animation.AnimationListener animationListener = this.f2050a;
                    if (animationListener != null) {
                        animationListener.onAnimationStart();
                    }
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        }

        /* renamed from: com.amap.api.maps.model.Marker$b$b, reason: collision with other inner class name */
        class C0115b extends qc {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Animation.AnimationListener f2051a;

            C0115b(b bVar, Marker marker, Animation.AnimationListener animationListener) {
                this.f2051a = animationListener;
            }

            @Override // com.amap.api.col.p0003sl.qc
            public void runTask() {
                try {
                    Animation.AnimationListener animationListener = this.f2051a;
                    if (animationListener != null) {
                        animationListener.onAnimationEnd();
                    }
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        }

        @Override // com.amap.api.maps.model.animation.Animation.AnimationListener
        public void onAnimationEnd() {
            s4.b().a(this.b);
        }

        @Override // com.amap.api.maps.model.animation.Animation.AnimationListener
        public void onAnimationStart() {
            s4.b().a(this.f2049a);
        }

        private b(Marker marker, Animation.AnimationListener animationListener) {
            this.f2049a = new a(this, marker, animationListener);
            this.b = new C0115b(this, marker, animationListener);
        }
    }

    public Marker(IGlOverlayLayer iGlOverlayLayer, INativeOverlayLayer iNativeOverlayLayer, MarkerOptions markerOptions, String str) {
        super(str);
        this.isRemoved = false;
        this.viewModeLatLngDp = new DPoint();
        this.viewModeLatLng = null;
        this.isUseAnimation = false;
        this.mCurAnimation = null;
        this.mCurAnimationListener = null;
        this.mCurInnerAnimationListener = null;
        this.isClickable = true;
        this.isInfoWindowEnable = true;
        this.glOverlayLayerRef = new WeakReference<>(iGlOverlayLayer);
        this.nativeOverlayLayerRef = new WeakReference<>(iNativeOverlayLayer);
        this.options = markerOptions;
    }

    private Object callNativeFunction(String str, Object[] objArr) {
        try {
            IGlOverlayLayer iGlOverlayLayer = this.glOverlayLayerRef.get();
            if (TextUtils.isEmpty(this.overlayName) || iGlOverlayLayer == null) {
                return null;
            }
            return iGlOverlayLayer.getNativeProperties(this.overlayName, str, objArr);
        } catch (Throwable unused) {
            return null;
        }
    }

    private void updateOption() {
        try {
            if (isIconView()) {
                INativeOverlayLayer iNativeOverlayLayer = this.nativeOverlayLayerRef.get();
                if (TextUtils.isEmpty(this.overlayName) || iNativeOverlayLayer == null) {
                    return;
                }
                iNativeOverlayLayer.updateOverlayOption(this.overlayName, this.options);
                return;
            }
            IGlOverlayLayer iGlOverlayLayer = this.glOverlayLayerRef.get();
            if (TextUtils.isEmpty(this.overlayName) || iGlOverlayLayer == null) {
                return;
            }
            iGlOverlayLayer.updateOption(this.overlayName, this.options);
        } catch (Throwable unused) {
        }
    }

    @Override // com.amap.api.maps.model.BasePointOverlay
    public void destroy() {
        try {
            remove();
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public boolean equals(Object obj) {
        MarkerOptions markerOptions;
        if (obj != null) {
            try {
                if ((obj instanceof Marker) && (markerOptions = this.options) != null && markerOptions.equals(((Marker) obj).options)) {
                    if (this.overlayName.equals(((Marker) obj).overlayName)) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        return false;
    }

    public float getAlpha() {
        Object callNativeFunction;
        if (this.options != null) {
            return (!this.isUseAnimation || (callNativeFunction = callNativeFunction("getAlpha", null)) == null) ? this.options.getAlpha() : ((Double) callNativeFunction).floatValue();
        }
        return 1.0f;
    }

    public float getAltitude() {
        try {
            MarkerOptions markerOptions = this.options;
            if (markerOptions != null) {
                return markerOptions.getAltitude();
            }
            return 0.0f;
        } catch (Exception e) {
            e.printStackTrace();
            return 0.0f;
        }
    }

    public float getAnchorU() {
        MarkerOptions markerOptions = this.options;
        if (markerOptions != null) {
            return markerOptions.getAnchorU();
        }
        return 0.0f;
    }

    public float getAnchorV() {
        MarkerOptions markerOptions = this.options;
        if (markerOptions != null) {
            return markerOptions.getAnchorV();
        }
        return 0.0f;
    }

    public int getDisplayLevel() {
        return 5;
    }

    public IPoint getGeoPoint() {
        if (this.geoPoint == null) {
            this.geoPoint = new IPoint();
        }
        LatLng position = getPosition();
        if (position != null) {
            VirtualEarthProjection.latLongToPixels(position.latitude, position.longitude, 20, this.geoPoint);
        }
        return this.geoPoint;
    }

    public ArrayList<BitmapDescriptor> getIcons() {
        try {
            return this.options.getIcons();
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    @Override // com.amap.api.maps.model.BasePointOverlay
    public String getId() {
        try {
            return this.overlayName;
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    @Override // com.amap.api.maps.model.BasePointOverlay
    public Object getObject() {
        return this.object;
    }

    public MarkerOptions getOptions() {
        MarkerOptions markerOptions = this.options;
        if (markerOptions != null) {
            return markerOptions;
        }
        return null;
    }

    public int getPeriod() {
        try {
            return this.options.getPeriod();
        } catch (Throwable th) {
            th.printStackTrace();
            return 0;
        }
    }

    @Override // com.amap.api.maps.model.BasePointOverlay
    public LatLng getPosition() {
        Object callNativeFunction;
        try {
            if (this.options != null) {
                if (!isViewMode()) {
                    return (!this.isUseAnimation || (callNativeFunction = callNativeFunction("getPosition", null)) == null) ? this.options.getPosition() : (LatLng) callNativeFunction;
                }
                this.glOverlayLayerRef.get().getMap().getPixel2LatLng(this.options.getScreenX(), this.options.getScreenY(), this.viewModeLatLngDp);
                LatLng latLng = this.viewModeLatLng;
                if (latLng != null) {
                    double d = latLng.latitude;
                    DPoint dPoint = this.viewModeLatLngDp;
                    if (d == dPoint.y && latLng.longitude == dPoint.x) {
                        return latLng;
                    }
                }
                DPoint dPoint2 = this.viewModeLatLngDp;
                return new LatLng(dPoint2.y, dPoint2.x);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return null;
    }

    @Override // com.amap.api.maps.model.BasePointOverlay
    public float getRotateAngle() {
        if (this.options == null) {
            return 0.0f;
        }
        if (this.isUseAnimation) {
            Object callNativeFunction = callNativeFunction("getRotateAngle", null);
            Log.e("mapcore", "getRotateAngle " + callNativeFunction);
            if (callNativeFunction != null) {
                return ((Double) callNativeFunction).floatValue();
            }
        }
        return this.options.getRotateAngle();
    }

    @Override // com.amap.api.maps.model.BasePointOverlay
    public String getSnippet() {
        try {
            MarkerOptions markerOptions = this.options;
            if (markerOptions != null) {
                return markerOptions.getSnippet();
            }
            return null;
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    @Override // com.amap.api.maps.model.BasePointOverlay
    public String getTitle() {
        try {
            MarkerOptions markerOptions = this.options;
            if (markerOptions != null) {
                return markerOptions.getTitle();
            }
            return null;
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    public float getZIndex() {
        MarkerOptions markerOptions = this.options;
        if (markerOptions != null) {
            return markerOptions.getZIndex();
        }
        return 0.0f;
    }

    public int hashCode() {
        if (this.options == null) {
            return super.hashCode();
        }
        String str = this.overlayName;
        return (((str == null ? 0 : str.hashCode()) + 31) * 31) + this.options.hashCode();
    }

    public void hideInfoWindow() {
        try {
            if (isIconView()) {
                INativeOverlayLayer iNativeOverlayLayer = this.nativeOverlayLayerRef.get();
                if (TextUtils.isEmpty(this.overlayName) || iNativeOverlayLayer == null) {
                    return;
                }
                iNativeOverlayLayer.hideInfoWindow(this.overlayName);
                return;
            }
            IGlOverlayLayer iGlOverlayLayer = this.glOverlayLayerRef.get();
            if (TextUtils.isEmpty(this.overlayName) || iGlOverlayLayer == null) {
                return;
            }
            iGlOverlayLayer.hideInfoWindow(this.overlayName);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public boolean isClickable() {
        Object callNativeFunction = callNativeFunction("isClickable", null);
        return callNativeFunction instanceof Boolean ? ((Boolean) callNativeFunction).booleanValue() : this.isClickable;
    }

    public boolean isDraggable() {
        MarkerOptions markerOptions = this.options;
        if (markerOptions != null) {
            return markerOptions.isDraggable();
        }
        return false;
    }

    public boolean isFlat() {
        MarkerOptions markerOptions = this.options;
        if (markerOptions != null) {
            return markerOptions.isFlat();
        }
        return false;
    }

    public boolean isIconView() {
        MarkerOptions markerOptions = this.options;
        return (markerOptions == null || markerOptions.getIconView() == null) ? false : true;
    }

    public boolean isInfoWindowAutoOverturn() {
        return false;
    }

    @Override // com.amap.api.maps.model.BasePointOverlay
    public boolean isInfoWindowEnable() {
        MarkerOptions markerOptions = this.options;
        return markerOptions != null ? markerOptions.isInfoWindowEnable() : this.isInfoWindowEnable;
    }

    public boolean isInfoWindowShown() {
        if (isIconView()) {
            INativeOverlayLayer iNativeOverlayLayer = this.nativeOverlayLayerRef.get();
            if (TextUtils.isEmpty(this.overlayName) || iNativeOverlayLayer == null) {
                return false;
            }
            return iNativeOverlayLayer.isInfoWindowShown(this.overlayName);
        }
        IGlOverlayLayer iGlOverlayLayer = this.glOverlayLayerRef.get();
        if (TextUtils.isEmpty(this.overlayName) || iGlOverlayLayer == null) {
            return false;
        }
        Object callNativeFunction = callNativeFunction("isInfoWindowShown", null);
        if (callNativeFunction instanceof Boolean) {
            return ((Boolean) callNativeFunction).booleanValue();
        }
        return false;
    }

    public boolean isPerspective() {
        return false;
    }

    public boolean isRemoved() {
        return this.isRemoved;
    }

    public boolean isViewMode() {
        MarkerOptions markerOptions = this.options;
        if (markerOptions != null) {
            return markerOptions.isViewMode();
        }
        return false;
    }

    @Override // com.amap.api.maps.model.BasePointOverlay
    public boolean isVisible() {
        try {
            MarkerOptions markerOptions = this.options;
            if (markerOptions != null) {
                return markerOptions.isVisible();
            }
            return false;
        } catch (Throwable th) {
            th.printStackTrace();
            return false;
        }
    }

    @Override // com.amap.api.maps.model.BasePointOverlay
    public void remove() {
        try {
            if (isInfoWindowShown()) {
                hideInfoWindow();
            }
            if (isIconView()) {
                INativeOverlayLayer iNativeOverlayLayer = this.nativeOverlayLayerRef.get();
                if (iNativeOverlayLayer != null) {
                    iNativeOverlayLayer.removeNativeOverlay(this.overlayName);
                }
            } else {
                IGlOverlayLayer iGlOverlayLayer = this.glOverlayLayerRef.get();
                if (iGlOverlayLayer != null) {
                    iGlOverlayLayer.removeOverlay(this.overlayName);
                }
            }
            this.isRemoved = true;
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void setAlpha(float f) {
        MarkerOptions markerOptions = this.options;
        if (markerOptions != null) {
            markerOptions.alpha(f);
            updateOption();
        }
    }

    public void setAltitude(float f) {
        try {
            MarkerOptions markerOptions = this.options;
            if (markerOptions != null) {
                markerOptions.altitude(f);
                updateOption();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void setAnchor(float f, float f2) {
        try {
            MarkerOptions markerOptions = this.options;
            if (markerOptions != null) {
                markerOptions.anchor(f, f2);
                updateOption();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.amap.api.maps.model.BasePointOverlay
    public void setAnimation(Animation animation) {
        if (animation != null) {
            try {
                Animation.AnimationListener animationListener = this.mCurAnimationListener;
                if (animationListener != null) {
                    animation.setAnimationListener(animationListener);
                }
            } catch (Throwable unused) {
                return;
            }
        }
        this.mCurAnimation = animation;
        this.isUseAnimation = animation != null;
        callNativeFunction("setAnimation", new Object[]{animation});
        if (animation != null) {
            animation.resetUpdateFlags();
        }
    }

    public void setAnimationListener(Animation.AnimationListener animationListener) {
        this.mCurAnimationListener = animationListener;
        b bVar = new b(animationListener);
        this.mCurInnerAnimationListener = bVar;
        if (this.mCurAnimation != null) {
            callNativeFunction("setAnimationListener", new Object[]{bVar});
        }
    }

    public void setAutoOverturnInfoWindow(boolean z) {
    }

    public void setBelowMaskLayer(boolean z) {
        MarkerOptions markerOptions = this.options;
        if (markerOptions != null) {
            markerOptions.belowMaskLayer(z);
            updateOption();
        }
    }

    public void setClickable(boolean z) {
        this.isClickable = z;
        callNativeFunction("setClickable", new Object[]{Boolean.valueOf(z)});
    }

    public void setDisplayLevel(int i) {
    }

    public void setDraggable(boolean z) {
        try {
            MarkerOptions markerOptions = this.options;
            if (markerOptions != null) {
                markerOptions.draggable(z);
                updateOption();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void setFixingPointEnable(boolean z) {
    }

    public void setFlat(boolean z) {
        try {
            MarkerOptions markerOptions = this.options;
            if (markerOptions != null) {
                markerOptions.setFlat(z);
                updateOption();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.amap.api.maps.model.BasePointOverlay
    public void setGeoPoint(IPoint iPoint) {
        this.geoPoint = iPoint;
        if (iPoint != null) {
            DPoint pixelsToLatLong = VirtualEarthProjection.pixelsToLatLong(((Point) iPoint).x, ((Point) iPoint).y, 20);
            LatLng latLng = new LatLng(pixelsToLatLong.y, pixelsToLatLong.x, false);
            pixelsToLatLong.recycle();
            this.options.position(latLng);
            updateOption();
        }
    }

    public void setIcon(BitmapDescriptor bitmapDescriptor) {
        if (bitmapDescriptor != null) {
            try {
                MarkerOptions markerOptions = this.options;
                if (markerOptions != null) {
                    markerOptions.icon(bitmapDescriptor);
                    updateOption();
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public void setIcons(ArrayList<BitmapDescriptor> arrayList) {
        try {
            this.options.icons(arrayList);
            updateOption();
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void setInfoWindowEnable(boolean z) {
        this.isInfoWindowEnable = z;
        MarkerOptions markerOptions = this.options;
        if (markerOptions != null) {
            markerOptions.infoWindowEnable(z);
            updateOption();
        }
    }

    public void setMarkerOptions(MarkerOptions markerOptions) {
        this.options = markerOptions;
        updateOption();
    }

    @Override // com.amap.api.maps.model.BasePointOverlay
    public void setObject(Object obj) {
        this.object = obj;
    }

    public void setPeriod(int i) {
        try {
            this.options.period(i);
            updateOption();
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void setPerspective(boolean z) {
    }

    @Override // com.amap.api.maps.model.BasePointOverlay
    public void setPosition(LatLng latLng) {
        try {
            MarkerOptions markerOptions = this.options;
            if (markerOptions != null) {
                markerOptions.position(latLng);
                updateOption();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void setPositionByPixels(int i, int i2) {
        MarkerOptions markerOptions = this.options;
        if (markerOptions != null) {
            markerOptions.setScreenPosition(i, i2);
            updateOption();
        }
    }

    public void setPositionNotUpdate(LatLng latLng) {
        setPosition(latLng);
    }

    @Override // com.amap.api.maps.model.BasePointOverlay
    public void setRotateAngle(float f) {
        try {
            MarkerOptions markerOptions = this.options;
            if (markerOptions != null) {
                markerOptions.rotateAngle(f);
                updateOption();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void setRotateAngleNotUpdate(float f) {
    }

    @Override // com.amap.api.maps.model.BasePointOverlay
    public void setSnippet(String str) {
        try {
            MarkerOptions markerOptions = this.options;
            if (markerOptions != null) {
                markerOptions.snippet(str);
                updateOption();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.amap.api.maps.model.BasePointOverlay
    public void setTitle(String str) {
        try {
            MarkerOptions markerOptions = this.options;
            if (markerOptions != null) {
                markerOptions.title(str);
                updateOption();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void setToTop() {
        try {
            IGlOverlayLayer iGlOverlayLayer = this.glOverlayLayerRef.get();
            if (TextUtils.isEmpty(this.overlayName) || iGlOverlayLayer == null) {
                return;
            }
            iGlOverlayLayer.set2Top(this.overlayName);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.amap.api.maps.model.BasePointOverlay
    public void setVisible(boolean z) {
        try {
            MarkerOptions markerOptions = this.options;
            if (markerOptions != null) {
                markerOptions.visible(z);
                updateOption();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void setZIndex(float f) {
        MarkerOptions markerOptions = this.options;
        if (markerOptions != null) {
            markerOptions.zIndex(f);
            updateOption();
        }
    }

    @Override // com.amap.api.maps.model.BasePointOverlay
    public void showInfoWindow() {
        try {
            if (isIconView()) {
                INativeOverlayLayer iNativeOverlayLayer = this.nativeOverlayLayerRef.get();
                if (TextUtils.isEmpty(this.overlayName) || iNativeOverlayLayer == null) {
                    return;
                }
                iNativeOverlayLayer.showInfoWindow(this.overlayName);
                return;
            }
            IGlOverlayLayer iGlOverlayLayer = this.glOverlayLayerRef.get();
            if (TextUtils.isEmpty(this.overlayName) || iGlOverlayLayer == null) {
                return;
            }
            iGlOverlayLayer.showInfoWindow(this.overlayName);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.amap.api.maps.model.BasePointOverlay
    public boolean startAnimation() {
        Object callNativeFunction = callNativeFunction("startAnimation", null);
        if (callNativeFunction instanceof Boolean) {
            return ((Boolean) callNativeFunction).booleanValue();
        }
        return false;
    }
}
