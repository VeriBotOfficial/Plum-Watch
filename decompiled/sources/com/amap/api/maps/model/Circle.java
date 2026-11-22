package com.amap.api.maps.model;

import android.text.TextUtils;
import com.amap.api.maps.interfaces.IGlOverlayLayer;
import java.lang.ref.WeakReference;
import java.util.List;

/* loaded from: classes11.dex */
public final class Circle extends BaseOverlay {

    /* renamed from: a, reason: collision with root package name */
    WeakReference<IGlOverlayLayer> f2042a;
    private CircleOptions options;

    public Circle(IGlOverlayLayer iGlOverlayLayer, CircleOptions circleOptions, String str) {
        super(str);
        this.f2042a = new WeakReference<>(iGlOverlayLayer);
        this.options = circleOptions;
    }

    private void updateOption() {
        try {
            IGlOverlayLayer iGlOverlayLayer = this.f2042a.get();
            if (TextUtils.isEmpty(this.overlayName) || iGlOverlayLayer == null) {
                return;
            }
            iGlOverlayLayer.updateOption(this.overlayName, this.options);
        } catch (Throwable unused) {
        }
    }

    public boolean contains(LatLng latLng) {
        try {
            IGlOverlayLayer iGlOverlayLayer = this.f2042a.get();
            if (iGlOverlayLayer != null) {
                return iGlOverlayLayer.IsCircleContainPoint(this.options, latLng);
            }
            return false;
        } catch (Throwable th) {
            th.printStackTrace();
            return false;
        }
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof Circle)) {
            try {
                if (super.equals(obj)) {
                    return true;
                }
                return ((Circle) obj).getId() == getId();
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        return false;
    }

    public LatLng getCenter() {
        try {
            CircleOptions circleOptions = this.options;
            if (circleOptions != null) {
                return circleOptions.getCenter();
            }
            return null;
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    public int getFillColor() {
        try {
            CircleOptions circleOptions = this.options;
            if (circleOptions != null) {
                return circleOptions.getFillColor();
            }
            return 0;
        } catch (Throwable th) {
            th.printStackTrace();
            return 0;
        }
    }

    public List<BaseHoleOptions> getHoleOptions() {
        try {
            CircleOptions circleOptions = this.options;
            if (circleOptions != null) {
                return circleOptions.getHoleOptions();
            }
            return null;
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    public String getId() {
        try {
            return this.overlayName;
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    public double getRadius() {
        try {
            CircleOptions circleOptions = this.options;
            if (circleOptions != null) {
                return circleOptions.getRadius();
            }
            return 0.0d;
        } catch (Throwable th) {
            th.printStackTrace();
            return 0.0d;
        }
    }

    public int getStrokeColor() {
        try {
            CircleOptions circleOptions = this.options;
            if (circleOptions != null) {
                return circleOptions.getStrokeColor();
            }
            return 0;
        } catch (Throwable th) {
            th.printStackTrace();
            return 0;
        }
    }

    public int getStrokeDottedLineType() {
        try {
            CircleOptions circleOptions = this.options;
            if (circleOptions != null) {
                return circleOptions.getStrokeDottedLineType();
            }
            return -1;
        } catch (Throwable th) {
            th.printStackTrace();
            return -1;
        }
    }

    public float getStrokeWidth() {
        try {
            CircleOptions circleOptions = this.options;
            if (circleOptions != null) {
                return circleOptions.getStrokeWidth();
            }
            return 0.0f;
        } catch (Throwable th) {
            th.printStackTrace();
            return 0.0f;
        }
    }

    public float getZIndex() {
        try {
            CircleOptions circleOptions = this.options;
            if (circleOptions != null) {
                return circleOptions.getZIndex();
            }
            return 0.0f;
        } catch (Throwable th) {
            th.printStackTrace();
            return 0.0f;
        }
    }

    public int hashCode() {
        try {
            return super.hashCode();
        } catch (Throwable th) {
            th.printStackTrace();
            return 0;
        }
    }

    public boolean isVisible() {
        try {
            CircleOptions circleOptions = this.options;
            if (circleOptions != null) {
                return circleOptions.isVisible();
            }
            return false;
        } catch (Throwable th) {
            th.printStackTrace();
            return false;
        }
    }

    public void remove() {
        try {
            IGlOverlayLayer iGlOverlayLayer = this.f2042a.get();
            if (iGlOverlayLayer != null) {
                iGlOverlayLayer.removeOverlay(this.overlayName);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void setCenter(LatLng latLng) {
        try {
            CircleOptions circleOptions = this.options;
            if (circleOptions != null) {
                circleOptions.center(latLng);
                updateOption();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void setFillColor(int i) {
        try {
            CircleOptions circleOptions = this.options;
            if (circleOptions != null) {
                circleOptions.fillColor(i);
                updateOption();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void setHoleOptions(List<BaseHoleOptions> list) {
        if (list != null) {
            try {
                synchronized (list) {
                    this.options.getHoleOptions().clear();
                    this.options.addHoles(list);
                    updateOption();
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public void setRadius(double d) {
        try {
            CircleOptions circleOptions = this.options;
            if (circleOptions != null) {
                circleOptions.radius(d);
                updateOption();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void setStrokeColor(int i) {
        try {
            CircleOptions circleOptions = this.options;
            if (circleOptions != null) {
                circleOptions.strokeColor(i);
                updateOption();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void setStrokeDottedLineType(int i) {
        try {
            CircleOptions circleOptions = this.options;
            if (circleOptions != null) {
                circleOptions.setStrokeDottedLineType(i);
                updateOption();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void setStrokeWidth(float f) {
        try {
            CircleOptions circleOptions = this.options;
            if (circleOptions != null) {
                circleOptions.strokeWidth(f);
                updateOption();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void setVisible(boolean z) {
        try {
            CircleOptions circleOptions = this.options;
            if (circleOptions != null) {
                circleOptions.visible(z);
                updateOption();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void setZIndex(float f) {
        try {
            CircleOptions circleOptions = this.options;
            if (circleOptions != null) {
                circleOptions.zIndex(f);
                updateOption();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
