package com.baidu.mapapi.map;

import android.os.Bundle;
import com.baidu.mapapi.model.LatLng;

/* loaded from: classes13.dex */
public final class DotOptions extends OverlayOptions {

    /* renamed from: a, reason: collision with root package name */
    private LatLng f7906a;
    int d;
    Bundle f;
    private int b = -16777216;
    private int c = 5;
    boolean e = true;

    public DotOptions center(LatLng latLng) {
        if (latLng == null) {
            throw new IllegalArgumentException("BDMapSDKException: dot center can not be null");
        }
        this.f7906a = latLng;
        return this;
    }

    public DotOptions color(int i) {
        this.b = i;
        return this;
    }

    public DotOptions extraInfo(Bundle bundle) {
        this.f = bundle;
        return this;
    }

    public LatLng getCenter() {
        return this.f7906a;
    }

    public int getColor() {
        return this.b;
    }

    public Bundle getExtraInfo() {
        return this.f;
    }

    @Override // com.baidu.mapapi.map.OverlayOptions
    Overlay getOverlay() {
        Dot dot = new Dot();
        dot.d = this.e;
        dot.c = this.d;
        dot.e = this.f;
        dot.h = this.b;
        dot.g = this.f7906a;
        dot.i = this.c;
        return dot;
    }

    public int getRadius() {
        return this.c;
    }

    public int getZIndex() {
        return this.d;
    }

    public boolean isVisible() {
        return this.e;
    }

    public DotOptions radius(int i) {
        if (i > 0) {
            this.c = i;
        }
        return this;
    }

    public DotOptions visible(boolean z) {
        this.e = z;
        return this;
    }

    public DotOptions zIndex(int i) {
        this.d = i;
        return this;
    }
}
